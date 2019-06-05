package inheritance;

import java.util.LinkedList;

public class Theater {
    protected String name;
    protected LinkedList<String> movies;

    public Theater(String name){
        this.name = name;
        this.movies = new LinkedList<String>();
    }

    public void addMovie(String movie){
        this.movies.add(movie);
    }

    public void removeMovie(String movie){
        this.movies.remove(movie);
    }

    public String toString(){
        StringBuilder output = new StringBuilder();
        output.append(String.format("Name: %s\n", this.name));
        for (String movie : movies){
            output.append(movie + "\n");
        }
        return output.toString();
    }
}
