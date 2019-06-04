package inheritance;

public class Review {

    String body;
    String auth;
    int stars;

    public Review(String text, String auth, int rating) {
        this.body = text;
        this.auth = auth;
        this.stars = rating;
    }


    public String toString(){
        String output = String.format("%s: \n%s\nRating: %d stars.", this.auth, this.body, this.stars);
        return output;
    }


}
