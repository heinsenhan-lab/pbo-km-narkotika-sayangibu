package util;

import model.KnowledgeRepository;
import model.Putusan;

public class DataSeeder {

    public static void isiDataAwal(KnowledgeRepository repository) {
        for (int i = 1; i <= 50; i++) {
            repository.simpan(new Putusan(
                    String.format("%03d", i),
                    i <= 10 ? "PN Malang" :
                            i <= 20 ? "PN Surabaya" :
                                    i <= 30 ? "PN Jakarta" :
                                            i <= 40 ? "PN Bandung" : "PN Medan",

                    String.format("%02d-01-2024", (i % 28) + 1),

                    "Terdakwa " + i,

                    20 + (i % 25),

                    i % 3 == 0 ? "Ekstasi" :
                            i % 2 == 0 ? "Ganja" : "Sabu-sabu",

                    1.0 + (i % 15),

                    i % 3 == 0 ? "Pasal 114" :
                            i % 2 == 0 ? "Pasal 111" : "Pasal 112",

                    i % 4 == 0 ? "Pengedar" :
                            i % 3 == 0 ? "Kurir" :
                                    i % 2 == 0 ? "Penyimpan" : "Pengguna",

                    12 + ((i % 7) * 12),

                    300000000 + (i * 50000000L),

                    "Hakim " + ((char)('A' + (i % 10)))
            ));
        }
    }
}