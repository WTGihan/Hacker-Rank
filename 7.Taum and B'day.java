import java.util.*;
public class Test {

    public static void main(String[] args) {

        int b=27984;
        int w=1402;
        int bc=619246;
        int wc=615589;
        int z=247954;
        long cost=0;
        long cost1=0;
        long cost2=0;


        if(bc+z>wc+z) {
            cost1 = Long.valueOf(w) *Long.valueOf(wc) + Long.valueOf(b)* (Long.valueOf(wc) + Long.valueOf(z));
            cost2= Long.valueOf(bc) * Long.valueOf(b) + Long.valueOf(wc) *Long.valueOf(w);
            if(cost1>cost2) {
                cost = cost2;
            }
            else {
                cost = cost1;
            }
        }

        if(bc+z==wc+z){
            cost=Long.valueOf(bc) * Long.valueOf(b) + Long.valueOf(wc) *Long.valueOf(w);
            System.out.println("3");
        }

        if(wc+z>bc+z){
            cost1 = Long.valueOf(b) *Long.valueOf(bc) + Long.valueOf(w)* (Long.valueOf(bc) + Long.valueOf(z));
            cost2=Long.valueOf(bc) * Long.valueOf(b) + Long.valueOf(wc) *Long.valueOf(w);
                if(cost1>cost2) {
                    cost = cost2;
                }
                else {
                    cost = cost1;
                }
                

        }

        System.out.println(cost);
    }

}