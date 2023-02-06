import Transport.Bus;
import Transport.Car;

public class Main {
    public static void main(String[] args) {

        Car lada = new Car("Lada", "Granta", 2015, "России", "желтого", 1.7, "автомат", "универсал", "т172ко98", 5, null);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германии", "черный", 3.0, "", "", "н657оп87", 5, null);
        Car bmw = new Car("BMW", "Z8", 2021, "Германии", "черный", 3.0, "вариатор", "купе", "н648рк65", 5, null);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2018, "Южной Корея", "красный", 2.4, "механика", "лимузин", "а111аа11", 11, null);
        Car hyundai = new Car("Hyundai", "Avante", 2016, "Южной Корее", "оранжевый", 0, "", "", "", 0, new Car.Key(true, true));
//        System.out.println(lada + "\n" + audi + "\n" + bmw + "\n" + kia + "\n" + hyundai);
        System.out.println(hyundai);
        Bus reno = new Bus("Рено", "", 2020, "франция", "коричневый", 66);
        Bus paz = new Bus("Паз", "'9547'", 2016, "Россия", "красый", 220);
        Bus opel = new Bus("Опель", "'континент'", 2033, "Германия", "черный", 360);
        System.out.println(reno+"\n"+paz+"\n"+opel);
    }

}

