package com.javatutorialshub.exceptionhandling.divide;

public class DivideNumberComputeException extends Exception {
    public DivideNumberComputeException() {
    }

    public DivideNumberComputeException(String message) {
        super(message);
    }

    public DivideNumberComputeException(String message, Throwable cause) {
        super(message, cause);
    }

    public DivideNumberComputeException(Throwable cause) {
        super(cause);
    }

    public DivideNumberComputeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
