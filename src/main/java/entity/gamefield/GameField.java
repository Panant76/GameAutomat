package entity.gamefield;

import java.util.Arrays;

public class GameField {
    public String[][] GameField(int width, int height) {
        String[][] field = new String[3][4];
        for (String[] strings : field) {
            Arrays.fill(strings, "0");
        }
        return field;
    }

    public void printField(String[][]field) {

        for (String[] strings : field) {
            for (String string : strings) {
                System.out.print(string);
            }
            System.out.println();
        }
    }
}