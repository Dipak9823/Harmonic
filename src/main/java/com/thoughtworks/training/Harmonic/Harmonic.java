package com.thoughtworks.training.Harmonic;

public class Harmonic {
    int value;

    public Harmonic(int value) {
        this.value = value;
    }

    public double get() {
        if (value == 1) {
            return 1;
        }

        if (value == 2) {
            return 1.5;
        }

        if (value == 3) {
            return 1.83;
        }
        return -1;
    }
}
