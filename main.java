// Miguel Rodriguez
// Solution demonstrating composition, aggregation, and association in Java.
// How a Toyota class extends Car and incorporates ToyotaEngine instances.

class Car {
    private int id;
    private String model;
    private String color;

    public Car() {
        this.id = 0;
        this.model = null;
        this.color = null;
    }

    public Car(int id, String model, String color) {
        this.id = id;
        this.model = model;
        this.color = color;
    }

    public void setID(int new_id) { 
        id = new_id;
    }

    public void setModel(String new_model) { 
        model = new_model;
    }

    public void setColor(String new_color) { 
        color = new_color;
    }

    public int getId() { 
        return id;
    }

    public String getModel() { 
        return model;
    }

    public String getColor() { 
        return color;
    }

    @Override
    public String toString() {
        String result = "Car id: " + getId();
        result += "\nModel: " + getModel();
        result += "\nColor: " + getColor();

        return result;
    }
}

class Toyota extends Car {
    private ToyotaEngine engine;

    public Toyota(int id, String model, String color, ToyotaEngine engine) {
        super(id, model, color);
        this.engine = engine;
    }

    public void setEngine(ToyotaEngine new_engine) {
        engine = new_engine;
    }

    public ToyotaEngine getEngine() {
        return engine;
    }

    public void setStart() {
        engine.start();
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "\nEngine: Toyota Engine";
        return result;
    }
}

class ToyotaEngine {

    public void start() {
        System.out.println("Engine started! 🚘");
    }

    public void stop() {
        System.out.println("Engine stopped! 😔");
    }

    @Override
    public String toString() {
        return "ZX500 Engine";
    }
}

class Main {
    public static void main(String[] args) {
        ToyotaEngine engine = new ToyotaEngine();
        Toyota toyota = new Toyota(89683, "Camry", "Blue", engine);
        toyota.setStart();
        System.out.println(toyota);
        System.out.println(toyota.getEngine());
    } // end of main
}
