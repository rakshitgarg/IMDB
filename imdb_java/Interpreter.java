/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imdb.movie.search;

/**
 *
 * @author Rahul
 */
import java.util.Scanner;
public class Interpreter 
{
    
    static void interpreterOf(IMDB imdb)
    {
            Scanner in = new Scanner(System.in);
            System.out.println("Welcome to IMDB Popular Movie Search. Type ? for help, q to quit.");
            while(true)
            {
                 System.out.print("<");
                 String str = in.next();
                 str = str.trim();
                 char ch = str.charAt(0);
                 switch(ch)
                 {
                     case '?' : System.out.println("Commands:");
                                System.out.println("?                                For help");
                                System.out.println("m movie-name-or-part-of-name     Search by movie");
                                System.out.println("d director-name-or-part-of-name  Search by Director");
                                System.out.println("a actor-name-or-part-of-name     Search by Actor");
                                System.out.println("y year                           Search movie by year of release");
                                System.out.println("number                           Show details of the item of previous search result");
                                System.out.println("g                                Draw graph of previous search result (if applicable)");
                                System.out.println("q                                Quit");
                                break;
                     case 'm' : break;
                     case 'd' : break;
                     case 'a' : break;
                     case 'y' : break;
                     case 'g' : break;    
                     default :  System.out.println("No such result!");
                                break;
                     case 'q' : System.exit(0);
                                break;
                 }
            }
            
            }
            
        }

    

