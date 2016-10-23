package org.libucr.course.rest;

public abstract class Response {
    private boolean success;

    protected Response(boolean success) {
        this.success = success;
    }
}

