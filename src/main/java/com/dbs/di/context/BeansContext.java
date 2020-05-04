package com.dbs.di.context;

import com.dbs.di.beans.contant.ExceptionConstants;
import com.dbs.di.beans.util.InjectionUtil;
import java.util.concurrent.ConcurrentHashMap;

public class BeansContext {
    private static ConcurrentHashMap conHashMap = new ConcurrentHashMap<String,Object>();

    public static void initContext(String beanName) throws Exception {
        Class cls = Class.forName(beanName);
        conHashMap.put(beanName,cls.getDeclaredConstructor().newInstance());
    }

    public static Object getBean(String beanName) throws Exception {
        initContext(beanName);
        Object beanObj = conHashMap.get(beanName);

        if(null==beanObj){
            throw new Exception(ExceptionConstants.EXCEPTION_BEAN_NOT_FOUND);
        }

        return InjectionUtil.injectFieldsInBeanObject(beanObj);
    }
}
