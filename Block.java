
public class Block {

	private int index;
	private String hash;
	private int hashnumber;
	private Block prev;
	private Block me;
	private double timestamp;
	private DataPad values;
	
	public Block(String prevhash, Block prevB, double time, DataPad pad, int ind){
		
		index = ind + 1;
		hashnumber = prevhash.hashCode();
		hash = Integer.toString(hashnumber);
		hash = prevhash + hash;
		prev = prevB;
		timestamp = time;
		values = pad;
		
	}
	
	public int getIndex(){
		return index;
	}
	
	public String getHash(){
		return hash;
	}
	
	public DataPad getData(){
		return values;
	}
}
