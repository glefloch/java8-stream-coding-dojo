package com.stream.example;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * This class aims to show the utility of the collect stream API
 */
public class CollectStream {

    /**
     * This method should collect a stream and return a list containing all elements
     * @param stream stream to compute
     * @return list containing stream elements
     */
    public static final List<Double> toList(final Stream<Double> stream) {
        return stream.collect(Collectors.toList());
    }

    /**
     * This method should collect a stream and return a comma separated string of elements
     * @param stream stream to compute
     * @return comma separated string of elements
     */
    public static final String toString(final Stream<Double> stream) {
        return null;
    }

    /**
     * This method should collect a stream and return a map grouping values by value length
     * @param stream stream to compute
     * @return map of values grouped by length
     */
    public static final Map<Integer, List<String>> group(final Stream<String> stream) {
        return null;
    }


}
