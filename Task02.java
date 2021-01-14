import java.util.*;

public class Task02{
  public int fib (int n){
    if(n==0){
      return 0;
    }
     else if(n==1 || n==2){
      return 1;
    }
      return fib(n-1) +fib(n-2);
  }
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    Task02 f = new Task02();
    int n = sc.nextInt();
    int x = 0;
    while(x<n-1){
    System.out.print(f.fib(x)+", ");
    x++;
    }
     System.out.print(f.fib(n-1));
  }
}