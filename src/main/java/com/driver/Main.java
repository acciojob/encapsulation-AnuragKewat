package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rw = new RWOnly();

        //name has private access in com.driver.RWOnly

        rw.setName("Anurag");
        rw.getName();
    }
}