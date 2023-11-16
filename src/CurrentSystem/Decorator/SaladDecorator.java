package CurrentSystem.Decorator;

import CurrentSystem.Burger;
import CurrentSystem.Decorator.BurgerDecorator;

public class SaladDecorator extends BurgerDecorator {
    public SaladDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Salad";
    }

    @Override
    public double getCost() {
        return burger.getCost() + 200;
    }
}
