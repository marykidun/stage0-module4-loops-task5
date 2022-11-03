package school.mjc.stage0.loops.task5;

public class Square {
    public static void printSquareFrom8s(int sideLength){
        int j, i = 0;
        while (i < sideLength )
        {
            j = 0 ;
            while ( j < sideLength )
            {
                if (i == 0 || i == sideLength - 1 || j == 0 || j == sideLength - 1) {
                    System.out.print("8");
                }
                else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }


                        public static void main(String[] args) {
            printSquareFrom8s(4);

        }

    }

