package com.company;

public class Boy {
    private String name;
    private int age;

    Boy(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    public final String getName() {
        return name;
    }

    public final int getAge() {
        return age;
    }

    @Override
    public final String toString() {
        return name + "-" + age;
    }
}
