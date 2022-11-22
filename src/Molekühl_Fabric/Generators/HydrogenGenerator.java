package Molekühl_Fabric.Generators;

import Molekühl_Fabric.Atoms.HydrogenAtom;
import Molekühl_Fabric.Generator;

public class HydrogenGenerator extends Generator {

    public HydrogenGenerator(int rechargeDuration) {
        super(rechargeDuration);
    }

    @Override
    protected HydrogenAtom generateMolecule() {
        return new HydrogenAtom();
    }

}
