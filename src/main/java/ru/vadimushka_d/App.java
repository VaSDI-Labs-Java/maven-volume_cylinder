package ru.vadimushka_d;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Cylinder chapterTube_One = new Cylinder(6, 8);
        Cylinder chapterTube_Two = new Cylinder(6, 6);

        System.out.println(chapterTube_One);
        System.out.println(chapterTube_Two);

        System.out.println("-------------");

        double volume = chapterTube_One.Volume() - chapterTube_Two.Volume();
        System.out.printf("Объем трубы = %.2f см^3\n", volume);

        double square = chapterTube_One.SideSquare() + chapterTube_Two.SideSquare() +
                (chapterTube_One.SquareBasis() - chapterTube_Two.SquareBasis());
        System.out.printf("Площадь поверхности трубы = %.2f см^2\n", square);
    }
}
