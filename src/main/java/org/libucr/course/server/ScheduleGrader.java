package org.libucr.course.server;

import org.libucr.course.Course;
import org.libucr.course.rest.CourseResult;

public class ScheduleGrader {
    public ScheduleGrader() {
    }

    public CourseResult makeResult(Course[] courses) {
        return new CourseResult(courses, score(courses));
    }

    public int score(Course[] courses) {
        // TODO
        return -1;
    }
}

