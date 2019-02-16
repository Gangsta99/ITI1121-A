import java.util.Arrays;

public class Solution {
	private boolean[][] board;
	private int row, column;
	
	public Solution(int row, int column) {
		this.board = new boolean[column][row];
		this.row = row;
		this.column = column;
	}

	int element = 0;
	int co = 0;
	int ro = 0;

	public void setNext(boolean sta) {
		if (ro < row) {
			board[co][ro] = sta;
			ro++;
			element++;
		}
		else {
			ro = 0;
			co++;
			setNext(sta);
		}
	}

	public boolean isReady() {
		return element == (row*column);
	}

	public boolean isSuccessful() {
		boolean result = true;
		for (int i = 0; i < column; i++){
			for (int j = 0; j < row; j++){
				int selected = 0;
				if (board[i][j] == true){
					selected++;
				}
				if ((i-1 >= 0) && (board[i-1][j]==true)){
					selected++;
				}
				if ((i+1 < column) && (board[i+1][j]==true)){
					selected++;
				}
				if ((j-1 >= 0) && (board[i][j-1]==true)){
					selected++;
				}
				if ((j+1 < row) && (board[i][j+1]==true)){
					selected++;
				}
				if (selected % 2 == 0){
					result = false;
				}
			}
		}

		return result;
	}

	public boolean equals(Object other){
		if (other == null){
			return false;
		}
		
		Solution sol = (Solution) other;
		return this.equals(other);
	}

	public String toString(){
		String result;
		result = Arrays.deepToString(board).replace("], ", "]\n");
		return result;
	}
}