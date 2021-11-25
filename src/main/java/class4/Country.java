package class4;

public class Country {

    final String countryName;
    final char countrySign;

    public Country(String countryName, char countrySign) {
        this.countryName = countryName;
        this.countrySign = countrySign;
    }

    public String getCountryName() {
        return countryName;
    }

    public char getCountrySign() {
        return countrySign;
    }

    public String toString() {
        return countryName + "-" + countrySign;
    }

}
