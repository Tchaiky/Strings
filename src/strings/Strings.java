/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strings;
import inpututilities.InputUtilities;//Import input utilities so we can use the code from there

/**
 *
 * @author tati_
 */
public class Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        
        
        InputUtilities myInput = new InputUtilities ();//Declaring that we are going to use input utilities
        String userName;//Declaring variable
        
         
       userName = myInput.askUserForText("Please enter your first name"); 
      //Using input utilities codes, in this case the ask user for text one,which ask user to enter text only
       
        
       String newName = userName + " McLovin"; //Adding last name at the end of name
       
       System.out.println("Hello " + newName);
       //Revealing new name with last name to user
    
       String reverseName = new StringBuilder(userName).reverse().toString().toUpperCase(); 
      //Reversing name and also changing to upper case at the same time
       
       System.out.println("Your name backwards is " +reverseName);
       //Revealing name backwards to user
       
       System.out.println("There are " + userName.length() + " letters in your name");
      //Telling user their name length using lenght string
       
    }
   
        
        
        
        
    }

