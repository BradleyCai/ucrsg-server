package org.libucr.course.server;

public class CourseGenerationException extends Exception {
    private final String details;

    public CourseGenerationException(String message, String details) {
        super(message);
        this.details = details;
    }

    public CourseGenerationException(String message) {
        this(message, null);
    }

    public String getDetails() {
        return details;
    }
}

