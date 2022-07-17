import java.util.*;

public class Baekjoon4344 {
	public void method1(){
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int n;

		for(int i=0; i<c;i++) {
			n = sc.nextInt();
			int sum=0;
			int array[] = new int[n];
			float l=0;
			
			for(int j=0; j<n;j++) {
				array[j]=sc.nextInt();
				sum+=array[j];
			}
			for(int j=0; j<n;j++) {
				if(array[j]>sum/n) 	l++;
			}
			System.out.println(String.format("%.3f", l/n*100)+"%");
		}
		
	}
	
}
