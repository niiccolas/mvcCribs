package com.cribs.model;

import java.util.Arrays;

public class Room {

    private static String name;
    private static int size;
    private static String[] furniture;

    public Room(String name, int size, String[] furniture) {
        Room.name      = name;
        Room.size      = size;
        Room.furniture = furniture;
    }

    public void displayInfos() {
        System.out.println("- Room: \"" + name + "\"");
        System.out.println("- Size: " + size + " sqft.");

        if(furniture != null)
            System.out.println("- Furniture: " + Arrays.toString(furniture));
    }
}
