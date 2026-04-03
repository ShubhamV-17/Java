public class multidimensional_array {
    public static void main(String[] args) {
        int[][] marks = new int[3][3];
        // 50 30 90 
        // 60 40 80
        // 70 50 70
        marks[0][0] =50;
        marks[0][1] =30;
        marks[0][2] =90;
        marks[1][0] =60;
        marks[1][1] =40;
        marks[1][2] =80;
        marks[2][0] =70;
        marks[2][1] =50;
        marks[2][2] =70;
        marks[0][0] =50;
        for( int row=0; row<3; row++){
            for(int col=0; col<row; col++){
             System.out.print( marks[row] [col]+ "   ");       
            }
            System.out.println();
        }

    }
}
