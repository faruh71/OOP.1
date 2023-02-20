package Transport;


public abstract class Transport<T extends Driver> implements Competing {
    private final String brend;
    private final String model;
    private double engineVolume;
    private T driver;

    private LoadCapaciti loadCapaciti;

    public Transport(String brend, String model, double engineVolume, T driver) {
        this.brend = strings(brend);
        this.model = strings(model);
        this.engineVolume = numbers(engineVolume);
        setDriver(driver);
    }

    public void printInfo() {
        System.out.println("brend = " + brend +
                ", Model = " + model +
                ", engineVolume = " + engineVolume + " , " + driver);
    }

    abstract Type getType();

    abstract void printType();

    abstract void start();

    abstract void stop();


    public LoadCapaciti getLoadCapaciti() {
        return loadCapaciti;
    }

    public String getBrend() {
        return strings(brend);
    }

    public String getModel() {
        return strings(model);
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }


    public static String strings(String value) {
        return value == null || value.isEmpty() || value.isBlank() ? "не известно" : value;
    }

    public static double numbers(double value) {
        return value <= 0 ? 1.5 : value;
    }
}

