package com.example.test.decoration;


/**
 * @author by syt
 * on 2020/12/17
 * desc:手机包装类
 */
public class PhoneDecorator implements Appearance {
    protected Appearance appearance;

    public PhoneDecorator(Appearance appearance) {
        this.appearance = appearance;
    }

    @Override
    public void structure() {
        appearance.structure();
    }
}
