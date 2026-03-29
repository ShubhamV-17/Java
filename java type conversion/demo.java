public class demo {

    public static void main(String[] args) {
        //Implicit conversion
        //(byte to int)
        byte b=24;
        int i=b;
        System.out.println(i);

    //character to int
        char c='a';
        int j;
        j=c;
        System.out.println(j);

    //Explicit conversion
    int k=100;
    byte m;
    m=(byte)k;
    System.out.println(m);

    //Truncating conversion
    float f=3.154f;
    int z;
    z=(int)f;
    System.out.println(z);




}
}
