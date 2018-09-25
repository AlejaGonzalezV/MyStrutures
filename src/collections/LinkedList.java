package collections;
import interfaces.ILinkedList;

public class LinkedList<L> implements ILinkedList<L> {
	
	private NodeList root;
	private NodeList last;
	private NodeList prev;
	private int sizeL;
	
	
	public LinkedList() {
		
		root = null;
		
	}

	@Override
	public void addLinkedListAtLast(L element) {
		
		NodeList newElement = new NodeList(element);
		
		if(root == null) {
			
			setRoot(newElement);
			sizeL++;
			
		} else {
			
			NodeList aux = root;
			
			while(aux.getNext() != null) {
				
				aux = aux.getNext();
				
			}
			
			aux.setNext(newElement);
			sizeL++;			
		}
		
	}
	
	public void addLinkedListAtFirst(L element) {
		
		NodeList newElement = new NodeList(element);
		
		if(root == null) {
			
			setRoot(newElement);
			sizeL++;
			
		} else {
			
			newElement.setNext(root);
			root = newElement;
			sizeL++;			
		}
		
	}

	@Override
	public void addCircularLinkedList(L element) {
		
		NodeList newElement = new NodeList(element);
		
		if(root == null) {
			
			setRoot(newElement);
			sizeL++;
			
		} else {
			
			NodeList aux = root;
			
			while(aux.getNext() != null) {
				
				aux = aux.getNext();
				
			}
			
			aux.setNext(newElement);
			newElement.setPrev(aux);
			newElement.setNext(root);
			root.setPrev(newElement);
			sizeL++;			
		}
		
	}

	@Override
	public void addDoublyLinkedList(L element) {
		
		NodeList newElement = new NodeList(element);
		
		if(root == null) {
			
			setRoot(newElement);
			sizeL++;
			
		} else {
			
			NodeList aux = root;
			
			while(aux.getNext() != null) {
				
				aux = aux.getNext();
				
			}
			
			aux.setNext(newElement);
			newElement.setPrev(aux);
			sizeL++;			
		}
		
	}
		
	

	@Override
	public void delete(L element) {
		
		
		
	}

	@Override
	public L find(L element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int sizeL() {
		
		return sizeL;
	}

	@Override
	public boolean isEmptyL() {
		
		if(sizeL == 0) {
			
			return true;
			
		} else {
			
			return false;
			
		}
	}

	public NodeList getRoot() {
		return root;
	}

	public void setRoot(NodeList root) {
		this.root = root;
	}

	
	

}
