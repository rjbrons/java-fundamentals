import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        flipNHeads(3);
        flipNHeads(1);
        flipNHeads(22);
        clock();
    }

    public static String pluralize(String word, int number) {
        if (number == 1) {
            return word;
        } else {
            return word + "s";
        }
    }

    public static void flipNHeads(int tosses){
        Random randomizer = new Random();
        int flips = 0;
        int consecutive = 0;
        while ( true ) {
            float number = randomizer.nextFloat();
            if (number <= .5) {
                System.out.println("tails");
                consecutive = 0;
            } else {
                System.out.println("heads");
                consecutive++;
            }
            flips++;
            if (consecutive == tosses){
                System.out.println("It took " + flips + " " + pluralize("flip", flips) + " to flip " + tosses + " " + pluralize("head", tosses) + " in a row.");
                break;
            }
        }
    }

    public static void clock(){
        LocalDateTime now = LocalDateTime.now();
        while (true){
            if (now.getSecond() != LocalDateTime.now().getSecond()) {
                System.out.println(now.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
                now = LocalDateTime.now();
            }
        }

    }
}