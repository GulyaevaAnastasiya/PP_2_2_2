package web.model;

public class Car {
    private String brand;
    private String model;
    private int generation;

    public Car(String brand, String model, int generation) {
        this.brand = brand;
        this.model = model;
        this.generation = generation;
    }

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    @Override
    public String toString() {
        return "Car{" +
               "brand='" + brand + '\'' +
               ", model='" + model + '\'' +
               ", generation=" + generation +
               '}';
    }
}
