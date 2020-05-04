package com.dbs.di.beans.scope;

import java.lang.reflect.InvocationTargetException;

public class PrototypeBeanImpl implements IBean {

    public static synchronized Object getBean(String beanName) {
        Object obj = null;

        try
        {
            Class cls = Class.forName(beanName);
            obj = cls.getDeclaredConstructor().newInstance();
            //System.out.println(obj.getMember1());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return obj;
    }
}
