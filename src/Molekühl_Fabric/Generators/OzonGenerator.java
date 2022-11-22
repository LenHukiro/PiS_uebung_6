package Molekühl_Fabric.Generators;

import Molekühl_Fabric.Atoms.OzonMolecule;
import Molekühl_Fabric.Generator;

public class OzonGenerator extends Generator {

    public OzonGenerator(int distance) {
        super(distance);
    }

    @Override
    protected OzonMolecule generateMolecule() {
        return new OzonMolecule();
    }

    public void setRechargeDuration(){
        try {
            Thread.sleep(rechargeDuration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
