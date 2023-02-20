package Transport;

public class Bus extends Transport<DriverD> {
    private Capacity capacity;

    public Bus(String brend, String model, double engineVolume, DriverD driver, Capacity capacity) {
        super(brend, model, engineVolume, driver);
        this.capacity = capacity;
    }

    public void printInfo() {
        System.out.println("brend = " + getBrend() +
                ", Model = " + getModel() +
                ", engineVolume = " + getEngineVolume() + " , " + getDriver() + " , " + capacity);
    }

    @Override
    Type getType() {
return Type.BUS;
    }

    @Override
    void printType() {
        if (getLoadCapaciti() == null) {
            System.out.println("Данных недостаточно");
        }else {
            System.out.println(getLoadCapaciti());
        }
    }


    @Override

    public void start() {
        System.out.println(" автобус " + getBrend() + " начал движение");
    }

    @Override
    public void stop() {
        System.out.println(" автобус " + getBrend() + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println(" пит стоп автобуса ");
    }


    @Override
    public void bestLapTime() {
        int minTime = 70;
        int maxTime = 150;
        int time = (int) (minTime + (maxTime - minTime) * Math.random());
        System.out.println(" лучшее время круга автобуса = " + time);
    }

    @Override
    public void maxSpeed() {
        int minSpeed = 70;
        int maxSpeed = 140;
        int speed = (int) (minSpeed + (maxSpeed - minSpeed) * Math.random());
        System.out.println(" максимальная скорость автобуса = " + speed);
    }
}

