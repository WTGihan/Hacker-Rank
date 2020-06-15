import java.util.*;
public class Test {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,3,3,2,1};

        List<Integer> list = new ArrayList<>();
        int result=0;
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        int min=0;

        while(result!=1){
            int k=0;
            min=max;
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=0 && min>arr[i]){
                    min=arr[i];
                }
            }
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=0){
                    arr[i]=arr[i]-min;
                    k++;
                }
            }
            list.add(k);

            for(int i=0;i<arr.length;i++){
                if(arr[i]==0){
                    result=1;
                }
                else{
                    result=0;
                    break;
                }
            }
        }
        int arr1[]=new int[list.size()];
        for(int i=0;i<list.size();i++){

            arr1[i]=list.get(i);
        }
        for(int i=0;i<list.size();i++){
            System.out.println(arr1[i]);
        }


    }


}
