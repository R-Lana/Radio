package ru.netology.radio;

public class Radio {
    private int currentNumber;

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

    public int increaseVolume(int currentVolume) {
        if (currentVolume < 9) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 9;
        }
        return currentVolume;
    }

    public int decreaseVolume(int currentVolume) {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
        return currentVolume;
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


}

