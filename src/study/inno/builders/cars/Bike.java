package study.inno.builders.cars;

import study.inno.builders.components.Engine;
import study.inno.builders.components.TripComputer;
import study.inno.builders.components.Wheels;

public class Bike {
    private Engine engine;
    private Wheels wheels;
    private int weelsQty;
    private TripComputer computer;
    private boolean sideSeat;

    public Bike(Engine engine, Wheels wheels, int weelsQty, TripComputer computer, boolean sideSeat) {
        this.engine = engine;
        this.wheels = wheels;
        this.weelsQty = weelsQty;
        this.computer = computer;
        this.sideSeat = sideSeat;
    }

    public Engine getEngine() {
        return engine;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public int getWeelsQty() {
        return weelsQty;
    }

    public TripComputer getComputer() {
        return computer;
    }

    public boolean isSideSeat() {
        return sideSeat;
    }

    public void setSideSeat(boolean sideSeat) {
        this.sideSeat = sideSeat;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "engine=" + engine +
                ", wheels=" + wheels +
                ", weelsQty=" + weelsQty +
                ", computer=" + computer +
                ", sideSeat=" + sideSeat +
                '}';
    }
}
