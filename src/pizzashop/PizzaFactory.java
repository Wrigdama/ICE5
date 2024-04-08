package pizzashop;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class PizzaFactory {
    private final Map<String, Supplier<Pizza>> registeredPizzas = new HashMap<>();

    public PizzaFactory() {
        // Register pizza types with their creation logic, including strategies.
        registerPizza("cheese", () -> new CheesePizza(new StandardBakingStrategy(), new StandardCuttingStrategy()));
        registerPizza("pepperoni", () -> new PepperoniPizza(new StandardBakingStrategy(), new StandardCuttingStrategy()));
    }

    public void registerPizza(String type, Supplier<Pizza> constructor) {
        registeredPizzas.put(type, constructor);
    }

    public Pizza createPizza(String type) {
        Supplier<Pizza> pizzaSupplier = registeredPizzas.get(type);
        if (pizzaSupplier != null) {
            return pizzaSupplier.get();
        }
        throw new IllegalArgumentException("No such pizza type registered");
    }
}
