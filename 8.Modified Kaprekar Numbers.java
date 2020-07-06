import java.util.*;
public class Test {

    public static void main(String[] args) {
        int p=22222;
        int q=99999;
        for(int i=p;i<=q;i++){
            int num3=i;
            long l=Long.valueOf(num3);
            long val=l*l;
            String s1 = Long.toString(num3);
            int n1=s1.length();

            int num=10;
            for(int j=1;j<n1;j++){
                num=num*10;
            }
            long value=Long.valueOf(num);
            long num1=val/value;
            long num2=val%value;
            if(l==(num1+num2)){
                System.out.printf("%d ",num3);
            }
        }
        
    }

}