package ua.baziaka.problems;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianOfTwoSortedArraysTest {

    private MedianOfTwoSortedArrays toTestAlg = new MedianOfTwoSortedArrays();;

    @Test
    public void testSuccess(){
        IntStream.iterate(1, i -> i < 100, i -> i + 1).forEach(System.out::println);
        Assert.assertEquals(2,2);
    }
}