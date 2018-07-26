package Practice;

import java.util.Scanner;

public class DigitalTime
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        String[] stringArray = string.split(",");
        int[] intArray = new int[9];
        for (int i = 0; i < 9; i++)
        {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        int[] count = new int[10];
        for (int i = 0; i < 9; i++)
        {
            count[intArray[i]]++;
        }
        String HH = "";
        if (count[2] > 0)
        {
            if (count[4] > 0&&count[0]>3)
            {
                System.out.println("24:00:00");
                return;
            }
        }
        if (count[2] > 0)
        {
            HH += 2;
            count[2]--;
            for (int i = 3; i >= 0; i--)
            {
                if (count[i] > 0)
                {
                    HH += i;
                    count[i]--;
                    break;
                }
                if (i == 0)
                {
                    System.out.print("Impossible");
                    return;
                }
            }
        } else if (count[1] > 0)
        {
            HH += 1;
            count[1]--;
            for (int i = 9; i >= 0; i--)
            {
                if (count[i] > 0)
                {
                    HH += i;
                    count[i]--;
                    break;
                }
                if (i == 0)
                {
                    System.out.print("Impossible");
                    return;
                }
            }
        } else if (count[0] > 0)
        {
            HH += 0;
            count[0]--;
            for (int i = 9; i >= 0; i--)
            {
                if (count[i] > 0)
                {
                    HH += i;
                    count[i]--;
                    break;
                }
                if (i == 0)
                {
                    System.out.print("Impossible");
                    return;
                }
            }
        } else
        {
            System.out.print("Impossible");
            return;
        }


        String MM = "";
        if (count[5] > 0)
        {
            MM += 5;
            count[5]--;
            for (int i = 9; i >= 0; i--)
            {
                if (count[i] > 0)
                {
                    MM += i;
                    count[i]--;
                    break;
                }
                if (i == 0)
                {
                    System.out.print("Impossible");
                    return;
                }
            }
        } else if (count[4] > 0)
        {
            MM += 4;
            count[4]--;
            for (int i = 9; i >= 0; i--)
            {
                if (count[i] > 0)
                {
                    MM += i;
                    count[i]--;
                    break;
                }
                if (i == 0)
                {
                    System.out.print("Impossible");
                    return;
                }
            }
        } else if (count[3] > 0)
        {
            MM += 3;
            count[3]--;
            for (int i = 9; i >= 0; i--)
            {
                if (count[i] > 0)
                {
                    MM += i;
                    count[i]--;
                    break;
                }
                if (i == 0)
                {
                    System.out.print("Impossible");
                    return;
                }
            }
        } else if (count[2] > 0)
        {
            MM += 2;
            count[2]--;
            for (int i = 9; i >= 0; i--)
            {
                if (count[i] > 0)
                {
                    MM += i;
                    count[i]--;
                    break;
                }
                if (i == 0)
                {
                    System.out.print("Impossible");
                    return;
                }
            }
        } else if (count[1] > 0)
        {
            MM += 1;
            count[1]--;
            for (int i = 9; i >= 0; i--)
            {
                if (count[i] > 0)
                {
                    MM += i;
                    count[i]--;
                    break;
                }
                if (i == 0)
                {
                    System.out.print("Impossible");
                    return;
                }
            }
        } else if (count[0] > 0)
        {
            MM += 0;
            count[0]--;
            for (int i = 9; i >= 0; i--)
            {
                if (count[i] > 0)
                {
                    MM += i;
                    count[i]--;
                    break;
                }
                if (i == 0)///error
                {
                    System.out.print("Impossible");
                    return;
                }
            }
        } else
        {
            System.out.print("Impossible");
            return;
        }


        String SS = "";
        if (count[5] > 0)
        {
            SS += 5;
            count[5]--;
            for (int i = 9; i >= 0; i--)
            {
                if (count[i] > 0)
                {
                    SS += i;
                    count[i]--;
                    break;
                }
                if (i == 0)
                {
                    System.out.print("Impossible");
                    return;
                }
            }
        } else if (count[4] > 0)
        {
            SS += 4;
            count[4]--;
            for (int i = 9; i >= 0; i--)
            {
                if (count[i] > 0)
                {
                    SS += i;
                    count[i]--;
                    break;
                }
                if (i == 0)
                {
                    System.out.print("Impossible");
                    return;
                }
            }
        } else if (count[3] > 0)
        {
            SS += 3;
            count[3]--;
            for (int i = 9; i >= 0; i--)
            {
                if (count[i] > 0)
                {
                    SS += i;
                    count[i]--;
                    break;
                }
                if (i == 0)
                {
                    System.out.print("Impossible");
                    return;
                }
            }
        } else if (count[2] > 0)
        {
            SS += 2;
            count[2]--;
            for (int i = 9; i >= 0; i--)
            {
                if (count[i] > 0)
                {
                    SS += i;
                    count[i]--;
                    break;
                }
                if (i == 0)
                {
                    System.out.print("Impossible");
                    return;
                }
            }
        } else if (count[1] > 0)
        {
            SS += 1;
            count[1]--;
            for (int i = 9; i >= 0; i--)
            {
                if (count[i] > 0)
                {
                    SS += i;
                    count[i]--;
                    break;
                }
                if (i == 0)
                {
                    System.out.print("Impossible");
                    return;
                }
            }
        } else if (count[0] > 0)
        {
            SS += 0;
            count[0]--;
            for (int i = 9; i >= 0; i--)
            {
                if (count[i] > 0)
                {
                    SS += i;
                    count[i]--;
                    if (HH.equals("00") && MM.equals("00") && SS.equals("00"))
                    {
                        System.out.println("Impossible");
                        return;
                    }
                    break;
                }
                if (i == 0)//error
                {
                    System.out.print("Impossible");
                    return;
                }
            }
        } else
        {
            System.out.print("Impossible");
            return;
        }
        String result = HH + ":" + MM + ":" + SS;
        System.out.print(result);
    }
}
