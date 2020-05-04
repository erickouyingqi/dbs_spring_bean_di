package com.dbs.di.beans.factory;

public interface IBeanFactory {
    public Object createBean(String beanName, String beanScopeType);
}
