package com.cribs.controller;

import java.util.Scanner;

import com.cribs.model.House;
import com.cribs.model.Room;
import com.cribs.vue.UITools;

public class HouseBuilder {

    public static House build() {
        Scanner input = new Scanner(System.in);
        UITools.prompt("Enter a name for your house: ");

        String houseName = input.nextLine();
        System.out.println("*** The House of " + houseName + " ***");

        String[] entranceFurniture = {"welcome rug"};
        Room entrance = new Room("Entrance", 5, entranceFurniture);

        Room[] houseRooms = {entrance};

        return new House(houseName, houseRooms);
    }
}
