package ru.netology.radio;

public class Radio {
    private int currentNumber;
    private int currentVolume;

    public int getCurrentNumber() {
        return currentNumber;
    }


    public int setCurrentNumber(int newCurrentNumber) {

        if (newCurrentNumber > 9) {
            while (newCurrentNumber > 9) {
                newCurrentNumber = newCurrentNumber / 10;
            }
        }
        currentNumber = newCurrentNumber;
        return currentNumber;
    }

    public int next(int number) {
        if (number < 9) {
            number = number + 1;
        } else {
            number = 0;
        }
        return number;
    }

    public int prev(int number) {
        if (number <= 0) {
            number = 9;
        } else {
            number = number - 1;
        }
        return number;
    }

    public int plus(int volume) {
        if (volume >= 9) {
            volume = 9;
        } else {
            volume = volume + 1;
        }
        return volume;
    }

    public int minus(int volume) {
        if (volume <= 0) {
            volume = 0;
        } else {
            volume = volume - 1;
        }
        return volume;
    }
}

