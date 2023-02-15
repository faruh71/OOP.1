package Transport;

public class DriverD extends  Driver{
    public DriverD(String name, boolean driversLicense, int experience) {
        super(name, driversLicense , experience);
    }
    @Override
    public String toString() {
        return " имя водителя " + getName() +
                ", категория ВУ = D" +
                ", стаж =" + getExperience()+ " лет ,он учавствует в заезде " ;
    }

    @Override
    void startMovi() {
        System.out.println("водитель автобуса "+getName()+" начал движение ");
    }

    @Override
    void stopMovi() {
        System.out.println("водитель автобуса "+getName()+" закончил движение ");
    }

    @Override
    void refill() {
        System.out.println("водитель автобуса "+getName()+" заправил авто  ");
    }
}
