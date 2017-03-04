/**
Kebab is an object that allow you to make a sandwich kebab with a predefined 
array of ingredient. Each kebab contain at least 2 pieces of bread 
one on top one at the bottom.
It as one method .describe(), that print the layout of the kebab and if
it is vegetarian or not.
 */

package kebabkata;

import java.util.Arrays;
import java.util.Random;


public class Kebab {
    private String ingredients[]={"salad","onion","steak","soy-steacK",
                                    "tuna","lamb","cheese","pickels"};
    private int layers; // number of layers of the kebab.
    private int randLayer; // to pick an ingredient randomly in the array.
    Random randNb=new Random();
    String oneKebab[]; // Will contain the actual kebab
    
    // The constructor make a Kebab of n layers pick randomly.
    public Kebab(int layers) {
        this.layers = layers;
        oneKebab=new String[layers];
        for (int i=0; i<layers;i++){
            randLayer=randNb.nextInt(ingredients.length);
            this.oneKebab[i]=ingredients[randLayer];
        }
    }

    
    public int getLayers() {
        return layers;
    }

    public void setLayers(int layers) {
        this.layers = layers;
    }
    
    // Print the layout of the kebab in an ordered fashion.
    // Tell if it is a vegetarian kebab.
    public void describe(){
        if ( Arrays.asList(oneKebab).contains("steak")
             || Arrays.asList(oneKebab).contains("lamb") ){
            System.out.println("Here is your MEAT Kebab: ");
        }
        else System.out.println("Here is your VEGIE Kebab: ");
            
        System.out.println("bread");
        for (String i:oneKebab) System.out.println(i);
        System.out.println("bread\n");

    }
    
}
