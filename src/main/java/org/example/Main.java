package org.example;



import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.example.MeetingUtils.countOverlappingMeetings;

public class Main {
    public static void main(String[] args) {
//        Meeting meeting1 = new Meeting(10, 20);
//        Meeting meeting2 = new Meeting(15, 25);
//        System.out.println("Пересекаются ли встречи: " + meeting1.isOverlap(meeting2));

//        List<Meeting> meetings = Arrays.asList(
//                new Meeting(10, 20),
//                new Meeting(15, 25),
//                new Meeting(30, 40),
//                new Meeting(35, 45),
//                new Meeting(50, 60)
//        );
//
//
//
//            System.out.println("Общее количество пересечений: " + countOverlappingMeetings(meetings));
//    }
//
//    static List<Integer> proseh(List<Integer> sequence) {
//        return sequence.stream()
//                .filter(value -> value > 5)
//                .collect(Collectors.toList());
//    }

        HashMap<Integer, String> passportsAndNames = new HashMap<>();
        HashMap<Integer, String> passportsAndNames2 = new HashMap<>();

        passportsAndNames.put(212133, "Лидия Аркадьевна Бубликова");
        passportsAndNames.put(162348, "Иван Михайлович Серебряков");
        passportsAndNames.put(8082771, "Дональд Джон Трамп");

        passportsAndNames2.put(917352, "Алексей Андреевич Ермаков");
        passportsAndNames2.put(925648, "Максим Олегович Архаров");


        passportsAndNames.putAll(passportsAndNames2);
//        System.out.println(passportsAndNames);

        for (Map.Entry entry: passportsAndNames.entrySet()) {

            System.out.println(entry.getKey());

        }

    }
}
