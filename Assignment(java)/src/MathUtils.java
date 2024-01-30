public class MathUtils {

    /**
     * Returns the sum of two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the sum of a and b
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * Returns the result of subtracting b from a.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the result of subtraction
     */
    public static int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Returns the product of two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the product of a and b
     */
    public static int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Returns the result of dividing a by b.
     * If b is zero, returns -1.0.
     *
     * @param a the numerator
     * @param b the denominator
     * @return the result of division, or -1.0 if b is zero
     */
    public static double divide(int a, int b) {
        if (b == 0) {
            return -1.0;
        }
        return (double) a / b;
    }
}
