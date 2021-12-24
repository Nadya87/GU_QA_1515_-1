package Lesson8;

import Lesson8.Weather;

import java.util.List;

public interface IWeatherRepository {

    List<Weather> getAllData(); // добавили метод для просмотра нашего архива

    void saveWeatherObject (Weather weather);
}
