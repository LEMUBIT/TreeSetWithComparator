package lemubit.academy;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        var comparator = new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2) {
                if (c1.price > c2.price) {
                    return 1;
                } else if (c1.price == c2.price) {
                    return 0;
                } else {
                    return -1;
                }
            }
        };

        var carTreeSet = new TreeSet<Car>((carA, carB) -> {
            if (carA.price > carB.price) {
                return 1;
            } else if (carA.price == carB.price) {
                return 0;
            } else {
                return -1;
            }
        });

        carTreeSet.add(new Car("Lambo", 300));
        carTreeSet.add(new Car("Ferrari", 250));
        carTreeSet.add(new Car("Buga", 2000));
        carTreeSet.add(new Car("Benz", 150));

        System.out.println(carTreeSet);

    }
}
