package class4;

public class Dimension {
    private final int high;
    private final int width;
    private final int trunkCapacity;

    public Dimension(int high, int width, int trunkCapacity) {
        this.high = high;
        this.width = width;
        this.trunkCapacity = trunkCapacity;
    }

    public int getHigh() {
        return high;
    }

    public int getWidth() {
        return width;
    }

    public int getTrunkCapacity() {
        return trunkCapacity;
    }
}
