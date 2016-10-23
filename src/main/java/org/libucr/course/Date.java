package org.libucr.course;

public class Date {
    private final Times times;
    private final byte day;
    private final byte month;
    private final short year;

    public Date(Times times, byte day, byte month, short year) {
        this.times = times;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Times getTimes() {
        return times;
    }

    public byte getDay() {
        return day;
    }

    public byte getMonth() {
        return month;
    }

    public short getYear() {
        return year;
    }
}

