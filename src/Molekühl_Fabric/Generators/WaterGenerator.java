package Molekühl_Fabric.Generators;

import Molekühl_Fabric.Atoms.WaterMolecule;
import Molekühl_Fabric.Generator;

public class WaterGenerator extends Generator {

    public WaterGenerator(int distance) {
        super(distance);
    }

    @Override
    protected WaterMolecule generateMolecule() {
        return new WaterMolecule();
    }

    public void setRechargeDuration(){
        try {
            Thread.sleep(rechargeDuration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
