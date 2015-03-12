package nyc.c4q.ac21.romancalc;

/**
 * Code to convert to and from Roman numerals.
 */
public class RomanNumerals {
    /**
     * Formats a number in Roman numerals.
     * @param value
     *   The value to format.
     * @return
     *   The value in Roman numerals.
     */
    static String format(int value) {
        // TODO: Group 1: Write this function!
        String result = "";

        while ( value >= 1000) {
            result += "M";
            value -= 1000;
        }

        if (value >= 900) {
            result += "CM";
            value -= 900;
        }

        while (value >= 500) {
            result += "D";
            value -= 500;
        }

        if (value >= 400) {
            result += "CD";
            value -= 400;
        }

        while (value >= 100) {
            result += "C";
            value -=100;
        }

        if (value >= 90) {
            result += "XC";
            value -= 90;
        }

        while (value >= 50) {
            result += "L";
            value -=50;
        }

        if (value >= 40) {
            result +="XL";
            value -= 40;
        }

        while (value >= 10) {
            result += "X";
            value -=10;
        }

        if (value >= 9) {
            result += "IX";
            value -= 9;

        }

        while (value >= 5) {
            result += "V";
            value -=5;
        }

        if (value >=4) {
            result += "IV";
            value -= 4;
        }

        while (value >= 1) {
            result += "I";
            value -=1;
        }

        return result;

    }

    /**
     * Parses a number in Roman numerals.
     * @param number
     *   The number to parse.
     * @return
     *   The value, or -1 if the number isn't in Roman numerals.
     */
    public static int parse(String number) {
        // TODO: Group 2: Write this function!

        // You will need:
        //   `number.length()` gives the length (number of characters) of the number
        //   `number.charAt(i)` gives the i'th character

        return -1;
    }

    public static void main(String[] argv) {
        // TODO: Group 3: Write this function!
        // It should test that format() and parse() work correctly.

        int leftDecimal, rightDecimal, add, sub, div, mul, rem, avg;
        String leftRoman, rightRoman, addRoman, subRoman, divRoman, mulRoman, remRoman, avgRoman;

        //declaring arrays, One for the decimal values, the other for Roman numeral values
        int [] decimalArray;
        String [] romanArray;

        //Assigning decimal values to the decimal array for testing purposes
        decimalArray = new int[10];
        decimalArray[0] = 9;
        decimalArray[1] = 14;
        decimalArray[2] = 29;
        decimalArray[3] = 310;
        decimalArray[4] = 413;
        decimalArray[5] = 517;
        decimalArray[6] = 622;
        decimalArray[7] = 725;
        decimalArray[8] = 826;
        decimalArray[9] = 1928;

        //Assigning roman numeral values to the roman numeral array for testing purposes
        romanArray = new String[10];
        romanArray[0] = "IV"; //4
        romanArray[1] = "XVIII"; //18
        romanArray[2] = "XLIV"; //44
        romanArray[3] = "LXXII"; //72
        romanArray[4] = "XCIX"; //99
        romanArray[5] = "CCXIV"; //214
        romanArray[6] = "CDXCVI"; //496
        romanArray[7] = "DL"; //550
        romanArray[8] = "DCCVII"; //707
        romanArray[9] = "MDXCVI"; // 1596

        /***
         *This for loop to iterate through the arrays. Converts roman numerals to decimal by calling the parse           *function, then does several operations on the current value in the array and the next value in the array.
         *The for loop starts at the last number in the array, then iterates backwards: It starts at the                 *romanArray[9] value then goes to romanArray[8]
         ***/
        System.out.println("This is the test for converting roman numerals to decimal numbers");
        for(int i = 9; i > 0; i--) {

            leftDecimal = parse(romanArray[i]); //current value in the array
            rightDecimal = parse(romanArray[i - 1]); // next value in the array

            //System.out.println("This is the " + i + "iteration in the for loop.");
            System.out.println("The current left number is: " + romanArray[i] + ", the current right number is: " + romanArray[i - 1]);
            add = leftDecimal + rightDecimal;
            sub = leftDecimal - rightDecimal;
            div = leftDecimal / rightDecimal;
            mul = leftDecimal * rightDecimal;
            rem = leftDecimal % rightDecimal;
            avg = (leftDecimal + rightDecimal) / 2;
            System.out.println("Addition: " + add + "\nSubtraction: " + sub + "\nDivision: " + div + "\nMultiply: " + mul + "\nRemainder: " +rem + "\nAverage: " + avg);

            System.out.println();


        }
        //Printed out a bunch of dashes to separate the roman to decimal conversion from the decimal to roman conversion
        System.out.println("---------------------------------------------------------------------------------");

        System.out.println("This is the test for converting decimal numbers to roman numerals.");

        //For loop to iterate through the decimalArray so we can convert the decimal numbers to roman numerals.
        for(int i = 9; i > 0; i--) {

            leftRoman = format(decimalArray[i]); //current value in the array
            rightRoman = format(decimalArray[i - 1]); // next value in the array

            //System.out.println("This is the " + i + "iteration in the for loop.");
            System.out.println("The current left number is: " + decimalArray[i] + ", the current right number is: " + decimalArray[i - 1]);
            addRoman = leftRoman +" + "+ rightRoman;
            subRoman = leftRoman + " - " + rightRoman;
            divRoman = leftRoman + " / " + rightRoman;
            mulRoman = leftRoman + " * " + rightRoman;
            remRoman = leftRoman + " % " + rightRoman;
            avgRoman = "(" + leftRoman + " + " + rightRoman + ") / 2 ";
            System.out.println("Addition: " + addRoman + "\nSubtraction: " + subRoman + "\nDivision: " + divRoman + "\nMultiply: " + mulRoman + "\nRemainder: " +remRoman + "\nAverage: " + avgRoman);

            System.out.println();


        }


    }
}