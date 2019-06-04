package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {

    @Test
    public void test_Review_constructor(){
        Review testReview = new Review("This place was awesome.","Mark Watney", 2);
        assertTrue("The body should have text in it.", testReview.body != null);
        assertEquals("The author should be Mark Watney", "Mark Watney", testReview.auth);
        assertEquals("The rating should be 2", 2, testReview.stars);
    }

    @Test
    public void test_Review_toString(){
        Review testReview = new Review("This place was awesome.","Mark Watney", 2);
        String expect = "Mark Watney: \nThis place was awesome.\nRating: 2 stars.";
        assertEquals("Strings should match", expect, testReview.toString());
    }


}