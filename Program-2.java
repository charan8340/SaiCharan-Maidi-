import java.util.*;
class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int count = 0;
        for(int i=1; count < a; i++) {
            if (i % 2 != 0) {
                count++;
                if(count == a)
                    System.out.println(i);
                else
                    System.out.print(i + ", ");
            }
        }
    }
}