import java.util.Scanner;
import java.util.Random;

public class Game2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int userscore = 0;
        int computerscore = 0;

        System.out.println("Even Odd Game ! \t Choose : 0 for even && 1 for odd");
        System.out.print("Even or Odd : ");
        int choices = sc.nextInt();


        for(int i = 1; i <= 10 ; i++) {
            System.out.println("=> Round " + i + " of 10");

            System.out.print("Enter Your Number : ");
            int number = sc.nextInt();

            int computernumber = rand.nextInt(200);
            System.out.println("Computer Choices Number : " + computernumber);

            int sum = number + computernumber;
            System.out.println("Sum is : " + sum);

            if (sum % 2 == 0)
            {
                System.out.println("Result = Even");
                if (choices == 0)
                {
                    System.out.println("< You Win >");
                    userscore++;
                } else
                {
                    System.out.println("< Computer Win >");
                    computerscore++;
                }
            } else
            {
                System.out.println("Result = ODD");
                if (choices == 1)
                {
                    System.out.println("< You Win >");
                    userscore++;
                } else
                {
                    System.out.println("< Computer Win >");
                    computerscore++;
                }
            }
        }

        System.out.println("==========Final Result=============");
        System.out.println("/>/ Your Score = " + userscore);
        System.out.println("/>/ Computer Score = " + computerscore);

        if(userscore>computerscore)
        {
            System.out.println("\n>> \uD83C\uDF89 Congratulation! You win the Game");
        }
        else if(userscore<computerscore)
        {
            System.out.println("\n>> \uD83E\uDD16 Computer Wins the Game!");
        }
        else
        {
            System.out.println("\n>> The Game was Tie!");
        }

        sc.close();
    }
}
