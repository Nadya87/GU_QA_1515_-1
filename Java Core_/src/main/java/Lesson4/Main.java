package Lesson4;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        task1 ();
        task2 ();
    }


    //Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
    // Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
    // Посчитать, сколько раз встречается каждое слово.

    private static void task1 (){
        String[] wordsArray = new String[]{"Как", "на", "горке", "на", "пригорке", "жили", "тридцать", "три",
                "Егорки", "раз", "Егорка", "два", "Егорка", "три", "Егорка"};
        countAndPrintUniqueWords(wordsArray);
    }

    private static void countAndPrintUniqueWords (String[] words){
        Map<String, Integer> wordsCount = new HashMap();
        for (String word : words) {
            word = word.toLowerCase();
            if (wordsCount.containsKey(word)) {
                wordsCount.put(word, wordsCount.get(word) + 1);
            } else {
                wordsCount.put(word, 1);
            }
        }
        System.out.println(wordsCount);
    }



    //Написать простой класс «Телефонный Справочник»,
    // который хранит в себе список фамилий и телефонных номеров.
    // В этот телефонный справочник с помощью метода add() можно добавлять записи,
    // а с помощью метода get() искать номер телефона по фамилии.
    // Следует учесть, что под одной фамилией может быть несколько телефонов
    // (в случае однофамильцев), тогда при запросе такой фамилии
    // должны выводиться все телефоны.

    private static void task2 (){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(71234567890L, "Ivanov");
        phoneBook.add(71234567891L, "Petrov");
        phoneBook.add(71234567892L, "Egorov");
        phoneBook.add(71234567893L, "Sydorov");
        phoneBook.add(71234567894L, "Ivanov");
        System.out.println(phoneBook.get("Ivanov"));
        System.out.println(phoneBook.get("Antonov"));
    }

}
