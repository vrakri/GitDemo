import java.util.ArrayList;

public class CoreJavaBrushup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int[] arr2 = {1,2,4,5,6,7,8,9,10,122};
		  
		  //2,4,6,8,10,122
		 
		 for(int i=0;i<arr2.length;i++)
		  {
			  if (arr2 [i] %2 ==0)
		  {
			  System.out.println (arr2 [i]);
		 break;
		  }
		  else
			  {
				  System.out.println (arr2 [i] + " je broj koji nije djeljiv sa 2");
			  }	  
				  
		  }	  
		
		  ArrayList<String> a = new ArrayList<String>();
		  a.add("ana");
		  a.add("vlado");
		  a.add("kike");		  
		  a.remove(2);
		  a.add("bepo");
		  System.out.println(a.get(2));
		  
	for(int i=0;i<a.size();i++)
	{ 
		System.out.println (a.get(i));
	}
	for(String val:a)
	{ 
		System.out.println (val);
	}

	
	System.out.println (a.contains("bepo"));
	}

	  String[] name = {"ana", "ivan","kike", "filip", "vlado"};



}




