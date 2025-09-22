package lab03;

public class Task12 {
    public static void main(String[] args) {
        printResults(0.1);      // груба точність
        printResults(0.001);    // середня точність
        printResults(1e-6);     // висока точність
        printResults(-0.5);     // помилка (ε <= 0)
        printResults(0);        // помилка (ε = 0)
    }

    public static double calculateSum(double epsilon) {
        if (epsilon <= 0) {
            throw new IllegalArgumentException("Invalid epsilon: " + epsilon);
        }

        double sum = 0;
        int i = 1;
        while (true) {
            double term = 1.0 / (i * (i + 1));
            if (term < epsilon) break;
            sum += term;
            i++;
        }
        return sum;
    }

    static void printResults(double epsilon) {
        System.out.print("epsilon:" + epsilon + " result:");
        try {
            System.out.println(calculateSum(epsilon));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}