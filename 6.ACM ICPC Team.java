import java.util.*;
public class Test {

    public static void main(String[] args) {

        String[] topic={"10101","11100","11010","00101"};
        int max=0;
        int count2=0;
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<topic.length-1;i++){
            for(int j=i+1;j<topic.length;j++){
                char[] ch1 = topic[i].toCharArray();
                char[] ch2 = topic[j].toCharArray();
                int count=0;
                for(int l=0;l<ch1.length;l++){
                    if(ch1[l]=='1'||ch2[l]=='1'){
                        count++;
                    }
                }

                list.add(count);
            }
        }
        max=list.get(0);
        for(int i=1;i<list.size();i++){
            if(max<list.get(i)){
                max=list.get(i);
            }
        }
        for(int i=1;i<list.size();i++){
            if(max==list.get(i)){
                count2++;
            }
        }
        System.out.println(max);
        System.out.println(count2);
        

    }

}