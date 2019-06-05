package inheritance;

import java.util.LinkedList;

public class Shop {
    protected String name;
    protected String descr;
    protected String cost;
    protected LinkedList<Review> reviews;

    public Shop(String name, String descr, String cost){
        this.name = name;
        this.descr = descr;
        this.cost = cost;
        this.reviews = new LinkedList<Review>();
    }

    public String toString(){
        return String.format("Name: %s\nPricing: %s\n%s", this.name, this.cost, this.descr);
    }

    public void addReview(Review newRev){
        newRev.locationReviewed = this;
        this.reviews.add(newRev);
    }
}
