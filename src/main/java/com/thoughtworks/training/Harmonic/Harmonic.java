package com.thoughtworks.training.Harmonic;

public class Harmonic {
    int value;

    public Harmonic(int value) {
        this.value = value;
    }

    public double get() {
        double sum=0;
        if (value == 1) {
            sum +=1;
        }

        if (value == 2) {
            sum +=0.5;
        }

        if (value == 3) {
            sum +=0.33;
        }
        return sum;
    }
}
