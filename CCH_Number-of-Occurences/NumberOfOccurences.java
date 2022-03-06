import java.util.Arrays;
import java.util.Scanner;

public class NumberOfOccurences
{
    public static void main(String args[])
    {
        int temp, size, counter[] = new int[256];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter letters (without spaces): ");
        String str = sc.nextLine();
        char charArray[] = str.toCharArray();
        size = charArray.length;
        for (int i = 0; i < size; i++)
        {
            for (int j = i + 1; j < size; j++)
            {
                if (charArray[i] > charArray[j])
                {
                    temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = (char) temp;
                }
            }
        }

        for (int i = 0; i < size; i++)
        {
            counter[(int) str.charAt(i)]++;
        }

        System.out.println("");
        System.out.println("Number of Occurences of the letters");

        for (int i = 0; i < 256; i++) {
            if (counter[i] != 0) {
                System.out.println((char) i + " --> " + counter[i]);
            }
        }
        System.out.println("");
        System.out.println("Letters in an alpahbetical order : " + Arrays.toString(charArray));
    }
}