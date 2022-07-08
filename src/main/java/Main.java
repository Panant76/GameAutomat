import entity.gamefield.GameField;
import processmanager.GameAutomat;

public class Main {
    public static void main(String[] args) {
        GameAutomat gameAutomat=new GameAutomat();
        GameField gameField = new GameField();
        gameAutomat.run();
        //gameField.printField(gameField.GameField(3, 4));
    }
}
