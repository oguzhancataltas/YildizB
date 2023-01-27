public class Main {
    public static void main(String[] args) {

        String[][] multiArr = new String[7][4];

        for (int i = 0; i < multiArr.length; i++){
            for (int j = 0; j < multiArr[i].length; j++){

                if (i == 0 || i == 3 || i == 6){
                    multiArr[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    multiArr[i][j] = " * ";
                }else {
                    multiArr[i][j] = "   ";
                }
            }
        }

        for (String[] row : multiArr){
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
