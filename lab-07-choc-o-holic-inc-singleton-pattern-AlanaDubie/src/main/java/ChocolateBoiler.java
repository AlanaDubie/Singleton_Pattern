public class ChocolateBoiler {
    private static ChocolateBoiler uniqueInstance; //holds one instance

    private boolean empty;
    private boolean boiled;


    //Singleton implementation:
    // static getInstance() method: A way to instantiate the class & return an instance of it
    public static ChocolateBoiler getInstance()
    {
        if (uniqueInstance == null) //checks for a first connection
        {
            uniqueInstance =  new ChocolateBoiler();
        }//else if there's already a first connection, connects to it
        return uniqueInstance;
    }

    // This code is only started when the boiler is empty!
    public ChocolateBoiler()
    {
        System.out.println("BOILER: Connected to controller!");
        empty = true;
        boiled = false;
    }

    public void fill() {
        // To fill the boiler it must be empty, and once it is full we set the empty and boiled flags.
        if(isEmpty()) {
            System.out.println("BOILER: Filling the boiler!");
            empty = false;
            boiled = false;
            // fill the boiler with a milk/chocolate mixture
        }
        else {
            System.out.println("SAFETY SYSTEM: Not filling the boiler - it is not empty!");
        }
    }

    public void drain() {
        // To drain the boiler it must be full (non-empty) and also boiled.
        // Once it is drained, we set empty back to true.
        if (!isEmpty() && isBoiled()) {
            System.out.println("BOILER: Draining the boiler!");
            // drain the boiled milk and chocolate
            empty = true;
        }
        else {
            System.out.println("SAFETY SYSTEM: Not draining the boiler - it is either empty or not boiled!");
        }
    }

    public void boil() {
        // To boil the mixture, the boiler has to be full and not already boiled.
        // Once it is boiled we set the boiled flag to true.
        if (!isEmpty() && !isBoiled()) {
            System.out.println("BOILER: Boiling the mixture!");
            // bring the contents to a boil
            boiled = true;
        }
        else {
            System.out.println("SAFETY SYSTEM: Not boiling the mixture - it is either empty or already boiled!");
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
