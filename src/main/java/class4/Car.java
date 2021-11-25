package class4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Car {
    final Producent producent;
    final String model;
    final String type;
    final boolean isAutomaticGear;
    final Market market;
    final String name;
    final String segment;
    List<Dimension> dimensions = new ArrayList<>();

    public Producent getProducent() {
        return producent;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public boolean isAutomaticGear() {
        return isAutomaticGear;
    }

    public Market getMarket() {
        return market;
    }

    public String getName() {
        return name;
    }

    public String getSegment() {
        return segment;
    }

    public List<Dimension> getDimensions() {
        return dimensions;
    }

    public Car(Producent producent, String model, String type, boolean isAutomaticGear, Market market, String name,
               String segment, List<Dimension> dimensions) {
        this.producent = producent;
        this.model = model;
        this.type = type;
        this.isAutomaticGear = isAutomaticGear;
        this.market = market;
        this.name = name;
        this.segment = segment;
        this.dimensions = dimensions;
    }

    public boolean isBMWAndHasAutomaticGearAndTrunkCapacityOver300() {
        if ("BMW".equals(getProducent().getModel()) && isAutomaticGear()) {
            for (Dimension dimension : getDimensions()) {
                if (dimension.getTrunkCapacity() > 300) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String getCountryNameAndSign(List<Country> countries) {
        return countries.stream()
                .map(Country::toString)
                .collect(Collectors.joining(", "));
    }
}
