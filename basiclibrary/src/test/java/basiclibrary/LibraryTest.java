/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void testroll_with_value() {
        Library classUnderTest = new Library();
        assertTrue("roll should return 'true'", classUnderTest.roll(5).length == 5);
    }

    @Test public void test_roll_randomizer() {
        Library classUnderTest = new Library();
        int[] res = classUnderTest.roll(5);
        assertTrue("roll should return 'true'", 0 < res[0] && res[0] <= 6 );
    }

    @Test public void test_roll_with_high_value() {
        Library classUnderTest = new Library();
        assertTrue("roll should return 'true'", classUnderTest.roll(20).length == 20);
    }

    @Test public void test_roll_with_zero() {
        Library classUnderTest = new Library();
        assertTrue("roll should return 'true'", classUnderTest.roll(0).length == 0);
    }

    @Test public void test_roll_with_negative() {
        Library classUnderTest = new Library();
        assertTrue("roll should return 'true'", classUnderTest.roll(-1).length == 0);
    }

    @Test public void test_containsDuplicates_true() {
        Library classUnderTest = new Library();
        int[] testArr = new int[] {2,3,4,5,3,6};
        assertTrue("containsDupliates should return 'true'", classUnderTest.containsDuplicates(testArr));
    }

    @Test public void test_containsDuplicates_false() {
        Library classUnderTest = new Library();
        int[] testArr = new int[] {2,3,4,5,9,6};
        assertFalse("containsDupliates should return 'false'", classUnderTest.containsDuplicates(testArr));
    }

    @Test public void test_containsDuplicates_array_of_one() {
        Library classUnderTest = new Library();
        int[] testArr = new int[] {2};
        assertFalse("containsDupliates should return 'false'", classUnderTest.containsDuplicates(testArr));
    }

    @Test public void test_containsDuplicates_array_of_zero() {
        Library classUnderTest = new Library();
        int[] testArr = new int[] {};
        assertFalse("containsDupliates should return 'false'", classUnderTest.containsDuplicates(testArr));
    }

    @Test public void test_arrayAverage_passing() {
        Library classUnderTest = new Library();
        int[] testArr = new int[] {1,1,1,1,1};
        assertTrue("average value is accurate", classUnderTest.arrayAverage(testArr) == 1);
    }
    @Test public void test_arrayAverage_passing_less_than_one() {
        Library classUnderTest = new Library();
        int[] testArr = new int[] {0,1};
        assertTrue("average value is accurate", classUnderTest.arrayAverage(testArr) == 0.5);
    }

    @Test public void test_arrayAverage_passing_large_numbers() {
        Library classUnderTest = new Library();
        int[] testArr = new int[] {2345, 4432, 55234, 88999, 2334};
        assertTrue("average value is accurate", classUnderTest.arrayAverage(testArr) == 30668.8);
    }

    @Test public void test_arrayLowestAverage_passing(){
        Library classUnderTest = new Library();
        int[][] testArr = new int[][] {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        assertTrue("lowest average array is accurate", classUnderTest.arrayLowestAverage(testArr) == testArr[2]);
    }

    @Test public void test_arrayLowestAverage_passing_2(){
        Library classUnderTest = new Library();
        int[][] testArr = new int[][] {
                {1,2,3,4,5,5},
                {11,12,13,14,13},
                {111,222,333,444,555,666},
                {65, 56, 55, 52, 55, 62, 57}
        };
        assertTrue("lowest average array is accurate", classUnderTest.arrayLowestAverage(testArr) == testArr[0]);
    }

}
