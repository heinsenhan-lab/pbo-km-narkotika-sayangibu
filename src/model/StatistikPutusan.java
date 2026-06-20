package model;

import java.util.ArrayList;

public class StatistikPutusan {
    private int totalPutusan;
    private double rataRataVonis;
    private double rataRataDenda;

    public StatistikPutusan(ArrayList<Putusan> daftar) {
        totalPutusan = daftar.size();

        if (daftar.isEmpty()) {
            rataRataVonis = 0;
            rataRataDenda = 0;
            return;
        }

        int totalVonis = 0;
        double totalDenda = 0;

        for (Putusan p : daftar) {
            totalVonis += p.getVonisHukuman();
            totalDenda += p.getVonisDenda();
        }

        rataRataVonis = (double) totalVonis / daftar.size();
        rataRataDenda = totalDenda / daftar.size();
    }

    public int getTotalPutusan() {
        return totalPutusan;
    }

    public double getRataRataVonis() {
        return rataRataVonis;
    }

    public double getRataRataDenda() {
        return rataRataDenda;
    }
}