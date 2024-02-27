package org.example;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class SolutionTest {

    private int[] inputArray;
    private int[] expectedArray;

    public SolutionTest(int[] inputArray, int[] expectedArray) {
        this.inputArray = inputArray;
        this.expectedArray = expectedArray;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions() {
        return Arrays.asList(
                new Object[][] {
                        {new int[] {1, 0, 2, 3, 0, 4, 5, 0}, new int[] {1, 0, 0, 2, 3, 0, 0, 4}},
                        {new int[] {1, 2, 3}, new int[] {1, 2, 3}},
                        {new int[] {1}, new int[] {1}},
                        {new int[] {}, new int[] {}},
                        {new int[] {1, 2, 0}, new int[] {1, 2, 0}},
                        {new int[] {0, 0, 3}, new int[] {0, 0, 0}},
                        {new int[] {1, 0, 3, 0}, new int[] {1, 0, 0, 3}},
                        {new int[] {0, 0, 0, 0, 0, 0, 0}, new int[] {0, 0, 0, 0, 0, 0, 0}},
                        {new int[] {1, 2, 0, 0, 3, 4, 5, 0}, new int[] {1, 2, 0, 0, 0, 0, 3, 4}}
                });
    }

    @Test
    public void testDuplicateZeros() {
        Solution solution = new Solution();
        solution.duplicateZeros(inputArray);
        assertArrayEquals(expectedArray, inputArray);
    }
}
