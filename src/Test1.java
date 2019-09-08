

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        int a,b,ch;
        Scanner in=new Scanner(System.in);
        System.out.println("enter a:");
        a=in.nextInt();
        System.out.println("enter b:");
        b=in.nextInt();
        System.out.println("enter your choice:");
        System.out.println("1.add/n 2.sub/n 3.mutiply/n 4.divide/");
        ch=in.nextInt();
        switch (ch)
        {
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            default:
                System.out.println("enter right choice");
        }


    }
}
