import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;

import org.junit.*;

import play.mvc.*;
import play.test.*;
import play.data.DynamicForm;
import play.data.validation.ValidationError;
import play.data.validation.Constraints.RequiredValidator;
import play.i18n.Lang;
import play.libs.F;
import play.libs.F.*;
import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;


/**
*
* Simple (JUnit) tests that can call all parts of a play app.
* If you are interested in mocking a whole application, see the wiki for more details.
*
*/
public class ApplicationTest {

    @Test
    public void simpleCheck() {
        int a = 1 + 1;
        assertThat(a).isEqualTo(2);
    }

    @Test
    public void renderTemplate() {
        Content html = views.html.index.render("Your new application is ready.");
        assertThat(contentType(html)).isEqualTo("text/html");
        assertThat(contentAsString(html)).contains("Your new application is ready.");
    }
    
    @Test
    public void urlparser(){
    	String id = "88hjjkh87kjjkk";
    	String url;
    	//dehash
    	 url = "http://sprtup.i0/#http://www.iotnewsnetwork.com/connected-home/genican-your-garbage-can-just-got-smart/?product_name=Soma Crouse;product_slug=soma-crouse";
    	
    	String contentURL =  url.substring(url.indexOf("#")+1, url.indexOf("?product_name="));
    	String productName = url.substring(url.lastIndexOf("product_name=")+("product_name=").length(), url.indexOf(";product_slug"));
    	String productSlug = url.substring(url.lastIndexOf("product_slug=")+("product_slug=").length(), url.length());

    	System.out.println(contentURL);
    	System.out.println(productName);
    	System.out.println(productSlug);
    }


}
