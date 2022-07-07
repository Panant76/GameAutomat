package exeption;

public class ToysProblemException extends Exception{
    public ToysProblemException(){
        super("Проверьте количество игрушек!");
    }
}
