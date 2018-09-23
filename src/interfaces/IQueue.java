package interfaces;

public interface IQueue<Q> {
	
	public void enqueue(Q newElement);
	
	public Q dequeue() throws Exception;
	
	public Q front() throws Exception;
	
	public boolean isEmptyQ();
	
	public int sizeQ();

}
