public class test_Sprial_matrix {
    public static void main (String [] args){
        int [][] array= {{1,2,3,4}, {5,6,7,8}, {9,10,11,12},{13,14,15,16}};
        new test_Sprial_matrix().print_sprial(array);
    }
    void print_sprial(int [][] array){

        int firstRow=0;
        int lastRow= array.length-1;
        int firstCol= 0;
        int lastCol= array[0].length-1;

        while (firstRow < lastRow && firstCol < lastCol){

            for(int i= firstCol; i <= lastCol; i++){
                System.out.println(array[firstRow][i]);
            }
            for(int i= firstRow+1; i <= lastRow; i++) {
                System.out.println(array[i][lastCol]);
            }
            for(int i= lastCol-1; i >= firstCol; i--) {
                System.out.println(array[lastRow][i]);
            }
            for(int i= lastRow-1; i > firstCol; i--) {
                System.out.println(array[i][firstCol]);
            }

            firstRow++;
            lastRow--;
            firstCol++;
            lastCol--;
        }
    }
}