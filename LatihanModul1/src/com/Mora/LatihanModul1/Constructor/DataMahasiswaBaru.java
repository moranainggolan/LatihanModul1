package com.Mora.LatihanModul1.Constructor;

public class DataMahasiswaBaru {
    String nama, jeniskel, TTL, alamat, agama, prodi, email, namaortu, asalSekolah, noHP, mediasosial;
    int nilai;

    public DataMahasiswaBaru(String nama, String jeniskel, String TTL, String alamat, String agama,
                         String prodi, String email, String namaortu, String asalSekolah, String noHP, String mediasosial,
                         int nilai) {
        this.nama = nama;
        this.jeniskel = jeniskel;
        this.TTL = TTL;
        this.alamat = alamat;
        this.agama = agama;
        this.prodi = prodi;
        this.email = email;
        this.namaortu = namaortu;
        this.asalSekolah = asalSekolah;
        this.noHP = noHP;
        this.mediasosial = mediasosial;
        this.nilai = nilai;
    }
}
