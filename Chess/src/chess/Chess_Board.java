package chess;

public class Chess_Board {
	public String wq = "\u2655";
        public String wr = "\u2656";
        public String wb = "\u2657";
        public String wn = "\u2658";
        public String wx = "\u2659";
        public String bk = "\u265A";
        public String bq = "\u265B";
        public String br = "\u265C";
        public String bb = "\u265D";
        public String bn = "\u265E";
        public String bx = "\u265F";
	public String vo = " ";
	public String[][] board = {{br, bn, bb, bq, bk, bb, bn, br}, 
				   {bx, bx, bx, bx, bx, bx, bx, bx}, 
				   {vo, vo, vo, vo, vo, vo, vo, vo}, 
				   {vo, vo, vo, vo, vo, vo, vo, vo}, 
				   {vo, vo, vo, vo, vo, vo, vo, vo}, 
				   {vo, vo, vo, vo, vo, vo, vo, vo}, 
				   {wx, wx, wx, wx, wx, wx, wx ,wx}, 
				   {wr, wn, wb, wq, wk, wb, wn, wr}};
	public void board() {
		System.out.println(" ---------------------------------------");
		for(int i = 0; i < board.length; i++) {
			System.out.print("| ");
			for(int j = 0; j < board.length; j++) {
				System.out.print(board[i][j] + " | ");
			}
			System.out.println("\n ---------------------------------------");
		}
	}
}
