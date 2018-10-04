package study.inno.builders.builders;

import study.inno.builders.components.Engine;
import study.inno.builders.components.TripComputer;
import study.inno.builders.components.Wheels;

public interface Builder {
    public void setComputer(TripComputer computer);

    public void setEngine(Engine engine);

    public void setWheels(Wheels wheels);

    public void setWeelsQty(int weelsQty);

}
