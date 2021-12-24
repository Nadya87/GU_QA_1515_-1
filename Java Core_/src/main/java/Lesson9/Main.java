package Lesson9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Егор", Arrays.asList(new Course("Химия"), new Course("Литература"))));
        students.add(new Student("Антон", Arrays.asList(new Course("Биология"), new Course("Химия"),
                new Course("Естествознание"), new Course("Социология"))));
        students.add(new Student("Алина", Arrays.asList(new Course("Маркетинг"), new Course("Экономика"),
                new Course("Банковский учёт"), new Course("Эффективные коммуникации"))));
        students.add(new Student("Алевтина", Arrays.asList(new Course("Маркетинг"), new Course("Экономика"),
                new Course("Банковский учёт"), new Course("Эффективные коммуникации"), new Course("Естествознание"), new Course("Социология"))));

        System.out.println(students.stream()
                .map(s -> s.getCourses())
                .flatMap(f -> f.stream())
                .collect(Collectors.toSet()));

        System.out.println(students.stream()
                .sorted((s1, s2) -> s2.getCourses().size() - s1.getCourses().size())
                .limit(2)
                .collect(Collectors.toList()));

        Course course = new Course("Химия");
        System.out.println(students.stream()
                .filter(s -> s.getCourses().contains(course))
                .collect(Collectors.toList()));
    }
}

