package se.idioti.example.jaxrs.rest.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

/**
 * Hello world!
 *
 */
public class KaraokeClient  {
    public static void main( String[] args ) {
    	Client client = Client.create();
    	WebResource resource = client.resource("http://localhost:8080/song");
    	String response = resource.path("Macarena").get(String.class);
    	
    	System.out.println(response);
    }
}
