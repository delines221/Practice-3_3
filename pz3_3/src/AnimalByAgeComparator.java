import java.util.Comparator;
import java.util.stream.IntStream;

public class AnimalByAgeComparator implements Comparator<PatAnimal> {
    private Order order;

    public AnimalByAgeComparator(Order order) {
        this.order = order;
    }

    @Override
    public int compare(PatAnimal o1, PatAnimal o2) {
        if(order==Order.ASCENDING){
            return Integer.compare(o1.getYearOfBirth(), o2.getYearOfBirth()) ;

        }
        else {
            return Integer.compare(o2.getYearOfBirth(), o1.getYearOfBirth());
        }
    }
}
