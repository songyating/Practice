package com.example.test;

import com.example.test.decoration.Phone;
import com.example.test.decoration.PhoneCover;
import com.example.test.decoration.PhoneShell;

/**
 * 练习
 */
public class MyClass {

    private static void decorator(){
        //创建一个手机
        Phone phone  = new Phone();
        //给手机套上手机壳
        PhoneShell phoneShell = new PhoneShell(phone);
        //给手机贴上手机膜
        PhoneCover phoneCover = new PhoneCover(phoneShell);
        //最终的结构
        phoneCover.structure();
    }

    public static void main(String[] args){
        decorator();
    }
}