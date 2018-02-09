package com.stream.example;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;

/**
 * Test class for {@link MapStream} class methods
 */
public class MapStreamTest {

    /**
     * This test aims to validate {@link MapStream#convert(Stream)} method
     */
    @Test
    public void testConvertStream() {
        final List<Integer> result = MapStream.convert(Stream.of(2.5, 4.3)).collect(Collectors.toList());
        assertThat(result.get(0)).isInstanceOf(Integer.class);
        assertThat(result.get(0)).isEqualTo(2);
    }


}
