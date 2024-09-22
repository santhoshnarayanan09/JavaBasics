import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//Part A:
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int a,b1,b2,b3;
        float c,avg;
        char[] st1;
        char[] st2;
        int[]  p1 = new int[100];
        Scanner obj = new Scanner(System.in);
        System.out.print("Part A:\n A.1 Enter a Single digit Number:");
        a = obj.nextInt();
        a = a * a;
        System.out.println("Square of the number:" + a );
        System.out.print("A.2 Enter a three integers Number: \n");
        b1 = obj.nextInt();
        b2 = obj.nextInt();
        b3 = obj.nextInt();
        c = 3.0F;
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
        
        st1 = obj.next().toCharArray();
        for (char j : st1) {
            int y = 0;
            j = st2[y];
            y++;
        }


     // Part C:
        System.out.print("Part C:\n C.1 Enter a non-zero digit Number, terminated by 0:");
        while (true) {
            a = obj.nextInt();
            i = 0;
            if (a == 0) {
                break;
            }
            p1[i++] = a;
        }
        Arrays.sort(p1);
        for (i=0; i < p1.length; i++){
            System.out.println("" + p1[i]);
        }
    }
}