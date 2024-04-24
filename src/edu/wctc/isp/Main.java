package edu.wctc.isp;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Original Program");

        Book book1 = new HardcoverBook("The Hunger Games", "9780439023528",
                8.79, 12,
                LocalDate.of(2010, Month.JULY, 3),
                "Suzanne Collins", 384);
        Book book2 = new PaperbackBook("A Wrinkle in Time", "9780312367541",
                6.19, 4,
                LocalDate.of(2007, Month.MAY, 1),
                "Madeleine L'Engle", 256);
        Album record = new VinylRecord("Kind of Blue",
                13.54, 18,
                LocalDate.of(2011, Month.APRIL, 12),
                "Miles Davis", Duration.ofMinutes(46));

        List<Product> items = new ArrayList<>();
        items.add(book1);
        items.add(book2);
        items.add(record);

        for (Product p : items) {
//            doubleCost(p);
            System.out.println(p.toString());
            System.out.println("\n");
        }
    }

//    public static void doubleCost(Product p) {
//        p.setCost(p.getCost() * 2);
//    }
}
