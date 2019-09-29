package projectEuler;

public class projectEuler2 {





    public static void main(String[] args){

        int sum = 0;

        for(int i = 0; i < 34; i++){

            if(fib(i) % 2 == 0){
                sum += fib(i);
            }


        }

        System.out.println(sum);

        }
        

    public static int fib(int n){
        if(n <= 1){
            return n;
        }

        return fib(n-1) + fib(n-2);
    }
}


