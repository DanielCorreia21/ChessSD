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

}
