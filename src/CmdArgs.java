import java.util.Scanner;

public class CmdArgs {
    public static void main(String [] args){
        System.out.println("What is your name");
        Scanner scnr = new Scanner(System.in);
        System.out.println("Hi "+scnr.next());
    }
}
