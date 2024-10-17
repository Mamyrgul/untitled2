import java.time.LocalDate;

public class Person {
    String firstName;
    String lastName;
    LocalDate dateOfBirth;


    public Person(){}

    public Person(String firstName,String lastName,LocalDate dateOfBirth){
        this.firstName=firstName;
        this.lastName=lastName;
        this.dateOfBirth=dateOfBirth;

    }


    @Override
    public String toString() {
        return "firstName= " + firstName + '\n' +
                " lastName= " + lastName + '\n' +
                " dateOfBirth= " + dateOfBirth ;
    }
}
