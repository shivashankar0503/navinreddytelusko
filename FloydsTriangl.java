 import java.util.*;
 public class FloydsTriangl{
    public static void main(String[] args) {
        int no=1;
       
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int space=n;
// no of line one loop
       for(int i=1;i<=n;i++){
        // forspaces  one loop
        for(int s=1;s<=space;s++){
            System.out.print(" ");
        }


//for printing one loop
        for(int j=1;j<=i;j++){
            System.out.print(no+ " ");
            no++;
        }
        System.out.println(" ");
        space--;
       }
   

        
    }
} 