package models;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;

public class URLGenerator {
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPERATOR = "\n";
	
	public static void generateURL() throws IOException {
		FileInputStream in = null;
		BufferedReader reader = null;
		FileWriter writer = null;
		String all = "";
		try {
			in = new FileInputStream("URLFile/rogerLinks.csv");
			reader = new BufferedReader(new InputStreamReader(in));
			String line = "";
			all = reader.readLine();
			while ((line = reader.readLine()) != null) {
				String[] tokens = line.split(COMMA_DELIMITER);
				if (tokens.length > 0) {
					if (tokens.length < 5) {
						String campaignID = String.valueOf((int)(Math.random()*9000)+1000);
						String genURL = "http://sprtup.io/" + campaignID + 
								"?content=" + tokens[0] + 
								"?product_name=" + tokens[1] + 
								"?product_slug=" + tokens[2];
						genURL = convertToUrl(genURL).toString();
						line = tokens[0] + COMMA_DELIMITER +
								tokens[1] + COMMA_DELIMITER +
								tokens[2] + COMMA_DELIMITER +
								genURL + COMMA_DELIMITER +
								campaignID;
					}
					all = all + NEW_LINE_SEPERATOR + line;
				}
			}
		} catch(FileNotFoundException e) {
			System.out.println("File named inputParams.txt cannot be founds");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Not all parameters given in inputParams.txt");
			e.printStackTrace();
		} finally {
			reader.close();
			in.close();
		}
		try {
			File file = new File ("URLFile/rogerLinks.csv");
			if(file.delete()) {
				writer = new FileWriter("URLFile/rogerLinks.csv");
				writer.append(all);
			}
			else {
				writer = new FileWriter("URLFile/rogerLinksMod.csv");
				writer.append(all);
			}
		} finally {
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
