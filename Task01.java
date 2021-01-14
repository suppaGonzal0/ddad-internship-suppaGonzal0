import java.util.*;

public class Task01{
  public int fac (int n){
    if(n<2){
      return n;
    }
    else{
      return fac(n-1) *n;
    }
  }
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    Task01 f = new Task01();
    System.out.println(f.fac(sc.nextInt()));
  }
}