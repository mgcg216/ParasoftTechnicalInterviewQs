/*
A rational number is any number that can be represented as a fraction
 */

public class ParasoftQ4 {
    public static void main(String[] args) {
        //first rational number
        double num = 3.54;
        double den = 4.3;
        //second rational number
        double num2 = 5;
        double den2 = 6;

        if (num % 1==0 & den % 1 == 0 &num2 % 1==0 & den2 % 1 == 0) {
            printDecimal(num, den);
            printFraction(num, den);
            add(num, num2, den, den2);
        }
        else{
            double b = toTheTenPower(whichGreater(num, den));
            double d = toTheTenPower(whichGreater(num2, den2));
            num = num*b;
            den = den*b;
            num2 = num2*d;
            den2 = den2*d;
            printDecimal(num, den);
            printFraction(num, den);
            add(num, num2, den, den2);
        }
    }
    //Methods
    private static double toTheTenPower(double n){
        double a=1;
        for(int i =0; i < n;i++){
            a = a * 10;
        }
        return a;
    }
    private static double whichGreater(double num, double den){
        double n = ifDecimal(num);
        double d = ifDecimal(den);
        if (n>d){
            return n;
        }
        else{
            return d;
        }
    }

    private static void printDecimal(double num,double den){
        double nm = num;
        double dn = den;
        System.out.println(nm/dn);
    }
    private static int ifDecimal(double num){
        //finds how many decimal points
        String text = Double.toString(Math.abs(num));
        int integerPlaces = text.indexOf('.');
        int decimalPlaces = text.length() - integerPlaces - 1;
        return decimalPlaces;
    }

    private static void printFraction(double num, double den){
        if (den == 0 ){
            System.out.println("Not Rational");
        }
        double g = gcf(num, den);
        if (g==0){g=1;}
        System.out.println(num/g +"/" + den/g);
    }

    private static void add(double num1, double num2, double den1, double den2 ){
        //EX 3/4 + 5/7 = 21/28 + 20/28 = (21 + 20)/28
        //or (num1*den2 + num2+den1)/(den1*den2)
        double num = num1*den2 + num2+den1;
        double den = den1*den2;
        printDecimal(num, den);
        printFraction(num, den);
    }

    private static double gcf(double num,double den){
        //EX 20/28 = 10/14 = 5/7
        double gcf = 0;
        for (int i = 2; i < (den); i++ ){
            if (num % i==0 & den % i ==0){
                gcf = i;
            }
        }
        return gcf;
    }


}
