import java.util.Arrays;

public class Human {
    String name;
    int age;
    String work;
    long salary;
    long pricePhone;

    public  Human(){}

    public Human( String name,int age,String work,long salary,long pricePhone){
        this.name=name;
        this.age=age;
        this.work=work;
        this.salary=salary;
        this.pricePhone=pricePhone;

    } public static void salaryCheck(Human [] humans){
        Human max=humans[0];
        Human min = humans[0];
        for (int i = 0; i < humans.length; i++) {
            if (max.salary<humans[i].salary){
                max=humans[i];
            } if (min.salary>humans[i].salary){
                min=humans[i];
            }
        }
        System.out.println(max.name+" take maximum salary: "+max.salary);
        System.out.println(min.name+" take minimum salary: "+min.salary);
    }

    public static void priceCheck(Human [] humans){
        Human price= humans[0];
        for (int i = 0; i < humans.length; i++) {
            if (price.pricePhone<humans[i].pricePhone){
                price=humans[i];
            }
        }
        System.out.println(price.name+" most expensive phone: "+price.pricePhone);

    }

    @Override
    public String toString() {
        return
                "\nName: " + name + '\n' +
                "Age: " + age +"\n"+
                "Work: " + work + '\n' +
                "Salary: " + salary +"\n"+
                "Price phone: " + pricePhone ;
    }
}
