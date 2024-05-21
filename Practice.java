// sum of digits of given number

import java.util.Scanner;
public class Practice {
  public static void main(String[] args) {
    System.out.println("please start");
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    int sum = 0;
    for(int i=0 ; i<num ; ){
    sum += num % 10;
    num /=  10;
    }
    System.out.println("sum is :" + sum);
  }
}