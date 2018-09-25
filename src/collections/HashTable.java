package collections;
import interfaces.IHashTable;

public class HashTable<H> implements IHashTable<H> {
	
	private int sizeH;
	private Object[] array;
	
	public HashTable(int size) {
		
		create(sizeH);
			
	}

	@Override
	public void create(int size) {
		
		array = new Object[size];
		
	}

	@Override
	public void addChaining(H newElement, int key) {
		
		
		
	}

	@Override
	public String find(int key) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int key) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int SizeH() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmptyH() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int hashFunctionChaining(int key) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
