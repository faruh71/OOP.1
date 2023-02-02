package Transport;

import java.security.Key;
import java.util.regex.Pattern;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private String bodytype;
    private String registrationNumber;
    private int numberSeats;
    private Key key;

    private String season;

//    public Car(String brand, String model, int year, String country, String color, double engineVolume) {
//        this.brand = string(brand, "бренд  не указан ");
//        this.model = string(model, " не указана ");
//        this.engineVolume = volume(engineVolume);
//        this.color = string(color, "белый");
//        this.year = number(year, 2000);
//        this.country = string(country, " не указана ");
//    }

    public Car(String brand, String model, int year, String country, String color, double engineVolume, String transmission,
               String bodytype, String registrationNumber, int numberSeats, String season) {
        this.brand = string(brand, "бренд  не указан ");
        this.model = string(model, " не указана ");
        this.engineVolume = volume(engineVolume);
        this.color = string(color, "белый");
        this.year = number(year, 2000);
        this.country = string(country, " не указана ");
        this.transmission = string(transmission, "механика");
        this.bodytype = getBodytype();
        this.registrationNumber = registracionNumbers(registrationNumber);
        this.numberSeats = number(numberSeats, 4);
        this.season = getSeason();
    }

    public class Key {
        private String remoteStart;
        private String keylessAccess;

        public Key(String remoteStart, String keylessAccess) {
            this.remoteStart = string(remoteStart, "нет");
            this.keylessAccess = string(keylessAccess, "нет");
        }

        public String getRemoteStart() {
            return string(remoteStart, "стандартный");
        }

        public void setRemoteStart(String remoteStart) {
            this.remoteStart = string(remoteStart, "стандартный");
        }

        public String getKeylessAccess() {
            return string(keylessAccess, "стандарный");
        }

        public void setKeylessAccess(String keylessAccess) {
            this.keylessAccess = string(keylessAccess, "стандарный");

        }

        @Override
        public String toString() {
            return "дистанционный запуск -" + remoteStart + " , бесключевой  доступ - " + keylessAccess + " .";
        }
    }

    public String getBrand() {
        return string(brand, "бренд не указан");

    }

    public String getModel() {
        return string(model, "не указан");
    }

    public double getEngineVolume() {
        return engineVolume = volume(engineVolume);
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = volume(engineVolume);
    }

    public String getColor() {
        return color = string(color, "белый");
    }

    public void setColor(String color) {
        this.color = string(color, "белый");
    }

    public int getYear() {
        return number(year, 2000);
    }

    public String getCountry() {
        return string(color, "Россия");
    }

    public String getTransmission() {
        this.transmission = string(transmission, "механика");
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = string(transmission, "механика");
    }

    public String getBodytype() {
        return string(bodytype, "седан");
    }

    public String getRegistrationNumber() {
        return registrationNumber = registracionNumbers(registrationNumber);
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registracionNumbers(registrationNumber);
    }

    public int getNumberSeats() {
        return numberSeats < 0 ? 4 : numberSeats;
    }

    public String getSeason() {
        return season = string("зимние", season);
    }

    public void setSeason(String season) {
        this.season = string(season, "зимние");
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }


    public String line() {
        return brand + ", модель " + model + " , год выпуска " + year + ", страна производства " + country
                + " , цвет кузова -" + color + "  обьем двигателя " + engineVolume;
    }


    @Override
    public String toString() {
        return brand + '\'' +
                ", модель " + model + '\'' +
                ", обьем двигвтеля =" + engineVolume +
                ", цвет " + color + '\'' +
                ", год выпуска =" + year +
                ", произведено в " + country + '\'' +
                "\n трансмиссия ='" + getTransmission() + '\'' +
                ", тип кузова ='" + bodytype + '\'' +
                ", гос номер ='" + registrationNumber + '\'' +
                ", вместимость =" + numberSeats +
                ", шины ='" + season + "\n";
    }

    public static String registracionNumbers(String i) {
        if (Pattern.matches("[а-я][0-9]{3}[а-я]{2}[0-9]{3}", i)) {
            return i;
        } else if (Pattern.matches("[а-я][0-9]{3}[а-я]{2}[0-9]{2}", i)) {
            return i;
        } else {
            return " x000xx000";
        }
    }

    public static double volume(double i) {
        return i <= 0 ? 1.5 : i;
    }

    public static int number(int a, int s) {
        return a <= 0 ? s : a;
    }

    public static String string(String a, String s) {
        return a == null || a.isBlank() || a.isEmpty() ? s : a;
    }

}
