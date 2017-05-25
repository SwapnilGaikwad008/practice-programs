package Simple_Programs;

import java.net.URL;
import java.net.URLConnection;

public class InternetConnection {
	
	public static void main(String args[]){
		
		try {
			URL url = new URL("http://www.goggle.com");
			
			URLConnection connection = url.openConnection();
			connection.connect(); 
			
			System.out.println("Internet is working");
		} catch (Exception e) {
			System.out.println("Internet is not Working");
			e.printStackTrace();
		}
	}

}
