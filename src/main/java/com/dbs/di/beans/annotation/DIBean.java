package com.dbs.di.beans.annotation;

import com.dbs.di.beans.contant.BeanScopeConstants;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface DIBean {
    public String scope() default BeanScopeConstants.BEAN_SCOPE_SINGLETON;
}
