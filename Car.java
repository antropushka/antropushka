package autoIndustryTkachova;

import java.util.Arrays;


public class Car {

    private final MakeList make;
    private final Integer manufactureYear;
    private final ModelList model;
    private final EngineCapacityList engineCapacity;

    private ColorList color;
    private WheelSizeList wheelSize;
    private CarAccessories[] additionalAccessories;


    public Car (MakeList make,  ModelList model, Integer manufactureYear,  EngineCapacityList engineCapacity, ColorList color, WheelSizeList wheelSize) {
        this.make = make;
        this.model = model;
        this.manufactureYear = manufactureYear;

        this.engineCapacity = engineCapacity;
        this.color = color;
        this.wheelSize = wheelSize;

        this.additionalAccessories = new CarAccessories[0];
    }

    public void setColor(ColorList color) {
        this.color = color;
    }

    public void setWheelSize(WheelSizeList wheelSize) {
        this.wheelSize = wheelSize;
    }

    public void setAdditionalAccessories(CarAccessories[] additionalAccessories) {
        this.additionalAccessories = additionalAccessories;
    }

    public MakeList getMake() {
        return make;
    }

    public Integer getManufactureYear() {
        return manufactureYear;
    }

    public ModelList getModel() {
        return model;
    }

    public EngineCapacityList getEngineCapacity() {
        return engineCapacity;
    }

    public ColorList getColor() {
        return color;
    }

    public WheelSizeList getWheelSize() {
        return wheelSize;
    }

    public CarAccessories[] getAdditionalAccessories() {
        return additionalAccessories;
    }

    public void printInformationAboutCar() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufactureYear=" + manufactureYear +
                ", model='" + model + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", color=" + color +
                ", wheelSize=" + wheelSize +
                ", additionalAccessories=" + Arrays.toString(additionalAccessories) +
                '}';
    }
}

