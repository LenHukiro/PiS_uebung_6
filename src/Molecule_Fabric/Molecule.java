package Molecule_Fabric;

public abstract class Molecule implements IAtom {

    protected IAtom[] atoms;

    public Molecule(){
        setAtoms();
    }

    @Override
    public char getSymbol() {
        return 0;
    }

    protected abstract void setAtoms();
}
