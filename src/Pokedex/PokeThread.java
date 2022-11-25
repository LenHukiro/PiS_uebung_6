package Pokedex;

import processing.core.PImage;

public class PokeThread extends Thread {
    static final PImage[] gen1 = new PImage[151];
    static int counter = 0;
    int start, end;

    PokeThread(int start, int end) {
        this.start = start;
        this.end = end;
        counter = end;
    }

    @Override
    public void run() {
        while (start < end) {
            for (int i = start; i < end; i++) {
                String p = String.format("https://assets.pokemon.com/assets/cms2/img/pokedex/full/%03d.png", i + 1);
                gen1[i] = Main.loadPokeImage(p);
            }
        }
    }



}
