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
    public static void main(String[]args){
        System.out.println(isPrime(2));
        System.out.println(countFactors(2));
    }
}