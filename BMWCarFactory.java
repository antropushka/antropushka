package autoIndustryTkachova;

import java.util.Arrays;

public class BMWCarFactory{
    // private final String BMW;

    private final ModelList[] model;
    private final EngineCapacityList[] engineCapacity;

    private ColorList[] color;
    private WheelSizeList[] wheelSize;
    private final BMWCarStorage myBMWCarStorage;
   ;

    public BMWCarFactory(String BMW, ModelList[] model, EngineCapacityList[] engineCapacity, ColorList[] color, WheelSizeList[] wheelSize) {
       // this.BMW = BMW;
        this.model = model;
        this.engineCapacity = engineCapacity;
        this.color = color;
        this.wheelSize = wheelSize;
        this.myBMWCarStorage = new  BMWCarStorage();

    }

    public void printCarFactoryOpportunities() {
        System.out.println("На нашем заводе выпускаются автомобили со следующими характеристиками: ");
        System.out.println("марка: " + MakeList.valueOf("BMW"));
        System.out.println("модели: " + Arrays.toString(model));
        System.out.println("цвета: " + Arrays.toString(color));
        System.out.println("Объем двигателя: " + Arrays.toString(engineCapacity));
        System.out.println("размер колес: " + Arrays.toString(wheelSize));

    }

    public void createCar (MakeList make, ModelList model, EngineCapacityList engineCapacity, ColorList color,
                           WheelSizeList wheelSize) {
        BMWCarStorage.addCarToStorage(new Car(make, model, engineCapacity, color, wheelSize));

    }






}














