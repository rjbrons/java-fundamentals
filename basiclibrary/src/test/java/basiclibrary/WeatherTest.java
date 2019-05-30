package basiclibrary;

import org.junit.Test;

import static org.junit.Assert.*;

public class WeatherTest {

    @Test
    public void analyzeWeather() {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        String expected = "High: 51\n" +
                "Low: 72\n" +
                "Never saw temperature: 63\n" +
                "Never saw temperature: 67\n" +
                "Never saw temperature: 68\n" +
                "Never saw temperature: 69";
        Weather testClass = new Weather();
        testClass.analyzeWeather(weeklyMonthTemperatures);
        assertEquals("this will be true", expected = testClass.analyzeWeather(weeklyMonthTemperatures));
    }

    @Test
    public void analyzeWeather_fail() {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        String expected = "High: 40\n" +
                "Low: 90\n" +
                "Never saw temperature: 63\n" +
                "Never saw temperature: 67\n" +
                "Never saw temperature: 68\n" +
                "Never saw temperature: 69";
        Weather testClass = new Weather();
        testClass.analyzeWeather(weeklyMonthTemperatures);
        assertNotEquals("this will be true", expected = testClass.analyzeWeather(weeklyMonthTemperatures));
    }
}