package psapi;

import java.util.ArrayList;
import java.util.List;

import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import psapi.util.Course;

public class ClientTest {

	
	
	
	
	
	
	
	public static void main(String...args) {
		Client c = new Client("https://powerschool.bcsc.k12.in.us/public/home.html", "vasuvicky","GREN_vos8baiw");
		HtmlPage page = c.get("https://powerschool.bcsc.k12.in.us/guardian/home.html");
		
		ArrayList<Course> courses = new ArrayList<>();
		
		List<HtmlElement> items = (List<HtmlElement>) page.getByXPath("//tr[@class='center']");

		HtmlElement classElement = items.get(0).getFirstByXPath("//td[@align='left']");
		String className = classElement.asText();
		className = className.substring(0, className.indexOf("\n"));
		
		List<HtmlElement> quarters =  (List<HtmlElement>) items.get(0).getByXPath("//td");
		
		
		
		
		System.out.println(quarters.get(0).asText());
		
	}
}

