package class4;

public class Producent {
    final String model;
    final String type;

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
