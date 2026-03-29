public class problem17 {
    public static void main(String[] args) {
         /*   
     A     
    ABA
   ABCBA
  ABCDCBA
 ABCDEDCBA
         */

          for(int i=0; i<5; i++){
     //space
        for(int j=0; j<=(5-i-1); j++){
            System.out.print(" ");
        }
        //Alphabates
        char ch = 'A'; 
        int break_point = (2*i +1) / 2;
        for(int j=0; j<2*i +1; j++){
            System.out.print(ch);
            if(j<break_point){
                ch++;
            }
            else{
                ch--;
            }
        }
         //space
        for(int j=0; j<=(5-i-1); j++){
            System.out.print(" ");
        }
        System.out.println();
    }
}
}
