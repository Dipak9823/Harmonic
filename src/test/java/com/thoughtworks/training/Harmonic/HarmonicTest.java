package com.thoughtworks.training.Harmonic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HarmonicTest {

    @Test
    void givenValueOne_WhenGet_ThenShouldBeReturnHarmonicValueOne() {

        Harmonic harmonic = new Harmonic(1);

        Assertions.assertEquals(1, harmonic.get());
    }

    @Test
    void givenValueTwo_WhenGet_ThenShouldBeReturnHarmonicValueZeroPointFive() {

        Harmonic harmonic = new Harmonic(2);

        Assertions.assertEquals(1.5, harmonic.get());
    }

    @Test
    void givenValueThree_WhenGet_ThenShouldBeReturnHarmonicValueOnePoinEightThree() {

        Harmonic harmonic = new Harmonic(3);

        Assertions.assertEquals(1.83, harmonic.get());
    }
}
