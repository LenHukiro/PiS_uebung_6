package Molecule_Fabric.Generators;

import Molecule_Fabric.Atoms.OxygenAtom;
import Molecule_Fabric.Generator;

public class OxygenGenerator extends Generator {
    public OxygenGenerator(int rechargeDuration) {
        super(rechargeDuration);
    }
    @Override
    protected OxygenAtom generateMolecule() {
        return new OxygenAtom();
    }
}
