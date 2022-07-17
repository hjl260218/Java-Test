import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon3052 {
	public void beakjooon3052(){
		Scanner sc = new Scanner(System.in);
		int result[] = new int[10];
		for(int i=0; i<10; i++) 
			result[i]=sc.nextInt()%42;
		System.out.println(Arrays.stream(result).distinct().count());
		sc.close();
	}
}
