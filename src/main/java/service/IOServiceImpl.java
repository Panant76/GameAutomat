package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOServiceImpl implements IOService {
    private BufferedReader reader;

    public IOServiceImpl() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public int read() {
        try {
            String s = reader.readLine();
            return Integer.parseInt(s);
        } catch (IOException e) {
            write("Произошла Ошибка. Повторите ввод");
            return read();
        }
    }

    @Override
    public void write(String message) {
        System.out.println(message);
    }
}
