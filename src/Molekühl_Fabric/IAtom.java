package Molekühl_Fabric;

public interface IAtom {

    char getSymbol();
    default String getStringSymbol(){
            return String.valueOf(getSymbol());
    }
}
