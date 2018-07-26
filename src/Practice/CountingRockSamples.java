package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class CountingRockSamples
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int S=sc.nextInt();
        int R=sc.nextInt();
        int[] intArray=new int[S];
        for(int i=0;i<S;i++)
        {
            intArray[i] = sc.nextInt();
        }
        Arrays.sort(intArray);
        for(int i=0;i<R;i++)
        {
            int minimumSize= sc.nextInt();
            int countA=0;
            int maximumSize= sc.nextInt();
            int countB=0;
            for(int j=0;j<S;j++)
            {
                if(minimumSize<=intArray[j])
                {
                    break;
                }
                countA++;
            }
            for(int j=0;j<S;j++)
            {
                if(maximumSize<intArray[j])
                {
                    break;
                }
                countB++;
            }
            System.out.print(countB-countA+" ");
        }
    }
}
