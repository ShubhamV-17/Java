public class problem7 {
    public static void main(String[] args) {
        int i=10;
        int j=25;
        int k=15;
        if(i>j && i>k){
            System.out.println("Largest number is 10");
        }
        else if(j>i && j>k){
            System.out.println("Largest number is 25");
        }
        else if(k>i && k>j){
            System.out.println("Largest number is 15");
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
