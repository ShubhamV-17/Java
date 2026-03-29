public class problem9 {
    public static void main(String[] args) {

        /*
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
        
        */
       int n = 5;

        //  Upper Pyramid
        for(int i = 0; i < n; i++) {

            // spaces
            for(int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // stars
            for(int j = 0; j < 2*i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        //  Lower Pyramid (your code merged)
        for(int i = 0; i < n; i++) {

            // spaces
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // stars
            for(int j = 0; j < 2*n - (2*i + 1); j++) {
                System.out.print("*");
            }
             for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}