import java.util.Scanner;

public class MissingNumber
{
    public static void main(String[] args)
    {
        System.out.println("Enter the number pattern (Seperated by a comma) : ");
        Scanner sc = new Scanner(System.in);
        String numSeq = sc.next();
        String[] numList = numSeq.split(",");
        int size = numList.length;
        int[] numArr = new int[size];
        for (int i = 0; i < size; i++)
        {
            numArr[i] = Integer.parseInt(numList[i]);
        }
        sorting(numArr);

        int mNo = 0, count = 0;
        int n = numArr[0];
        for (int i = 0; i < size; i++)
        {
            if (numArr[i] != n)
            {
                mNo = n;
                count++;
            }
            n = numArr[i] + 1;
        }

        if (count == 1)
        {
            System.out.println("Missing number is : " + mNo);
        } else if (count > 1)
        {
            System.out.println("There are many missing numbers within the number series.");
        }
        else
        {
            System.out.println("No missing number");
        }
    }

    static void sorting(int[] arr)
    {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = 1; j < (n - i); j++)
            {
                if (arr[j - 1] > arr[j])
                {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}