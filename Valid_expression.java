/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Valid_expression
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int count=0,proceed=0,i;
		for(i=0;i<str.length();i++){
		    if(str.charAt(i)=='('){
		        count+=1;
		    }
		    if(str.charAt(i)==')'){
		        count-=1;
		    }
		    if(str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='/'||str.charAt(i)=='*'|| str.charAt(i)=='%'){
		        if(Character.isLetter(str.charAt(i-1)) && Character.isLetter(str.charAt(i+1))){
		            proceed=1;
		        }
		        else{
		            proceed=0;
		        }
		    }
		}
		 if(count==0 && proceed==1){
		     System.out.println("Valid");
		 }
		 else{
		     System.out.println("Invalid");
		 }
		
	}
}
