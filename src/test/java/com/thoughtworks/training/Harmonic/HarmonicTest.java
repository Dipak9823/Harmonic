package com.thoughtworks.training.Harmonic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HarmonicTest {

    @Test
    void givenValueOne_WhenGet_ThenShouldBeReturnHarmonicValueOne() {
        Harmonic harmonic =new Harmonic(1);
        Assertions.assertEquals(1,harmonic.get());
    }

    @Test
    void givenValueTwo_WhenGet_ThenShouldBeReturnHarmonicZeroPointFive() {
        Harmonic harmonic=new Harmonic(2);
        Assertions.assertEquals(0.5,harmonic.get());
    }
}
