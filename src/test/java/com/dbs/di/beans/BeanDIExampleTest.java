package com.dbs.di.beans;

import com.dbs.di.beans.example.BeanDIByFieldsExample;
import com.dbs.di.context.BeansContext;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class BeanDIExampleTest {
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void byFieldsDITest() throws Exception {

        BeanDIByFieldsExample beanDIByFieldsExample1 = (BeanDIByFieldsExample) BeansContext.getBean(BeanDIByFieldsExample.class.getName());
        BeanDIByFieldsExample beanDIByFieldsExample2 = (BeanDIByFieldsExample) BeansContext.getBean(BeanDIByFieldsExample.class.getName());

        //singleton bean injection
        Assert.assertTrue(beanDIByFieldsExample1.getBeanSingletonImpl() == beanDIByFieldsExample2.getBeanSingletonImpl());

        //prototype bean injection
        Assert.assertFalse(beanDIByFieldsExample1.getBeanProtoTypeImpl() == beanDIByFieldsExample2.getBeanProtoTypeImpl());
    }

    @Test
    public void byFieldsDINotExistTest() throws Exception {
        exceptionRule.expect(ClassNotFoundException.class);
        exceptionRule.expectMessage("com.dbs.di.beans.example.BeanDIByFieldsNotExistExample");
        BeanDIByFieldsExample beanDIByFieldsExample1 = (BeanDIByFieldsExample) BeansContext.getBean("com.dbs.di.beans.example.BeanDIByFieldsNotExistExample");
    }
}
