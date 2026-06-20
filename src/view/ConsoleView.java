package view;

import model.Putusan;
import java.util.ArrayList;
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

        System.out.print("Umur Terdakwa: ");
        data[4] = sc.nextLine();

        System.out.print("Jenis Narkotika: ");
        data[5] = sc.nextLine();

        System.out.print("Berat Barang Bukti: ");
        data[6] = sc.nextLine();

        System.out.print("Pasal Dilanggar: ");
        data[7] = sc.nextLine();

        System.out.print("Peran Terdakwa: ");
        data[8] = sc.nextLine();

        System.out.print("Vonis Hukuman (bulan): ");
        data[9] = sc.nextLine();

        System.out.print("Vonis Denda: ");
        data[10] = sc.nextLine();

        System.out.print("Nama Hakim: ");
        data[11] = sc.nextLine();

        return data;
    }

    public String inputKeyword(String pesan) {
        System.out.print(pesan);
        return sc.nextLine();
    }

    public void tampilkanDaftarPutusan(ArrayList<Putusan> list) {
        if (list.isEmpty()) {
            System.out.println("Data tidak ditemukan.");
            return;
        }

        System.out.println("\n===== DAFTAR PUTUSAN =====");

        for (Putusan p : list) {
            p.tampilkan();
        }
    }

    public void tampilkanDetail(Putusan p) {
        if (p == null) {
            System.out.println("Data tidak ditemukan.");
        } else {
            System.out.println("\n===== DETAIL PUTUSAN =====");
            System.out.println(p);
        }
    }

    public void tampilkanPesan(String pesan) {
        System.out.println(pesan);
    }
}