package Transport;

import java.util.Objects;

public abstract class Driver {
    private String name;
    private boolean driversLicense;
    private int experience;

    public Driver(String name, boolean driversLicense, int experience) {
        this.name = name;
        this.driversLicense = driversLicense;
        this.experience = experience;
    }

    abstract void startMovi();

    abstract void stopMovi();

    abstract void refill();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDriversLicense() {
        return driversLicense;
    }

    public void setDriversLicense(boolean driversLicense) {
        this.driversLicense = driversLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
    @Override
    public String toString() {
        return " имя водителя " + name +
                ", категория= " + driversLicense +
                ", стаж =" + experience+ " лет учавствует в заезде " ;
    }


}

