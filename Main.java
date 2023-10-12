abstract class Engine {
     String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

class CombustionEngine extends Engine {
    public CombustionEngine() {
        super("Combustion");
    }
}

class ElectricEngine extends Engine {
    public ElectricEngine() {
        super("Electric");
    }
}

class HybridEngine extends Engine {
    public HybridEngine() {
        super("Hybrid");
    }
}

class Manufacture {
     String name;
     String model;
     String color;

    public Manufacture(String name, String model, String color) {
        this.name = name;
        this.model = model;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }
    public String getcolor() {
        return color;
    }
}

abstract class Vehicle {
     Manufacture manufacture;
     Engine engine;

    public Vehicle(Manufacture manufacture, Engine engine) {
        this.manufacture = manufacture;
        this.engine = engine;
    }

    public abstract void showCharacteristics();
}

class ICEV extends Vehicle {
    public ICEV(Manufacture manufacture, Engine engine) {
        super(manufacture, engine);
    }

    public void showCharacteristics() {
        System.out.println("ICEV Characteristics:");
        System.out.println("Manufacture: " + manufacture.getName());
        System.out.println("Model: " + manufacture.getModel());
        System.out.println("Color: " + manufacture.getcolor());
        System.out.println("Engine Type: " + engine.getType());
    }
}

class BEV extends Vehicle {
    public BEV(Manufacture manufacture, Engine engine) {
        super(manufacture, engine);
    }

    public void showCharacteristics() {
        System.out.println("BEV Characteristics:");
        System.out.println("Manufacture: " + manufacture.getName());
        System.out.println("Model: " + manufacture.getModel());
        System.out.println("Color: " + manufacture.getcolor());
        System.out.println("Engine Type: " + engine.getType());
    }
}

class HybridV extends Vehicle {
    public HybridV(Manufacture manufacture, Engine engine) {
        super(manufacture, engine);
    }

    public void showCharacteristics() {
        System.out.println("HybridV Characteristics:");
        System.out.println("Model: " + manufacture.getModel());
        System.out.println("Color: " + manufacture.getcolor());
        System.out.println("Engine Type: " + engine.getType());
    }
}

public class Main {
    public static void main(String[] args) {
        Manufacture manufacturer1 = new Manufacture("Tata", "Altroz", "Blue");
        Manufacture manufacturer2 = new Manufacture("Tata", "Nexon", "Blue");
        Manufacture manufacturer3 = new Manufacture("maruti", "Wagonr", "Red");


        ICEV icev = new ICEV(manufacturer1, new CombustionEngine());
        BEV bev = new BEV(manufacturer2, new ElectricEngine());
        HybridV hybridv = new HybridV(manufacturer3, new HybridEngine());

        Vehicle[] vehicles = {icev, bev, hybridv};

        for (Vehicle vehicle : vehicles) {
            vehicle.showCharacteristics();
            System.out.println();
        }
    }
}
