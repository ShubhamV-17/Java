public class demo2 {
    public static void main(String[] args) {
        // Nested loop to print patterns
    for(int i=1; i<=10; i++){
        for(int j=1; j<=i; j++){
            System.out.print("* ");
        }
        System.out.println();
    }

    //jump statement in java
    // break, continue
    for(int i=1; i<=10; i++){
        System.out.println(i);
        if(i==5){
            break;

        } 
    }

    for(int i=1; i<=10; i++){
        if(i==5){
            continue;
        }
        System.out.println(i);
    }

    // break in  nested loops
    for(int i=1; i<=10; i++){
        for(int j=1; j<=i; j++){
            System.out.print("* ");
            if(j>=5){
                break;
            }
        }
        System.out.println();
    }

    //lables
    outer: for(int i=1; i<=10; i++){
         for(int j=1; j<=i; j++){
            System.out.print("* ");
            if(j>=5){
                break outer;
            }
        }
        System.out.println();
    }



}
}
