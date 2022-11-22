package Molekühl_Fabric;

public abstract class Molecule implements IAtom {

    protected IAtom[] atoms;

    public Molecule(){
        setAtoms();
    }

    @Override
    public char getSymbol() {
        return 0;
    }

    public abstract String getStringSymbol();

    protected abstract void setAtoms();
}
