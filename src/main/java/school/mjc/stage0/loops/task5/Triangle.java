package school.mjc.stage0.loops.task5;

public class Triangle {
    public static void printTriangle(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("8");
            System.out.println("");
        }
    }


    public static void main(String[] args) {
        printTriangle(5);

    }
}