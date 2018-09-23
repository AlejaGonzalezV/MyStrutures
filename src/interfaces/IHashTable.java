package interfaces;

public interface IHashTable<H> {
	
	public void create(int size);
	
	public void add(H newElement, int key);
	
	public String find(int key) throws Exception;
	
	public void delete(int key) throws Exception;
	
	public int SizeH();
	
	public boolean isEmptyH();

}