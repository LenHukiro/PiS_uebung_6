package Molecule_Fabric.Generators;

import Molecule_Fabric.Generator;
import Molecule_Fabric.IAtom;


public abstract class MultipleAtomGenerator extends Generator {
    private IAtom[] atoms;

    public MultipleAtomGenerator(int distance) {
        super(distance);
    }


    protected IAtom[] getAtoms() {
        return atoms;
    }

    @Override
    protected void generate() {
        super.generate();
    }


    public void setRechargeDuration() {
        try {
            Thread.sleep(rechargeDuration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
