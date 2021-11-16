package class4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Country poland = new Country("Poland", 'P');
        Country germany = new Country("Germany", 'G');
        Country china = new Country("China", 'C');
        Country korea = new Country("Korea", 'K');
        Country france = new Country("France", 'F');

        List<Country> countries = new ArrayList<Country>();
        countries.add(poland);
        countries.add(germany);
        countries.add(china);
        countries.add(korea);
        countries.add(france);


        Market business = new Market("business", Arrays.asList(poland, china, korea));
        Market cargo = new Market("cargo", Arrays.asList(germany, china, france));
        Market transport = new Market("transport", Arrays.asList(germany, korea, china));
        Market taxi = new Market("taxi", Arrays.asList(korea, poland, france));
        Market bus = new Market("bus", Arrays.asList(korea, germany, poland));

        List<Market> markets = new ArrayList<Market>();
        markets.add(business);
        markets.add(cargo);
        markets.add(transport);
        markets.add(taxi);
        markets.add(bus);

        Producent toyota = new Producent("Toyota", "Corolla");
        Producent fiat = new Producent("Fiat", "Punto");
        Producent BMW = new Producent("BMW", "e92");
        Producent ford = new Producent("Ford", "Focus");
        Producent mazda = new Producent("Mazda", "X5");
        Producent mercedes = new Producent("Mercedes", "Benz");
        Producent opel = new Producent("Opel", "Astra");
        Producent alfa = new Producent("Alfa Romeo", "Giulietta");
        Producent gmc = new Producent("GMC", "Sierra");
        Producent range = new Producent("Range Rover", "Velar");

        Producent[] producents = new Producent[10];
        producents[0] = toyota;
        producents[1] = fiat;
        producents[2] = BMW;
        producents[3] = ford;
        producents[4] = mazda;
        producents[5] = mercedes;
        producents[6] = opel;
        producents[7] = alfa;
        producents[8] = gmc;
        producents[9] = range;

        List<Car> carList = Arrays.asList(
                new Car(producents[2], "BMW", "e92", true, markets.get(4),
                        "bus", "medium", Arrays.asList(new Dimension(120, 200, 450))),
                new Car(producents[1], "Fiat", "Punto", false, markets.get(2),
                        "transport", "premium", Arrays.asList(new Dimension(125, 80, 400))),
                new Car(producents[0], "Toyota", "Corolla", false, markets.get(1),
                        "cargo", "standard", Arrays.asList(new Dimension(10, 140, 200))),
                new Car(producents[3], "Ford", "Fiesta", true, markets.get(3),
                        "taxi", "premium", Arrays.asList(new Dimension(70, 130, 120))),
                new Car(producents[4], "Mazda", "X5", true, markets.get(1),
                        "cargo", "medium", Arrays.asList(new Dimension(87, 143, 59))),
                new Car(producents[7], "Opel", "Astra", false, markets.get(2),
                        "transport", "standard", Arrays.asList(new Dimension(113, 97, 214))),
                new Car(producents[8], "GMC", "Sierra", true, markets.get(2),
                        "transport", "standard", Arrays.asList(new Dimension(160, 270, 321))),
                new Car(producents[9], "Range Rover", "Velar", true, markets.get(3),
                        "taxi", "premium", Arrays.asList(new Dimension(98, 116, 500))),
                new Car(producents[4], "Ford", "Fiesta", false, markets.get(3),
                        "taxi", "premium", Arrays.asList(new Dimension(110, 150, 400))),
                new Car(producents[5], "Mercedes", "Benz", false, markets.get(0),
                        "business", "premium", Arrays.asList(new Dimension(90, 210, 250))),
                new Car(producents[2], "BMW", "e92", false, markets.get(4),
                        "bus", "medium", Arrays.asList(new Dimension(126, 223, 550))),
                new Car(producents[5], "Mercedes", "Benz", true, markets.get(0),
                        "business", "medium", Arrays.asList(new Dimension(113, 159, 330))),
                new Car(producents[0], "Toyota", "Corolla", true, markets.get(3),
                        "taxi", "standard", Arrays.asList(new Dimension(108, 162, 229))),
                new Car(producents[7], "Alfa Romeo", "Giulietta", false, markets.get(1),
                        "cargo", "medium", Arrays.asList(new Dimension(93, 104, 217))),
                new Car(producents[9], "GMC", "Sierra", false, markets.get(2),
                        "transport", "premium", Arrays.asList(new Dimension(145, 238, 399))));

        for (Car car : carList) {
            if (car.isBMWAndHasAutomaticGearAndTrunkCapacityOver300()) {
                System.out.println(car.getCountryNameAndSign(car.getMarket().getCountries()));
            }
        }
    }
}
