import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        play();
    }
    
    public static void play() {
        Scanner scanner = new Scanner(System.in);
        Board board = new Board();
        Player playerX = new Player('X');
        Player playerO = new Player('O');
        Player currentPlayer = playerX;
        
        while (!board.isGameOver()) {
            board.display();
            System.out.println("Player " + currentPlayer.getSymbol() + "'s turn");
            System.out.print("Enter row and column (0-2): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            Move move = new Move(row, col);
            
            if (board.makeMove(currentPlayer, move)) {
                if (board.isWinner(currentPlayer)) {
                    board.display();
                    System.out.println("Player " + currentPlayer.getSymbol() + " wins!");
                    return;
                }
                currentPlayer = (currentPlayer == playerX) ? playerO : playerX;
            } else {
                System.out.println("Invalid move! Try again.");
            }
        }
        
        board.display();
        System.out.println("It's a draw!");
        scanner.close(); 
    }
}

class Player {
    char symbol;
    
    public Player(char symbol) {
        this.symbol = symbol;
    }
    
    public char getSymbol() {
        return symbol;
    }
}

class Board {
    char[][] grid = new char[3][3];
    int movesMade = 0;
    
    public Board() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = '-';
            }
        }
    }
    
    public boolean makeMove(Player player, Move move) {
        if (move.getRow() < 0 || move.getRow() >= 3 || move.getCol() < 0 || move.getCol() >= 3 || grid[move.getRow()][move.getCol()] != '-') {
            return false;
        }
        grid[move.getRow()][move.getCol()] = player.getSymbol();
        movesMade++;
        return true;
    }
    
    public boolean isWinner(Player player) {
        char symbol = player.getSymbol();
        
        for (int i = 0; i < 3; i++) {
            if (grid[i][0] == symbol && grid[i][1] == symbol && grid[i][2] == symbol) return true;
            if (grid[0][i] == symbol && grid[1][i] == symbol && grid[2][i] == symbol) return true;
        }
        
        if (grid[0][0] == symbol && grid[1][1] == symbol && grid[2][2] == symbol) return true;
        else if (grid[0][2] == symbol && grid[1][1] == symbol && grid[2][0] == symbol) return true;
        
        return false;
    }
    
    public boolean isGameOver() {
        return movesMade == 9;
    }
    
    public void display() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class Move {
    int row, col;
    
    public Move(int row, int col) {
        this.row = row;
        this.col = col;
    }
    
    public int getRow() {
        return row;
    }
    
    public int getCol() {
        return col;
    }
}
