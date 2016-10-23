package org.libucr.course;

import org.libucr.course.rest.GenerateRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CourseGenerator {
    private static final Random rand = new Random();

    private CourseGenerator() {
    }

    public static Course.Builder randomCourseBuilder() {
        Course.Builder builder = new Course.Builder()
            .setCourseNumber(courseNumber())
            .setSection((short)rand.nextInt(999))
            .setInstructor("John Doe")
            .setClassType(classType().name())
            .setFinalExam(date());

        for (int i = 0; i < rand.nextInt(2) + 1; i++) {
            builder.setDay(Day.values()[rand.nextInt(Day.values().length)]);
        }

        return builder;
    }

    public static Course randomCourse() {
        return randomCourseBuilder().build();
    }

    private static String courseNumber() {
        return String.format("%03d%s",
                rand.nextInt(999),
                (rand.nextDouble() < 0.4) ? ('A' + rand.nextInt(26)) : "");
    }

    private static ClassType classType() {
        double val = rand.nextDouble();
        if (val < 0.5) {
            return ClassType.LEC;
        } else if (val < 0.8) {
            return ClassType.DIS;
        } else {
            return ClassType.LAB;
        }
    }

    private static Times times() {
        return new Times(
                (byte)(rand.nextInt(10) + 6),
                (byte)(rand.nextBoolean() ? 10 : 40));
    }

    private static Date date() {
        return new Date(
                new Times(
                        (byte)(rand.nextInt(4) * 3 + 8),
                        (byte)0
                    ),
                (byte)(rand.nextInt(30) + 1),
                (byte)(rand.nextInt(12) + 1),
                (short)(rand.nextInt(30) + 2000));
    }

    public static List<Course[]> getGroups(List<GenerateRequest> requests) {
        return new ArrayList<Course[]>() {{
            for (GenerateRequest request : requests) {
                Course[] courses = new Course[rand.nextInt(6)];
                for (int i = 0; i < courses.length; i++) {
                    Course.Builder builder = randomCourseBuilder();
                    builder.setSubjectArea(request.getSubject());
                    builder.setCourseNumber(request.getId());
                    courses[i] = builder.build();
                }
                add(courses);
            }
        }};
    }
}

