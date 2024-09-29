public class operand {
    public static void main(String[] args)
    {
        int intOperandA = 1;
        int intOperandB = 2;
        int intSum = 5;
        int intProduct = 11;
        int intDifference = 9;
        int intQuotient = 18;
        int intModulo = 20;
        double doubleOperandA = 12;
        double doubleOperandB = 15;
        double doubleSum = 7;
        double doubleProduct = 3;
        double doubleDifference = 10;
        double doubleQuotient = 19;
        double doubleModulo = 28;
        intSum = intOperandA + intOperandB;
        intProduct = intOperandA * intOperandB;
        intDifference = intOperandA - intOperandB;
        intQuotient = intOperandA / intOperandB;
        intModulo = intOperandA % intOperandB;
        doubleSum = doubleOperandA + doubleOperandB;
        doubleProduct = doubleOperandA * doubleOperandB;
        doubleDifference = doubleOperandA - doubleOperandB;
        doubleQuotient = doubleOperandA / doubleOperandB;
        doubleModulo = doubleOperandA % doubleOperandB;
        System.out.println("The sum using ints of " + intOperandA + " " + intOperandB + " is " + intSum);
        System.out.println("The product using ints of " + intOperandA + " " + intOperandB + " is " + intProduct);
        System.out.println("The difference using ints of " + intOperandA + " " + intOperandB + " is " + intDifference);
        System.out.println("The quotient using ints of " + intOperandA + " " + intOperandB + " is " + intQuotient);
        System.out.println("The modulo using ints of " + intOperandA + " " + intOperandB + " is " + intModulo);
        System.out.println("The sum using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleSum);
        System.out.println("The product using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleProduct);
        System.out.println("The difference using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleDifference);
        System.out.println("The quotient using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleQuotient);
        System.out.println("The modulo using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleModulo);
    }

}
