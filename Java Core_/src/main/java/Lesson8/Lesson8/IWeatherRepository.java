package Lesson8.Lesson8;

import java.util.List;

public interface IWeatherRepository {

    List<Weather> getAllData(); // добавили метод для просмотра нашего архива

    void saveWeatherObject (Weather weather);
}
