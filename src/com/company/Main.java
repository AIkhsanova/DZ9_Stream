package com.company;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(final String[] args) {
        final ArrayList<Boy> boys = new ArrayList<>() {{
            add(new Boy("Николай", 68));
            add(new Boy("Пётр", 53));
            add(new Boy("Василий", 25));
            add(new Boy("Михаил", 19));
            add(new Boy("Алексей", 6));
            add(new Boy("Николай", 86));
            add(new Boy("Пётр", 35));
            add(new Boy("Михаил", 111));
            add(new Boy("Алексей", 22));
            add(new Boy("Михаил", 1));
            add(new Boy("Яков", 30));
        }};


        Map<String, Long> filtered = new HashMap<>();
        boys.stream()
                .filter(p -> p.getAge() > 18)
                .map(Boy::getName)
                .distinct()
                .sorted()
                .limit(4)
                .forEach(p -> filtered.put(p, boys.stream()
                        .filter(x -> x.getName().equals(p))
                        .count() - 1));
        System.out.println(filtered);

    }

}
