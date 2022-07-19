public class Average {
    public static void main(String[] args) {
        // Initialize the number of names and integers to be printed
        int n = Integer.parseInt(args[0]);

        // Initialize the string array for the names
        String[][] name = new String[n * 1000][n * 1000];
        // Initialize the arrays for the numbers
        int[][] num1 = new int[n * 1000][n * 1000];
        int[][] num2 = new int[n * 1000][n * 1000];
        int[][] num3 = new int[n * 1000][n * 1000];
        // Initialize the array to keep track of the sums of the different numbers
        int[] sum = new int[n * 1000];
        // Initialize the array for the averages
        double[] average = new double[n * 1000];
        // Initialize the counter
        int i = 0;

        // While loop puts user input into the arrays until standard input is empty
        while (!StdIn.isEmpty()) {
            name[i][0] = StdIn.readString();
            num1[i][0] = StdIn.readInt();
            num2[i][0] = StdIn.readInt();
            num3[i][0] = StdIn.readInt();
            // Counter to keep track of the indexes
            i++;
        }


        // For loop for printing out the names, integers, and averages up to the user input number
        for (int x = 0; x < n; x++) {
            // Add up each of the sets of three integers
            sum[x] = num1[x][0] + num2[x][0] + num3[x][0];
            // Divide the sum by 3 to get the average- store in variable array
            average[x] = (double) sum[x] / 3.0;
            // Use printf() to printout each name, its three numbers, and its average to two decimal places
            StdOut.printf("%s %d %d %d %.2f \n", name[x][0], num1[x][0], num2[x][0], num3[x][0],
                          average[x]);
        }
    }
}