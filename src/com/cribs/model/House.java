package com.cribs.model;

public class House {
    private static String name;
    private static Room[] rooms;

    public House(String name, Room[] rooms) {
        House.name  = name;
        House.rooms = rooms;
    }

    public void displayInfos() {
        System.out.println("Your are in the house of: " + name);
        System.out.println("here are the rooms");

        for (Room room : rooms) {
            room.displayInfos();
        }
    }

    public String getName() {
        return name;
    }

}
