package com.example.test.decoration;

/**
 * @author by syt
 * on 2020/12/17
 * desc:
 */
public class Phone implements Appearance{

    @Override
    public void structure() {
        System.out.println("手机的属性：玻璃后盖，金属边框");
    }
}
