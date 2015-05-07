/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imdb.movie.search;

/**
 *
 * @author Rahul
 */
public class NodeActor 
{
    Actor a;
    NodeActor next;
    
    public NodeActor(Actor a)
    {
        this.a = a;
        this.next = null;
    }
   
    
}
