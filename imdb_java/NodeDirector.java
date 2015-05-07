/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imdb.movie.search;

/**
 *
 * @author Rahul
 */
public class NodeDirector 
{
    Director d;
    NodeDirector next;
    public NodeDirector(Director d)
    {
        this.d = d;
        this.next = null;
    }
}
