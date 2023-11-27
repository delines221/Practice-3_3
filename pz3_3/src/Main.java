import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>(List.of(new Cat("Tom", LocalDate.of(2018, 04, 14), new Random().nextInt(100)),
                new Cat("Murca", LocalDate.of(2022, 06, 29), new Random().nextInt(100)),
                new Cat("Murzic", LocalDate.of(2019, 02, 10), new Random().nextInt(100))));
        for (Cat cat : cats){
            System.out.println(cat);

        }
        Collections.sort(cats);
        List<Dog> dogs = new ArrayList<>(List.of(new Dog("Shuric", LocalDate.of(2022, 07, 19), new Random().nextInt(100)),
                new Dog("Zver", LocalDate.of(2021, 04, 29), new Random().nextInt(100)),
                new Dog("Luna", LocalDate.of(2010, 01, 14), new Random().nextInt(100))));
        for(Dog dog : dogs){
            System.out.println(dog);
        }
        List<PatAnimal> rancho = new ArrayList<>();
        rancho.addAll(cats);
        rancho.addAll(dogs);
        rancho.sort(new AnimalByAgeComparator(Order.DESCENDING));

        for(PatAnimal animal : rancho){
            System.out.println(animal.getName() + " " + animal.getYearOfBirth() + " years");
            System.out.println();
        }

    }
}