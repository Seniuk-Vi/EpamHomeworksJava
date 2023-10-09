package com.epam.spring.homework2.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

@Component
public class BeanPost implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization: " + bean + " beanName: " + beanName);
        validateBeans(bean);
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        validateBeans(bean);
        System.out.println("postProcessAfterInitialization: " + bean + " beanName: " + beanName);
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }

    private Field getField(Object bean, String fieldName) {
        Field field = null;
        try {
            field = bean.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
        } catch (NoSuchFieldException e) {
            System.out.println("Class doesn't contain that field!!!");
        }
        return field;
    }

    private Object getFieldValue(Object bean, Field field) {
        Object value;
        try{
            value = field.get(bean);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("No field in this class!!!");
        }
        return value;
    }
    private void validateBeans(Object bean){
        try {
            Field nameField = getField(bean, "name");
            if (nameField!=null){
                String name = (String) getFieldValue(bean, nameField);
                if (name == null) {
                    nameField.set(bean, "NoName");
                }
            }
            if (nameField!=null){
                Field valueField = getField(bean, "value");
                int value = (int) getFieldValue(bean, valueField);
                if (value < 0) {
                    valueField.set(bean, 0);
                }
            }

        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
    }
}
