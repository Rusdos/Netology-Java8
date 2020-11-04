package ru.netology.domain;

public class Radio {
    private int station;
    private int volume;

    public int getStation() {
        return station;
    }

    public void setStation(int station) {

        if (station < 0) {
            return;
        }
        if (station > 9) {
            this.station = 9;
            return;
        }
        this.station = station;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume > 10) {
            this.volume = 10;
            return;
        }
        if (volume < 0) {
            return;
        }
        this.volume = volume;
    }

    public void increaseVolume() {
        if (this.getVolume() == 10) {
            return;
        }
        this.volume++;
    }

    public void decreaseVolume() {
        if (this.getVolume() == 0) {
            return;
        }
        this.volume--;
    }

    public void nextStation() {
        if (this.getStation() == 9) {
            this.setStation(0);
            return;
        }
        this.station++;
    }

    public void previousStation() {
        if (this.getStation() == 0) {
            this.setStation(9);
            return;
        }
        this.station--;
    }
}
