package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        int expected = 39;
        conditioner.setMaxTemperature(40);
        conditioner.increaseCurrentTemperature(38);
        assertEquals(expected, conditioner.getCurrentTemperature());

    }
    @Test
    void increaseCurrentTemperatureEqualMax() {
        Conditioner conditioner = new Conditioner();
        int expected = 40;
        conditioner.setMaxTemperature(40);
        conditioner.increaseCurrentTemperature(40);
        assertEquals(expected, conditioner.getCurrentTemperature());

    }

    @Test
    void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        int expected = -1;
        conditioner.setMinTemperature(-3);
        conditioner.decreaseCurrentTemperature(0);
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    void decreaseCurrentTemperatureEqualMin() {
        Conditioner conditioner = new Conditioner();
        int expected = 0;
        conditioner.setMinTemperature(0);
        conditioner.decreaseCurrentTemperature(0);
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    void shouldSetCurrentTemperature(){
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(0);
        conditioner.setCurrentTemperature(10);
        assertEquals(10,conditioner.getCurrentTemperature());

    }

    @Test
    void setCurrentTemperatureAboveMax(){
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(0);
        conditioner.setCurrentTemperature(31);
        assertEquals(0,conditioner.getCurrentTemperature());

    }

    @Test
    void setCurrentTemperatureBelowMin(){
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(0);
        conditioner.setCurrentTemperature(-1);
        assertEquals(0,conditioner.getCurrentTemperature());

    }
}