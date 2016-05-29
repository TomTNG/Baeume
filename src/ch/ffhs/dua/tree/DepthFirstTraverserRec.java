package ch.ffhs.dua.tree;

/**
 * Klasse zum Traversieren eines Baumes mit Tiefensuche.
 *
 * @param <N>
 */
public abstract class DepthFirstTraverserRec<N> 
{

	
	public void traverse(TreeNode<N> node) 
	{
		// TODO
	}
	
	/**
	 * Operation auf einem Knoten, bevor die NAchkommen besuchr wurden.
	 * @param value
	 */
	abstract protected void preOperation(N value);   
    
	/**
	 * Operation auf einem Knoten, nachdem die Nachkommen besuchr wurden.
	 * @param value
	 */
	abstract protected void postOperation(N value);  

}   