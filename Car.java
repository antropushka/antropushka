package autoIndustryTkachova;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


public abstract class Car {

    private String color;
    private String model;
    private int manufactureYear;
    private String wheelSize;
    private double engineCapacity;
    private String additionalAccessories;


    public Car (String color, String model, int manufactureYear, String wheelSize, double engineCapacity, String additionalOptions) {
        this.color = color;
        this.model = model;
        this.manufactureYear = manufactureYear;
        this.wheelSize = wheelSize;
        this.engineCapacity = engineCapacity;
        this.additionalAccessories =additionalOptions;
    }

    public Car() {

    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public String getWheelSize() {
        return wheelSize;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public String getAdditionalAccessories() {
        return additionalAccessories;
    }

    public void setColor(String color) {
        this.color = ColorList.valueOf(color);
    }

    public void setWheelSize(String wheelSize) {
        this.wheelSize = WheelSizeList.valueOf(wheelSize);
    }

//    public void setAdditionalAccessories(String additionalAccessories) {
//        this.additionalAccessories = additionalAccessories;
//    }
}

