package Molekühl_Fabric.Generators;

import Molekühl_Fabric.Atoms.OxygenAtom;
import Molekühl_Fabric.Generator;

public class OxygenGenerator extends Generator {
    public OxygenGenerator(int rechargeDuration) {
        super(rechargeDuration);
    }
    @Override
    protected OxygenAtom generateMolecule() {
        return new OxygenAtom();
    }
}
