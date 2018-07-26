package Practice;

import java.util.Scanner;

public class Base6
{
    static long addDigits(long number)
    {
        long sum = 0;

        while (number != 0)
        {
            sum = sum + number % 10;
            number /= 10;
        }

        return sum;
    }

    static long base6(long number)
    {
        long[] baseSixNumber = new long[100];

        int count = 0;
        while (number > 0)
        {
            baseSixNumber[count] = number % 6;
            number /= 6;
            count++;
        }
        String result = "";
        for (int j = count - 1; j >= 0; j--)
        {
            result += baseSixNumber[j];
        }
        long resultInLong = Long.parseLong(result);
        return addDigits(resultInLong);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String string = sc.next();
        String[] stringArray = string.split(",");
        long[] longArray = new long[N];
        for (int i = 0; i < N; i++)
        {
            longArray[i] = Long.parseLong(stringArray[i]);
        }
        long[] derivedSequence = new long[N];
        for (int i = 0; i < N; i++)
        {
            derivedSequence[i] = base6(longArray[i]);
        }
        long count=0;
        for(int i=0;i<N-1;i++)
        {
            for(int j=i+1;j<N;j++)
            {
                if(derivedSequence[i]>derivedSequence[j])
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
