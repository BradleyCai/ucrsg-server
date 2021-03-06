package org.libucr.course.rest;

import org.libucr.course.Course;

public class CourseResult {
    private final Course[] courses;
    private final double score;

    public CourseResult(Course[] courses, double score) {
        this.courses = courses;
        this.score = score;
    }

    public Course[] getCourses() {
        return courses.clone();
    }

    public double getScore() {
        return score;
    }
}

