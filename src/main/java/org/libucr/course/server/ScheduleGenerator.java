package org.libucr.course.server;

import org.libucr.course.Course;
import java.util.ArrayList;
import java.util.List;

public class ScheduleGenerator {
    public static List<CourseResult> getSchedules(CourseGroup[] groups) {
        ScheduleGenerator gen = new ScheduleGenerator(groups);
    }

    private final List<Course[]> groups;

    private ScheduleGenerator(List<Course[]> groups) {
        this.groups = groups;
    }
}

