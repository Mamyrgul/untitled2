import java.time.LocalDate;
import java.util.Arrays;

public class Company {
    String companyName;
    String country;
    LocalDate foundationDate;
    String founder;
    Group [] groups;
    Person [] people;

    public Company(){}

    public Company(String companyName,String country,LocalDate foundationDate,String founder,Group [] groups,Person [] people){
        this.companyName=companyName;
        this.country=country;
        this.foundationDate=foundationDate;
        this.founder=founder;
        this.groups=groups;
        this.people=people;
    }

    @Override
    public String toString() {
        return
                "Company name= " + companyName + '\n' +
                "Country= " + country + '\n' +
                "Foundation date= " + foundationDate + "\n"+
                "Founder= " + founder + '\n' +
                "Groups= " + Arrays.toString(groups) +"\n"+"People:"+Arrays.toString(people) ;
    }
}
