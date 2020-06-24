import java.util.*;
public class Test {

    public static void main(String[] args) {
        String s="a";
        long n=1000000000;
        long count=0;
        char[] ch = s.toCharArray();
        int j=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='a'){
                count++;
            }

        }
        long l=ch.length;
        long m=n/l;
        long t=n-m*l;
        long count1=0;
        if(t>0) {
            for (int i = 0; i < t; i++) {
                if (ch[i] == 'a') {
                    count1++;
                }
            }
        }
        long count2=count1+count*m;
        System.out.println(count2);

    }


}