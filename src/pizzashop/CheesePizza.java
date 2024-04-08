
package pizzashop;

/**
 * A class to model pizzas that only have cheese on them
 * Note that the following source was used as a reference in 
 * creating this example:
 * Freeman, E.Freeman, E., Sierra, K., & Bates, B. (2004). Head First Design patterns. Sebastopol, CA: O'Reilly.
 * @author dancye
 */
public class CheesePizza extends Pizza {
    private BakingStrategy bakingStrategy;
    private CuttingStrategy cuttingStrategy;

    public CheesePizza(BakingStrategy bakingStrategy, CuttingStrategy cuttingStrategy) {
        this.bakingStrategy = bakingStrategy;
        this.cuttingStrategy = cuttingStrategy;
    }

    // Make sure to use the strategies in your methods
}

