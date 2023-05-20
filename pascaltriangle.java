import java.util.*;
public class pascaltriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=n;
       int  number=1;


//no of lines
for(int i=0;i<n;i++){
    // for no of spaces
    for(int s=1;s<=space;s++){
        System.out.print(" ");
    }
number=1;
for(int j=0;j<=i;j++){
   
    System.out.print(number+ " ");
    number=number*(i-j)/(j+1);

}
   System.out.println("");
   space--;
}


    }
    
}
