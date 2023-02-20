package Transport;

public class Truck extends Transport<DriverC> {
    private LoadCapaciti loadCapaciti;

    public Truck(String brend, String model, double engineVolume,DriverC driver,LoadCapaciti loadCapaciti) {
        super(brend, model, engineVolume, driver);
        this.getLoadCapaciti();
    }

    @Override
    public void printInfo() {
        System.out.println("brend = " + getBrend() +
                ", Model = " + getModel() +
                ", engineVolume = " + getEngineVolume() + " , " + getDriver() + " , " + getLoadCapaciti());
    }

    @Override
    Type getType() {
        return Type.TRUCK;
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
        System.out.println(" грузовик " + getBrend() + " начал движение");
    }

    @Override
    public void stop() {
        System.out.println(" грузовик " + getBrend() + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println(" пит стоп грузовика ");
    }

    @Override
    public void bestLapTime() {
        int minTime = 70;
        int maxTime = 150;
        int time = (int) (minTime + (maxTime - minTime) * Math.random());
        System.out.println(" лучшее время круга грузовика = " + time);
    }

    @Override
    public void maxSpeed() {
        int minSpeed = 70;
        int maxSpeed = 150;
        int speed = (int) (minSpeed + (maxSpeed - minSpeed) * Math.random());
        System.out.println(" максимальная скорость грузовика = " + speed);
    }
}
