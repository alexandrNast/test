package org.example;

public class Meeting {
    private int start;
    private int end;

    public Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public boolean isOverlap(Meeting other) {
        return this.start < other.end && other.start < this.end;
    }
}
