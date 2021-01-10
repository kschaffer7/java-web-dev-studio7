package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc{

    public CD(String name, int storageCapacity) {
        super(name, storageCapacity);
    }

    // TODO: Implement your custom interface.

    @Override
    public void spinDisc() {
        System.out.println("This disc spins at 5400rpm");
    }

    @Override
    public void readData() {
        System.out.println("This is a music CD.");
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
