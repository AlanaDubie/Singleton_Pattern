public class Main {
    public static void main(String[] args)
    {

        // STEP 1: Test a single ChocolateBoiler object;
        // We physically only have ONE actual chocolate boiler in the factory.
        // Here, we have created a ChocolateBoiler object, which will let us control the boiler.
        //ChocolateBoiler controller1 = new ChocolateBoiler();

        //Edit: Created singleton object for controller
        ChocolateBoiler controller1 = ChocolateBoiler.getInstance();

        // Now let's run through the boiler operations in the expected order:
        controller1.fill();
        controller1.boil();
        controller1.drain();

        // Suppose we try to drain again, we should get a Safety System error, which is good:
        controller1.drain();

        // STEP 2: Uncomment the code below, and see what happens when we introduce a second controller and try to fill the boiler twice.

        // Now what if we create another controller, and we have two controllers sending mixed signals?
        //ChocolateBoiler controller2 = new ChocolateBoiler();

        //Edit: Created singleton object for controller
        ChocolateBoiler controller2 = ChocolateBoiler.getInstance();

        controller1.fill();
        controller2.fill();

        // Uh oh, we're hearing that the boiler is overflowing and flooding the factory floor!
        // How do we fix this?

    }
}
