package ru.netology.radioman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    

    @Test
    public void increaseNumberStationMax() {

        Radio radioStation = new Radio();
        radioStation.setNumberStation(9);
        int actual = radioStation.increaseNumberStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void decreaseNumberStationMin() {

       Radio radioStation = new Radio();
        radioStation.setNumberStation(0);
        int actual = radioStation.decreaseNumberStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseNumberStationMin() {
        Radio radioStation = new Radio();
        radioStation.setNumberStation(0);
        int actual = radioStation.increaseNumberStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseNumberStationPreMin() {
        Radio radioStation = new Radio();
        radioStation.setNumberStation(1);
        int actual = radioStation.increaseNumberStation();
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseNumberStationCentre() {
        Radio radioStation = new Radio();
        radioStation.setNumberStation(50);
        int actual = radioStation.increaseNumberStation();
        int expected = 51;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseNumberStationPreMax() {
        Radio radioStation = new Radio();
        radioStation.setNumberStation(8);
        int actual = radioStation.increaseNumberStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void decreaseNumberStationPreMin() {
        Radio radioStation = new Radio();
        radioStation.setNumberStation(1);
        int actual = radioStation.decreaseNumberStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void decreaseNumberStationCentre() {
       Radio radioStation = new Radio();
        radioStation.setNumberStation(5);
        int actual = radioStation.decreaseNumberStation();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void decreaseNumberStationMax() {
        Radio radioStation = new Radio();
        radioStation.setNumberStation(9);
        int actual = radioStation.decreaseNumberStation();
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    public void decreaseNumberStationPreMax() {
        Radio radioStation = new Radio();
        radioStation.setNumberStation(8);
        int actual = radioStation.decreaseNumberStation();
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseNumberStationUnderLimit() {

       Radio radioStation = new Radio();
        radioStation.setNumberStation(11);
        int actual = radioStation.increaseNumberStation();
        int expected = 11;
        assertEquals(expected, actual);
    }

    @Test
    public void decreaseNumberStationOverLimit() {

        Radio radioStation = new Radio();
        radioStation.setNumberStation(-1);
        int actual = radioStation.decreaseNumberStation();
        int expected = -1;
        assertEquals(expected, actual);
    }

    //сеттер
    @Test
    public void setStationFromBottomLimit() {
        Radio radioStation = new Radio();
        radioStation.setNumberStation(0);
        int actual = radioStation.getNumberStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void setStation() {
        Radio radioStation = new Radio();
        radioStation.setNumberStation(5);
        int actual = radioStation.getNumberStation();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void setStationFromAboveLimit() {
        Radio radioStation = new Radio();
        radioStation.setNumberStation(10);
        int actual = radioStation.getNumberStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void setStationFromUpperLimit() {
        Radio radioStation = new Radio();
        radioStation.setNumberStation(9);
        int actual = radioStation.getNumberStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void setStationFromLowerBottomLimit() {
       
        radioStation.setNumberStation(-1);
        int actual = radioStation.getNumberStation();
        int expected = 0;
        assertEquals(expected, actual);
    }
// volume
    
@Test
public void increaseVolumeFromBottomLimit() {

    Radio radioVolume = new Radio();
    radioVolume.setVolume(0);
    int actual = radioVolume.increaseVolume();
    int expected = 1;
    assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumePreCentre() {

         Radio radioVolume = new Radio();
        radioVolume.setVolume(5);
        int actual = radioVolume.increaseVolume();
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMax() {

         Radio radioVolume = new Radio();
        radioVolume.setVolume(100);
        int actual = radioVolume.increaseVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumePreMax() {

        Radio radioVolume = new Radio();
        radioVolume.setVolume(99);
        int actual = radioVolume.increaseVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }


    @Test
    public void decreaseVolumeMin() {

         Radio radioVolume = new Radio();
        radioVolume.setVolume(0);
        int actual = radioVolume.decreaseVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void decreaseVolumePreMin() {

         Radio radioVolume = new Radio();
        radioVolume.setVolume(1);
        int actual = radioVolume.decreaseVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void decreaseVolumeCentre() {

        Radio radioVolume = new Radio();
        radioVolume.setVolume(60);
        int actual = radioVolume.decreaseVolume();
        int expected = 59;
        assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeFromUpperLimit() {

        Radio radioVolume = new Radio();
        radioVolume.setVolume(100);
        int actual = radioVolume.decreaseVolume();
        int expected = 99;
        assertEquals(expected, actual);
    }

    
    @Test
    public void setVolumeOverLimit() {

        Radio radioVolume = new Radio();
        radioVolume.setVolume(111);
        int actual = radioVolume.decreaseVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void setVolumeFromBottomLimit() {

        Radio radioVolume = new Radio();
        radioVolume.setVolume(-1);
        int actual = radioVolume.decreaseVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }
    }
