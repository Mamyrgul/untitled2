import java.time.LocalDate;

public class Main2 {
    public static void main(String[] args) {
     /*   Company деген класс тузунуз, полелери
        (company name, country, year of foundation,
        founder, groups[]).
        Group деген класс тузунуз, полелери(group
        name, start date, mentor), ушул класс Company
        класска поле катары массив болуп барат.
        Person деген класс тузунуз, полелери(first
        name, last name, date of birth) ушул класс
        Company жана Group класстарга поле катары
        барат.
                main ден класстардын объектин тузуп
        полелерине маани бериниз жана консольго
        чыгарыныз.*/

        Person person1 = new Person("Adilet","Egemberdiev",LocalDate.of(2008,4,30));
        Person person2 = new Person("Fatima","Altynbek kyzy",LocalDate.of(2004,8,1));
        Person person3 = new Person("Mirlan","Tashtanbekov",LocalDate.of(1992,2,14));
        Person person4 = new Person("Gulnur","Asanalieva",LocalDate.of(1995,2,23));
        Person person5 = new Person("Bektur","Akylbekov",LocalDate.of(2004,3,3));
        Person person6 = new Person("Sanjar","Abdumalikov",LocalDate.of(2009,7,29));
        Person person7 = new Person("Mamyrgul","Zhursunbekova",LocalDate.of(2006,2,7));
        Person person8 = new Person("Said","Abdurashitov",LocalDate.of(2008,7,29));
        Person person9 = new Person("Enes","Marat uulu",LocalDate.of(2004,8,24));
        Person person10 = new Person("Nursultan","Alymbekov",LocalDate.of(2007,1,2));
        Person person11 = new Person("Elaman","Abjalov",LocalDate.of(2008,3,27));
        Person person12 = new Person("Rahmankul","Zhakaev",LocalDate.of(2003,4,14));
        Person person13 = new Person("Azmar","Kurmanbekov",LocalDate.of(2009,2,21));
        Person person14 = new Person("Jyrgalbek","Amangulov",LocalDate.of(2009,2,15));


        Person []people= {person1,person2,person3,person4,person5,person6,person7,person8,person9,person10,person11,person12,person13,person14};
        Group group = new Group("Java16",LocalDate.of(2024,9,9),"Aizat",people);

        Company company = new Company("PeakSoft","Kyrgyzstan",LocalDate.of(2015,9,9),"Esen",new Group[]{group},people);
        System.out.println(company);
    }
    }
