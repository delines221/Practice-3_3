import java.time.LocalDate;
import java.util.Random;

public class Dog extends PatAnimal implements Comparable<Dog>{
    private int scaredOfThievesCount;

    public Dog(String name, LocalDate yearOfBirth, int scaredOfThievesCount) {
        super(name, yearOfBirth);
        this.scaredOfThievesCount = new Random().nextInt((getYearOfBirth()*getYearOfBirth()+1));
    }

    public int getScaredOfThievesCount() {
        return scaredOfThievesCount;
    }

    @Override
    public void sleep() {
        System.out.println("ZzZz... wouf");
    }

    @Override
    public void makeSound() {
        System.out.println("GAF-GAF");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "scaredOfThievesCount=" + scaredOfThievesCount +
                '}';
    }

    @Override
    public int compareTo(Dog o) {
        return Integer.compare(this.scaredOfThievesCount, o.getScaredOfThievesCount());
    }
}
