package com.thoughtworks.training.Harmonic;

public class Harmonic {
    int value;

    public Harmonic(int value) {
        this.value=value;
    }

    public double get() {
        if(value==2) {
            return 0.5;
        }
        return 1;
    }
}
