package ru.netology.radioman;

public class Radio {

    private int numberStation;
    private int volume;

    public int increaseNumberStation() {
        if (numberStation < 9) {
            numberStation = numberStation + 1;
            return numberStation;
        }
        if (numberStation == 9) {
            numberStation = 0;
        }
        return numberStation;
    }

    public int decreaseNumberStation() {
        if (numberStation > 0) {
            numberStation = numberStation - 1;
            return numberStation;
        }

        if (numberStation == 0) {
            numberStation = 9;
        }
        return numberStation;
    }

    public int getNumberStation() {

        return numberStation;
    }

    public void setNumberStation(int newNumberStation) {

        if (newNumberStation > 9) {
            return;
        }
        if (newNumberStation < 0) {
            return;
        }

        this.numberStation = newNumberStation;
    }
    public void setNumberStationForCoverage(int newNumberStation) {

        this.numberStation = newNumberStation;

    }
    public int increaseVolume() {
        if (volume < 10) {
            volume = volume + 1;
        }
        return volume;
    }

    public int decreaseVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
        return volume;
    }
    public void setVolume(int newVolume) {

        if (newVolume > 10) {
            return;
        }
        if (newVolume < 0) {
            return;
        }

        this.volume = newVolume;
    }
    }
