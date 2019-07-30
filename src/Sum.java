public class Sum {
    public static int sumDigits(int number){
        String num = Integer.toString(number);
        int sum=0;
        for (int i = 0; i<num.length(); i++){
            sum+= number%10;
            number/=10;
        }
        return sum;
    }

}
