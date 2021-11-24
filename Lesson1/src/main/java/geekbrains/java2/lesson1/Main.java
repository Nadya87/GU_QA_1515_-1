package geekbrains.java2.lesson1;

public class Main {
        public static void main(String[] args) {
            Course c = new Course(); // Создаем полосу препятствий
            Team team = new Team("New team"); // Создаем команду
            c.doIt(team); // Просим команду пройти полосу
            team.showResults(); // Показываем результаты
            team.membersName();
        }
    }
