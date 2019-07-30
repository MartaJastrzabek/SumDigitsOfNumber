public class Sum {
    public static int sumDigits(int number){
        String num = Integer.toString(number);
        int sum=0;
        int[] digits = new int[num.length()];
        for (int i = 0; i<digits.length; i++){
            digits[i] = number%10;
            number/=10;
            sum+=digits[i];
        }
        return sum;
    }

}
