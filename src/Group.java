import java.time.LocalDate;

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
        return "groupName=" + groupName + '\n' +
                " startDate=" + startDate +
                " mentor=" + mentor + '\n';
    }
}
