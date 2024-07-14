package com.javatutorialshub.exceptionhandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Logger;

public class UnCheckedExceptionExample {

    private static final Logger log = Logger.getLogger(UnCheckedExceptionExample.class.getName());
    public static void main(String[] args) {
        String name = null;
        log.info("The name length is: " + name.length());
    }
}
