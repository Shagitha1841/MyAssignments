package week1.day2;

public class Find_Intersection {
	
	 

	public static void main(String[] args) {
		
		 int a[]= {3,2,11,4,6,7,12,14}; 
		 int b[]= {1,2,8,4,9,7,13,14};
		
		
		for (int i=0;i<a.length;i++) {
			
			for(int j=0;j<b.length;j++) {
				
				if(a[i]==b[j])
				{
					System.out.println("Match =" + a[j]);
					
				}
				
			}
				
		}
		

	}

}
