package com.simpleApp.simpleMavenApp;

import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Path("resource")
public class Resource {
	ObjectMapper mapper = new ObjectMapper();

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("testGet")
	public String test() {
		return "testGet";
	}

	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("testPost")
	public Response testPost(String input)
			throws JsonParseException, JsonMappingException, IOException {
		TestData testData = mapper.readValue(input, TestData.class);
		System.out.println(testData);
		return Response.status(201).entity("success: " + testData + "\n")
				.build();
	}

}
