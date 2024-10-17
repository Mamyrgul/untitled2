import java.time.LocalDate;
import java.util.Arrays;

public class Group {
    String groupName;
    LocalDate startDate;
    String mentor;
    Person [] people;

    public Group(){}

    public  Group( String groupName,LocalDate startDate,String mentor,Person [] people){
        this.groupName=groupName;
        this.startDate=startDate;
        this.mentor=mentor;
        this.people=people;

    }

    @Override
    public String toString() {
        return "Group name= " + groupName + '\n' +
                " Start date= " + startDate + "\n"+
                "Mentor= " + mentor + '\n' +"People:"+ Arrays.toString(people);
    }
}
