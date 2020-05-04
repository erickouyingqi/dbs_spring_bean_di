package com.dbs.di.beans.util;

import com.dbs.di.beans.annotation.DIAutowire;
import com.dbs.di.beans.annotation.DIBean;
import com.dbs.di.beans.contant.ExceptionConstants;
import com.dbs.di.beans.factory.BeanFactory;

import java.lang.reflect.Field;

public class InjectionUtil {
    public static Object injectFieldsInBeanObject(Object beanObject) throws Exception {
        if(null == beanObject){
            throw new Exception(ExceptionConstants.EXCEPTION_BEAN_NULL);
        }

        Class<?> clazz = beanObject.getClass();

        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);

            if (field.isAnnotationPresent(DIAutowire.class)) {//field injection
                BeanFactory beanFactory = new BeanFactory();
                field.set(beanObject,beanFactory.createBean(field.getType().getName(),field.getType().getAnnotation(DIBean.class).scope()));
            }
        }

        return beanObject;
    }
}
