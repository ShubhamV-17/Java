public class problem5 {
    public static void main(String[] args) {
        int i=30;
        if(i<10){
            System.out.println("Very Cold");
        }
        else if(i>=10 && i<25){
            System.out.println("Moderate");
        }
        else if(i>=25){
            System.out.println("Hot");
        }
        else{
            System.out.println("Invalid Temperature");
        }
    }
    
}
