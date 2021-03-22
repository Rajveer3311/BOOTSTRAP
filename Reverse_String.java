public class Reverse_String
{
	public static void main(String[] args) 
	{
		String s="Rajveer";
		String v=" ";
		for ( int i=s.length()-1;i>=0 ;i-- ) {
			  v+=s.charAt(i);
		}
		System.out.println(v);
	}
}