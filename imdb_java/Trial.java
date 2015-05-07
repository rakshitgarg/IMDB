/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imdb.movie.search;


import java.io.*;
/**
 *
 * @author Rahul
 */
public class Trial 
{
    public static void main(String args[])
  {
  try{
  // Open the file that is the first 
  // command line parameter
  FileInputStream fstream = new FileInputStream("1962.txt");
  // Get the object of DataInputStream
  DataInputStream in = new DataInputStream(fstream);
  BufferedReader br = new BufferedReader(new InputStreamReader(in));
  String strLin;
  int space ;
  
  //Read File Line By Line
  while ((strLin = br.readLine()) != null)   
  {
      if(strLin.charAt(1)!= 'M')
      // Print the content on the console
      {
      space = strLin.indexOf(' ') ;
      String str = strLin.substring(0, space);
      if(str.equalsIgnoreCase("#Outline"))
      {
          System.out.println(strLin.substring(space));
      }
     }
  }
  //Close the input stream
  in.close();
    }catch (Exception e){//Catch exception if any
  System.err.println("Error: " + e.getMessage());
  }
  }
}
