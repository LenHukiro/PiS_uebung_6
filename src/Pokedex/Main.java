package Pokedex;

import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet {
    public static void main(String[] args) {
        PApplet.main(Main.class);
    }
    final int size = 100;

    @Override
    public void settings() {
        size(1900, 1400);
    }

    @Override
    public void setup() {
        surface.setResizable(true);
        int j = 0;
        PokeThread[] threads = new PokeThread[6];
        for (int i = 0; j<151; i++) {
            j+= 30;
            if(j>=151) j = 151;
            System.out.println("start ="+PokeThread.counter+" end= "+j);
            threads[i]= new PokeThread(PokeThread.counter,j);
            threads[i].start();
        }
        System.out.println("Done");
    }

    public static PImage loadPokeImage(String p ){
        return new Main().loadImage(p);
    }

    @Override
    public void draw() {
        background(255);
        for(int i=0; i<PokeThread.gen1.length; i++) {
            int xPos = (i % 15) * size;
            int yPos = (i / 15) * size;
            if(PokeThread.gen1[i] == null){
                textSize(12);
                fill(color(0, 0, 0));
                text("Loading", xPos+(float)size/2, yPos+(float)size/2);
            }else
                image(PokeThread.gen1[i], xPos, yPos, size, size);
        }
    }
}