import java.util.Scanner;

public class Baekjoon1546 {
	public void method1() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float jumsu[] = new float[n];
		float max=0;
		float sum=0;
		for(int i=0; i<n; i++) {
			jumsu[i]=sc.nextInt();
			if(max < jumsu[i])
				max = jumsu[i];
		}
		for(int i=0; i<n; i++) {
			jumsu[i]=jumsu[i]/max*100;
			sum=sum+jumsu[i];
		}
		System.out.println(sum/n);		
		sc.close();
	}
}
