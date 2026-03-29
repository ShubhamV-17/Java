public class demo {
    public static void main(String[] args) {
        int i=10;
        if(i==10){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }


        int num=10;
        if(num%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    //if-else-if ladder
        int n=9;
    if(n>0){
        System.out.println("positive");
    }
    else if(n<0){
        System.out.println("negative");
    } 
    else{
        System.out.println("zero");
    }


    //program fo age predication
    int age=50;
    if(age<18){
        System.out.println("child");
    }
    else if(age>=18 && age<30){
        System.out.println("youth");
    }
    else if(age>=31 && age<40){
        System.out.println(" adult ");
    }
    else if(age>=41 && age<=50){
        System.out.println("married");
    }
    else{
        System.out.println("senior citizen");
    }

    //program fo age predication by nested if-else
        int v=50;
    if(v>80){
        System.out.println("you are very old");
    }
    if(v>60){
        System.out.println("you are old");
    }
    if(v>40){
        System.out.println("you are mature");
    }
    if(v>20){
        System.out.println("you are young");
    }
    else{
        System.out.println("you are child");
    }


    


}}
