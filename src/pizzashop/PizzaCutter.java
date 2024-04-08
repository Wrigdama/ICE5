package pizzashop;

public class PizzaCutter {
    // Static instance, initially null, of PizzaCutter
    private static PizzaCutter instance = null; 
    
    public int numSlices = 0; // Public field for number of slices

    // Private constructor to prevent external instantiation
    PizzaCutter() {
        // intentionally left blank
    }

    // Public static method to get the instance, creates it if it doesn't exist
    public static PizzaCutter getInstance() {
        if (instance == null) {
            instance = new PizzaCutter();
        }
        return instance;
    }
}
