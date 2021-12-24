package Lesson7;

import Lesson7.Periods;


import java.io.IOException;

public interface WeatherProvider {

    void getWeather(Periods periods) throws IOException;

    void getWeatherIn5Days() throws IOException;

    void getHistory();
}