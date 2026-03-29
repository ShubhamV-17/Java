public class problem19 {
    public static void main(String[] args) {
 /*
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********
                  
*/

        // First pattern 
        for(int i=5; i>=1; i--){
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        
        //space
        for (int k=1; k<=10-(2*i); k++) {
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    // second pattern
    for (int i=1; i<=5; i++){
        for(int j=1; j<=i; j++){
            System.out.print(  "*");
        }
        for (int k=1; k<=10-(2*i); k++) {
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print(  "*");
        }

        System.out.println();
    }
    }
}
