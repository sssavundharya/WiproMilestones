import java.util.Scanner;

public class Pgm5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);  
		int n=scan.nextInt();
		String s=n+"";
		char a[]=s.toCharArray();
		int count=0;
			int t=s.length()-1;
			for(int i=0;i<s.length()/2;i++){
				if(a[i]!=a[t]){
					count=1;
					String x=a[i]+"";
					String y=a[t]+"";
					if(a[i+1]==a[t])System.out.print(a[i]);
					else System.out.print(a[t]);
					break;
				}
				t--;
		}
		if(count==0)System.out.println("-1");
	}

}
