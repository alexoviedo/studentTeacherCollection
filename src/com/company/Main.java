package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student alex = new Student("Alex", "Oviedo", 1, 1);
        Student parker = new Student("Paker", "Hawkins", 2, 1);
        Student helen = new Student("Helen", "Shaw", 3, 1);
        Student sim = new Student("Simeran", "Dunno", 4, 1);
        Student ben = new Student("Ben", "Benson", 5, 1);
        Student kyle = new Student("Kyle", "Smith", 6, 1);
        Student chris = new Student("Chris", "Media", 7, 1);
        Student mike = new Student("Mike", "Hunt", 8, 1);
        Student tom = new Student("Tom", "Jones", 9, 1);
        Student jeff = new Student("Jeff", "Gif", 10, 1);
        Student kari = new Student("Kari", "Scharf", 11, 1);
        Student cindi = new Student("Cindi", "Harris", 12, 1);
        Student charlie = new Student("Charlie", "Day", 13, 1);
        Student adam = new Student("Adam", "Ant", 14, 1);
        Student amy = new Student("Amy", "Polher", 15, 1);
        Set<Student> one = new HashSet<>();
        one.add(parker);
        one.add(helen);
        one.add(sim);
        one.add(ben);
        one.add(kyle);
//        System.out.println("First grade:" + one);
        Set<Student> two = new HashSet<>();
        two.add(chris);
        two.add(mike);
        two.add(tom);
        two.add(jeff);
        two.add(kari);
//        System.out.println("First grade #2:" + two);
        Set<Student> three = new HashSet<>();
        three.add(cindi);
        three.add(charlie);
        three.add(adam);
        three.add(amy);
        three.add(alex);
//        System.out.println("First grade #3:" + three);
        ArrayList<Teacher> teacher = new ArrayList<>();
        Teacher doug = new Teacher("Doug", "Hughes", 1, 1);
        Teacher lexi = new Teacher("Lexi", "Namer", 2, 1);
        Teacher kaitlin = new Teacher("Kaitlin", "Cantmember", 3, 1);
        Set<Teacher> teacherSet = new HashSet<>();
        teacherSet.add(doug);
        teacherSet.add(lexi);
        teacherSet.add(kaitlin);
//        System.out.println("Here are the teachers:" + teacherSet);
        Map<Teacher, Set> mapSet = new HashMap<>();
        mapSet.put(doug, one);
        mapSet.put(lexi, two);
        mapSet.put(kaitlin, three);
//        System.out.println("School teacher roster:" + teacherSet);
        System.out.printf("Student teacher assignment collection: " + mapSet);
        for (Teacher key : mapSet.keySet()) {
            System.out.println("key" + key);
            for (Set value : mapSet.values()) {
                System.out.println("value" + value);
            }
        }
    }
}