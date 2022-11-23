package Molekühl_Fabric.Generators;

import Molekühl_Fabric.Generator;
import Molekühl_Fabric.IAtom;


public abstract class multipleAtomGenerator  extends Generator {
    private IAtom[] atoms;

    public multipleAtomGenerator(int distance) {
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
