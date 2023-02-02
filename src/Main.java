import Transport.Car;

public class Main {
    public static void main(String[] args) {

        Car lada = new Car("Lada", "Granta", 2015, "России", "желтого", 1.7, "автомат", "универсал", "т172ко98", 5, "летние");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германии", "черный", 3.0, "", "", "н657оп87", 5, "летние");
        Car bmw = new Car("BMW", "Z8", 2021, "Германии", "черный", 3.0, "вариатор", "купе", "н648рк65", 5, "зимние");
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2018, "Южной Корея", "красный", 2.4, "механика", "лимузин", "а111аа11", 11, "лунные");
        Car hyundai = new Car("Hyundai", "Avante", 2016, "Южной Корее", "оранжевый", 0, "", "", "а555ап6", 0, "");
        Car.Key hyundaKey = hyundai.new Key("есть", "нет");
        hyundai.setRegistrationNumber("у765ку75");
        System.out.println(lada + "\n" + audi + "\n" + bmw + "\n" + kia + "\n" + hyundai);
        System.out.println(hyundai+" " +hyundaKey);
    }
}

