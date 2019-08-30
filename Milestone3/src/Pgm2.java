import java.util.Scanner;

public class Pgm2 {
	 public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
			int opt=scan.nextInt();
			int c=1,r=0;
			switch(opt){
			case 1:
				fun1(n);
				break;
			case 2:
				fun2(n);
				break;
			}
	}
	 public static void fun1(int n){
		int c=0,r=0;
		while((n-c)>=1){
			if(c%2==0)r+=(n-c);
			else r-=(n-c);
			//System.out.println((n-c)+"->"+r);
			c++;
		}
		System.out.println(r);
	 }
	 public static void fun2(int n){
		 int c=0,r=0;
			while((n-c)>=1){
				if(c==0)r+=(n-c);
				else if(c%2==0 && c!=0)r-=(n-c);
				else r+=(n-c);
				//System.out.println((n-c)+"->"+r);
				c++;
			}
			System.out.println(r);
	 }
}
