package task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Tester {
    public static ArrayList<People> listPeople = new ArrayList<>(20);

    public static void main(String[] args) {

        Random random = new Random();
        for (int i = 0; i < 19; i++) {
            listPeople.add(new People(random.nextInt(150, 210), random.nextInt(50, 120)));
        }

        listPeople.sort((People p1, People p2) -> {
            int result = 0;
            if (p1.getWeight() - p2.getWeight() == 0) {
                return 0;
            } else {
                result = p1.getWeight() - p2.getWeight() > 0 ? 1 : -1;
                return result;
            }
        });
        listPeople.forEach(x -> System.out.println(x + "\n"));


    }
}
