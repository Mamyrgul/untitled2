import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     /*   MyClass деген класс тузунуз
        Ал класста озунуз жонундо маалымат сактаган полелер болсун(атыныз, фамилияныз, жашыныз
                , Peaksoft то катышкан сабактарыныз(массив), жакшы коргон тамагыныз)
        Параметри эки башка болгон эки конструктор тузунуз
        MyClassтын 2 объектисин тузуп, конструктор аркылуу маани бериниз
        Эки объектке эки башка конструктор иштесин.
        Объекттердин маанилерин консольго чыгарыныз.*/

       MyClass myClass= new MyClass("Mamyrgul","Zhurdunbekova",18);
       String [] lessons= {"Loop","Massive","Construction"};
       MyClass myClass1= new MyClass("Maya","Kuluieva",18,lessons,"Kitchen");
       myClass.info();
       myClass1.information();
    }
}