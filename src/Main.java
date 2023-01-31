public class Main {
    public static void main(String[] args) {

        Car lada = new Car("Lada", "Granta", 2015, "России", "желтого", 1.7);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германии", "черный", 3.0);
        Car bmw = new Car("BMW", "Z8", 2021, "Германии", "черный", 3.0);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2018, "Южной Корее", "красный", 2.4);
        Car hyundai = new Car("Hyundai", "Avante", 2016, "Южной Корее", "оранжевый", 1.6);
        Car ehyundai = new Car("", "", 0, "", "", 0);
        System.out.println(lada + "\n" + audi + "\n" + bmw + "\n" + kia + "\n" + hyundai + "\n" + ehyundai);
    }
}

