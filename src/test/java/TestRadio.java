import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radio.Radio;

public class TestRadio {
    @Test
    public void shouldSetNumber() {
        Radio num = new Radio();
        num.setCurrentNumber(8);
        int expected = 8;
        int actual = num.getCurrentNumber();
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldNotSetNumberAboveMax() {
        Radio num = new Radio();
        num.setCurrentNumber(239);
        int expected = 2;
        int actual = num.getCurrentNumber();
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void moveToNextNumber() {
        Radio num = new Radio();
        int expected = 8;
        int actual = num.Next(7);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void moveToNextIfNumberAboveMax() {
        Radio num = new Radio();
        int expected = 0;
        int actual = num.Next(9);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void moveToPrevNumber() {
        Radio num = new Radio();
        int expected = 6;
        int actual = num.Prev(7);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void moveToPrevIfNumberUnderMin() {
        Radio num = new Radio();
        int expected = 9;
        int actual = num.Prev(0);
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void moveToPlus() {
        Radio value = new Radio();
        int expected = 8;
        int actual = value.Plus(7);
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void moveToPlusAboveMax() {
        Radio value = new Radio();
        int expected = 9;
        int actual = value.Plus(9);
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void moveToMinus() {
        Radio value = new Radio();
        int expected = 6;
        int actual = value.Minus(7);
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void moveToMinusUnderMin() {
        Radio value = new Radio();
        int expected = 0;
        int actual = value.Minus(0);
        Assertions.assertEquals(expected, actual);

    }

}