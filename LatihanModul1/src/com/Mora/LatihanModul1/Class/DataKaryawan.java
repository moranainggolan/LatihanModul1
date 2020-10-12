package com.Mora.LatihanModul1.Class;

public class DataKaryawan {
    private static String nama = "Charlie Puth";
    private static String jeniskelamin = "Laki-laki";
    private static String ttl = "Rumson, 2 Desember 1991";
    private static String alamat = "Amerika";
    private static String agama = "Kristen";
    private static String kewarganegaraan = "Amerika";
    private static String noHP = "082258433701";

    public static void main(String[] args) { //method
        System.out.println();
        System.out.println("\t\t\t\t\tDATA KARYAWAN");
        System.out.println();
        System.out.println("Nama Lengkap\t\t\t: " + nama);
        System.out.println("Jenis Kelamin\t\t\t: " + jeniskelamin);
        System.out.println("Tempat Tanggal Lahir\t: " + ttl);
        System.out.println("Alamat\t\t\t\t\t: " + alamat);
        System.out.println("Agama\t\t\t\t\t: " + agama);
        System.out.println("Kewarganegaraan\t\t\t: " + kewarganegaraan);
        System.out.println("Nomor HP\t\t\t\t: " + noHP);
    }
}
