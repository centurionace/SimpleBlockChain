import java.util.ArrayList;

public class DataPad {

	private ArrayList<Integer> transactions;
	
	public DataPad(){
		transactions = new ArrayList<Integer>();
	}
	
	public void addTransaction(int value){
		transactions.add(value);
	}
	
	public ArrayList<Integer> getTransactions(){
		return transactions;
	}
	
}
