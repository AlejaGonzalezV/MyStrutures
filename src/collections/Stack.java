package collections;
import interfaces.IStack;

public class Stack<S> implements IStack<S>{
	
	
	private int sizeS;
	private NodeList top;
	
	
	public Stack() {
		
		this.top = null;
		
	}
	

	public int getSizeS() {
		return sizeS;
	}



	public void setSizeS(int sizeS) {
		this.sizeS = sizeS;
	}



	public NodeList getTop() {
		return top;
	}



	public void setTop(NodeList top) {
		this.top = top;
	}



	
	public void push(S newElement) {
		
		NodeList element = new NodeList(newElement);
		element.setNext(top);
		setTop(element);
		sizeS++;
		
	}



	@Override
	public S pop() throws Exception {
		
		S delete = null;
		
		if(isEmptyS()) {
			
			throw new Exception("the stack is empty");
			
		}
		
		if(top != null) {
			
			delete = (S) top.getInfo();
			top = top.getNext();
			sizeS--;
			
		}
		
		return delete;
	}



	@Override
	public S top() throws Exception {
		
		if(top == null) {
			
			return null;
			
		}
		
		else if(isEmptyS()) {
			
			throw new Exception("the stack is empty");
			
		}else {
			
			return (S) top.getInfo();
			
		}
	}



	@Override
	public boolean isEmptyS() {
		
		if(sizeS == 0) {
			
			return true;
			
		} else {
			
			return false;
			
		}
		
		
	}



	@Override
	public int sizeS() {
		
		return sizeS;
	}



}
