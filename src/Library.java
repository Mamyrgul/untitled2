import java.util.Arrays;
import java.util.SortedMap;

public class Library {
    long id;
    String name;
    String address;
    Book [] books;

    public Library(){}

    public Library ( long id,String name, String address, Book [] books){
        this.name=name;
        this.id=id;
        this.address=address;
        this.books=books;



    }
public  void info(){
    System.out.println("\nName library: "+name+"\n"+"ID: "+id+"\n"+"Address: "+address);
    System.out.println("Books inside this library:");
    for (Book book:books){
        System.out.println(book);
    }
}
}
