/* 王其康版权所有
 */
package com.wqk.two;

/**
 * @author wangqikang
 * @version 1.0
 */
public class Computer {
    private USB[] usbs = new USB[5];
    int num = 0;
    public void add(USB usb){
        if(usbs[4]==null){
            usbs[num] = usb;
            num++;
        }
    }
    public void powerOn(){
        System.out.println("计算机开机");
    }
    public void powerOff(){
        System.out.println("计算机关机");
    }

    public USB[] getUsbs() {
        return usbs;
    }

    public void setUsbs(USB[] usbs) {
        this.usbs = usbs;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
