package Molekühl_Fabric.Generators;

import Molekühl_Fabric.Atoms.OzonMolecule;

public class OzonGenerator extends multipleAtomGenerator {

OxygenGenerator oxygenGenerator;
    public OzonGenerator(int distance,OxygenGenerator oxygenGenerator) {
        super(distance);
        this.oxygenGenerator = oxygenGenerator;
    }

    @Override
    protected OzonMolecule generateMolecule() {
            oxygenGenerator.getMolecule();
            oxygenGenerator.getMolecule();
            oxygenGenerator.getMolecule();
            return new OzonMolecule();
    }

    public void setRechargeDuration() {
        try {
            Thread.sleep(rechargeDuration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
