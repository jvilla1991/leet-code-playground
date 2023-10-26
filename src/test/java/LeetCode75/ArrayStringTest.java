package LeetCode75;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

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
    
}