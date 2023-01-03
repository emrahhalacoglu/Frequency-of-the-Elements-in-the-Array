import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Array Lenght : ");
        int arrayLenght = input.nextInt();
        int[] list = new int[arrayLenght];
        for (int i = 0; i < list.length; i++)
        {
            int randomNumber = (int)(Math.random()*100);
            list[i] = randomNumber;
        }
        System.out.println(Arrays.toString(list));

        for (int i = 0; i < list.length; i++)
        {
            int counter = 1;
            for (int j = i + 1; j < list.length; j++)
            {
                if (list[i] == list[j])
                {
                   counter++;
                }
            }
            System.out.println(list[i] + " Repeated " + counter + " Times.");
        }
    }
}