package com.cribs.vue;

import java.util.Scanner;

public class UITools {
    private static final Scanner kb = new Scanner(System.in);
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLUE  = "\u001B[34m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_RED   = "\u001B[31m";

    static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static int getInt() {
        prompt("ENTER SELECTION: ");
        return Integer.parseInt(kb.nextLine());
    }

    public static void prompt(String message) {
        System.out.print(ANSI_BLUE + ">  " + message.toUpperCase() + ANSI_RESET);
    }

    static void header(String message) {
        System.out.println(ANSI_GREEN + ">  " + message.toUpperCase() + ANSI_RESET);
    }

    static void warning(String message) {
        System.out.print(ANSI_RED + ">  " + message.toUpperCase() + "\n" + ANSI_RESET);
    }
}