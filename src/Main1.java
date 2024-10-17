import java.time.LocalDate;

public class Main1 {
    public static void main(String[] args) {

        Student student = new Student("Tima", LocalDate.of(2005,5,17),"0701019452","Kyrgyz");
        Student student1 = new Student("Maya", LocalDate.of(2005,4,18),"0701019542","Kyrgyz");
        Student student2 = new Student("Gulia", LocalDate.of(2005,6,18),"070101942","Kyrgyz");
        Student student3 = new Student("Eldiar", LocalDate.of(2005,12,23),"0701219452","Kyrgyz");
        Student student4 = new Student("Adema", LocalDate.of(2005,9,24),"0701015452","Kyrgyz");
        Student [] students= {student,student1,student2,student3,student4};
        for (Student i : students){
        System.out.println(i);
            System.out.println("Age:"+student.getAge());
        }
    }
}
