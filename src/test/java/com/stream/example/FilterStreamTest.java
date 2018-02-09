package com.stream.example;

import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

import java.util.stream.Stream;

/**
 * Test class for {@link FilterStream} class
 */
public class FilterStreamTest {

    /**
     * This test aims to validate {@link FilterStream#filterOddNumber(Stream)} method
     */
    @Test
    public void validateFilterMethod() {
        Stream<Integer> result = FilterStream.filterOddNumber(Stream.of(1,2,3,4,5,6,7,8,9));
        assertThat(result.count()).isEqualTo(4);

    }

}
