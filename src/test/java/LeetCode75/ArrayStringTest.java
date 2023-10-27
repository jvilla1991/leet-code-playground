package LeetCode75;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayStringTest {

    private ArrayString arrayString;

    @BeforeEach
    public void setUp() {
        arrayString = new ArrayString();
    }

    @Test
    void testMergeStrings1() {
        String output = arrayString.mergeStrings("thisis", "aString123");

        assertEquals("tahSitsriisng123",output);
    }

    @Test
    void testGcdOfStrings1() {
        String output = arrayString.gcdOfStrings("ABCABC", "ABC");
        assertEquals("ABC",output);
    }

    @Test
    void testGcdOfStrings2() {
        String output = arrayString.gcdOfStrings("ABABAB", "ABAB");
        assertEquals("AB",output);
    }

    @Test
    void testGcdOfStrings3() {
        String output = arrayString.gcdOfStrings("LEET", "CODE");
        assertEquals("",output);
    }

    @Test
    void testGcdOfStrings4() {
        String output = arrayString.gcdOfStrings("ABABABAB", "ABAB");
        assertEquals("ABAB",output);
    }

    @Test
    void kidsWithCandies() {
        List<Boolean> output = arrayString.kidsWithCandies(new int[]{2,3,5,1,3}, 3);
        assertEquals(Arrays.asList(true, true, true, false, true), output);
    }
}