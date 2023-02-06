package Transport;

import java.time.LocalDate;
import java.util.regex.Pattern;

public class Car extends Transport {

    private double engineVolume;
    private String transmission;
    private String bodytype;
    private String registrationNumber;
    private int numberSeats;
    private String season;
    private Key key;

//    public Car(String brand, String model, int year, String country, String color, double engineVolume) {
//        this.brand = string(brand, "бренд  не указан ");
//        this.model = string(model, " не указана ");
//        this.color = string(color, "белый");
//        this.year = number(year, 2000);
//        this.country = string(country, " не указана ");
//        this.engineVolume = volume(engineVolume);
//    }

    public Car(String brand, String model, int year, String country, String color, double engineVolume, String transmission,
               String bodytype, String registrationNumber, int numberSeats, Key key) {
        super(brand, model, year, country, color);
        this.engineVolume = volume(engineVolume);
        this.transmission = string(transmission, "механика");
        this.bodytype =getBodytype(bodytype);
        this.registrationNumber = registracionNumbers(registrationNumber);
        this.numberSeats = number(numberSeats, 4);
//        this.season = season; boolean season
        setKey(key);
    }

    public static class Key {
        private final boolean remoteStart;
        private final boolean keylessAccess;

        public Key(boolean remoteStart, boolean keylessAccess) {
            this.remoteStart = remoteStart;
            this.keylessAccess = keylessAccess;
        }

        public boolean isRemoteStart() {
            return remoteStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }

        @Override
        public String toString() {
            return (remoteStart ? ", удаленный запуск " : ", без удаленного запуска ") + " " + (keylessAccess ? ", беcключквой дотуп " : ", ключевой дотуп ");
        }
    }

    public double getEngineVolume() {
        return engineVolume = volume(engineVolume);
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = volume(engineVolume);
    }

    public String getTransmission() {
        this.transmission = string(transmission, "механика");
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = string(transmission, "механика");
    }


    public String getBodytype(String bodytype) {
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

//    public boolean isSeason() {
//        return season;
//    }

    public String setSeason() {
        int month = LocalDate.now().getMonthValue();
        if ((month >= 11 && month <= 12) || (month >= 1 && month <= 3)) {
            season = "зимние";
        } else if (month >= 4 && month <= 10) {
            season = "летние";
        }
        return season;
    }
//    public void setSeason(int month) {
//        if ((month >= 11 && month <= 12) || (month >= 1 && month <= 3)) {
//            season = false;
//        } else if (month >= 4 && month <= 10) {
//            season = true;
//        }
//    }


    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key == null) {
            key = new Key(false, false);
        }
        this.key = key;
    }


    public String line() {
        return getBrand() + ", модель " + getModel() + " , год выпуска " + getYear() + ", страна производства " + getCountry()
                + " , цвет кузова -" + getColor() + "  обьем двигателя " + engineVolume;
    }


    @Override
    public String toString() {
        return super.toString() +
                ", обьем двигвтеля =" + engineVolume +
                "\n трансмиссия ='" + getTransmission() + '\'' +
                ", тип кузова ='" + bodytype + '\'' +
                ", гос номер ='" + registrationNumber + '\'' +
                ", вместимость =" + numberSeats +
                ", нужны шины =" + setSeason() + " , " + key + " \n";
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


}
