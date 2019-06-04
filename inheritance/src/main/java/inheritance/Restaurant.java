package inheritance;

public class Restaurant {
    String name;
    int stars;
    String cost;

    public Restaurant(String name, int stars, String cost){
        this.name = name;
        this.stars = stars;
        this.cost = cost;
    }

    public String toString(){
        String printString = String.format("The %s restaurant.\nRating: %d\nPrice: %s", this.name, this.stars, this.cost);
        return printString;
    }
}
