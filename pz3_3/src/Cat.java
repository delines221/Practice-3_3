import java.time.LocalDate;
import java.util.Random;

public class Cat extends PatAnimal implements Comparable<Cat>{
    private int caughtMiceCount;

    public Cat(String name, LocalDate yearOfBirth, int caughtMiceCount) {
        super(name, yearOfBirth);
        this.caughtMiceCount = new Random().nextInt((getYearOfBirth()*getYearOfBirth()+1));
    }



    @Override
    public void sleep() {
        System.out.println("meow.... zZzz...");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "caughtMiceCount=" + caughtMiceCount +
                '}';
    }

    @Override
    public int compareTo(Cat o) {
        return Integer.compare(this.caughtMiceCount, o.caughtMiceCount);
    }
}
