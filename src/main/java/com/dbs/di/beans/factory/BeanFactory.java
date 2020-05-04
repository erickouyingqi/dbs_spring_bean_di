package com.dbs.di.beans.factory;

import com.dbs.di.beans.contant.BeanScopeConstants;
import com.dbs.di.beans.scope.PrototypeBeanImpl;
import com.dbs.di.beans.scope.SingletonBeanImpl;

public class BeanFactory implements IBeanFactory {
    public Object createBean(String beanName, String beanScopeType) {
        Object beanObj;

        if(beanScopeType.equalsIgnoreCase(BeanScopeConstants.BEAN_SCOPE_PROTOTYPE)){
            beanObj = PrototypeBeanImpl.getBean(beanName);
        }else{
            beanObj = SingletonBeanImpl.getBean(beanName);
        }

        return beanObj;
    }
}
