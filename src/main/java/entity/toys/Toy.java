package entity.toys;

import exeption.ToysProblemException;

public class Toy {
    private int quanToys;

    public Toy(int quanToys) {
        this.quanToys = quanToys;
    }

    public void setQuanToys() {
        this.quanToys = quanToys - 1;
    }

    public boolean checkQuanToys() throws ToysProblemException {
        if (quanToys > 10 || quanToys < 2) {
            throw new ToysProblemException();
        }
        return true;
    }
}
