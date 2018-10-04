package study.inno.builders.director;

import study.inno.builders.builders.Builder;
import study.inno.builders.components.Engine;
import study.inno.builders.components.TripComputer;
import study.inno.builders.components.Wheels;

public class Director {

    public void constructRace(Builder builder) {
        builder.setWheels(Wheels.SLICKS_WEELS);
        builder.setComputer(new TripComputer(120));
        builder.setEngine(new Engine(true, 100, 0));
        builder.setWeelsQty(6);
    }

    public void constructRoad(Builder builder) {
        builder.setWheels(Wheels.TRACK_WHEELS);
        builder.setComputer(new TripComputer(40));
        builder.setEngine(new Engine(true, 30, 10_000));
        builder.setWeelsQty(4);
    }

    public void constructDirth(Builder builder) {
        builder.setWheels(Wheels.DIRT_WEELS);
        builder.setComputer(new TripComputer(20));
        builder.setEngine(new Engine(true, 60, 100));
        builder.setWeelsQty(4);
    }

}
