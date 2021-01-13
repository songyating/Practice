package com.example.test.decoration;

/**
 * @author by syt
 * on 2020/12/17
 * desc:
 */
public class PhoneCover extends PhoneDecorator {
    public PhoneCover(Appearance appearance) {
        super(appearance);
    }

    @Override
    public void structure() {
        super.structure();
        System.out.println("给手机贴上手机膜");
    }
}
