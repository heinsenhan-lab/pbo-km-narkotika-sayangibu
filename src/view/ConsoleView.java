package view;

import java.util.Scanner;

public class ConsoleView {
    private Scanner sc = new Scanner(System.in);

    public int tampilkanMenu() {
        System.out.println("\n===== KMS PUTUSAN NARKOTIKA =====");
        System.out.println("1. Tambah Putusan");
        System.out.println("2. Tampilkan Semua Putusan");
        System.out.println("3. Cari Putusan by Nomor");
        System.out.println("4. Cari Putusan by Nama");
        System.out.println("5. Statistik");
        System.out.println("6. Hapus Putusan");
        System.out.println("7. Keluar");
        System.out.print("Pilih menu: ");

        return Integer.parseInt(sc.nextLine());
    }

    public String[] inputFormPutusan() {
        String[] data = new String[12];

        System.out.print("Nomor Perkara: ");
        data[0] = sc.nextLine();

        System.out.print("Pengadilan: ");
        data[1] = sc.nextLine();

        System.out.print("Tanggal Putusan: ");
        data[2] = sc.nextLine();

        System.out.print("Nama Terdakwa: ");
        data[3] = sc.nextLine();

        return data;
    }
}