package data_types;

public class Integers {
        //Integer types stores whole numbers, positive or negative without decimals.
        public static void main(String[] args) {
        int Num = 250000;
        int Sum = Num/2;
        System.out.println(Sum);

        //The Byte data type can store whole numbers from -128 to 127. This can be used instead of int or other integer types to save memory when you are certain that the value will be within -128 and 127:
        byte Num2 = 123;
        int Sum2 = Num2 * 3;
        System.out.println(Sum2);

        //The short data type can store whole numbers from -32768 to 32767:
        short Num3 = 30000;
        System.out.println(Num3);

        //The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807. This is used when int is not large enough to store the value. Note that you should end the value with an "L"
        long Num4 = 6000000L;
        double Sum4 = Num4 / Math.round(100);
        System.out.println(Sum4);
    }
}


