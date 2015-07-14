package controllers;

import play.mvc.*;
import views.html.*;

public class Application extends Controller {

    public static Result index() {
    	return ok(index.render("Link got messed up..sorry.."));
    }
    
    public static Result content(String id) {
    	/*
    	 * http://sprtup.io/1?content=http://www.iotnewsnetwork.com/connected-home/genican-your-garbage-can-just-got-smart/?product_name=Soma%20Carafe/?product_slug=soma-carafe
    	 */
    	routes.Application.index().absoluteURL(request());
    	String url = request().getQueryString("content");
    	String destinationURL= "http://www.sproutup.co";
    	String contentURL = "http://google.com";
    	String productSlug = "";
    	String productName = "";
    	
   	 	if (url!=null && url.length()>0){
    	
   	 		if (url.indexOf("?product_name=")!=-1) {
   	 		  contentURL = url.substring(0, url.indexOf("?product_name="));
    	
	   	 		if (url.indexOf("/?product_slug=")!=-1){
	   	 			productName = url.substring(url.lastIndexOf("product_name=")+("product_name=").length(), url.indexOf("/?product_slug"));
	   	 			productSlug = url.substring(url.lastIndexOf("product_slug=")+("product_slug=").length(), url.length());
	   	 			
	   	 			if (productSlug!=null)
	   	 				destinationURL = destinationURL + "/product/"+productSlug+"?refId=" + id + "&utm_source=sprtup";
	   	 		
	   	 		}
   	 		}
   	 	}
   	 	
    	
    	
//    	System.out.println("id " + id);
//    	System.out.println("url " + url);
//    	System.out.println("contentURL: " + contentURL);
//    	System.out.println("productName: " + productName);
//    	System.out.println("productSlug: " + productSlug);
//    	System.out.println("destinationURL: " + destinationURL);
   	 	
    	return ok(content.render(contentURL, productName, productSlug, destinationURL));
       
    }


}
