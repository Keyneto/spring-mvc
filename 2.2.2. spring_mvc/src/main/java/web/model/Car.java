package web.model;

public class Car {
    private String model;
    private int series;
    private double sizeEngine;

    public Car(String model, int series, double sizeEngine) {
        this.model = model;
        this.series = series;
        this.sizeEngine = sizeEngine;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public double getSizeEngine() {
        return sizeEngine;
    }

    public void setSizeEngine(double sizeEngine) {
        this.sizeEngine = sizeEngine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "This car: " + model
                + " series number: " + series
                + " size engine: + " + sizeEngine;
    }
}
