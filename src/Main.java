import Transport.*;

public class Main {
    public static void main(String[] args) {
        Transport[] transport = new Transport[]{
        new Car("BMW", "M5", 4, new DriverB("Али", true, 6)),
                new Car("audi", "Q8", 4.5, new DriverB("Вова", false, 8)),
                new Car("kia", "k5", 5.0, new DriverB("Гриша", true, 2)),
                new Car("Ford", "mondeo", 4.7, new DriverB("Гоша", true, 7)),
                new Train("камаз", "6454", 8.8, new DriverC("Альберт", true, 12)),
                new Train("маз", "8545", 9, new DriverC("Ринат", true, 24)),
                new Train("man", "825", 7.9, new DriverC("Олег", true, 14)),
                new Train("D&M", "SUPER", 9.9, new DriverC("Арсен", true, 17)),
                new Bus("кировец", "", 8, new DriverD("Георг", true, 26)),
                new Bus("волгабус", "545", 7, new DriverD("Вадим", true, 35)),
                new Bus("газ", "4645", 7, new DriverD("Саша", true, 23)),
                new Bus("белаз", "", 8.8, new DriverD("Оскар", true, 24)),
        };


        for (int i = 0; i < transport.length; i++) {
            Transport t = transport[i];
            t.printInfo();

        }
    }

}

