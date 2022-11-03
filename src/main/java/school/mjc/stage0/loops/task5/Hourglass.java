package school.mjc.stage0.loops.task5;

public class Hourglass {
    public static void printHourglassOfGivenSize(int height) {
        {
            int i, j, k;

            // for loop for printing
            // upper half
            for (i = 1; i <= height; i++) {

                // printing i spaces at
                // the beginning of each row
                for (k = 1; k < i; k++)
                    System.out.print(" ");

                // printing i to rows value
                // at the end of each row
                for (j = i; j <= height; j++)
                    System.out.print("8" + " ");

                System.out.println();
            }

            // for loop for printing lower half
            for (i = height - 1; i >= 1; i--) {
                // printing i spaces at the
                // beginning of each row
                for (k = 1; k < i; k++)
                    System.out.print(" ");

                // printing i to rows value
                // at the end of each row
                for (j = i; j <= height; j++)
                    System.out.print("8" + " ");

                System.out.println();
            }
        }
    }
        public static void main(String[] args) {
            printHourglassOfGivenSize( 5);
        }
}
