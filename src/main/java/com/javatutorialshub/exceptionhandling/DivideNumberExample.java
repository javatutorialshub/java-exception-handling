package com.javatutorialshub.exceptionhandling;

import com.javatutorialshub.exceptionhandling.divide.DivideNumber;
import com.javatutorialshub.exceptionhandling.divide.DivideNumberComputeException;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DivideNumberExample {
    private static final Logger log = Logger.getLogger(DivideNumberExample.class.getName());
    public static void main(String[] args){
        try {
            int result = new DivideNumber().compute(10, 0);
            log.log(Level.INFO, "Result is: " + result);
        } catch (DivideNumberComputeException e) {
            log.log(Level.SEVERE, e.getMessage(), e);
            System.exit(-1);
        }
    }
}
