import java.util.Scanner;

public class Vicky
{
    public static void main(String[] args)
    {
        System.out.print("Enter distance : ");
        Scanner in = new Scanner(System.in);
        int distance = in.nextInt();

        int fiveM = 0;
        int threeM = 0;
        int oneM = 0;

        while (distance >= 5)
        {
            fiveM = fiveM + 1;
            distance = distance - 5;
        }

        while (distance >= 3)
        {
            threeM = threeM + 2;
            distance = distance - 3;
        }

        while (distance >= 1)
        {
            oneM = oneM + 3;
            distance = distance - 1;
        }

        System.out.println("Time : " + fiveM + threeM + oneM);
    }
}