package autoIndustryTkachova;

public class BMWCarFactory{

    ModelList model;
    EngineCapacityList engineCapacity;
    ColorList color;
    WheelSizeList wheelSize;
    BMWCarStorage myBMWCarStorage;

    public BMWCarFactory(ModelList model, EngineCapacityList engineCapacity, ColorList color, WheelSizeList wheelSize, BMWCarStorage myBMWCarStorage) {
        this.model = model;
        this.engineCapacity = engineCapacity;
        this.color = color;
        this.wheelSize = wheelSize;
        this.myBMWCarStorage = myBMWCarStorage;
    }

    public BMWCarFactory createNewCar(String color, String model, int manufactureYear,
                                      String wheelSize, double engineCapacity, String additionalOptions){
        return new BMWCar(this.color, this.model, this.manufactureYear, this.wheelSize, this.engineCapacity, this.additionalOptions);

    };
    public  BMWCarFactory takeFromTheStorage(){

    };
    public  BMWCarFactory selectAndModifyFromTheStorage(){

    };

    public class BMWCarStorage {

        private BMWCarStorage[] myBMWCarStorage = new BMWCarStorage[6];
        private int count = 0;

        public BMWCarStorage() {
            BMWCarFactory BMWCarStorage =


        }

        }

        public  void addInBMWCarStorage (int number) {
            BMWCarFactory [count] = number;
            if (count  == 5) {



        }




    }






}








