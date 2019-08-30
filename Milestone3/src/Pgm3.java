import java.util.ArrayList;
import java.util.Scanner;

public class Pgm3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);  
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		int n3=scan.nextInt();
		int n4=scan.nextInt();
		int n5=scan.nextInt();
		String s1=n1+" "+n2+" "+n3+" "+n4+" "+n5;
		//ArrayList<Integer>stable=new ArrayList<Integer>();
		//ArrayList<Integer>unstable=new ArrayList<Integer>();
		int stable=0,unstable=0;
		for(String s:s1.split(" ")){
			String t="";
			if(s.length()<=2)stable+=Integer.parseInt(s);
			else{
				for(int i=0;i<s.length();i++){
					if(!t.contains(s.substring(i,i+1)))t+=s.substring(i,i+1);
				}
				if(t.length()*2==s.length()||t.length()==s.length())stable+=Integer.parseInt(s);
				else unstable+=Integer.parseInt(s);
			}
		}

		System.out.println(stable-unstable);

	}

}
