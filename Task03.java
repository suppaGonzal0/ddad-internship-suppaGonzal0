import java.util.*;
public class Task03{
  static boolean palindrome(String s){
    if(s.length() == 0 || s.length() == 1){
      return true; 
    }
    if(s.charAt(0) == s.charAt(s.length()-1)){
      return palindrome(s.substring(1, s.length()-1));
    }
    return false;
  }
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    boolean flag = true;
    String s = sc.next().toUpperCase();
    Task03 f = new Task03();
    flag =f.palindrome(s);
    if(flag==true){
      int x = s.length()%2;
      switch(x){
        case 0:
          System.out.println("Even Palindrome");
          break;
        case 1:
          System.out.println("Odd Palindrome");
      }
    }
    else{
      System.out.println("Not a Palindrome");
    }
  }
}