package _11_Classes_and_Objects.src;

class me {
    // data or instances
    String name;
    int age;
    String dob;
    String bloodgrp;
    String hobby;
    String nickname;
    String favanime;

}

public class Test {
    public static void main(String[] args) {
        me obj = new me();
        obj.name = "Aditya Ghosh";
        obj.age = 19;
        obj.bloodgrp = "A+";
        obj.dob = "19 april 2003";
        obj.hobby = "likes playing guitar";
        obj.favanime = "Naruto";
        obj.nickname = "andy";

        // printing essentials :

        System.err.println(obj.name);
        System.err.println(obj.nickname);
        System.err.println(obj.dob);
        System.err.println(obj.age);
        System.err.println(obj.bloodgrp);
        System.err.println(obj.hobby);
        System.err.println(obj.favanime);

    }
}
