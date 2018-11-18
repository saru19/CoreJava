package com.test;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if(kiloBytes >= 0) {
            int megaBytes = (int)kiloBytes/1024;
            int remainingKiloBytes = (int)kiloBytes%1024;
            System.out.println(kiloBytes +" KB = "+megaBytes+" MB " +"and " +remainingKiloBytes +" KB");

        } else {
            System.out.println("Invalid Value");
        }
    }

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(2050);
    }
}
