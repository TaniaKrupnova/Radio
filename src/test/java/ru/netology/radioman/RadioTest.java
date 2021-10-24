package ru.netology.radioman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    
 Radio radioStation = new Radio(8);
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
   
@Test
public void increaseVolumeFromBottomLimit() {

    
    radioStation.setVolume(0);
    int actual = radioStation.increaseVolume();
    int expected = 1;
    assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumePreCentre() {

        
        radioStation.setVolume(5);
        int actual = radioStation.increaseVolume();
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMax() {

         
        radioStation.setVolume(100);
        int actual = radioStation.increaseVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumePreMax() {

        
        radioStation.setVolume(99);
        int actual = radioStation.increaseVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }


    @Test
    public void decreaseVolumeMin() {

         
        radioStation.setVolume(0);
        int actual = radioStation.decreaseVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void decreaseVolumePreMin() {

         
        radioStation.setVolume(1);
        int actual = radioStation.decreaseVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void decreaseVolumeCentre() {

       
        radioStation.setVolume(60);
        int actual = radioStation.decreaseVolume();
        int expected = 59;
        assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeFromUpperLimit() {

        
        radioStation.setVolume(100);
        int actual = radioStation.decreaseVolume();
        int expected = 99;
        assertEquals(expected, actual);
    }

    
    @Test
    public void setVolumeOverLimit() {

        
        radioStation.setVolume(111);
        int actual = radioStation.decreaseVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void setVolumeFromBottomLimit() {

        
        radioStation.setVolume(-1);
        int actual = radioStation.decreaseVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }
    }
