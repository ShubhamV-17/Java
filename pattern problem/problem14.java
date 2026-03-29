public class problem14 {
    public static void main(String[] args) {
        // char ch='A';
        int n=5;
        for(int i=1; i<=n; i++){
            for(char ch='A'; ch<'A'+i; ch++) {
                System.out.print(ch + "  ");
            }
            System.out.println();
        }
    }
    
}