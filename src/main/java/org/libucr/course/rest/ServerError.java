package org.libucr.course.rest;

public class ServerError extends Response {
    private final String error;
    private final String message;

    public ServerError(String error, String message) {
        super(false);
        this.error = error;
        this.message = message;
    }

    public ServerError(String error) {
        this(error, "");
    }
}

