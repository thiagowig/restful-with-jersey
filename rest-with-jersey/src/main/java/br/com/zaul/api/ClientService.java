package br.com.zaul.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/client")
public class ClientService {

	@GET
	public Response getClient() {
		return Response.status(200).entity("The default Client").build();
	}
	
	@GET
	@Path("/{param}")
	public Response getClient(@PathParam("param") String param) {
		return Response.status(200).entity("The Client Is: " + param).build();
	}
	
}
