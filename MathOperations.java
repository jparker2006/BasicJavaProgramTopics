public class MathOperations {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4}; // Example array

        int sumOfSquaresResult = sumOfSquares(numbers);
        System.out.println("Sum of Squares: " + sumOfSquaresResult);

        int productOfElementsResult = productOfElements(numbers);
        System.out.println("Product of Elements: " + productOfElementsResult);
    }

    /**
     * Calculates the sum of the squares of each element in the array.
     *
     * @param numbers The array of integers.
     * @return The sum of the squares of the numbers in the array.
     */
    public static int sumOfSquares(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number * number;
        }
        return sum;
    }

    /**
     * Calculates the product of all elements in the array.
     *
     * @param numbers The array of integers.
     * @return The product of all the numbers in the array.
     */
    public static int productOfElements(int[] numbers) {
        int product = 1; // Start with 1 because it's a multiplication operation
        for (int number : numbers) {
            product *= number;
        }
        return product;
    }
}
