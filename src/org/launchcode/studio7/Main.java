package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

        CD cd = new CD("Rock Steady", 20);
        OpticalDisc dvd = new DVD("The Fast and the Furious", 500);

        cd.spinDisc();
        dvd.spinDisc();
    }
}
