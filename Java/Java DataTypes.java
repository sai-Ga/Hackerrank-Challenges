import java.util.*;
import java.io.*;
import java.math.BigInteger;



class Solution{
    public static void main(String []argh)
    {



        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < n; i++){
            String input1 = scanner.nextLine();
            if(input1.isEmpty()){
                continue;
            }
            BigInteger a = new BigInteger(input1);
            BigInteger byte1 = BigInteger.valueOf(-128);
            BigInteger byte2 = BigInteger.valueOf(127);
            if(a.compareTo(byte1) >= 0 && a.compareTo(byte2) <= 0){
                System.out.println(a + " can be fitted in:\n* byte\n* short\n* int\n* long");
                continue;
            }
            BigInteger short1 = BigInteger.valueOf(-32768);
            BigInteger short2 = BigInteger.valueOf(32767);
            if(a.compareTo(short1) >= 0 && a.compareTo(short2) <= 0){
                System.out.println(a + " can be fitted in:\n* short\n* int\n* long");
                continue;
            }
            BigInteger int1 = BigInteger.valueOf(-2147483648);
            BigInteger int2 = BigInteger.valueOf(2147483647);
            if(a.compareTo(int1) >= 0 && a.compareTo(int2) <= 0){
                System.out.println(a + " can be fitted in:\n* int\n* long");
                continue;
            }
            BigInteger long1 = new BigInteger("-9223372036854775808");
            BigInteger long2 = new BigInteger("9223372036854775807");
            if(a.compareTo(long1) >= 0 && a.compareTo(long2) <= 0){
                System.out.println(a + " can be fitted in:\n* long");
                continue;
            }else{
                System.out.println(a + " can't be fitted anywhere.");
                continue;
            }
        }
    }
}



