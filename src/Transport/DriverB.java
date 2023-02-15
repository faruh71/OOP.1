package Transport;

public class DriverB extends Driver {
    public DriverB(String name, boolean  driversLicense, int experience) {
        super(name, driversLicense, experience);

    }
    @Override
    public String toString() {
        return " имя водителя " + getName() +
                ", категория ВУ = B" +
                ", стаж =" + getExperience()+ " лет , он учавствует в заезде " ;
    }



    @Override
    void startMovi() {
        System.out.println("водитель авто "+getName()+" начал движение ");
    }

    @Override
    void stopMovi() {
        System.out.println("водитель авто "+getName()+" закончил движение ");
    }

    @Override
    void refill() {
        System.out.println("водитель авто "+getName()+" заправил авто  ");
    }

}
