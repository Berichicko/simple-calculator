package by.zasinets.qa;

public class Multiplication implements Сalculator {
    private final int numberFirst;
    private final int numberSecond;

    public Multiplication(int numberFirst, int numberSecond) {
        this.numberFirst = numberFirst;
        this.numberSecond = numberSecond;
    }

    @Override
    public int calculation() {
        int result = numberFirst * numberSecond;
        return result;
    }
}
