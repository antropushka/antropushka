package autoIndustryTkachova;

public class BMWCarStorage {
    private Car[] BMWCarStorage;

    public BMWCarStorage() {
        this.BMWCarStorage = new Car[0];
    }

    public Car[] getBMWCarStorage() {
        return BMWCarStorage;
    }
    // поис машины по полному совпадению параметров, чтобы выполнить заказ
    public Integer searchCar (MakeList make, ModelList model, Integer manufactureYear,
                              EngineCapacityList engineCapacity, ColorList color, WheelSizeList wheelSize) {
        for (int i = 0; i < BMWCarStorage.length; i++) {
            if (BMWCarStorage[i].getMake().equals(make) && BMWCarStorage[i].getModel().equals(model) &&
                    BMWCarStorage[i].getManufactureYear().equals(manufactureYear) &&
                    BMWCarStorage[i].getEngineCapacity().equals(engineCapacity) &&
                    BMWCarStorage[i].getColor().equals(color) && BMWCarStorage[i].getWheelSize().equals(wheelSize)) {
                return i;
            }
        }
        return -1;
    }
    // поис машины по  совпадению параметров МОДЕЛЬ, ГОДЮ ОБЪЕМ ДВИГАТЕЛЯ (кот-е неизменяемые), чтобы  отправить в сервис
    public Integer searchCar (ModelList model, Integer manufactureYear,
                              EngineCapacityList engineCapacity) {
        for (int i = 0; i < BMWCarStorage.length; i++) {
            if (BMWCarStorage[i].getModel().equals(model) && BMWCarStorage[i].getManufactureYear().equals(manufactureYear) &&
                    BMWCarStorage[i].getEngineCapacity().equals(engineCapacity)) {
                return i;
            }
        }
        return -1;
    }
//     Добавить созданную машину в гараж
    public  void addCarInBMWStorage (Car BMWCar) {
        Car[] BMWCarStorageTemp = new Car[BMWCarStorage.length + 1];
        BMWCarStorageTemp[BMWCarStorageTemp.length - 1] = BMWCar;
        this.BMWCarStorage = BMWCarStorageTemp;
////
//            }
//
//
//        //извлечь машину из гаража
//
//        public void takeCarFromStorage() {
//            if (count < 0) {
//                System.out.println("В гараже нет машин");
//            }
//
//            return BMWCarStorage[count--];
//        }
//
    }





}




