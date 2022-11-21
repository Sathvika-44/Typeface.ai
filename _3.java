import java.util.*;
class _3{
static int lcd(int n){
	int res=0;
	for(int i=0;i<=n;i++){			
		if(isGood(i)){
            	res++;
		}
	}
      return res;
}
public static boolean isGood(int n){
	boolean check=false;
	while(n>0){
		int k=n%10;
		if(k==2||k==5||k==6||k==9) check=true;
            if(k==3||k==4||k==7) return false;
   		n/=10;
	}
	return check;
}
public static void main(String [] args){
 	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	System.out.print(num+lcd(num));
}
}