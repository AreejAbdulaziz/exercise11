import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //1. Develop a program that takes the weight (in kilograms) and height (in meters) as
        //input and calculates the BMI, then prints it.
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the weight in kilograms");
        int  weight=s.nextInt();
        System.out.println("Enter the height in meters");
        double  height=s.nextDouble();
        double result = Math.pow(height , 2);
        System.out.println("the BMI : " + weight/result);

        //2.Write a program that takes the obtained marks and total marks as input and
        //calculates the percentage, then prints it.
        System.out.println("Enter obtained marks");
        double  obtainedMark=s.nextDouble();
        if(obtainedMark > 100) {
            System.out.println("Invalid input");
            return;
        }
        int total = 100;
        System.out.println("percentage = " + obtainedMark/total*100 +"%");

        //3.Create a program that takes an amount in one currency and an exchange rate as
        //input, then converts and prints the amount in another currency.
        System.out.println("Enter Amount and New Currency:");
        double  oldCurrency=s.nextDouble();
        String currencyName=s.nextLine();
        System.out.println("Exchange Rate :");
        double  conversionRate=s.nextDouble();
        System.out.println("Amount in "+currencyName +" = " + oldCurrency*conversionRate);

        //4. Create a program that takes a string as input, calculates its length, and then reverses
        //the string using the StringBuilder class, finally printing both the length and reversed
        //string.

        System.out.println("Enter your text: ");
        String text=s.nextLine();
        StringBuilder sb =new StringBuilder(text);
        System.out.println(sb.reverse());


        //5. Develop a program that takes a sentence as input and extracts a substring from it,
        //then prints the extracted substring.
        System.out.println("Enter sentence : ");
        String A =s.nextLine();
        System.out.println(A.substring(10,20));

        //6.Write a program that takes a sentence and a keyword as input, then check if the
        //keyword is present in the sentence and prints the result.
        System.out.println("Enter sentence : ");
        String R=s.nextLine();
        System.out.println("Enter keyword : ");
        String keyword=s.nextLine();
        if(R.contains(keyword)) {
            System.out.println( "keyword " +keyword+ " is present in the sentence");
        }
        else {
            System.out.print("this keyword is not contained in the sentence");
        }

    //7. Develop a program that takes a sentence and a word to replace as input, then
        //replace all occurrences of the word with another word and prints the modified
        //sentence
        System.out.println("Enter sentence : ");
        String s1=new String( "The quick brown fox jumps over the lazy dog");
        System.out.println(s1);
        System.out.println(s1.replace("fox","cat"));


    //8.Write a program that takes two strings as input and check if they are equal, ignoring
        //the case, then prints whether they are equal or not.
        System.out.println("Enter input1 : ");
        String input1=s.nextLine();
        System.out.println("Enter input2 : ");
        String input2=s.nextLine();
        System.out.println(input1.equalsIgnoreCase(input2));
        }
    }
