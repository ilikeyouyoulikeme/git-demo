/* 王其康版权所有
 */
package com.wqk.one;

import com.wqk.one.BorrowBook;
import com.wqk.one.Student;

/**
 * @author wangqikang
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        BorrowBook book = new BorrowBook(new Student("小红", "2393443373@qq.com"), 1);
        System.out.println(book);
    }
}
