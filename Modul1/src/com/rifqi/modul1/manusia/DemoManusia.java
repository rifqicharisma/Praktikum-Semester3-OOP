package com.rifqi.modul1.manusia;

public class DemoManusia {
    public static void main(String[] args) {
        // Array of object
        Manusia arrayMahasiswa[] = new Manusia[3];

        // constructor tipe pertama
        Manusia manusia1 = new Manusia();
        manusia1.setNama("Jean");
        manusia1.setUmur(20);

        // constructor tipe kedua
        Manusia manusia2 = new Manusia("Fischl");

        // constructor tipe ketiga
        Manusia manusia3 = new Manusia("Barbara", 18);

        arrayMahasiswa[0] = manusia1;
        arrayMahasiswa[1] = manusia2;
        arrayMahasiswa[2] = manusia3;

        for (Manusia x : arrayMahasiswa) {
            System.out.println("Character");
            System.out.println("Nama\t: " + x.getNama());
            System.out.println("Umur\t: " + x.getUmur());
        }
    }
}
