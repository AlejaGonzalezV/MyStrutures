package collections;
import interfaces.IQueue;

public class Queue<Q> implements IQueue<Q>{
	
	private NodeList<Q> front;
	private NodeList<Q> last;
	private int sizeQ;
	
	public Queue() {
		
		this.front = null;
		this.last = null;
		
	}
	
	
	public NodeList<Q> getFront() {
		return front;
	}



	public void setFront(NodeList<Q> front) {
		this.front = front;
	}



	public NodeList<Q> getLast() {
		return last;
	}



	public void setLast(NodeList<Q> last) {
		this.last = last;
	}



	public int getSizeQ() {
		return sizeQ;
	}



	public void setSizeQ(int sizeQ) {
		this.sizeQ = sizeQ;
	}



	@Override
	public void enqueue(Q newElement) {
	
		NodeList element = new NodeList(newElement);
		
		if(front == null) {
			
			setFront(element);
			setLast(element);
			sizeQ++;
			
		} else {
			
			last.setNext(element);
			setLast(element);
			sizeQ++;
			
		}
		
	}

	@Override
	public Q dequeue() throws Exception {
		
		NodeList delete = null;
		
		if(front == null) {
			
			throw new Exception("The queue is empty");
			
		}
		
		if(front != null) {
			
			delete = front;
			front = front.getNext();
			sizeQ--;
		
		}
		
		return (Q) delete.getInfo();
	
	}

	@Override
	public Q front() throws Exception{
		
		if(front == null) {
			
			throw new Exception("The queue is empty");
			
		} else {
			
			return (Q) front.getInfo();
			
		}
	}

	@Override
	public boolean isEmptyQ() {
		
		if(sizeQ == 0) {
			
			return true;
			
		} else {
			
			return false;
		}
		
	}

	@Override
	public int sizeQ() {
		return sizeQ;
	}

}
