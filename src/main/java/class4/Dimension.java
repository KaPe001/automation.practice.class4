package class4;

public class Dimension {
    final int high;
    final int width;
    final int trunkCapacity;

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
