import java.time.LocalDate;
import java.time.Period;

public class Student {
    String name;
    LocalDate  dateOfBirth;
    String phoneNumber;
    String nationality;

public Student(){}

    public  Student(String name,LocalDate dateOfBirth,String phoneNumber,String nationality){
        this.name= name;
        this.dateOfBirth= dateOfBirth;
        this.phoneNumber= phoneNumber;
        this.nationality= nationality;


    }
    public int getAge(){
        LocalDate currentDate=LocalDate.now();
       Period age= Period.between(dateOfBirth,currentDate);
       return age.getYears();

    }
    @Override
    public String toString() {
        return "Name= " + name + '\n' +
                " Date of birth= " + dateOfBirth +
                " Phone number= " + phoneNumber + '\n' +
                " Nationality= " + nationality + '\n' ;
    }
}
