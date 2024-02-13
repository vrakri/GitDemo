
public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String s = "Bepo Filip Vrankulj";
		String s2 = "Bepo Filip Vrankulj";
		
		String s3 = new String ("Good job");
		String s5 = new String ("Good job");
		
		String s = "Bepo Filip Vrankulj";
		String [] splittedString = s.split(" ");
		System.out.println (splittedString [0]);
		System.out.println (splittedString [1]);
		System.out.println (splittedString [2]);
		
		for(int i=0;i<s.length();i++)
	{
			System.out.println (s.charAt(i));
				
			
	}
		for(int i=s.length()-1;i>=0;i--)
		{
				System.out.println (s.charAt(i));
					
				
		}
	}

}
