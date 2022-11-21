import java.util.*;
class _2{
public static void main(String [] args){
 	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();
	String s2=sc.next();
	int count=0;
	char ch=s2.charAt(s2.length()-1);
	for(int i=0;i<s1.length();i++){
		if(s1.charAt(i)==ch) count++;
	}
	System.out.print(count);
}
}