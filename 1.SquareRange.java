import java.lang.Math;
public class Test {
    //Find Square numbers through number range
    public static void main(String[] args) {

    int a=465868129;
    int b=988379794;
    int num=0;

    int num1=(int)Math.sqrt(a);
    int num2=(int)Math.sqrt(b);
    for(int i=num1;i<=num2;i++){
        int num3=i*i;
        if(num3>=a&&num3<=b){
            num++;
        }

    }

    System.out.println(num);

    }

}