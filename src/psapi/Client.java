package psapi;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomElement;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class Client {

	public String psUrl;
	public WebClient client = new WebClient(BrowserVersion.CHROME);

	public Client(String psUrl, String user, String pass) {
		client.getOptions().setCssEnabled(false);
		client.getOptions().setJavaScriptEnabled(false);
		try {
			HtmlPage loginPage = client.getPage(psUrl);
			HtmlForm loginForm = loginPage.getFirstByXPath("//form[@id='LoginForm']");

			loginForm.getInputByName("account").setValueAttribute(user);
			loginForm.getInputByName("pw").setValueAttribute(pass);

			loginForm.getElementsByTagName("button").get(0).click();
		} catch (Exception e) {

		}

	}
	
	
	
	public HtmlPage get(String url) {
		
		try {
			return client.getPage(url);
		} catch (FailingHttpStatusCodeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	
	
	public List<DomElement> getAsHtml(String id) {
		
			return get(id).getElementsByIdAndOrName(id);
		
	}
	

}
