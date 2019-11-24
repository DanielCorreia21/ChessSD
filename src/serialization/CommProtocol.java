package serialization;

import java.io.Serializable;

public class CommProtocol implements Serializable{

	private int function;
	private boolean value;
	private int[][] table;
	private int[] initialPos;
	private int [][] availablePos;
	
	private CommProtocol(int function) {
		this.function = function;
	}

	
	public void initialPos(int[] initialPos) {
		this.initialPos = initialPos;
	}
	
	public void table(int[][] table) {
		this.table = table;
	}
	
	public void value(boolean value) {
		this.value = value;
	}
	
	public void availablePos(int[][] availablePos) {
		this.availablePos = availablePos;
	}

	public void initializeCommChannel() {
		
	}
	
}
