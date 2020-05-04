package com.dbs.di.beans.example.bean;

import com.dbs.di.beans.annotation.DIBean;
import com.dbs.di.beans.contant.BeanScopeConstants;

@DIBean(scope = BeanScopeConstants.BEAN_SCOPE_SINGLETON)
public class BeanSingletonImpl {
    public String getMember1() {
        return member1;
    }

    public void setMember1(String member1) {
        this.member1 = member1;
    }

    public String getMember2() {
        return member2;
    }

    public void setMember2(String member2) {
        this.member2 = member2;
    }

    private String member1;
    private String member2;
}
