public class demo {
    public static void main(String[] args) {
    //     int[] RollNum = new int[3];
    //     // 101,102,103
    //   RollNum[0]=101;
    //   RollNum[1]=102;
    //   RollNum[2]=103;
    //   System.out.println(RollNum[0]);
    //   System.out.println(RollNum[1]);
    //   System.out.println(RollNum[2]);
    //   System.out.println(RollNum.length);

int[] RollNum = new int[5];
      //by using loops
      int x = 101;
      for(int i=0; i<RollNum.length; i++){
        RollNum[i]=x;
        x++;
      }
      for(int i=0; i<RollNum.length; i++)
      {
        System.out.println(RollNum[i]);
      }
     
    }
}
