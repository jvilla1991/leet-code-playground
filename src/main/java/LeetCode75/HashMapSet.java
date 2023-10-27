package LeetCode75;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class HashMapSet {

    /**<a href="https://leetcode.com/problems/find-the-difference-of-two-arrays/?envType=study-plan-v2&envId=leetcode-75">...</a>
     * @param nums1 int array 1
     * @param nums2 int array 2
     * @return a list of lists, where the lists have numbers that are not in the other compared array.
     */
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        for (int i : nums1) {
            boolean found = false;
            for (int j : nums2) {
                if (i == j) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                hashSet1.add(i);
            }
        }
        HashSet<Integer> hashSet2 = new HashSet<>();
        for (int i : nums2) {
            boolean found = false;
            for (int j : nums1) {
                if (i == j) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                hashSet2.add(i);
            }
        }
        return Arrays.asList(hashSet1.stream().toList(), hashSet2.stream().toList());
    }

}
