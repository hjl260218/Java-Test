import java.util.Scanner;

public class Baekjoon2577 {
	public void baekjoon2577() {
		Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int num = A*B*C;
        int length = (int)(Math.log10(num)+1);
        int numArray[] = new int[length];
        int answer[] = new int[10];
        for(int i=0; i < length; i++) {
        	numArray[i] = num % 10;
        	num = num / 10;	
        	answer[numArray[i]]++;
        	}        
        
        for(int value:answer) {
        	System.out.println(value);
        }
        
        sc.close();
	}
}
