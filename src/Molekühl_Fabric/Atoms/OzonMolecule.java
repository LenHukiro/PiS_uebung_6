package Molekühl_Fabric.Atoms;

import Molekühl_Fabric.Generators.OxygenGenerator;
import Molekühl_Fabric.IAtom;
import Molekühl_Fabric.Molecule;

public class OzonMolecule extends Molecule {

    public OzonMolecule() {
        super();
    }

    @Override
    public String getStringSymbol() {
        return "3O";
    }
    @Override
    protected void setAtoms() {
        atoms = new IAtom[3];
        OxygenGenerator generator;

        for (int i = 0; i < 3; i++) {
            atoms[i] = new OxygenAtom();
        }
    }
}
