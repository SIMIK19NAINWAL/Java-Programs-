/*Write a program to check whether a given number is armstrong or not,using functions
  It should return 1 if number is armstrong else 0
 */


 import java.util.*;
class Armstrong{int s;
    public int ARM(){
        int on;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        on=sc.nextInt();
        int num=0,sum=0, d;on=num;
        while(num>0){
            d=num%10;
            sum=sum+(d*d*d);
            num=num/10;
        }
        if(on==sum){
            return (1);
        }
        else{
            return (0);
        }
    }int test(int z){ int d;
        if(z==0){
            return s;
        }else{
           d=z%10;
           s=s+(d*d*d);
           test(z/10);
        }return s;
    }
    public static void main(String args[]){
        Armstrong ob=new Armstrong();
        ob.ARM();ob.test(153);
    }
}