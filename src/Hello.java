import java.util.*;

public class Hello
{
    //  ctrl shift /
    public static void main(String[] args)
    {
/*        System.out.println("Hello world!!!!");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        double d = scanner.nextDouble();
        System.out.println("a = " + a + " d = "+ d);*/

        while(true)
        {
            //zad1();
            //zad2();
            //zad3();
            //zad4();
            zad5();
        }
    }
    public static void zad1()
    {
        Scanner scanner  = new Scanner(System.in);
        char lastChar;
        int count = 0;


        String inputString = scanner.nextLine();
        if(inputString.isEmpty())
            return;


        lastChar = inputString.charAt(inputString.length()-1);


        for(int i =0;i<inputString.length();i++)
        {
            if(inputString.charAt(i) == lastChar )
                count++;
        }
        System.out.println(count);
    }
    public static  void zad2()
    {

        Scanner scanner  = new Scanner(System.in);
        String inputString = scanner.nextLine();
        if(inputString.isEmpty())
            return;

        StringBuilder reverse = new StringBuilder(inputString);


        /*        for(int i =inputString.length() -1 ; i>= 0 ;i--)
        {
            reverse.append(inputString.charAt(i));
        }*/
        System.out.println(reverse.reverse());

    }
    public static void zad3()
    {
        Scanner scanner  = new Scanner(System.in);
        String inputString = scanner.nextLine();
        if(inputString.isEmpty())
            return;
        boolean palindrome = true;

        for(int i =0 ;i<inputString.length() / 2 ;i++)
        {
            if(inputString.charAt(i) != inputString.charAt(inputString.length() - 1 - i))
                palindrome = false;
        }
        if(palindrome)
            System.out.println("Ten text jest palindromem");
        else
            System.out.println("Ten text nie jest palindromem");
    }
    public static void zad4()
    {
        Scanner scanner  = new Scanner(System.in);
        String inputString = scanner.nextLine();
        if(inputString.isEmpty())
            return;

        //StringBuilder bulider = new StringBuilder(inputString);
        //foreach(char letter : builder)


        //char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int sum = 0;
        for(int i = 0; i < inputString.length(); i++)
        {

            if(Character.isDigit(inputString.charAt(i)))
            {
                sum += inputString.charAt(i) - '0';
            }
        }
        System.out.println("Suma cyfr to " + sum);
    }
    public static void zad5()
    {
        Scanner scanner  = new Scanner(System.in);
        String inputString = scanner.nextLine();
        if(inputString.isEmpty())
            return;

        boolean ok = true;

        Stack<Character> parentasees = new Stack<>();
        for(int i=0; i < inputString.length(); i++)
        {
            if(inputString.charAt(i) == '(')
            {
                parentasees.push(inputString.charAt(i));
            }
            else if(inputString.charAt(i) == ')') {
                if(parentasees.empty())
                    ok = false;
                else
                    parentasees.pop();
            }
        }
        if(parentasees.empty() && ok)
        {
            System.out.println("Ok");
        }
        else
        {
            System.out.println("Bledne sparowanie nawaisow");
        }
    }
}

