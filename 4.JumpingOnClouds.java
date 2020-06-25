import java.util.*;
public class Test {

    public static void main(String[] args) {

        int c[]={0,0,0,1,0,0};
        int i=0;
        int count=0;
        while(i!=c.length-1){
            System.out.println(i);
            if(i+2<c.length&&c[i+2]==0){
               i=i+2;
               count++;
            }
            else if(c[i+1]==0){
                i=i+1;
                count++;
            }
        }
        System.out.println(count);
    }
    
}