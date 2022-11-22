package Molekühl_Fabric;

import java.util.concurrent.Semaphore;

public abstract class Generator extends Thread  {
    protected int rechargeDuration;

    protected Semaphore molecules = new Semaphore(0);

    public Generator(int rechargeDuration){
        this.rechargeDuration = rechargeDuration;
        while(true){
            setRechargeDuration();
            generate();
        }
    }

    protected void generate() {
        molecules = new Semaphore(molecules.availablePermits()+1);
    }

    public IAtom getMolecule(){
        IAtom atom;
        try {
            molecules.acquire();
            atom = generateMolecule();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return atom;
    }

    protected abstract IAtom generateMolecule();

    protected void setRechargeDuration() {
        try {
            Thread.sleep(0,rechargeDuration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
