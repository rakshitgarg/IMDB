/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imdb.movie.search;

/**
 *
 * @author Rahul
 */
public class NodeMovie 
{
    Movie m ;    
    NodeMovie next;
    public NodeMovie(Movie m)
    {
        this.m = m;
        this.next = null;
    } 
}
