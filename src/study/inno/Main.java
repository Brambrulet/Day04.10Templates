package study.inno;

import study.inno.builders.builders.BikeBuilder;
import study.inno.builders.builders.CarBuilder;
import study.inno.builders.cars.Bike;
import study.inno.builders.cars.Car;
import study.inno.builders.director.Director;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        BikeBuilder bikeBuilder = new BikeBuilder();
        director.constructDirth(carBuilder);
        director.constructDirth(bikeBuilder);

        Car car = carBuilder.getResult();
        Bike bike = bikeBuilder.getResult();

        System.out.println(bike);
    }

}
