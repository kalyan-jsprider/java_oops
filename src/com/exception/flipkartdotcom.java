package com.exception;

public class flipkartdotcom {
    static void create(int age) throws FlipkartException {
        if (age > 18) {
            System.out.println("You are eligible to create an account.");
        } else {
            throw new FlipkartException("Invalid age");
        }
    }

    public static void main(String[] args) {
        try {
            create(2);
        } catch (FlipkartException e) {
            String x = e.getMessage();
            System.out.println(x);
        }
    }
}

class FlipkartException extends Exception {
    private String message;

    public FlipkartException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}