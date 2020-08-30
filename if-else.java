import java.io.*;
public class Solution {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        int N = scanner.nextInt();
       if(N%2 == 1||N%2 == 0 && 6<=N && N<=20)
        {
        System.out.println("Weird");
        }
        else if(N%2 == 0 && 2<=N && N<=5||N%2 == 0 && N>20)
        {
        System.out.println("Not Weird");
        }
    }
}
