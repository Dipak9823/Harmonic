package com.thoughtworks.training.Harmonic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HarmonicTest {

    @Test
    void givenValueOne_WhenCompute_ThenShouldBeReturnHarmonicValue() {
        Harmonic harmonic =new Harmonic(1);
        Assertions.assertEquals(1,harmonic.get());
    }
}
