package basiclibrary;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class TallyTest {

    @Test
    public void tally_passes() {
        ArrayList<String> testList = new ArrayList(Arrays.asList("Ryan", "Julie", "Bob", "Ryan", "Julie", "Bob", "Bob"));
        Tally testCase = new Tally();
        assertEquals("this test should return Bob", "Bob", testCase.tally(testList) );

    }

    @Test
    public void tally_passes_fails() {
        ArrayList<String> testList = new ArrayList(Arrays.asList("Ryan", "Julie", "Bob", "Ryan", "Julie", "Bob", "Bob"));
        Tally testCase = new Tally();
        assertNotEquals("this test should not return Ryan", "Ryan", testCase.tally(testList) );

    }

    @Test
    public void tally_passes_one_entry() {
        ArrayList<String> testList = new ArrayList(Arrays.asList("a", "b"));
        Tally testCase = new Tally();
        assertEquals("this test should return a", "a", testCase.tally(testList) );
    }
}