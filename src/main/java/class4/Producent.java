package class4;

public class Producent {
    private final String model;
    private final String type;

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public Producent(String model, String type) {
        this.model = model;
        this.type = type;
    }
}
