package com.Mora.LatihanModul1.Constructor;

import java.util.Scanner;

public class DemoDataMahasiswaBaru {
    public static void main(String[] args) { //method
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("\t\t\t\t\tPENDAFTARAN MAHASISWA BARU LE CORDON BLEU");
        System.out.println();

        System.out.print("Nama Lengkap\t\t\t: ");
        String nama = scanner.nextLine();

        System.out.print("Jenis Kelamin\t\t\t: ");
        String jeniskel = scanner.nextLine();

        System.out.print("Tempat Tanggal Lahir\t: ");
        String TTL = scanner.nextLine();

        System.out.print("Alamat\t\t\t\t\t: ");
        String alamat = scanner.nextLine();

        System.out.print("Agama\t\t\t\t\t: ");
        String agama = scanner.nextLine();


        System.out.println("Program Studi : ");
        System.out.println("Cuisine");
        System.out.println("Pastry & Confectionery");
        System.out.println("Hospitality Managemet & Gastronomy");
        System.out.println("Wine & Spirits");
        System.out.println("Culinary Arts & Business");
        System.out.println("Continuing Education & Professional Development");
        System.out.println("Bakery, Danish Pastries & Artisan Breads");
        System.out.println("Gourmet");
        System.out.println("Cheesse");
        System.out.println("Tourism, Conventions & Events");
        System.out.println();
        String prodi = scanner.nextLine();

        System.out.print("Email\t\t\t\t\t: ");
        String email = scanner.nextLine();

        System.out.print("Nama Orang Tua\t\t\t: ");
        String namaortu = scanner.nextLine();

        System.out.print("Asal Sekolah\t\t\t: ");
        String asalSekolah = scanner.nextLine();

        System.out.print("Nomor HP\t\t\t\t: ");
        String noHP = scanner.nextLine();

        System.out.print("Media Sosial\t\t\t\t: ");
        String mediasosial = scanner.nextLine();

        System.out.print("Nilai\t\t\t\t\t: ");
        int nilai = scanner.nextInt();
        System.out.println();
        System.out.println();

        DataMahasiswaBaru mahasiswaBaru = new DataMahasiswaBaru(nama, jeniskel, TTL, alamat, agama, prodi, email, namaortu, asalSekolah, noHP, mediasosial, nilai);
        System.out.println("\t\t\t\t\tDATA MAHASISWA BARU LE CORDON BLUE");
        System.out.println();
        System.out.println("Nama Lengkap\t\t\t: " + mahasiswaBaru.nama);
        System.out.println("Jenis Kelamin\t\t\t: " + mahasiswaBaru.jeniskel);
        System.out.println("Tempat Tanggal Lahir\t: " + mahasiswaBaru.TTL);
        System.out.println("Alamat\t\t\t\t\t: " + mahasiswaBaru.alamat);
        System.out.println("Agama\t\t\t\t\t: " + mahasiswaBaru.agama);
        System.out.println("Program Studi\t\t\t: " + mahasiswaBaru.prodi);
        System.out.println("Email\t\t\t\t\t: " + mahasiswaBaru.email);
        System.out.println("Nama Oang Tua\t\t\t: " + mahasiswaBaru.namaortu);
        System.out.println("Asal Sekolah\t\t\t: " + mahasiswaBaru.asalSekolah);
        System.out.println("Nomor HP\t\t\t\t: " + mahasiswaBaru.noHP);
        System.out.println("Media Sosial\t\t\t\t:" + mahasiswaBaru.mediasosial);
        System.out.println("Nilai\t\t\t\t\t: " + mahasiswaBaru.nilai);

    }
}
