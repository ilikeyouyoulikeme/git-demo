/* 王其康版权所有
 */
package com.wqk.two;

/**
 * @author wangqikang
 * @version 1.0
 */
public class KeyBoard implements USB{
    @Override
    public void turnOn() {
        System.out.println("键盘开启");
    }

    @Override
    public void turnOff() {
        System.out.println("键盘关闭");
    }
}
