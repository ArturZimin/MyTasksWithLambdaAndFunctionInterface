package task1;

import java.util.Objects;

public class People {
    private int height;
    private int weight;

    public People() {
    }

    public People(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return height == people.height && weight == people.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, weight);
    }

    @Override
    public String toString() {
        return "People{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }
}


/**
 * ЗАДАНИЕ 1. Написать класс People c полями рост, вес человека. Написать
 * компаратор для сравнения объектов класса People, который сравнивает
 * людей по индексу массы тела. Человек у которого больше индекс массы
 * тела считается больше. Создайте коллекцию People и отсортируйте ее.
 * * реализуйте компаратор используя лямбда выражение
 */
