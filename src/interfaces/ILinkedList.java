package interfaces;

public interface ILinkedList<L> {
	
	public void addLinkedListAtLast(L element);
	public void addLinkedListAtFirst(L element);
	public void addCircularLinkedList(L element);
	public void addDoublyLinkedList(L element);
	public void delete(L element);
	public L find(L element);
	public int sizeL();
	public boolean isEmptyL();
	

}
