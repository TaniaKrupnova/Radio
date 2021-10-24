package ru.netology.radioman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radioStation = new Radio();

    @Test
    public void increaseNumberStationMax() {

        
        radioStation.setNumberStation(9);
        int actual = radioStation.increaseNumberStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void decreaseNumberStationMin() {

       
        radioStation.setNumberStation(0);
        int actual = radioStation.decreaseNumberStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseNumberStationMin() {
        
        radioStation.setNumberStation(0);
        int actual = radioStation.increaseNumberStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseNumberStationPreMin() {
        
        radioStation.setNumberStation(1);
        int actual = radioStation.increaseNumberStation();
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseNumberStationCentre() {
        
        radioStation.setNumberStation(50);
        int actual = radioStation.increaseNumberStation();
        int expected = 51;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseNumberStationPreMax() {
        
        radioStation.setNumberStation(8);
        int actual = radioStation.increaseNumberStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void decreaseNumberStationPreMin() {
        
        radioStation.setNumberStation(1);
        int actual = radioStation.decreaseNumberStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void decreaseNumberStationCentre() {
       
        radioStation.setNumberStation(5);
        int actual = radioStation.decreaseNumberStation();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void decreaseNumberStationMax() {
        
        radioStation.setNumberStation(9);
        int actual = radioStation.decreaseNumberStation();
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    public void decreaseNumberStationPreMax() {
        
        radioStation.setNumberStation(8);
        int actual = radioStation.decreaseNumberStation();
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseNumberStationUnderLimit() {

       
        radioStation.setNumberStation(11);
        int actual = radioStation.increaseNumberStation();
        int expected = 11;
        assertEquals(expected, actual);
    }

    @Test
    public void decreaseNumberStationOverLimit() {

        
        radioStation.setNumberStation(-1);
        int actual = radioStation.decreaseNumberStation();
        int expected = -1;
        assertEquals(expected, actual);
    }

    //сеттер
    @Test
    public void setStationFromBottomLimit() {
        
        radioStation.setNumberStation(0);
        int actual = radioStation.getNumberStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void setStation() {
        
        radioStation.setNumberStation(5);
        int actual = radioStation.getNumberStation();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void setStationFromAboveLimit() {
        
        radioStation.setNumberStation(10);
        int actual = radioStation.getNumberStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void setStationFromUpperLimit() {
        
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
     Radio radioVolume = new Radio();
@Test
public void increaseVolumeFromBottomLimit() {

   
    radioVolume.setVolume(0);
    int actual = radioVolume.increaseVolume();
    int expected = 1;
    assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumePreCentre() {

        
        radioVolume.setVolume(5);
        int actual = radioVolume.increaseVolume();
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMax() {

        
        radioVolume.setVolume(100);
        int actual = radioVolume.increaseVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumePreMax() {

       
        radioVolume.setVolume(99);
        int actual = radioVolume.increaseVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }


    @Test
    public void decreaseVolumeMin() {

        
        radioVolume.setVolume(0);
        int actual = radioVolume.decreaseVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void decreaseVolumePreMin() {

        
        radioVolume.setVolume(1);
        int actual = radioVolume.decreaseVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void decreaseVolumeCentre() {

       
        radioVolume.setVolume(60);
        int actual = radioVolume.decreaseVolume();
        int expected = 59;
        assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeFromUpperLimit() {

       
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
