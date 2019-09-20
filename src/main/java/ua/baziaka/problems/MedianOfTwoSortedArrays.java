package ua.baziaka.problems;

import java.util.stream.IntStream;

/**
 * https://leetcode.com/problems/median-of-two-sorted-arrays/description/
 */
public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        IntStream.iterate(1, i -> i < 100, i -> i + 1).forEach(System.out::println);
        return 2;
    }
}
