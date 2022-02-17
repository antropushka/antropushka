package autoIndustryTkachova;

public class BMWCarDealership {
    public BMWCarDealership makeOrder(MakeList make,  ModelList model, Integer manufactureYear,
                                      EngineCapacityList engineCapacity, ColorList color, WheelSizeList wheelSize) {
        if (checkCarArgsToCreateOnFactory(model, engineCapacity, color, wheelSize)) {
            int placeInTheStorage = BMWCarStorage.searchCarInTheStorage(make, model, engineCapacity, color, wheelSize, manufactureYear);
            if (placeInTheStorage > 0) {
                System.out.println("Машина с заданными параметрами найдена и находится в гараже на месте " + placeInTheStorage
                        +"...перемещение");
                return factoryStorage.moveCarFromStorageByIndex(placeInTheStorage);
            }
            placeInTheStorage = BMWCarStorage.searchCarInTheStorage(model, engineCapacity);
            if (placeInTheStorage > 0) {
                System.out.println("Найдена машина на складе автопроизводителя, частично удовлетворяющая параметрам. " +
                        "Машина отправляется в автосервис для изменения параметров в соответствии с заказам автодилера");
                CarService carService = new CarService();
                carService.changeColor(BMWCarStorage.getStorage()[placeInTheStorage], color);
                carService.changeWheelSize(BMWCarStorage.getStorage()[placeInTheStorage], wheelSize);
                return BMWCarStorage.RelocateCarFromStorageToTheCarService(placeInTheStorage);
            }
            System.out.println("Так как автобомиль с заданными параметрами не найден на складе, мы создадим для Вас новый!");
            createCar(mark, engineSize, color, wheelSize);
            return factoryStorage.moveCarFromStorageByIndex(factoryStorage.getStorage().length - 1);
        }
        return null;
    }){

    };
    public BMWCarDealership makeOrderForChange() {

    }




}
