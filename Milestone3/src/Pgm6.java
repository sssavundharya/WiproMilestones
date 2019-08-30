import java.util.Scanner;

public class Pgm6 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);  
		String s1=scan.next();
		String s2=scan.next();
		int pin=scan.nextInt();
		String p=pin+"";
		int n=scan.nextInt();
		char a[]=s1.toCharArray();
		char b[]=s2.toCharArray();
		String s="",l="";
		if(s1.length()>s2.length()){
			s=s2;
			l=s1;
		}
		else if(s1.length()<s2.length()){
			s=s1;
			l=s2;
		}
		else{
			if(s1.length()==s2.length()){
				for(int i=0;i<s1.length();i++){
					if(a[i]<b[i]){
						s=s1;
						l=s2;
						break;
					}
					else if(a[i]>b[i]){
						l=s2;
						s=s1;
						break;
					}
				}
			}
		}
		//System.out.println(l+" ->"+s);
		String res=s.substring(s.length()-1)+l+p.charAt(n-1)+p.charAt(p.length()-n-1);
		System.out.println(res);

	}

}
