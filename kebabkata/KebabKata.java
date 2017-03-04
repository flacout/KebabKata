/*
Test the class Kebab by asking repeteadly a customer for making a new kebab.
 */
package kebabkata;

import java.util.Scanner;

/**
 *
 * @author fabrice
 */
public class KebabKata {


    public static void main(String[] args)
    {
        int nbLayers=1; // Number of ingredients in the Kebab.
        Scanner scan = new Scanner(System.in);
        
        while (true){
            System.out.println("How namy layers on your Kebab: ");
            nbLayers = scan.nextInt();
            
            // The kebab cannot contain more than 20 layers.
            if (nbLayers>0 && nbLayers<20){
                Kebab omar = new Kebab(nbLayers);
                omar.describe();
            }
            else break;
        } // end while

        System.exit(0);
    } // end main
    
}
