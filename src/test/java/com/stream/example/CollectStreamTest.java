package com.stream.example;

import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Test class for {@link CollectStream} methods
 */
public class CollectStreamTest {

    /**
     * This tests aims to validate the {@link CollectStream#toList(Stream)} method
     */
    @Test
    public void testConvertionToList() {
        final List<Double> result = CollectStream.toList(Stream.of(1.9, 2.3, 4.0));
        assertThat(result).isInstanceOf(List.class);
        assertThat(result.size()).isEqualTo(3);
    }

    /**
     * This tests aims to validate the {@link CollectStream#toString(Stream)} method
     */
    @Test
    public void testConversionToString() {
        String result = CollectStream.toString(Stream.of(1.9, 4.5));
        assertThat(result).isEqualTo("1.9,4.5");
    }

    /**
     * This tests aims to validate the {@link CollectStream#group(Stream)} method
     */
    @Test
    public void testGroup() {
        Map<Integer, List<String>> result = CollectStream.group(Stream.of("foo", "ba", "bar", "baz"));
        assertThat(result.get(3).size()).isEqualTo(3);
        assertThat(result.get(2).size()).isEqualTo(1);
    }

}
