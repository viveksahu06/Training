import java.util.*; 
public class Calculator{
	public static void main(String []args){
		int a=10; 
		int b=20;  
		char op='+'
		if(op=='+') System.out.println(sum(a,b)); 
		else if(op=='-') System.out.println(sub(a,b));
		else if(op=='*') System.out.println(mul(a,b));
		else if(op=='/') System.out.println(div(a,b));  
		else System.out.println("enter correct ope");
	}
}