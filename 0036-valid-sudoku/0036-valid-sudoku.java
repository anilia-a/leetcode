class Solution {
    public final char BLANK = '.';
    public final int ROW_LENGTH = 9;
    public final int COL_LENGTH = 9;
    public final int SUB_GRID_LENGTH = 3;

    public boolean isValidSudoku(char[][] board) {
        boolean validSudoku = true;
        char currentNumber = 'N';
        for (int row = 0; row < ROW_LENGTH; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] != BLANK) {
                    currentNumber = board[row][col];
                    boolean ans = unique(board, currentNumber, row, col);
                    if (ans == false)
                        return false;
                }
            }
        }
        return validSudoku;
    }

    public boolean unique(char[][] board, char currentNumber, int row, int col) {
        boolean unique = true;
        int i_row, j_col;

        // check if unique in row
        for (j_col = col + 1; j_col < COL_LENGTH; j_col++) {
            if (board[row][j_col] == board[row][col]) {
                return false;
            }
        }

        // check if unique in column
        for (i_row = row + 1; i_row < ROW_LENGTH; i_row++) {
            if (board[i_row][col] == board[row][col]) {
                return false;
            }
        }

        int rowStart = 0, rowEnd = 0, colStart = 0, colEnd = 0;
        // check in 3x3 sub grid
       if (row >= 3 & row <= 5) {
            rowStart = 3;
            rowEnd = 5;
        } else if (row >= 6 & row <= 8) {
            rowStart = 6;
            rowEnd = 8;
        } else {
            rowEnd = 2;
        }

        if (col >= 3 & col <= 5) {
            colStart = 3;
            colEnd = 5;
        } else if (col >= 6 & col <= 8) {
            colStart = 6;
            colEnd = 8;
        } else {
            colEnd = 2;
        }
        int countUnique = 0;
        for (int i = rowStart; i <= rowEnd; i++) {
            for (int j = colStart; j <= colEnd; j++) {
                if (board[i][j] == board[row][col]) {
                    countUnique++;
                    if (countUnique > 1) {
                        return false;
                    }
                }
            }
        }

        return unique;
    }
}