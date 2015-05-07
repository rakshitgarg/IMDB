/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imdb.movie.search;

/**
 *
 * @author Rahul
 */
public class IMDB 
{
   NodeActor listActors;
   NodeDirector listDirectors;
   NodeMovie listMovies;
   public IMDB()
   {
       listActors = null;
       listDirectors = null;
       listMovies = null;
       
        
   }
        public void insertActorObject()
        {
            NodeActor node = new NodeActor(a);
            if(listActors== null)
            {
                listActors = node;
            }
            else
            {
                node.next = listActors;
                listActors = node;
            }
            
        }
        public void insertDirectorObject()
        {   
            Director d = new Director();
            NodeDirector node = new NodeDirector(d);
            if(listDirectors == null)
            {
                listDirectors = node;
            }
            else
            {
                node.next = listDirectors;
                listDirectors = node;
            }
            
       
        }
        public void insertMovieObject()
        {   
            Movie m = new Movie();
            NodeMovie node = new NodeMovie(m);
            if(listMovies == null)
            {
                listMovies = node;
            }
            else
            {
                node.next = listMovies;
                listMovies = node;
            }
        }
}
       
    
     
    
     
             
             
             
             
   
   
