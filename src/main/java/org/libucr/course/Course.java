package org.libucr.course;

public class Course {
    private final String subjectArea;
    private final String courseNumber;
    private final short section;
    private final int callNumber;
    private final String courseName;
    private final String courseId;
    private final String instructor;
    private final String classType;
    private final boolean[] days;
    private final Times times;
    private final short availableSeats;
    private final short maxEnrollment;
    private final String courseStatus;
    private final Date finalExam;
    private final String coRequisites;
    private final String preRequisites;
    private final byte units;

    private Course(String subjectArea, String courseNumber, short section,
            int callNumber, String courseName, String courseId, String instructor,
            String classType, boolean[] days, Times times, short availableSeats,
            short maxEnrollment, String courseStatus, Date finalExam,
            String coRequisites, String preRequisites, byte units) {
        this.subjectArea = subjectArea;
        this.courseNumber = courseNumber;
        this.section = section;
        this.callNumber = callNumber;
        this.courseName = courseName;
        this.courseId = courseId;
        this.instructor = instructor;
        this.classType = classType;
        this.days = days;
        this.times = times;
        this.availableSeats = availableSeats;
        this.maxEnrollment = maxEnrollment;
        this.courseStatus = courseStatus;
        this.finalExam = finalExam;
        this.coRequisites = coRequisites;
        this.preRequisites = preRequisites;
        this.units = units;
    }

    public String getSubjectArea() {
        return subjectArea;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public short getSection() {
        return section;
    }

    public int getCallNumber() {
        return callNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getInstructor() {
        return instructor;
    }

    public String getClassType() {
        return classType;
    }

    public boolean[] getDays() {
        return days.clone();
    }

    public Times getTimes() {
        return times;
    }

    public short getAvailableSeats() {
        return availableSeats;
    }

    public short getMaxEnrollment() {
        return maxEnrollment;
    }

    public String getCourseStatus() {
        return courseStatus;
    }

    public Date getFinalExam() {
        return finalExam;
    }

    public String getCoRequisites() {
        return coRequisites;
    }

    public String getPreRequisites() {
        return preRequisites;
    }

    public byte getUnits() {
        return units;
    }

    public static class Builder {
        private String subjectArea;
        private String courseNumber;
        private short section;
        private int callNumber;
        private String courseName;
        private String courseId;
        private String instructor;
        private String classType;
        private boolean[] days;
        private Times times;
        private short availableSeats;
        private short maxEnrollment;
        private String courseStatus;
        private Date finalExam;
        private String coRequisites;
        private String preRequisites;
        private byte units;

        public Builder() {
            days = new boolean[6];
        }

        public Course build() {
            return new Course(subjectArea, courseNumber, section, callNumber,
                    courseName, courseId, instructor, classType, days, times,
                    availableSeats, maxEnrollment, courseStatus, finalExam,
                    coRequisites, preRequisites, units);
        }

        public Builder setSubjectArea(String subjectArea) {
            this.subjectArea = subjectArea;
            return this;
        }

        public Builder setCourseNumber(String courseNumber) {
            this.courseNumber = courseNumber;
            return this;
        }

        public Builder setSection(short section) {
            this.section = section;
            return this;
        }

        public Builder setCallNumber(int callNumber) {
            this.callNumber = callNumber;
            return this;
        }

        public Builder setCourseName(String courseName) {
            this.courseName = courseName;
            return this;
        }

        public Builder setCourseId(String courseId) {
            this.courseId = courseId;
            return this;
        }

        public Builder setInstructor(String instructor) {
            this.instructor = instructor;
            return this;
        }

        public Builder setClassType(String classType) {
            this.classType = classType;
            return this;
        }

        public Builder setDay(Day day, boolean value) {
            this.days[day.ordinal()] = value;
            return this;
        }

        public Builder setDay(Day day) {
            this.days[day.ordinal()] = true;
            return this;
        }

        public Builder setTimes(Times times) {
            this.times = times;
            return this;
        }

        public Builder setAvailableSeats(short availableSeats) {
            this.availableSeats = availableSeats;
            return this;
        }

        public Builder setMaxEnrollment(short maxEnrollment) {
            this.maxEnrollment = maxEnrollment;
            return this;
        }

        public Builder setCourseStatus(String courseStatus) {
            this.courseStatus = courseStatus;
            return this;
        }

        public Builder setFinalExam(Date finalExam) {
            this.finalExam = finalExam;
            return this;
        }

        public Builder setCoRequisites(String coRequisites) {
            this.coRequisites = coRequisites;
            return this;
        }

        public Builder setPreRequisites(String preRequisites) {
            this.preRequisites = preRequisites;
            return this;
        }

        public Builder setUnits(byte units) {
            this.units = units;
            return this;
        }
    }
}

