package Pokedex;

import processing.core.PApplet;
import processing.core.PImage;

public class OldMain extends PApplet {
    public static void main(String[] args) {
        PApplet.main(OldMain.class);
    }

    PImage[] gen1;
    int size = 100;

    @Override
    public void settings() {
        size(1500, 1100);
    }

    @Override
    public void setup() {
        gen1 = new PImage[151];
        for(int i=0; i<gen1.length; i++) {
            String p = String.format("https://assets.pokemon.com/assets/cms2/img/pokedex/full/%03d.png", i+1);
            gen1[i] = loadImage(p);
            System.out.println("Loaded: "+ i);
        }
        System.out.println("Done");
    }

    @Override
    public void draw() {
        background(255);
        for(int i=0; i<gen1.length; i++) {
            int xPos = (int)(i % 15) * size;
            int yPos = (int)(i / 15) * size;
            image(gen1[i], xPos, yPos, size, size);
        }
    }
}