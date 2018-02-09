package com.stream.example;

import org.junit.Test;

import java.sql.Types;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Test class for {@link TypedStreamTest} class
 */
public class TypedStreamTest {

    /**
     * This test aims to validate {@link TypedStream#convert(Stream)}
     */
    @Test
    public void testDoubleStreamConvertion() {
        final DoubleStream result = TypedStream.convert(Stream.of(3.0, 4.7, 2.3));
        assertThat(result.sum()).isEqualTo(10.0);
    }

    /**
     * This test aims to validate {@link TypedStream#convertToInt(Stream)}
     */
    @Test
    public void testIntStreamConvertion() {
        final IntStream result = TypedStream.convertToInt(Stream.of(3.0, 4.7, 2.3));
        assertThat(result.sum()).isEqualTo(9);
    }

    /**
     * This test aims to validate {@link TypedStream#getMax(Stream)} method
     */
    @Test
    public void testMaxStreamValue() {
        final double d = TypedStream.getMax(Stream.of(1.0, 3.9, 9.9));
        assertThat(d).isEqualTo(9.9);
    }

    /**
     * This test aims to validate {@link TypedStream#count(Stream)} method
     */
    @Test
    public void testCountMethod() {
        final long size = TypedStream.count(Stream.of(1.3, 4.0));
        assertThat(size).isEqualTo(2);
    }

    /**
     * This test aims to validate {@link TypedStream#countOdd(Stream)} method
     */
    @Test
    public void testCountOddMethod() {
        final long size = TypedStream.countOdd(Stream.of(1,2,3,4,5,6,7,8));
        assertThat(size).isEqualTo(4);
    }
}
