package org.acme.quickstart;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.util.Random;

@Path("/randomname")
public class NameGen {
	private String name[] = {
		"AkhilJoshi",
		"Manish",
		"Abhik Chakraborty",
		"Tushar",
		"Rohan Mishra",
		"Shubham Vashisht",
		"Rishi",
		"Rohan Maity (KaenDagger)",
		"Lichtut"
	};
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
		Random r = new Random();
		int stt = r.nextInt(9);
		String ans = name[stt];
		return ans;
    }
}