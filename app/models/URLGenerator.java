package models;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;

public class URLGenerator {
	public static void generateURL() throws IOException {
		FileInputStream in = null;
		BufferedReader reader = null;
		FileWriter writer = null;
		try {
			in = new FileInputStream("inputParams.txt");
			reader = new BufferedReader(new InputStreamReader(in));
			String campaignID = String.valueOf((int)(Math.random()*9000)+1000);
			String contentURL = reader.readLine();
			String productName = reader.readLine();
			String productSlug = reader.readLine();
			String output = "http://sprtup.io/" + campaignID + "?content=" + contentURL + 
					"?product_name=" + productName + "?product_slug=" + productSlug;
			output = convertToUrl(output).toString();
			writer = new FileWriter("outputURL.txt");
			writer.write(output);
		} catch(FileNotFoundException e) {
			System.out.println("File named inputParams.txt cannot be founds");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Not all parameters given in inputParams.txt");
			e.printStackTrace();
		} finally {
			reader.close();
			in.close();
			writer.close();
		}
	}
	
	private static URL convertToUrl(String urlStr) {
		URL url = null;
		try {
			url = new URL(urlStr);
		 	URI uri = new URI(url.getProtocol(), url.getUserInfo(), url.getHost(), 
		 			url.getPort(), url.getPath(), url.getQuery(), url.getRef());
		 	url = uri.toURL();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return url;
	}
	
	public static void main(String[] args) throws IOException {
		generateURL();
	}
}
