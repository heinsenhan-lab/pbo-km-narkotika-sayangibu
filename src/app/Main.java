package app;

import controller.KnowledgeController;
import model.KnowledgeRepository;
import view.ConsoleView;

public class Main {
    public static void main(String[] args) {
        KnowledgeRepository repository = new KnowledgeRepository();
        KnowledgeController controller = new KnowledgeController(repository);
        ConsoleView view = new ConsoleView();

        boolean running = true;

        while (running) {
            try {
                int pilihan = view.tampilkanMenu();

                switch (pilihan) {
                    case 1:
                        String[] data = view.inputFormPutusan();
                        if (controller.tambahPutusan(data)) {
                            view.tampilkanPesan("Data berhasil ditambahkan.");
                        } else {
                            view.tampilkanPesan("Data gagal ditambahkan.");
                        }
                        break;

                    case 2:
                        view.tampilkanDaftarPutusan(controller.tampilkanSemua());
                        break;

                    case 3:
                        String nomor = view.inputKeyword("Masukkan nomor perkara: ");
                        view.tampilkanDetail(controller.cariByNomor(nomor));
                        break;

                    case 4:
                        String nama = view.inputKeyword("Masukkan nama terdakwa: ");
                        view.tampilkanDaftarPutusan(controller.cariByNama(nama));
                        break;

                    case 5:
                        view.tampilkanStatistik(controller.getStatistik());
                        break;

                    case 6:
                        String nomorHapus = view.inputKeyword("Masukkan nomor perkara yang ingin dihapus: ");
                        if (controller.hapusPutusan(nomorHapus)) {
                            view.tampilkanPesan("Data berhasil dihapus.");
                        } else {
                            view.tampilkanPesan("Data tidak ditemukan.");
                        }
                        break;

                    case 7:
                        view.tampilkanPesan("Program selesai.");
                        running = false;
                        break;

                    default:
                        view.tampilkanPesan("Pilihan tidak valid.");
                }

            } catch (Exception e) {
                view.tampilkanPesan("Input tidak valid.");
            }
        }
    }
}