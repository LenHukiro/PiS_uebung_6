package Molecule_Fabric.Generators;

import Molecule_Fabric.Atoms.HydrogenAtom;
import Molecule_Fabric.Generator;

public class HydrogenGenerator extends Generator {

    public HydrogenGenerator(int rechargeDuration) {
        super(rechargeDuration);
    }

    @Override
    protected HydrogenAtom generateMolecule() {
        return new HydrogenAtom();
    }

}
