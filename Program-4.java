import java.util.*;
class Program4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] res = Test.solve(arr);

        for(int i=1; i<=9; i++){
            int key = i;
            int freq = res[i];

            if(i == 1)
                System.out.print("{"+i+": "+ res[i]+", ");
            else if(i < 9)
                System.out.print(i+": "+ res[i]+", ");
            else
                System.out.print(i+": "+ res[i]+"} ");
        }
    }

    public static int[] solve(int[] nums){
        int[] res = new int[11];

        for(int num : nums){
            for(int i=1; i<=9; i++){
                if(num % i == 0)
                    res[i]++;
            }
        }
        return res;
    }
}