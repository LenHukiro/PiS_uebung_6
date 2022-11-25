package Molekühl_Fabric.Generators;

import Molekühl_Fabric.Atoms.WaterMolecule;

public class WaterGenerator extends MultipleAtomGenerator {
    OxygenGenerator oxygenGenerator;
    HydrogenGenerator hydrogenGenerator;
    public WaterGenerator(int distance,OxygenGenerator oxygenGenerator,HydrogenGenerator hydrogenGenerator) {
        super(distance);
        this.oxygenGenerator = oxygenGenerator;
        this.hydrogenGenerator = hydrogenGenerator;
    }

    @Override
    protected WaterMolecule generateMolecule() {
        hydrogenGenerator.getMolecule();
        oxygenGenerator.getMolecule();
        oxygenGenerator.getMolecule();
        return new WaterMolecule();

    }



}
