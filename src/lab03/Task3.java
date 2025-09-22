package lab03;

public class Task3 {
    public static void main(String[] args) {
        printResults(10, 2);
        printResults(14, 5);
        printResults(15, 2);
        printResults(5, 0);
        printResults(5, -1);
    }

    public static double calculateSum(int k, double z) {
        if (k >= 15 || k <= 0) {
            throw new IllegalArgumentException("Invalid k: " + k);
        }
        if (z <= 0) {
            throw new IllegalArgumentException("Invalid z: " + z);
        }

        double sum = 0;
        for (int i = 1; i <= k; i++) {
            sum += 1.0 / Math.sqrt(z * i) + Math.tan((double) k / i);
        }
        return sum;
    }

    static void printResults(int k, double z) {
        System.out.print("k:" + k + " z:" + z + " result:");
        try {
            System.out.println(calculateSum(k, z));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}