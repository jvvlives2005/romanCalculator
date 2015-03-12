package nyc.c4q.ac21.romancalc;

/**
 * Created by c4q-joshelynvivas on 3/11/15.
 */
public class Test {
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

}
