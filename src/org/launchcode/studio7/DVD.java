package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc{
    public DVD(String name, int storageCapacity) {
        super(name, storageCapacity);
    }

    @Override
    public void spinDisc() {
        System.out.println("This disc spins at 7000rpm");
    }

    @Override
    public void readData() {
        System.out.println("This is a movie. It is The Fast and the Furious.");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
