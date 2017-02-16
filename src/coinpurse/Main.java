package coinpurse;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * A main class to create objects and connect objects together.
 * The user interface needs a reference to coin purse.
 * @author Kaninpat Tangittisak
 */
public class Main {
	/** Capacity of a purse. */
	private static int CAPACITY = 10;
    /**
     * Configure and start the application.
     * @param args not used
     */
    public static void main( String[] args ) {
        // 1. create a Purse

        // 2. create a ConsoleDialog with a reference to the Purse object

        // 3. run the ConsoleDialog

    	Purse purse = new Purse(5);
    	ConsoleDialog ui = new ConsoleDialog(purse);
    	ui.run();
    }
}
