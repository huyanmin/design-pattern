package com.ginny.pattern.design;

/**
 * @Author: Ginny
 * @Desc: //TODO
 * @Date:Create 2019/4/28 18:05
 */
public class Ginny {

    private ICourse icource;

    //构造器注入
    public Ginny(ICourse iCourse){
        this.icource = iCourse;
    }

    public Ginny(){
    }
    //Setter方式来注入
    public void setIcource(ICourse iCourse){
        this.icource = iCourse;
    }

    public void study(){
        this.icource.study();
    }
}
