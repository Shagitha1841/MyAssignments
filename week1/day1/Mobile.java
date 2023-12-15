package week1.day1;

public class Mobile {
	
    public  String makeCall(String mobileModel , float mobileWeight){
    	  
    	  System.out.println("welcome to Mobile World");
    	  return mobileModel+" , "+mobileWeight ;
      }
    public String  sendMsg(boolean isfullyCharged , int mobilecost) {
    	  
    	  
    	 System.out.println(" Exclusive Mobile Offer!!");
    	return isfullyCharged+" , "+mobilecost;
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile mbl = new Mobile();
		 String mobile=mbl.makeCall("vivo",  1.25f);
		 System.out.println(mobile);
	    String msg=mbl.sendMsg( true,25000);
		System.out.println(msg);
		System.out.println("This is My  Mobile");
		

	}

}
