package Transport;

public class Bus extends Transport {

    public Bus(String brand, String model, int year, String country, String color,int maxSpeed) {
        super(brand, model, year, country, color,maxSpeed);
    }

    @Override
    public String toString() {
        return "Марка автбуса "+getBrand()+" , модель "+getModel()+" , год выпуска "+getYear() +"г , страна производства "+getCountry()+" , цвет кузова "+getColor()+ " , максимальная скорость-"+getMaxSpeed();
    }
}
