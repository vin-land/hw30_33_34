import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>();
        books.add("1.Основание - A.Azimov");
        books.add("2.Гиперион - D.Simmons");
        books.add("3.Муки радости - I.Stone");
        books.add("4.Шерлок Холмс - A.Conan Doyle");
        books.add("5.Мушкетеры - А.Дюма");
        books.forEach(System.out::println);
        System.out.println("----------------------");
        books.remove(books.size()-1);
        books.forEach(System.out::println);
        System.out.println("----------------------");
        books.set(books.size()-1,"5.Мушкетеры - А.Дюма" );
        System.out.println(books.get(books.size()-1));
        System.out.println("----------------------");
        books.clear();
        books.addAll(Arrays.asList("1.Философия java","2. К оружию! К оружию!","3.HeadFirst Java"));
        books.forEach(System.out::println);
    }
}
