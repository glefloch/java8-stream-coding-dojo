package com.stream.example;

import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Test class for {@link CreateStream} methods
 */
public class CreateStreamTest {

    /**
     * This tests aims to validate the {@link CreateStream#convert(List)} method
     */
    @Test
    public void testConvertionFromList() {
        final Stream<Double> result = CreateStream.convert(Arrays.asList(1.9, 2.0, 3.4));
        assertThat(result).isInstanceOf(Stream.class);
        assertThat(result.count()).isEqualTo(3);
    }

    /**
     * This tests aims to validate the {@link CreateStream#convert(Double[])} method
     */
    @Test
    public void testConvertionFromArray() {
        final Stream<Double> result = CreateStream.convert(new Double[]{1.9, 2.0, 3.4});
        assertThat(result).isInstanceOf(Stream.class);
        assertThat(result.count()).isEqualTo(3);
    }

    /**
     * This tests aims to validate the {@link CreateStream#convert(Double, Double)} method
     */
    @Test
    public void testConversionFromValues() {
        final Stream<Double> result = CreateStream.convert(1.9, 2.0);
        assertThat(result).isInstanceOf(Stream.class);
        assertThat(result.count()).isEqualTo(2);
    }

}
