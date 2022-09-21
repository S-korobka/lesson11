package exceptions;

public class Solution {
    public static void   checkIntMensheZiro(int value) throws IllegalArgumentException {
        if (value < 0) {
            throw new IllegalArgumentException("The value should be more than zero");
        }else {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        checkIntMensheZiro(256);
        try {
            checkIntMensheZiro(-20);
        } catch (Exception e) {
            System.out.println("Exception was caught");
        }
        checkIntMensheZiro(-1);
    }
   /*
    1. Create the custom exception and extend it from IllegalArgumentException class
    2. Create the method which takes and integer value and print it to the console
    3. In the , throw your custom exception
    4. The method should throw this custom exception
    5. Exception should pass the message into the super class in the constructor - "The value should be more than zero"
    6. In method main call this method and:
        6.1. call this method with int > 0
        6.2. using try catch block pass int < 0, catch this exception and print to the console "Exception was caught"
        6.3. call this method with int < 0
     */
}
