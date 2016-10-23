package org.libucr.course.rest;

import org.libucr.course.Course;
import org.libucr.course.CourseGenerator;
import org.libucr.course.rest.CourseResponseList;
import org.libucr.course.server.CourseGenerationException;
import org.libucr.course.server.ScheduleGenerator;
import org.libucr.course.server.ScheduleGrader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    private final ScheduleGenerator generator;

    public Controller(ScheduleGenerator generator) {
        this.generator = generator;
    }

    public Controller(ScheduleGrader grader) {
        this.generator = new ScheduleGenerator(grader);
    }

    public Controller() {
        this.generator = new ScheduleGenerator(new ScheduleGrader());
    }

    @RequestMapping("/generate")
    public Response generateCourses(@RequestParam("courses") List<GenerateRequest> request) {
        try {
            List<Course[]> groups = CourseGenerator.getGroups(request);
            List<CourseResult> results = generator.getSchedules(groups);
            return new CourseResponseList(results);
        } catch (Exception ex) {
            return new ServerError("Internal error", ex.getMessage());
        }
    }
}

