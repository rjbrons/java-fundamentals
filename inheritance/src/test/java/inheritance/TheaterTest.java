package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class TheaterTest {

    @Test
    public void test_TheaterConstructor() {
        Theater testTheater = new Theater("Baelish Entertainment");
        assertTrue("testTheater should be an instance of Theater", testTheater instanceof Theater);
        assertEquals("Movie list should be empty", 0, testTheater.movies.size());
    }

    @Test
    public void test_addMovie() {
        Theater testTheater = new Theater ("Golden Suns Entertainment");
        testTheater.addMovie("A Song of Ice and Fire");
        assertEquals("testTheater movie list length should be 1",
                1,
                testTheater.movies.size());
        assertEquals("Movie put into list should be A Song of Ice and Fire",
                "A Song of Ice and Fire",
                testTheater.movies.peekFirst());
    }

    @Test
    public void test_removeMovie() {
        Theater testTheater = new Theater ("House of Black and White");
        testTheater.addMovie("A Song of Ice and Fire");
        testTheater.addMovie("The Rains of Castermere");
        testTheater.addMovie("The Bear and the Maiden Fair");
        testTheater.removeMovie("The Rains of Castermere");
        assertFalse("testTheater should not contain the movie",
                testTheater.movies.contains("The Rains of Castermere"));
    }

    @Test
    public void test_toString() {
        Theater testTheater = new Theater ("The Twins Screens");
        testTheater.addMovie("What is dead may never die.");
        testTheater.addMovie("You know nothing, John Snow.");
        assertEquals("To string should print out theater name and movies.",
                "Name: The Twins Screens\n" +
                        "What is dead may never die.\n" +
                        "You know nothing, John Snow.\n", testTheater.toString());
    }
}