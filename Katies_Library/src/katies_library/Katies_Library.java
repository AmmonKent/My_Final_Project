/*
 This program will create a file which the user will put in the books that are 
available. Then when the user checks out the book it will move into the file.
 */
package katies_library;
import java.util.*;
/**
 This class will be the class that ties all other classes together
 **/
public class Katies_Library {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        String input = "";
        Scanner KBD = new Scanner(System.in);
        Library library;
        System.out.println("put in the names of the books.");
         do{
         input = KBD.nextLine();// 
         library = new Library(input);
        }
        while(!"".equals(input));
         System.out.println("Done");
        
    }
}