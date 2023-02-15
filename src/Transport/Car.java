package Transport;

import org.w3c.dom.ls.LSOutput;

public class Car extends Transport<DriverB> {

    public Car(String brend, String model, double engineVolume, DriverB driver) {
        super(brend, model, engineVolume,  driver);
    }

    @Override

    public void start() {
        System.out.println(" автомобиль "+getBrend()+" начал движение");
    }

    @Override
    public void stop() {
        System.out.println(" автомобиль "+getBrend()+" закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println(" пит стп авто ");
    }


    @Override
    public void bestLapTime() {
        int minTime = 70;
        int maxTime = 150;
        int time = (int) (minTime+(maxTime - minTime) * Math.random());
        System.out.println(" лучшее время круга автомобиля = "+time);
    }

    @Override
    public void maxSpeed() {
        int minSpeed = 100;
        int maxSpeed = 150;
        int speed = (int) (minSpeed+(maxSpeed - minSpeed) * Math.random());
        System.out.println(" максимальная скорость автомобиля = "+speed);
    }
}
