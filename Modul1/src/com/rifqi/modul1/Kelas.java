package com.rifqi.modul1;

public class Kelas {
    private static String name = "Paiman";

    private static int setMinute(){
        int minute = 10;
        return minute;
    }

    public static void main(String[] args) {
        System.out.println("Nama\t\t: "+name);
        System.out.println("Set Minute\t: "+setMinute());
    }
}
