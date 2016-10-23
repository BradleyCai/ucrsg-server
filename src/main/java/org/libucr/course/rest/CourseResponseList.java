package org.libucr.course.rest;

import org.libucr.course.Course;

import java.util.Collections;
import java.util.List;

public class CourseResponseList extends Response {
    private final List<CourseResult> courses;

    public CourseResponseList(List<CourseResult> courses) {
        super(true);
        this.courses = courses;
    }

    public List<CourseResult> getCourses() {
        return Collections.unmodifiableList(courses);
    }
}

