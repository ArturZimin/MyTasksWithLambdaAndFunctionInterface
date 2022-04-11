package task1;

import java.util.Comparator;

public class MyComparator implements Comparator<People> {
    @Override
    public int compare(People o1, People o2) {
        int result = 0;
        if (o1.getWeight() - o2.getWeight() == 0) {
            return 0;
        } else {
            result = o1.getWeight() - o2.getWeight() > 0 ? 1 : 0;
            return result;
        }
    }
}
