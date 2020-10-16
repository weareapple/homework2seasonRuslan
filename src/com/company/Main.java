package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args){
        Pet pet = new Pet("name",45,Color.BLACK,new Shelter("home","bishkek"));
        Dog dog = new Dog("Кучук",12,Color.WHITE,new Shelter("street","Sokuluk"),
                "hyze",new String[]{"common,sit down"});
        Dog dog2 = new Dog("Мышык", 2, Color.GRAY, new Shelter("street", "Where"),
                "omg",new String[]{"lie,voice"});

        System.out.println(pet.getInfo());
        System.out.println("__________________________________________");

        System.out.println(dog.getInfo());
        System.out.println("__________________________________________");
        System.out.println(dog2.getInfo());
        System.out.println("__________________________________________");

        dog.makeVoice("Fight",2);
        dog.makeVoice(1,"run");
        dog.makeVoice("2un");
    }
}



