import java.util.Scanner;

public class Pgm4 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);  
		int n=scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
		}
		int sum=a[0]+a[1];
		for(int i=3;i<n;i++){
			for(int j=2;j<i;j++){
				if(i%j==0){
					System.out.println(i+"->"+a[i]);
					sum+=a[i];
					break;
				}
			}
		}
		System.out.println(sum);
	}

}
