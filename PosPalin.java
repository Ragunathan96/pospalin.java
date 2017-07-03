import java.util.Scanner;


public class PosPalin {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        String sb=s.next();
		System.out.println(sb);
		String s2=("");
		String s3="";
		for(int i=0;i<sb.length();i++){
			s2=sb.substring(0,i)+sb.substring(i+1,sb.length());
			s3=new StringBuffer(s2).reverse().toString();
			if(s2.equals(s3)){
				System.out.println("The character "+sb.charAt(i)+ " at "+ "index "+i+" should be removed to become a palindrome");
				break;
			}
			
		}
	}

}
