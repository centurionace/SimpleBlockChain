import java.util.ArrayList;
import java.util.HashMap;

public class Chain {

	private HashMap<Integer, Block> chain;
	
	public Chain(){
		chain = new HashMap<Integer, Block>();
	}
	
	public void addBlock(Block block, String hash){
		
		chain.put(block.getIndex(), block);
	}
	
}
