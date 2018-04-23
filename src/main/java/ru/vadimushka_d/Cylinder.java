package ru.vadimushka_d;

public class Cylinder {

    private float height;
    private float radius;

    Cylinder(float height, float radius) {
        this.height = height;
        this.radius = radius;
    }

    double SideSquare() {
        return 2 * Math.PI * this.radius * height;
    }

    double SquareBasis() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    double Volume() {
        return this.height * Math.pow(this.radius, 2) * Math.PI;
    }

    @Override
    public String toString() {
        return "Цилинд {" +
                "высота = " + height + " см , " +
                "радиус = " + radius + " см }\n" +
                "\tБоковая площадь {" + String.format("%.2f", SideSquare()) + " см^2}\n" +
                "\tПлощадь основания {" + String.format("%.2f", SquareBasis()) + " см^2}\n" +
                "\tОбъем {" + String.format("%.2f", Volume()) + " см^3}\n";
    }
}
