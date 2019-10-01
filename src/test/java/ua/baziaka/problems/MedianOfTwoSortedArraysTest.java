package ua.baziaka.problems;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class MedianOfTwoSortedArraysTest {

    private MedianOfTwoSortedArrays toTestAlg = new MedianOfTwoSortedArrays();

    @Test
    public void testSuccess() {
        var firstEven = Stream.of(1, 2, 3, 4).filter(i -> i % 3 == 0)
                .findFirst()
                .orElseThrow();
        Assert.assertEquals(firstEven.intValue(), 3);
    }
}