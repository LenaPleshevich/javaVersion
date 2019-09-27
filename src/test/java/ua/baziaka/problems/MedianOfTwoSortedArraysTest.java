package ua.baziaka.problems;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class MedianOfTwoSortedArraysTest {

    private MedianOfTwoSortedArrays toTestAlg = new MedianOfTwoSortedArrays();;

    @Test
    public void testSuccess(){
        //IntStream.iterate(1, i -> i < 100, i -> i + 1).forEach(System.out::println);
        BigDecimal price = new BigDecimal("1000000");
        System.out.println(price);
        Assert.assertEquals(2,2);
    }

}