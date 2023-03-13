import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[]nums=new int[N];
        for (int i=0; i<nums.length;i++){
            nums[i]=in.nextInt();
        }
        int min= nums[1];
        int sr=0;
        int sum=0;

        for(int i=0;i<nums.length;i++) {
            sum = sum+nums[i];
            if (nums[i]<min){
                min=nums[i];
            }
        }
        System.out.println(min+(sum/nums.length));
    }
}