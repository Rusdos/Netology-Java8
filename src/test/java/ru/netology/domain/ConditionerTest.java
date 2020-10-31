package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        int expected = 40;
        conditioner.setMaxTemperature(40);
        conditioner.increaseCurrentTemperature(39);
        assertEquals(expected, conditioner.getCurrentTemperature());

    }

    @Test
    void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        int expected = 0;
        conditioner.setMinTemperature(0);
        conditioner.decreaseCurrentTemperature(0);
        assertEquals(expected, conditioner.getCurrentTemperature());
    }
}