package web.model;

public class Car {
    private String name;
    private String series;

    public Car() {
    }

    public Car(String name, String series) {
        this.name = name;
        this.series = series;
    }

    public String getName() {
        return name;
    }

    public String getSeries() {
        return series;
    }
}
