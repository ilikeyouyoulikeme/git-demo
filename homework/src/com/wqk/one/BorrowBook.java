/* 王其康版权所有
 */
package com.wqk.one;

/**
 * @author wangqikang
 * @version 1.0
 */
public class BorrowBook {
    Student student;
    int num;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public BorrowBook(Student student, int num) {
        this.student = student;
        this.num = num;
    }

    public BorrowBook() {
    }

    @Override
    public String toString() {
        return "BorrowBook{" +
                "student=" + student +
                ", num=" + num +
                '}';
    }
}
