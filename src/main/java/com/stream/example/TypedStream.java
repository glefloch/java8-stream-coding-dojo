package com.stream.example;

import java.util.function.ToDoubleFunction;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * This class aims to show how to convert and use typed stream.
 */
public class TypedStream {

    /**
     * This method should convert a stream of double to a {@link DoubleStream}.
     * @param toConvert Stream to convert
     * @return {@link DoubleStream} converted stream
     */
    public static final DoubleStream convert(final Stream<Double> toConvert) {
        return null;
    }

    /**
     * This method should convert a stream of integer to a {@link DoubleStream}.
     * @param toConvert Stream to convert
     * @return {@link IntStream} converted stream
     */
    public static final IntStream convertToInt(final Stream<Double> toConvert) {
        return null;
    }

    /**
     * This method should return the max value of a Double stream
     * @param stream stream to compute
     * @return max value of stream
     */
    public static final Double getMax(final Stream<Double> stream) {
        return 0.0;
    }

    /**
     * This method should count the the number of values in the stream
     * @param stream stream to compute
     * @return number of data in the stream
     */
    public static final long count(final Stream<Double> stream) {
        return 0l;
    }

    /**
     * This method should count the number of odd values in the stream
     * @param stream stream to compute
     * @return number of odd values
     */
    public static final long countOdd(final Stream<Integer> stream) {
        return 0l;
    }

}
