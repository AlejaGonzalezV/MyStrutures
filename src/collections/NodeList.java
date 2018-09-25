package collections;

public class NodeList<N> {
	
	private N info;
	private NodeList<N> next;
	private NodeList<N> prev;
	
	public NodeList(N info) {
		
		this.info = info;
		
	}
	
	
	public N getInfo() {
		return info;
	}

	public void setInfo(N info) {
		this.info = info;
	}

	public NodeList<N> getNext() {
		return next;
	}
	
	public void setNext(NodeList<N> next) {
		this.next = next;
	}

	public NodeList<N> getPrev() {
		return prev;
	}

	public void setPrev(NodeList<N> prev) {
		this.prev = prev;
	}
	
	
	
	
	
	

}
