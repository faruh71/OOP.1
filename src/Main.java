import Transport.*;

public class Main {
    public static void main(String[] args) {
        Transport[] transport = new Transport[]{
                new Car("BMW", "M5", 4, new DriverB("Али", true, 6), BodyType.SEDAN),
                new Car("audi", "Q8", 4.5, new DriverB("Вова", false, 8),BodyType.VAN),
                new Car("kia", "k5", 5.0, new DriverB("Гриша", true, 2),BodyType.COUPE),
                new Car("Ford", "mondeo", 4.7, new DriverB("Гоша", true, 7), BodyType.CROSSOVER),
                new Truck("камаз", "6454", 8.8, new DriverC("Альберт", true, 12), LoadCapaciti.N1),
                new Truck("маз", "8545", 9, new DriverC("Ринат", true, 24), LoadCapaciti.N3),
                new Truck("man", "825", 7.9, new DriverC("Олег", true, 14), LoadCapaciti.N2),
                new Truck("D&M", "SUPER", 9.9, new DriverC("Арсен", true, 17), LoadCapaciti.N3),
                new Bus("кировец", "", 8, new DriverD("Георг", true, 26), Capacity.С1),
                new Bus("волгабус", "545", 7, new DriverD("Вадим", true, 35), Capacity.С3),
                new Bus("газ", "4645", 7, new DriverD("Саша", true, 23), Capacity.getValue(5)),
                new Bus("белаз", "", 8.8, new DriverD("Оскар", true, 24), Capacity.С4),
        };

        for (int i = 0; i < transport.length; i++) {
            Transport t = transport[i];
            t.printInfo();

        }
    }

}

