class NQueenSolutions {

	

	static boolean canPlace(int board[][],int n,int x,int y){

	    //Column
	    for(int k=0;k<x;k++){
	        if(board[k][y]==1){
	            return false;
	        }
	    }
	    //Left Diag 
	    int i = x;
	    int j = y;
	    while(i>=0 && j>=0){
	        if(board[i][j]==1){
	            return false;
	        }
	        i--; j--;
	    }

	    //Right Diag
	    i = x;
	    j = y;
	    while(i>=0 && j<n){
	        if(board[i][j]==1){
	            return false;
	        }
	        i--; j++;
	    }
	    return true;
	}

	private static void printBoard(int n, int[][] board){
		for (int i = 0; i < n ; i++) {
			for (int j = 0; j < n ; j++ ) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	static int solveNQueen(int n,int board[][],int i){
    //base case 
    if(i==n){
        //Print the board
        printBoard(n,board);
        return 1;
    }


    // rec case
    // try to place a queen in every row
    int ways = 0;
    for(int j=0;j<n;j++){
        //whether the current i,j is safe or not 
        if(canPlace(board,n,i,j)){
            board[i][j] = 1;
            ways += solveNQueen(n,board,i+1);
            //backtrack
            board[i][j] = 0;
        }
    }
    return ways;
}

	public static void main(String[] args) {
		
		int n = 4;
		int[][] board = new int[n][n];

		solveNQueen(n, board, 0);

	}
}

