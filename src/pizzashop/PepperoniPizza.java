/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzashop;

/**
 * A class to model pizzas that have cheese and 
 * pepperoni
 * Note that the following source was used as a reference in 
 * creating this example:
 * Freeman, E.Freeman, E., Sierra, K., & Bates, B. (2004). Head First Design patterns. Sebastopol, CA: O'Reilly.
 * @author dancye
 */
public class PepperoniPizza extends Pizza {
    private BakingStrategy bakingStrategy;
    private CuttingStrategy cuttingStrategy;

    public PepperoniPizza(BakingStrategy bakingStrategy, CuttingStrategy cuttingStrategy) {
        this.bakingStrategy = bakingStrategy;
        this.cuttingStrategy = cuttingStrategy;
    }

    // Make sure to use the strategies in your methods
}

