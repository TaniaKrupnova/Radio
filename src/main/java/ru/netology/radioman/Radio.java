package ru.netology.radioman;

public class Radio {

    private int numberStation;
    private int volume;
    private int totalStation = 10;

    public int increaseNumberStation() {
        if (numberStation < totalStation -1) {
            numberStation = numberStation + 1;
            return numberStation;
        }
        if (numberStation == totalStation -1) {
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
            numberStation = totalStation -1;
        }
        return numberStation;
    }

    public int getNumberStation() {

        return numberStation;
    }

    public void setNumberStation(int newNumberStation) {

        if (newNumberStation > totalStation - 1) {
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
    public Radio (int totalStation) {
        this. totalStation = totalStation;
    }
    pablic Radio () {
    }
        
    public int increaseVolume() {
        if (volume < 100) {
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

        if (newVolume > 100) {
            return;
        }
        if (newVolume < 0) {
            return;
        }

        this.volume = newVolume;
    }
    }
