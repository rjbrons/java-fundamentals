package basiclibrary;

import java.util.HashSet;

public class Weather {

    public String analyzeWeather(int[][] data){
        HashSet<Integer> weatherData = new HashSet<Integer>();
        int min = 400;
        int max = 0;
        String output = "";
        String buildString = "Never saw temperature: %s\n";
        for (int outer = 0; outer < data.length; outer++){
            for (int inner = 0; inner < data[outer].length; inner++){
                if (data[outer][inner] < min){
                    min = data[outer][inner];
                } else if (data[outer][inner] > max ){
                    max = data[outer][inner];
                }
                weatherData.add(data[outer][inner]);
            }
        }
        output += output.format("High: %s\nLow: %s\n", min, max);
        for (int i = min; i <= max; i++){
            if (!weatherData.contains(i)){
                output += buildString.format("Never saw temperature: %s\n", i);
            }
        }
        System.out.println(output);
        return output;
    }
}
