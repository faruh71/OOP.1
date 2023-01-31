public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public Car(String brand, String model, int year, String country, String color, double engineVolume) {
        this.brand = string(brand, "бренд  не указан ");
        this.model = string(model, " не указана ");
        this.engineVolume = volume(engineVolume);
        this.color = string(color, "белый");
        this.year = number(year, 2000);
        this.country = string(color, " не указана ");
    }


    @Override
    public String toString() {
        return brand + ", модель " + model + " , год выпуска " + year + ", страна производства " + country
                + " , цвет кузова -" + color + "  обьем двигателя " + engineVolume;
    }

    public static double volume(double i) {
        return i <= 0 ? 1.5 : i;
    }

    public static int number(int a, int s) {
        return a < 0 ? s : a;
    }

    public static String string(String a, String s) {
        return a == null || a.isBlank() || a.isEmpty() ? s : a;
    }

}
