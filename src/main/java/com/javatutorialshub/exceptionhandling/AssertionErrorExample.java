package com.javatutorialshub.exceptionhandling;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AssertionErrorExample {

    private static final Logger log = Logger.getLogger(AssertionErrorExample.class.getName());
    public static void main(String[] args){
        int status = 0;
        try {
            int a = 1;
            int b = 0;
            assert b != 0;
            int x = a / b;
            log.log(Level.INFO, "Result = " + x);
        } catch (Throwable e) {
            log.log(Level.SEVERE, e.getMessage());
            status = -1;
        } finally {
            System.exit(status);
        }
    }
}
