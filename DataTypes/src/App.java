public class App {
    public static void main(String[] args) {
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        System.out.println("Busted MAX value = " + (myMaxIntValue + 1)); // overflow
        System.out.println("Busted MIN value = " + (myMinIntValue - 1)); // underflow

        // int myMaxIntTest = 2147483648; // error int too large

        int myInt = 2_12_456_6;
        System.out.println(myInt);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum value = " + myMinByteValue);
        System.out.println("Byte Maximum value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum value = " + myMinShortValue);
        System.out.println("Short Maximum value = " + myMaxShortValue);

        long myLongValue = 100L; // Here 'L' denotes long number

        System.out.println(myLongValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum value = " + myMinLongValue);
        System.out.println("Long Maximum value = " + myMaxLongValue);

        // byte myNewByteValue = (myMinByteValue / 2); // error // converts the values
        // to int
        byte myNewByteValue = (byte) (myMinByteValue / 2); // Casting
        System.out.println(myNewByteValue);

        // Floats and double are different by their precision.
        // Float has single Precision and double has Double precision.

        /*
         * Precision refers to the format and amount of space occupied by the type.
         * Single Precision occupied 32 bits
         * (so has a width of 32) and a Double precision occupies 64 bits (and thus has
         * a width of 64).
         * 
         * As a result the float has a range from 1.4E-45 to 3.4028235E+38 and the
         * double is much precise with a range
         * from 4.9E-324 to 1.7976931348623157E+308.
         * 
         */

        /*
         * In general float and double are great for general floating point operations.
         * but both are not great to use
         * where precise calculations are required - this is due to a limitation with
         * how floating point number are stored,
         * and not a java problem as such.
         * 
         * Java has a class called BidDecimal that overcomes this. When precise
         * calculations are necessary, such as when
         * performing currency calculations , floating-point types should not be used.
         * 
         * But for general calculations float and double are fine.
         */

        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);

        boolean value = false;
        System.out.println(value);

        String myString = "This is a String";
        System.out.println(myString);

        int randomInt = 50;
        String randomString = "50";
        randomString = randomString + randomInt; // converts integer to string during string addition
        randomInt = Integer.parseInt(randomString) + randomInt;
        System.out.println(randomString);
        System.out.println(randomInt);

    }

}
