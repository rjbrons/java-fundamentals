package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void test_restaurant_constructor(){
        Restaurant myRest = new Restaurant("Mo Town", 2, "$$$");
        assertEquals("Name should be accurate", "Mo Town", myRest.name);
        assertEquals("Number of stars should be accurate", 2, myRest.stars);
        assertEquals("Price string should be accurate.","$$$", myRest.cost );
    }

    @Test
    public void test_toString1() {
        Restaurant myRest = new Restaurant("Eat Place", 3, "$$$$");
        String expectedOutput = "The Eat Place restaurant.\nRating: 3\nPrice: $$$$";
        assertEquals("Output string is correct.", expectedOutput, myRest.toString() );
    }
}