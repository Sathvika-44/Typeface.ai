import java.util.*;
class _1{
static String convertToBase3(int n){
 	if(n<0) return "-"+convertToBase3(-n);
	if(n<3) return Integer.toString(n);
	return convertToBase3(n/3)+convertToBase3(n%3);
}
public static void main(String [] args){
 	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	String s=convertToBase3(num);
	System.out.print(s);
}
}