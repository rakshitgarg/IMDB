/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imdb.movie.search;

/**
 *
 * @author Rahul
 */
public class Main 
{
    public static void main(String[] args)
    {
        IMDB imdb = new IMDB();
        FileReader.readFiles(imdb);
        Interpreter.interpreterOf(imdb);
        
    }
    
}
