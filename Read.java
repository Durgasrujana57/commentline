import java.util.Scanner;
 class Read {
   public static void main(String args[]) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
     int A[]=new int[n];
     for(int i=0;i<A.length;i++)
     {
      A[i]=in.nextInt();
     }
     for(int x:A)
     System.out.println(x);
     }
    }   
