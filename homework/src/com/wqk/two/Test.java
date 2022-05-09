/* 王其康版权所有
 */
package com.wqk.two;

import java.util.Arrays;

/**
 * @author wangqikang
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.add(new Mouse());
        USB[] usbs = computer.getUsbs();
        System.out.println(Arrays.toString(usbs));



    }
}
