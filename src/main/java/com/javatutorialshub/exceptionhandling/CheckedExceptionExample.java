package com.javatutorialshub.exceptionhandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CheckedExceptionExample {

    private static final Logger log = Logger.getLogger(CheckedExceptionExample.class.getName());
    public static void main(String[] args) throws IOException {
        Files.copy(Paths.get("myfile.txt"), System.out);
    }
}
