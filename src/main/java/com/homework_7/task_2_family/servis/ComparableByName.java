package com.homework_7.task_2_family.servis;

import com.homework_7.task_2_family.FamilyObject.Family;

import java.util.Collections;
import java.util.List;

public class ComparableByName implements Comparable<Family> {
    @Override
    public int compareTo(Family name) {
        return this.compareTo(name);
    }

    public void comparableByName(List list) {
        System.out.println("sort by name: ");
        Collections.sort(list);
    }
}