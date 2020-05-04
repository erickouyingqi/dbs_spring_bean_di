package com.dbs.di.beans.example;

import com.dbs.di.beans.annotation.DIAutowire;
import com.dbs.di.beans.example.bean.BeanSingletonImpl;
import com.dbs.di.beans.example.bean.BeanPrototypeImpl;

public class BeanDIByFieldsExample {

   @DIAutowire
   private BeanSingletonImpl beanSingletonImpl;

   @DIAutowire
   private BeanPrototypeImpl beanProtoTypeImpl;

   public BeanSingletonImpl getBeanSingletonImpl() {
      return beanSingletonImpl;
   }

   public void setBeanSingletonImpl(BeanSingletonImpl beanSingletonImpl) {
      this.beanSingletonImpl = beanSingletonImpl;
   }

   public BeanPrototypeImpl getBeanProtoTypeImpl() {
      return beanProtoTypeImpl;
   }

   public void setBeanProtoTypeImpl(BeanPrototypeImpl beanProtoTypeImpl) {
      this.beanProtoTypeImpl = beanProtoTypeImpl;
   }
}
