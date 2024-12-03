package PersonalFinance;

import java.util.Scanner;

public class Expense {
    public static void main(String[] args) {
        //variables to store a expense name, date, amount, category
        Scanner kb = new Scanner(System.in);
        System.out.println("Description:");
        String description1 = kb.nextLine();
        System.out.println("Date:");
        String date1 = kb.nextLine();
        System.out.println("Amount:");
        double amount1 = kb.nextDouble();

        kb.nextLine();//avoid empty line
        System.out.println("Category:");
        String category1 = kb.nextLine();

        //expense 2
        System.out.println();
        System.out.println("Description:");
        String description2 = kb.nextLine();
        System.out.println("Date:");
        String date2 = kb.nextLine();
        System.out.println("Amount:");
        double amount2 = kb.nextDouble();

        kb.nextLine();//avoid empty line
        System.out.println("Category:");
        String category2 = kb.nextLine();

        //output each expense in one line
        //output total spent so far
        System.out.println();
        System.out.println("Date \t Description \t Category \t Value");
         System.out.println(date1 + "\t" + description1 + "\t"+
                category1 + "\t  $" + amount1 +"\t");
        System.out.println(date2 + "\t" + description2 + "\t"+
                category2 + "\t  $" + amount2 +"\t");
        System.out.println("Total Spent: $" + (amount1 +amount2));
        //homework
        //System.out.format(); or a library research and fix our output
    }
}
