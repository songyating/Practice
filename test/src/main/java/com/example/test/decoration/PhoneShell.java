package com.example.test.decoration;

/**
 * @author by syt
 * on 2020/12/17
 * desc:手机壳
 */
public class PhoneShell extends PhoneDecorator {
    public PhoneShell(Appearance appearance) {
        super(appearance);
    }

    @Override
    public void structure() {
        super.structure();
        System.out.println("给手机套上手机壳");
    }
}
