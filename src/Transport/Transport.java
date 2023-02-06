package Transport;

public class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private int maxSpeed;

    public Transport(String brand, String model, int year, String country, String color) {
        this.brand = string(brand);
        this.model = string(model);
        this.color = string(color, "белый");
        this.year = number(year, 2000);
        this.country = string(country);

    }

    public Transport(String brand, String model, int year, String country, String color, int maxSpeed) {
        this.brand = string(brand);
        this.model = string(model);
        this.color = string(color, "белый");
        this.year = number(year, 2000);
        this.country = string(country);
        this.maxSpeed = number(maxSpeed,90);
    }

    @Override
    public String toString() {
        return brand + ", модель " + model + " , год выпуска " + year + ", страна производства " + country
                + " , цвет кузова -" + color + ", максимальная скорость =" + maxSpeed;
    }

    public String getBrand() {
        return string(brand);
    }

    public String getModel() {
        return string(model);
    }

    public int getYear() {
        return number(year, 2000);
    }

    public String getCountry() {
        return string(country, "Россия");
    }

    public String getColor() {
        return color = string(color, "белый");
    }

    public void setColor(String color) {
        this.color = string(color, "белый");
    }

    public int getMaxSpeed() {
        return maxSpeed=number(maxSpeed,60);
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = number(maxSpeed,60);
    }

    public static int number(int a, int s) {
        return a <= 0 ? s : a;
    }

    public static String string(String a, String s) {
        return a == null || a.isBlank() || a.isEmpty() ? s : a;
    }
        public static String string(String a) {
        return a == null || a.isBlank() || a.isEmpty() ? " неизвестно " : a;
    }
}
