public class Prime{
    public static int countFactors(int x){
        int number = 1;
        int factor = 0;
        while (number!=x){
            if(x%number==0){
                factor++;
            }
            number++;

        }
        return factor+1;
    }
    public static boolean isPrime(int x){
        if (countFactors(x) == 2){
            return true;
        }
        else{
            return false;
        }
    }
    public static int countPrimes(int n){
        int i = 2;
        int value =0;
        while(n>i){
            if(isPrime(i)){
                value++;
            }
            i++;
        }
        return value;
    }
    public static void main(String[]args){
        System.out.println(isPrime(2));
        System.out.println(countFactors(2));
        System.out.println(countPrimes(100));
    }
}