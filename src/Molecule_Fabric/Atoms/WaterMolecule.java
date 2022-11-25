package Molecule_Fabric.Atoms;

import Molecule_Fabric.IAtom;
import Molecule_Fabric.Molecule;

public class WaterMolecule extends Molecule {

    public WaterMolecule() {
        super();
    }

    @Override
    public String getStringSymbol() {
        return "H2O";
    }

    protected void setAtoms() {
        atoms = new IAtom[3];

        atoms[0] = new OxygenAtom();
        atoms[1] = new OxygenAtom();
        atoms[2] = new HydrogenAtom();
    }
}
