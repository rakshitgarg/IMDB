/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imdb.movie.search;

/**
 *
 * @author Rahul
 */
import java.io.*;
public class FileReader 
{
    static void readFiles(IMDB imdb)
    {
        
       
       try{
        // Open the file that is the first 
        // command line parameter

                for(int i = 1962 ;i<=2012;i++)
                {

                    FileInputStream fstream = new FileInputStream(i+".txt");
          // Get the object of DataInputStream
                    DataInputStream in = new DataInputStream(fstream);
                    BufferedReader br = new BufferedReader(new InputStreamReader(in));
                    String strLine;
          //Read File Line By Line
                    int space;
                    while ((strLine = br.readLine()) != null)  
                    {
                    // Print the content on the console
                        if(strLine.charAt(1)!= 'M')
                        {
                                space = strLine.indexOf(' ');
                                String str = strLine.substring(0, space);
                                Movie m =  new Movie();
                                if(str.equalsIgnoreCase("#Title"))
                                {
                                    m.getTitle();
                                }

                                if(str.equalsIgnoreCase("#TitleImage"))
                                {
                                    m.getTitleImage();
                                                              
                                }

                               if(strLine.equalsIgnoreCase("#Outline"))
                               {
                                   m.getOutline();                    
                               }
                               
                               if(strLine.equalsIgnoreCase("#Genre"))
                               {
                                   m.getGenre();                    
                               }
                               if(strLine.equalsIgnoreCase("#Certificate"))
                               {
                                   m.getCertificate();
                               }
                                if(strLine.equalsIgnoreCase("#Runtime"))
                               {
                                   m.getRuntime();
                               }
                                

                            }
                      }

          //Close the input stream
                    in.close();
                }
                }
                catch (Exception e)
                {//Catch exception if any
                    System.err.println("Error: " + e.getMessage());
                }
        }
  }
