package psapi;

public class ClientTest {

	
	
	
	
	
	
	
	public static void main(String...args) {
		Client c = new Client("https://powerschool.bcsc.k12.in.us/public/home.html", "vasuvicky","potato21");
		System.out.println(c.get("https://powerschool.bcsc.k12.in.us/guardian/home.html").asText());
		
		
		
	
		
		
		
	}
}

