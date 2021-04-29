public class CountryData {
    private String name;
    private String code3;
    private String capital;
    private String language;
    private String currency;
    private String region;

    public CountryData(String name, String code3, String capital, String language, String currency, String region) {
        this.name = name;
        this.code3 = code3;
        this.capital = capital;
        this.language = language;
        this.currency = currency;
        this.region = region;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode3() {
        return code3;
    }

    public void setCode3(String code3) {
        this.code3 = code3;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "CountryData{" +
                "name='" + name + '\'' +
                ", code3='" + code3 + '\'' +
                ", capital='" + capital + '\'' +
                ", language='" + language + '\'' +
                ", currency='" + currency + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
}
