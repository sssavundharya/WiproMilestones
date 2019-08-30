import java.util.Scanner;

public class Pgm1 {
 public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	int c=scan.nextInt();
	int n=scan.nextInt();
	int dif1=0,dif2=0;
	if(a>0 && b>0 && c>0){
		dif1=Math.abs(a-b);
		dif2=Math.abs(b-c);
	}
	else if(a>0 && b<0 && c<0){
		int t=a-b;
		String t1="-"+t+"";
		dif1=Integer.parseInt(t1);
		dif2=c-b;
		//System.out.println(dif1+"->"+dif2);
		
	}
	else if(a<0 && b<0 && c<0){
		dif1=a-b;
		dif2=b-c;
	}
	int r=c;
	for(int i=4;i<=n;i++){
		if(i%2==0){
			r+=dif1;
		}
		else{
			r+=dif2;
		}
	}
	System.out.println(r);
}
}
