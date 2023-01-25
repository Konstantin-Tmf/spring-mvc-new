package web.model;


public class Car {
    private final String model;
    private final String series;
    private final String color;

    public Car(String model, String series, String color) {
        this.model = model;
        this.series = series;
        this.color = color;
    }

    public String getModel() {
        return model;
    }


    public String getSeries() {
        return series;
    }


    public String getColor() {
        return color;
    }


    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", color='" + color + '\'' +
                '}';
    }
}


