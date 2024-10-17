import java.time.LocalDate;

public class MainHoWork {
    public static void main(String[] args) {

      /*  Book деген класс тузунуз
        полялары(id,bookName,price,genre,create
                Date)
        Library деген класс тузунуз
,полялары(id,name,address,Book[] books)
        Main ден 3 library 5 book тузунуз
        1 id деги library нин ичиндеги бардык
        китептерди алып чыккан метод
        тузунуз
       */

        Book book1 = new Book(5432123,"Flower",600,"Roman", LocalDate.of(2003,8,12));
        Book book2= new Book(6532123,"Scy",240,"Roman", LocalDate.of(2023,12,29));
        Book book3 = new Book(76432123,"Flower",600,"Roman", LocalDate.of(1890,7,14));
        Book book4 = new Book(4332123,"Flower",600,"Roman", LocalDate.of(2021,9,9));
        Book book5 = new Book(8732123,"Flower",600,"Roman", LocalDate.of(2022,11,24));
        Book [] books = {book1,book2,book3,book4,book5,};

        Library library1= new Library(65234,"Arabaev","Bishkek",books);
        Library library2= new Library(35234,"BookHouse","Osh",books);
        Library library3= new Library(34234,"BookShop","Talas ",books);

        library2.info();

    }

}
