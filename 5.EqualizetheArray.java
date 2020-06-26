import java.util.*;
public class Test {

    public static void main(String[] args) {

        int arr[]={1,2,2,3};
        int max=0;
        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(max<count){
                max=count;
            }
            //
        }
        int result=arr.length-max;
        //System.out.println(arr.length);
        System.out.println(result);
    }

}