import java.util.*;
public class Test {

    public static void main(String[] args) {

        List<Integer> a = Arrays.asList(1);
        List<Integer> b = Arrays.asList(100);

        int max1 = Collections.max(a);
        int max2 = Collections.max(b);
//        System.out.println(max1);
//        System.out.println(max2);
        int max = 0;
        if(max1 > max2) {
            max = max1;
        }
        else {
            max = max2;
        }

        int count = 0;
        for(int i=a.get(0); i<= max; i++) {
            int set1 = 0;
            int set2 = 0;

            for(int j=0; j< a.size(); j++) {

                if(i%a.get(j)!=0) {
                    set1 = 1;
                    break;
                }
            }

            if(set1 == 0) {
//                System.out.println(i);
                for(int k=0; k< b.size(); k++) {
                    if(b.get(k)%i!=0) {
                        set2 = 1;
                        break;
                    }
                }
                if(set2 == 0) {
                    System.out.println(i);
                    count++;
                }

            }
        }
        System.out.println(count);

    }

}



