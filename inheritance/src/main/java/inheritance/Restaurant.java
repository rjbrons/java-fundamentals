package inheritance;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class Restaurant {
    protected String  name;
    protected int stars;
    protected int totalStars;
    protected String cost;
    protected LinkedList<Review> reviews;

    public Restaurant(String name, int stars, String cost){
        this.name = name;
        this.stars = stars;
        this.cost = cost;
        this.reviews = new LinkedList<Review>();
        this.totalStars = 0;
    }

    public String toString(){
        String printString = String.format("The %s restaurant.\nRating: %d\nPrice: %s", this.name, this.stars, this.cost);
        return printString;
    }

    public void addReview(Review newRev){
        newRev.locationReviewed = this;
        int tempStars = this.totalStars + newRev.stars;
        this.reviews.add(newRev);
        this.setStars(tempStars);
    }

    public void setStars(int total){
        this.stars = total / this.reviews.size();
    }

    public void updateCost(String cost){
        this.cost = cost;
    }

    public LinkedList<Review> getReviews(){
        return this.reviews;
    }

}
