package com.jcs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//Part A:
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        // Java Ex. from Mentor - Eduard (5 Problems)
            //JavaEx();
            //ascii();
            //partc();
            //partd();
        //Basic Problems for Java
            // 1. Simple Calculator
            //calculator();
            // 2. Fibonacci Series
            //fibonacci();
            // 3. Prime Number
            //prime();
            //factorial();
            palindrome();
        //Basics 2 Problems (15 Problems)
        //Basics 3 Problems (20 Problems)
    }
    static void JavaEx(){
        int a,b1,b2,b3;
        double c,avg;
        String st1,st2 = "";
        int[] p1 = new int[100];
        boolean yn;
        Scanner obj = new Scanner(System.in);
        System.out.print("Part A:\n A.1 Enter a Single digit Number:");
        a = obj.nextInt();
        a = a * a;
        System.out.println("Square of the number:" + a );
        System.out.print("A.2 Enter a three integers Number: \n");
        b1 = obj.nextInt();
        b2 = obj.nextInt();
        b3 = obj.nextInt();
        c = 3.0;
        avg = (b1 + b2 + b3) / c;
        System.out.println("Average of 3 numbers:" + avg );
        System.out.println("A.3 Enter a sequence of positive numbers, 0 to end:");
        int i,i1 = 0;
        while (true) {
            i = obj.nextInt();
            if (i == 0){
                break;
            }
            if (i > i1){
                i1 = i;
            }
        }
        System.out.println("Largest number is:" + i1);
        System.out.println("A.4 Enter a string:");
        st1 = obj.next();
        for (i = st1.length() - 1; i >= 0 ; i--) {
            st2 += st1.charAt(i); //StringBuffer - StringBuilder
        }
        System.out.println("Reversed word:" +st2); //
    }
    static void ascii(){
        // Part B:
        System.out.println("Part - B \n B.1 - letters E, A, I, T, N, H, S ");
        System.out.print("Enter a word (consisting of letters E, A, I, T, N, H, S): ");
        Scanner obj = new Scanner(System.in);
        String input = obj.next().toUpperCase();
        boolean valid = false;
        System.out.println(input.length());
        System.out.println(input);
        for (int ii = 0; ii < input.length(); ii++) {
            char ch = input.charAt(ii);
            if (ch != 'E' && ch != 'A' && ch != 'I' && ch != 'T' && ch != 'N' && ch != 'H' && ch != 'S') {
                valid = true;
                break;
            }
        }
        if (valid == false) {
            raster(input);
        } else {
            System.out.println("Invalid input. Please use only letters E, A, I, T, N, H, S.");
        }
        System.out.println("B.2 - a pyramid of a height of N");
        int py = obj.nextInt();
        int count = 1;
        for(int i = 0; i < py; i++){
            for (int j = py - i; j>0; j--){
                System.out.print(" ");
            }
            for (int k = 1; k <= count; k++ ){
                System.out.print("*");
            }
            System.out.println();
            count += 2;
        }
        System.out.println("B.3 - a pyramid of a height of H with orientation o");
        int H = obj.nextInt();
        int O = obj.nextInt();
        switch (O){
            case 1:
                pyramid_one(H);
                break;
            case 2:
                pyramid_two(H);
                break;
            case 3:
                pyramid_three(H);
                break;
            case 4:
                pyramid_four(H);
                break;
        }
    }
    static void pyramid_one(int N){
        int count = 1;
        for(int i = 0; i < N; i++){
            for (int j = N - i; j>0; j--){
                System.out.print(" ");
            }
            for (int k = 1; k <= count; k++ ){
                System.out.print("*");
            }
            System.out.println();
            count += 2;
        }
    }
    static void pyramid_two (int N){
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = N - 1; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pyramid_three (int N){
        for (int i = N; i >= 1; i--) {
            for (int j = N - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pyramid_four (int N){
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = N - 1; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static String[] getchars(char ch) {
        String[] E = {
                "******",
                "*",
                "****",
                "*",
                "******"
        };
        String[] A = {
                "  ** ",
                "*    *",
                "******",
                "*    *",
                "*    *"
        };
        String[] I = {
                "*****",
                "  *  ",
                "  *  ",
                "  *  ",
                "*****"
        };
        String[] T = {
                "*****",
                "  *  ",
                "  *  ",
                "  *  ",
                "  *  "
        };
        String[] N ={
                "*****",
                "**  *",
                "* * *",
                "*  **",
                "*   *"
        };
        String[] H ={
                "*   *",
                "*   *",
                "*****",
                "*   *",
                "*   *"
        };
        String[] S={
                "*****",
                "*    ",
                " *** ",
                "    *",
                "*****"
        };
        switch (ch) {
            case 'T': return new String[]{
                    "*****",
                    "  *  ",
                    "  *  ",
                    "  *  ",
                    "  *  "
            };
            case 'H': return H;
            case 'E': return E;
            case 'A': return A;
            case 'I': return I;
            case 'N': return N;
            case 'S': return S;
            default: return new String[0];
        }
    }
    static void raster(String input) {
        int wl = input.length();
        for (int row = 0; row < 5; row++) {
            for (int i = 0; i < wl; i++) {
                char ch = input.charAt(i);
                String[] raster = getchars(ch);
                System.out.print(raster[row] + "  ");
            }
            System.out.println();
        }
    }
    static void partc(){
        // Part C:
        System.out.print("Part C:\n C.1 Enter a non-zero digit Number, terminated by 0:");
        Scanner obj = new Scanner(System.in);
        int a,i;
        ArrayList p1 = new ArrayList();
        while (true) {
            a = obj.nextInt();
            i = 0;
            if (a == 0) {
                break;
            }
            p1.add(a);
        }
        p1.sort(Comparator.reverseOrder());
        System.out.println("Descending order");
        for (i = 0; i < p1.size(); i++){
            System.out.println(p1.get(i));
        }

        System.out.print("Part C:\n C.2 A sequence of (at least three) positive integers terminated by a zero");


        Scanner scanner = new Scanner(System.in);

        int firstLargest = 0, secondLargest = 0, thirdLargest = 0;

        System.out.println("Enter positive integers (terminate with 0):");

        while (true) {
            int num = scanner.nextInt();

            if (num == 0) {
                break;  // Exit the loop if 0 is encountered
            }

            // Update the three largest numbers
            if (num > firstLargest) {
                thirdLargest = secondLargest;
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest) {
                thirdLargest = secondLargest;
                secondLargest = num;
            } else if (num > thirdLargest) {
                thirdLargest = num;
            }
        }

        if (thirdLargest == 0) {
            System.out.println("Not enough numbers were entered.");
        } else {
            System.out.println("The third largest number is: " + thirdLargest);
        }
    }
    static void partd(){
        int year;
        Scanner obj = new Scanner(System.in);
        System.out.println("Part D:\n D.1 a number of days in year Y, i.e. either 365 or 366");
        System.out.println("Enter a year (1970 - 3000): ");
        year = obj.nextInt();
        if (year < 1970 || year > 3000){
            System.out.println("Invalid year");
        }else{
            if(year % 4 == 0){ //divisible by 100 not leapyear
                System.out.println("Number of Days: 366");
            }else{
                System.out.println("Number of Days: 365");
            }
        }
        System.out.println("D.2  a number of days in month M of year Y.");
        System.out.println("Enter the month, year will be used from previous");
        int month = obj.nextInt();
        if (month <= 12 ){
            int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if (month == 2 && (year % 4 == 0)){
                days [2] = 29;
            }
            for (int ij = 0; ij < 12; ij++){
                if(days[ij] == month) {
                    System.out.println("Number of days" + month + "of year" + year + ":" + days[ij]);
                }
            }
        }
        System.out.println("D.3  an integer Y in range 1970 .. 3000, an integer M in range 1 .. 12, and an integer D in range 1 .. 31");
        Scanner scanner = new Scanner(System.in);
        // Input the year, month, and day
        System.out.print("Enter year (1970-3000): ");
        year = scanner.nextInt();

        System.out.print("Enter month (1-12): ");
        month = scanner.nextInt();

        System.out.print("Enter day (1-31): ");
        int day = scanner.nextInt();

        // Validate the input
        if (year < 1970 || year > 3000 || month < 1 || month > 12 || day < 1 || day > getDaysInMonth(year, month)) {
            System.out.println("Invalid date!");
        } else {
            int dayOfWeek = calculateDayOfWeek(year, month, day);
            String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
            System.out.println("Day of the week: " + days[dayOfWeek]);
        }
        scanner.close();
    }
    public static boolean LeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }
    public static int getDaysInMonth(int year, int month) {
        int []numberofdays = {31, 0, 31, 30, 31, 30,31, 31, 30, 31, 30, 31};
        if (month != 2){
            return numberofdays[month - 1];
        }
        if (LeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }

        }
    public static int calculateDayOfWeek(int year, int month, int day) {
        int totalDays = 0;
        // Add days from the years before the given year
        for (int i = 1970; i < year; i++) {
            if (LeapYear(i)) {
                totalDays += 366;
            } else {
                totalDays += 365;
            }
        }
        // Add days from the months before the given month in the current year
        for (int i = 1; i < month; i++) {
            totalDays += getDaysInMonth(year, i);
        }
        // Add days in the current month
        totalDays += day - 1;
        // 1st January 1970 was a Thursday, which corresponds to day 4 (0 = Sunday)
        int dayOfWeek = (totalDays + 4) % 7;
        return dayOfWeek;
    }
    public static void calculator(){
        System.out.println("\n ******* Calculator *******");
        double value, value1;
        double a,b,c,d;
        Scanner obj = new Scanner(System.in);
        System.out.println("\n Enter the values and choose the operation:");
        value = obj.nextDouble();
        value1 = obj.nextDouble();
        System.out.println(" Select the option: \n 1.Addition \n 2.Subraction \n 3.Multiplication \n 4.Division \n Select 0 to exit \n");
        int opt = obj.nextInt();
        switch (opt) {
            case 1:
                a = value + value1;
                System.out.println("Addition:" + a);
                break;
            case 2:
                b = value - value1;
                System.out.println("Subraction:" + b);
                break;
            case 3:
                c = value * value1;
                System.out.println("Multiplication:" + c);
                break;
            case 4:
                d = value / value1;
                System.out.println("Division: " + d);
                break;
            case 0:
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + opt);
        }

    }
    static void fibonacci() {
        //In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5 etc. The first two numbers of fibonacci series are 0 and 1.
        int a, b, c, d;
        System.out.println("\n Fibonacci Series -- \n Enter the first two numbers of the series: ");
        Scanner obj = new Scanner(System.in);
        System.out.println("\n Enter the first number:");
        a = obj.nextInt();
        System.out.println("\n Enter the Second number:");
        b = obj.nextInt();
        System.out.println("\n Enter the Maximum number of count to end the series:");
        c = obj.nextInt();
        if (a > 0 && b > 0) {
            for (int i = 0; i < c; i++) {
                d = a + b;
                System.out.println(d);
                a = b;
                b = d;
            }
        }
    }
        static void prime(){
        //Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words, prime numbers can't be divided by other numbers than itself or 1.
            // For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
        double a,b = 0, c = 0;
        System.out.println(" Prime Number \n Enter a number to check for prime number");
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();
        if (a > 1){
                b = a % 1;
                System.out.println(b);
                c = a % a;
                System.out.println(c); //have to check
            }
        if ( b == 0 && c ==0 ) {
                System.out.println("The number is prime");
            } else {
            System.out.println("The number is not prime:");
        }
        }
        static void palindrome(){
        //A palindrome number is a number that is same after reverse. For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers.
            // It can also be a string like LOL, MADAM etc
        String a,b;
        System.out.println("Palindrome: \n Enter a String:");
        Scanner obj = new Scanner(System.in);
        a = obj.toString();
        b = new StringBuilder(a).reverse().toString();
        if (a.equals(b)){
            System.out.println("The Given String is Palindorme");
        }else{
            System.out.println("The Given String is not Palindorme");
        }
        //diffrent approach, with words first with last/character comparision
        }
        static void factorial(){
        int a,b = 0;
        System.out.println("Factorial of a number:");
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();
        for (int i = 1; i <= a; i++){
            b = a * i;
        }
        System.out.println("Result:" + b);
        }
    }