package org.libucr.course;

public class Times {
    private final byte hour;
    private final byte minute;

    public Times(byte hour, byte minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public byte getHour() {
        return hour;
    }

    public byte getMinute() {
        return minute;
    }
}

