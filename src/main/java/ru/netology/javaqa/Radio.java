package ru.netology.javaqa;

public class Radio {


    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 1;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {

        currentVolume = newCurrentVolume;
    }

    public void nextRadioStation() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = 9;
        }
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > 9) {
            return;
        }
        if (newCurrentRadioStation < 0) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public int currentVolume;
    public int currentRadioStation;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }


}
