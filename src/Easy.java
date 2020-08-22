public class Easy {
    public int reverse(int x) {

        int isNegative = x<0?-1:1;
        x *= isNegative;
        double output =0;
        while(x>0){
            int dividend = x/10;
            int remainder = x%10;
            output = output*10+remainder;
            x= dividend;
        }
        output = output*isNegative;

        return output > Integer.MAX_VALUE || output<Integer.MIN_VALUE ? 0 : (int)output;
    }
}
