package org.libucr.course.server;

public CourseGenerationException extends Exception {
    private final String details;

    public CourseGenerationException(String message, String details) {
        super(message);
        this.details = details;
    }

    public String getDetails() {
        return details;
    }
}

