package BaiTapStack.check;

import java.util.Scanner;
import java.util.Stack;

public class Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String inputString = scanner.nextLine();
        if (isDecent(inputString)) {
            System.out.println("decent!!");
        } else {
            System.out.println("invalid");
        }
    }

    public static boolean isDecent(String string) {
        Stack<String> listChar = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            if (string.substring(i, i + 1).equals("(")) {
                listChar.push(string.substring(i, i + 1));
            }
            if (string.substring(i, i + 1).equals(")")) {
                if (listChar.isEmpty()) {
                    return false;
                }
                listChar.pop();
            }
        }
        if (listChar.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}