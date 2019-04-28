package com.ginny.pattern.design;

/**
 * @Author: Ginny
 * @Desc: //TODO
 * @Date:Create 2019/4/28 18:13
 */
public class GinnyTest {

    public static void main(String[] args) {
        //构造器注入
        Ginny ginny = new Ginny(new JavaICourse());
        ginny.study();

        //Setter注入
        Ginny ginny1 = new Ginny();
        ginny1.setIcource(new PythonICourse());
        ginny1.study();
    }
}
