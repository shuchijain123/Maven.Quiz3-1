package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

String [][] board = new String[][]{};

    public TicTacToe(String[][] board) {

this.board=board;

    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value)

    {
        String[] arr = board[value];
        return arr;
    }

    public String[] getColumn(Integer value)

    {
        String[] column = new String[board.length];
        for(int i=0; i<column.length; i++){
            column[i] = board[i][value];
        }
        return column;




    }

    public Boolean isRowHomogenous(Integer rowIndex)

    {

        Boolean ans=true;
        String []myRow= getRow(rowIndex);

        for (int i=0;i<myRow.length;i++){

            for (int j=1;j<myRow.length-1;j++){


                if (myRow[i]==myRow[j]){

                    ans=true;
                }

                else{
                    ans=false;
                }
            }
        }
        return ans;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {


        boolean ans = false;
        String[] row = getColumn(columnIndex);

        for (int i = 0; i < row.length-1; i++) {
            for (int j = 0; i < row.length - 1; i++) {

                if (row[i] == "O") ;

                ans = true;


            }

        }
        return ans;
    }


    public String getWinner() {

        


        return null;
    }

    public String[][] getBoard()


    {
        return null;
    }
}
