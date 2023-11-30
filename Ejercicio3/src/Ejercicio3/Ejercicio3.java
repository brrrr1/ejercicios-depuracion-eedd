package Ejercicio3;

import java.util.Arrays; 

public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        
        // Insert an element in 3rd position of the array (index->2, value->5)
        
        int Index_position = 2;
        int newValue    = 35;
        
        System.out.println("Original Array : "+Arrays.toString(my_array));     
        
        
        my_array[Index_position] = newValue;
        
        for(int i=Index_position; i >= Index_position; i++){
            my_array[i] = my_array[i+1];
        }
        
        
        System.out.println("New Array: "+Arrays.toString(my_array));
    }
}