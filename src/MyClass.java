import java.util.Arrays;

public class MyClass {
   String name;
   String lastname;
   int age;
   String [] lessons ;
   String food;

   public MyClass( String name,String lastname,int age){
       this.name=name;
       this.lastname=lastname;
       this.age=age;

   } public MyClass(String name,String lastname,int age,String [] lessons ,String food){
        this.name=name;
        this.lastname=lastname;
        this.age=age;
        this.lessons=lessons;
        this.food=food;

    } public void info(){
        System.out.println("Name"+name+"\n"+"Last name:"+lastname+"\n"+"Age:"+age);
    } public void information(){
        System.out.println("Name"+name+"\n"+"Last name:"+lastname+"\n"+"Age:"+age);
        System.out.println("Lessons:"+Arrays.toString(lessons));
        System.out.println("Favorite food:"+food);
    }

}
