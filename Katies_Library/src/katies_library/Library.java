/* This program will create a file which the user will put in the books that are 
available. Then when the user checks out the book it will move into the file.
 */
package katies_library;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

/**
 This class will create the library and manage it.
 */
public class Library {
    ArrayList<String> library = new ArrayList<>();
 
 String in = "";
 
 public Library(String input){
    in = input;
       }
 
 public void fileOutput() throws IOException{
   ArrayList<String> output;
   output = new ArrayList<>();
    while(!"".equals(in))
    {
      output.add(in);
    }
    FileWriter FW = new FileWriter ("Katies_Checkout.txt",true);
    PrintWriter OF = new PrintWriter(FW);
    for(int i = 0; i>= output.size();i++)
    {OF.println(output.get(i));}
 }
 
}