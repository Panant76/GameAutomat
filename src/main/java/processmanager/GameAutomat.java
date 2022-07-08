package processmanager;

import entity.many.Coins;
import entity.toys.Toy;
import exeption.ToysProblemException;
import service.IOService;
import service.IOServiceImpl;

public class GameAutomat {
    private int counter = 1;
    private Coins coins;
    private Toy toy;
    private IOService ioservise;

    public GameAutomat() {
        this.coins = new Coins(50);
        this.toy = new Toy(10);
        this.ioservise = new IOServiceImpl();

    }

    public void run() {
        welcomMessage();
        chooseOperation();
    }

    public void chooseOperation() {
        int operation = ioservise.read();
        switch (operation) {
            case 50:
                startGame(operation / 50);
                break;
            case 1:
            case 2:
                startGame((operation * 100) / 50);
                break;
            default:
                ioservise.write("Не известная операция");
                run();
        }
    }

    public void startGame(int gameCounter) {
        while (checkQuanToys()) {
            for (int i = 0; i < gameCounter; i++) {
                if (counter % 5 == 0) {
                    ioservise.write("Вы выиграли !!!");
                    toy.setQuanToys();
                } else {
                    ioservise.write("Вы проиграли !!!");
                }
                counter = counter + 1;

            }
            run();
            break;
        }
    }

    private void welcomMessage() {
        ioservise.write("Закиньте монету (1 игра - 50 копеек)");
        ioservise.write("Принимаются монеты достоинством: 50 коп., 1 руб., 2 руб.");
    }

    public boolean checkQuanToys() {
        try {
            if (toy.checkQuanToys()) return true;
        } catch (ToysProblemException e) {
            ioservise.write(e.getMessage());
        }
        return false;
    }
}
