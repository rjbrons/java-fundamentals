package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    @Test
    public void test_shop_toString() {
        String output = "Name: A Store Has No Name\nPricing: $$$$\nNot today, winter is coming.";
        String desc = "Not today, winter is coming.";
        String price = "$$$$";
        String name = "A Store Has No Name";
        Shop testShop = new Shop(name, desc, price);
        assertEquals("Strings should match", output, testShop.toString());
    }

    @Test
    public void test_shop_constructor() {
        String output = "Name: A Store Has No Name\nPricing: $$$$\nNot today, winter is coming.";
        String desc = "Not today, winter is coming.";
        String price = "$$$$";
        String name = "A Store Has No Name";
        Shop testShop = new Shop(name, desc, price);
        assertEquals("Strings should match", "A Store Has No Name", testShop.name);
    }

    @Test
    public void addReview() {
        Shop myShop = new Shop("Winterfell", "Last stop before the wall.", "$$");
        Review theReview = new Review("Good Goods", "Tyrion", 4);
        myShop.addReview(theReview);
        System.out.println(myShop);
        assertEquals("shop should have review", theReview, myShop.reviews.removeFirst());
    }
}