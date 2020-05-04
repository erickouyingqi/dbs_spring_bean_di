package com.dbs.di.beans.scope;

import java.lang.reflect.InvocationTargetException;

public class SingletonBeanImpl implements IBean {
    private static Object beanInstance = null;

    public static synchronized Object getBean(String beanName) {
        if(null == beanInstance){
            Class cls = null;
            try {
                cls = Class.forName(beanName);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            try {
                beanInstance = cls.getDeclaredConstructor().newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }

        return beanInstance;
    }
}
