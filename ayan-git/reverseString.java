package ayan;
import java.util.Scanner;

class reverseString {
public static void main(String args[]) {
    Scanner sc = new  Scanner(System.in);
    String rev = "";
    int turns = 0;
    while(turns<3){
    System.out.println("Enter a sentence");
    String s = sc.nextLine();
    //sc.close();
    for(int i =0;i<s.length();i++){
    char c = s.charAt(i);
    rev = c + rev;
    //turns++;
    //rev="";
}
turns++;
//sc.close();
System.out.println("Reverse of string is " + rev);
rev="";
}
}
}
