package ua.baziaka.problems;

import java.util.stream.Stream;

/**
 * https://leetcode.com/problems/median-of-two-sorted-arrays/description/
 */
public class MedianOfTwoSortedArrays {
    public void findMedianSortedArrays() {
        var firstEven = Stream.of(1,2,3,4).filter(i -> i % 2 == 0)
                .findFirst()
                .orElseThrow();
        System.out.println(firstEven);
    }
}
