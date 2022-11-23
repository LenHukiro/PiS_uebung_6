package Molekühl_Fabric;

import Molekühl_Fabric.Generators.HydrogenGenerator;
import Molekühl_Fabric.Generators.OxygenGenerator;
import Molekühl_Fabric.Generators.OzonGenerator;
import Molekühl_Fabric.Generators.WaterGenerator;
import processing.core.PApplet;

import java.util.ArrayList;
import java.util.Random;

public class Main extends PApplet {
    final int height = 800,width = 1600;
    final Generator[] generators = new Generator[4];
    public static void main(String[] args) {
        PApplet.main(Molekühl_Fabric.Main.class);
    }

    @Override
    public void setup() {
        HydrogenGenerator hydrogenGenerator= new HydrogenGenerator(20000);
        OxygenGenerator oxygenGenerator = new OxygenGenerator(30000);
        generators[0] = hydrogenGenerator;
        generators[1] = oxygenGenerator;
        generators[2] = new OzonGenerator(5000,oxygenGenerator);
        generators[3] = new WaterGenerator(4000,oxygenGenerator,hydrogenGenerator);


        for (Generator generator : generators) {
            generator.start();
        }
    }

    @Override
    public void settings() {
        size(width, height);
    }
boolean init;
    @Override
    public void draw() {
        fill(255);
        ArrayList<IAtom> atoms = new ArrayList<>();
        for (int i = 0;i<generators.length;i++) {
            for (int j = 0; j < generators[i].getMoleculeCount(); j++) {
                atoms.add(generators[i].getMolecule());
            }
        }
        Random r = new Random();
        for (IAtom atom :
                atoms) {
            int circleWidth = r.nextInt(0,width);
            int circleHeight = r.nextInt(0,height);

            circle(circleWidth,circleHeight,30);
            textSize(12);
            fill(color(0, 0, 0));
            if(!atom.getStringSymbol().equals("")){
                text(atom.getStringSymbol(),circleWidth-5,circleHeight+5);
            } else if(atom.getSymbol() != ' '){
                text(atom.getSymbol(),circleWidth-10,circleHeight+5);
            }
            fill(200);
        }

    }

}
