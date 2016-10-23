package org.libucr.course.rest;

public class GenerateRequest {
    private final String subject;
    private final String id;

    public GenerateRequest(String subject, String id) {
        this.subject = subject;
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public String getId() {
        return id;
    }
};

