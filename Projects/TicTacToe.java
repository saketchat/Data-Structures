import java.util.*;

class TicTacToe {
    Scanner sc = new Scanner(System.in);
    char mat[][] = new char[3][3];
    int row, col;

    TicTacToe() {
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                mat[i][j] = '-';
            }
        }
        row=0;
        col = 0;
    }

    public void input(char input) {
        row = sc.nextInt();
        col = sc.nextInt();
        checkInput(input);
    }

    public void checkInput(char inp) {
        if ((row >= 3) && (col >= 3)) { //&& ((mat[row][col] != '-') || (mat[row][col] != 'x') || (mat[row][col] != 'o'))) {
            input(inp);
        }
        else if (mat[row][col] == 'x') {
            System.out.println("Enter the row and column which are empty. Re-enter row and column!");
            input('o');
        }
        else if (mat[row][col] == 'o') {
            System.out.println("Enter the row and column which are empty. Re-enter row and column!");
            input('x');
        }
        else {
            mat[row][col] = inp;
            checkResult(inp);
        }
    }

    public void checkResult(char symbol) {

        if (symbol == 'x') {
            if(checkRow1(symbol) || checkRow2(symbol) || checkRow3(symbol) || checkCol1(symbol) || checkCol2(symbol) || checkCol2(symbol) || checkLeftDiagonal(symbol) || checkRightDiagonal(symbol)) {
                System.out.println ("Player 1 Wins");
                System.exit(0);
            }
        }

        else if (symbol == 'o') {
            if(checkRow1(symbol) || checkRow2(symbol) || checkRow3(symbol) || checkCol1(symbol) || checkCol2(symbol) || checkCol2(symbol) || checkLeftDiagonal(symbol) || checkRightDiagonal(symbol)) {
                System.out.println ("Player 2 Wins");
                System.exit(0);
            }
        }
    }

    //check 1st row
    public boolean checkRow1(char sym) {
        int c=0;
        for(int i=0;i<3;i++) {
            if(mat[0][i] == sym)
                c++;
        }
        if(c == 3) {
            return true;
        }
        else {
            return false;
        }
    }

    //check 2nd row
    public boolean checkRow2(char sym) {
        int c=0;
        for(int i=0;i<3;i++) {
            if(mat[1][i] == sym)
                c++;
        }

        if(c == 3) {
            return true;
        }
        else {
            return false;
        }
    }

    //check 3rd row
    public boolean checkRow3(char sym) {
        int c=0;
        for(int i=0;i<3;i++) {
            if(mat[2][i] == sym)
                c++;
        }
        
        if(c == 3) {
            return true;
        }
        else {
            return false;
        }
    }

    //check 1st column
    public boolean checkCol1(char sym) {
        int c=0;
        for(int i=0;i<3;i++) {
            if(mat[i][0] == sym)
                c++;
        }
        
        if(c == 3) {
            return true;
        }
        else {
            return false;
        }
    }

    //check 2nd column
    public boolean checkCol2(char sym) {
        int c=0;
        for(int i=0;i<3;i++) {
            if(mat[i][1] == sym)
                c++;
        }
        
        if(c == 3) {
            return true;
        }
        else {
            return false;
        }
    }

    //check 3rd column
    public boolean checkCol3(char sym) {
        int c=0;
        for(int i=0;i<3;i++) {
            if(mat[i][2] == sym)
                c++;
        }
        
        if(c == 3) {
            return true;
        }
        else {
            return false;
        }
    }

    //checking left diagonal
    public boolean checkLeftDiagonal(char sym) {
        int c=0;
        for(int i=0,j=0;i<3;i++,j++) {
            if(mat[i][j] == sym)
                c++;
        }

        if(c == 3) {
            return true;
        }
        else {
            return false;
        }
    }

    //checking right diagonal
    public boolean checkRightDiagonal(char sym) {
        int c=0;
        for(int i=0,j=2; (i<3 && j>=0); i++,j--) {
            if(mat[i][j] == sym)
                c++;
        }

        if(c == 3) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public void display() {
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                System.out.print(mat[i][j] +"  ");
            }
            System.out.println();
        }
    }
}

class Main {
    public static void main(String args[]) {
        TicTacToe obj = new TicTacToe();
        // obj.display();
        // boolean r;

        for(int i=1;i<=9;i++) {
            obj.display();

            if(i % 2 != 0) {
                System.out.println("Player 1: Enter row number and column number");
                obj.input('x');
            }
            else if(i % 2 == 0) {
                System.out.println("Player 2: Enter row number and column number");
                obj.input('o');
            }
        }
    }
}