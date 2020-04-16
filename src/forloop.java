import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        String word;
        int c;
        int d;
        int p = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Write a program that prints all the odd numbers from 1-20.");
        for (int x = 1; x <= 20; x++)
        {
            if(x % 2 != 0) {
                System.out.print(x + " ");
            }

        }

        System.out.println();
        System.out.println("Write a program that prints all the even numbers from 1-20.");
        for (int b = 1; b <= 20; b++)
        {
            if(b % 2 == 0) {
                System.out.print(b + " ");
            }


        }
        System.out.println();
        System.out.println("enter a word: ");
        word = input.nextLine();
        for (int x = word.length() -1; x >= 0; x--)
        {
            System.out.print(word.charAt(x));
        }
        System.out.println();
        System.out.println("enter a number: ");
        c = input.nextInt();
        for (int x=1; x<=c; x++){
            if(c % x == 0){
                System.out.print(x + " ");
            }

        }
        System.out.println();
        System.out.println("Enter a number");
        d = input.nextInt();

        for (int x=1; x<=d; x++){
            p = p * x;

        }
        System.out.println(p);




    }








}

