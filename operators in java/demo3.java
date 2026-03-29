public class demo3 {
    public static void main(String[] args) {
        //bitwise operators 
        int a=2;  //10 --> 00000000 00000000 00000000 00000010
        int b=3;  //11 --> 00000000 00000000 00000000 00000011
        int c=a&b; // 10-->2
        int d=a|b; //11-->3
        int e=a^b; // 01-->1
        int f=~a;  // 11111111 11111111 11111111 11111101 -->-3

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        // shift operation
        int g=1; // 00000000 00000000 00000000 00000001
        int h=g<<2; // 00000000 00000000 00000000 00000100 -->4
        int i=h>>1; // 00000000 00000000 00000000 00000010 -->2
        System.out.println(h);
        System.out.println(i);
    }
    
}
