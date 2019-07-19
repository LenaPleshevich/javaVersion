package ua.baziaka.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianOfTwoSortedArraysTest {

    MedianOfTwoSortedArrays4 toTestAlg;

    @BeforeEach
    public void setUp() throws Exception {
        toTestAlg = new MedianOfTwoSortedArrays4();
    }

    @Test
    public void testMedianOfTwoSortedArrays() {
        double actual = toTestAlg.findMedianSortedArrays(new int[]{1, 3},  new int[]{2});
        assertEquals(2.0d, actual);
    }
}