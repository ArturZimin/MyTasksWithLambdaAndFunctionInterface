package task2;

import com.sun.tools.javac.Main;

import java.util.*;

public class Test {


    public static void main(String[] args) {
        ArrayList<Student> gradeBook = new ArrayList<>();
        Student student1 = new Student("Ivanov Ivan Ivanovich", "Biology", 7);
        student1.addPredmet("Math", 2);
        student1.addPredmet("Giografy", 4);
        gradeBook.add(student1);

        Student student2 = new Student("Ivanov Ivan Ivanovich", "Geografy", 7);
        student2.addPredmet("Math", 5);
        student2.addPredmet("Giografy", 4);
        gradeBook.add(student2);

        Student student3 = new Student("Ivanov Ivan Ivanovich", "Geografy", 8);
        student3.addPredmet("Math", 3);
        student3.addPredmet("Giografy", 6);
        gradeBook.add(student3);


        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                double average1 = 0;
                double average2 = 0;
                average1 = Test.findAverageBall(gradeBook, o1.getFio());
                average2 = Test.findAverageBall(gradeBook, o2.getFio());
                if (average1 == average2) {
                    return 0;
                } else {
                    int result = average1 > average2 ? 1 : -1;
                    return result;
                }
            }
        };
        gradeBook.sort(comparator);

        for (Object o : gradeBook) {
            System.out.println(o + "\n");
        }


    }

    public static double findAverageBall(ArrayList<Student> list, String fio) {
        double result = 0;
        int count = 0;

        for (Student s : list) {
            if (s.getFio() == fio) {
                if (s.getMarks().get(s.getFio()) != null) {
                    result += (double) s.getMarks().get(s.getFio());
                    count++;
                }
            }
        }

        return (Double) (result / count);
    }

}
