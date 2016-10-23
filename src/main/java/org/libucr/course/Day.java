package org.libucr.course;

public enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;

    public static boolean[] createDayArray() {
        return new boolean[values().length];
    }
};

