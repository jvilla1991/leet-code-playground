package LeetCode75;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class HashMapSetTest {

    private HashMapSet hashMapSet;

    @BeforeEach
    public void setUp() {
        hashMapSet = new HashMapSet();
    }

    @Test
    void testFindDifference1() {
        List<List<Integer>> integerList = hashMapSet.findDifference(new int[]{1,2,3}, new int[]{2,4,6});
        assertEquals(List.of(List.of(1, 3), List.of(4, 6)), integerList);
    }

    @Test
    void testFindDifference2() {
        List<List<Integer>> integerList = hashMapSet.findDifference(new int[]{1,2,3,3}, new int[]{1,1,2,2});
        assertEquals(List.of(List.of(3), List.of()), integerList);
    }

}