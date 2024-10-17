import java.time.LocalDate;

public class Book {
    long id;
    String name;
    int price;
    String genre;
    LocalDate createData;

    public Book (){}

    public Book(long id, String name, int price, String genre, LocalDate createData){
     this.id=id;
     this.name=name;
     this.price=price;
     this.genre=genre;
     this.createData=createData;

    }

    @Override
    public String toString() {
        return
                "\nID: " + id + "\n"+
                "Name: " + name + '\n' +
                "Price: " + price +"\n"+
                "Genre: " + genre + '\n' +
                "Create data: " + createData ;
    }
}
