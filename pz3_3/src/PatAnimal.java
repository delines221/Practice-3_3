import java.time.LocalDate;

public class PatAnimal {
    private String name;
    private LocalDate yearOfBirth;

    public PatAnimal(String name, LocalDate yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public PatAnimal() {
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return LocalDate.now().getYear() - yearOfBirth.getYear();
    }
     public void sleep(){

     }

     public void makeSound(){

     }

}
