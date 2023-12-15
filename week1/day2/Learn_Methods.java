package week1.day2;

public class Learn_Methods {

 String launchBrowsers(String browserName) 
	 {
		 
	  System.out.println("browser is launched successfully!");
	  return "chrome";
	   
	 }
	 public void loadUrl(){
		 System.out.println("Application url loaded successfully");
		  
	  }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Learn_Methods met = new Learn_Methods();
		String launchBrowsers = met.launchBrowsers("chrome");
		System.out.println(launchBrowsers);
		met.loadUrl();

	}

}
