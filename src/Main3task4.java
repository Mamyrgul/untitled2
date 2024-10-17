public class Main3task4 {
    public static void main(String[] args) {

    /*    Cоздайте класс Person c полями(name,
                age, work, salary, phone). В main
        создайте 5 объектов класса, дайте
        значения через конструктор, положите
        эти объекты в массив, сначала
        выведите все эти объекты на консоль.
        Теперь выведите человека у которого
        самая высокая зарплата, выведите у
        кого самая низкая зарплата, выведите у
        кого самый дорогой телефон*/


        Human human1= new Human("Enes",20,"Programmer",2696490,57893);
        Human human2= new Human("Mirlan",32,"Businessman",143208,45763);
        Human human3= new Human("Jyrgalbek",16,"Seller",987653,578470);
        Human human4= new Human("Said",16,"Teacher",2837282,76347);
        Human human5= new Human("Rahmankul",21,"Builder",2693790,97893);
        Human human6= new Human("Maya",18,"Translator",983452,9845683);

    Human [] humans= {human1,human2,human3,human4,human5,human6};
    for (Human human:humans){
        System.out.println(human);
    }
        Human.salaryCheck(humans);
        Human.priceCheck(humans);
    }
}