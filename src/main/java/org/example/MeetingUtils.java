package org.example;

import java.util.List;

public class MeetingUtils {
    public static int countOverlappingMeetings(List<Meeting> meetings) {
        int count = 0;
        for (int i = 0; i < meetings.size() - 1; i++) {
            for (int j = i + 1; j < meetings.size(); j++) {
                if (meetings.get(i).isOverlap(meetings.get(j))) {
                    count++;
                }
            }
        }

        return count;
    }
}
