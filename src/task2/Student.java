package task2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class Student {
    private String fio;

    private Map<String, Integer> marks;

    public Student(String fio, String subject, int grade) {
        this.fio = fio;
        this.marks = new LinkedHashMap<>();
        this.marks.put(subject, grade);
    }

    public void addPredmet(String predmet, Integer grade) {
        this.marks.put(predmet, grade);

    }

    public int getGrade(String fio) {
        for (Map.Entry<String, Integer> mapStudent : marks.entrySet()) {
            if (fio.equals(mapStudent.getValue())) {
                return mapStudent.getValue();
            }
        }
        return 0;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setMarks(Map<String, Integer> marks) {
        this.marks = marks;
    }

    public Map<String, Integer> getMarks() {
        return marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(fio, student.fio) && Objects.equals(marks, student.marks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio, marks);
    }

    @Override
    public String toString() {
        return "Student{" +
                "fio='" + fio + '\'' +
                ", marks=" + marks +
                '}';
    }


}


/**
 * ЗАДАНИЕ 2. Написать класс Student c полями:
 * String fio;
 * Map<String, Integer> marks (ключ - предмет, значение - оценка).
 * Написать компаратор для сравнения объектов класса Student, который
 * сравнивает студентов по среднему баллу. У кого выше средний балл, тот
 * студент считается больше.
 */
