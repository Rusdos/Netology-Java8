package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldSetStation() {
        Radio radio = new Radio();
        radio.setStation(3);
        assertEquals(3, radio.getStation());
    }

    @Test
    void shouldSetPrevStation() {
        Radio radio = new Radio();
        radio.setStation(-1);
        assertEquals(0, radio.getStation());
    }

    @Test
    void shouldSetNextStation() {
        Radio radio = new Radio();
        radio.setStation(10);
        assertEquals(9, radio.getStation());
    }

    @Test
    void shouldSetVolume() {
        Radio radio = new Radio();
        radio.setVolume(5);
        assertEquals(5, radio.getVolume());
    }

    @Test
    void shouldSetUnderVolume() {
        Radio radio = new Radio();
        radio.setVolume(-3);
        assertEquals(0, radio.getVolume());
    }

    @Test
    void shouldSetAboveVolume() {
        Radio radio = new Radio();
        radio.setVolume(11);
        assertEquals(10, radio.getVolume());
    }

    @Test
    void increaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(7);
        radio.increaseVolume();
        assertEquals(8, radio.getVolume());
    }

    @Test
    void increaseMaxVolume() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getVolume());
    }

    @Test
    void decreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(4);
        radio.decreaseVolume();
        assertEquals(3, radio.getVolume());
    }

    @Test
    void decreaseMinVolume() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());
    }

    @Test
    void nextStation() {
        Radio radio = new Radio();
        radio.setStation(8);
        radio.nextStation();
        assertEquals(9,radio.getStation());
    }

    @Test
    void nextFirstStation() {
        Radio radio = new Radio();
        radio.setStation(9);
        radio.nextStation();
        assertEquals(0,radio.getStation());
    }

    @Test
    void previousStation() {
        Radio radio = new Radio();
        radio.setStation(6);
        radio.previousStation();
        assertEquals(5,radio.getStation());
    }
    @Test
    void previousLastStation() {
        Radio radio = new Radio();
        radio.setStation(0);
        radio.previousStation();
        assertEquals(9,radio.getStation());
    }
}