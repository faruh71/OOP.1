package Transport;

public class DriverC extends Driver {
    public DriverC(String name, boolean driversLicense, int experience) {
        super(name, driversLicense, experience);
    }
    @Override
    public String toString() {
        return " имя водителя " + getName() +
                ", категория ВУ = С" +
                ", стаж =" + getExperience()+ " лет, он учавствует в заезде " ;
    }

    @Override
    void startMovi() {
        System.out.println("водитель грузовика "+getName()+" начал движение ");
    }

    @Override
    void stopMovi() {
        System.out.println("водитель грузовика "+getName()+" закончил движение ");
    }

    @Override
    void refill() {
        System.out.println("водитель грузовика "+getName()+" заправил авто  ");
    }

}
