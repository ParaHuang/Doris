package ac.fhcampuswien.tictactoe;

public class TikTakToe {
    private char[][] gameBoard;
    private Player p1;
    private Player p2;
    private final int ROWS;
    private final int COLS;

    public TikTakToe(Player p1,Player p2){
        this.p1 = p1;
        this.p2 = p2;
        ROWS = 3;
        COLS = 3;
        gameBoard = new char[ROWS][COLS];
    }

    public boolean placeTic(Player p, int row, int col){//start from 1 or 0?
//        return gameBoard[row-1][col-1] != 'X'; //start from 1
//        return gameBoard[row][col] != 'X'; //start from 0
        if(gameBoard[row-1][col-1] == p1.getSymbol() || gameBoard[row-1][col-1] == p2.getSymbol()){
            return false;
        }
        //this place is not taken
        gameBoard[row-1][col-1] = p.getSymbol();
        return true;
    }
    private void prettyPrintGameBoard(){
        for (int i = 0; i < gameBoard.length; i++) {
            for(int j=0 ; j < gameBoard[i].length ; j++){
                char c = gameBoard[i][j];
                if(c != p1.getSymbol() && c != p2.getSymbol()){
                    //number
                    System.out.println(i*ROWS + j + 1);
                }else{
                    System.out.print(c+" ");
                }
            }
            System.out.println();
        }
    }
//    public boolean checkIfWon(Player p){
//
//    }
//    playGame()
}
