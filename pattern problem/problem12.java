public class problem12 {
    public static void main(String[] args) {
        int n=4;
        //numbers
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++) {
                System.err.print(j);
            }
        
        //spaces
        for(int j=1; j<=2*(n-i); j++){
            System.out.print(" ");
        }
        
        //pattern
        
            for(int j=i; j>=1; j--) {
                System.err.print(j);
            }
            System.err.println();
            
        }}
    }

