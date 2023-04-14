package chess;

public class Chess_Board {
	public String[][] board = {{"br", "bn", "bb", "bq", "bk", "bb", "bn", "br"}, 
				   {"bx", "bx", "bx", "bx", "bx", "bx", "bx" ,"bx"}, 
				   {"  ", "  ", "  ", "  ", "  ", "  ", "  ", "  "}, 
				   {"  ", "  ", "  ", "  ", "  ", "  ", "  ", "  "}, 
				   {"  ", "  ", "  ", "  ", "  ", "  ", "  ", "  "}, 
				   {"  ", "  ", "  ", "  ", "  ", "  ", "  ", "  "}, 
				   {"wx", "wx", "wx", "wx", "wx", "wx", "wx" ,"wx"}, 
				   {"wr", "wn", "wb", "wq", "wk", "wb", "wn", "wr"}}; 
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
