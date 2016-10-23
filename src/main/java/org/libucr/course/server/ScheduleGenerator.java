package org.libucr.course.server;

import org.libucr.course.Course;
import org.libucr.course.rest.CourseResult;

import java.util.ArrayList;
import java.util.List;

public class ScheduleGenerator {
    private final ScheduleGrader grader;

    public ScheduleGenerator(ScheduleGrader grader) {
        this.grader = grader;
    }

    public ScheduleGrader getScheduleGrader() {
        return grader;
    }

    public List<CourseResult> getSchedules(List<Course[]> groups) {
        return new ArrayList<CourseResult>() {{
            for (Course[] group : groups) {
                add(new CourseResult(group, grader.score(group)));
            }
        }};
    }
}

