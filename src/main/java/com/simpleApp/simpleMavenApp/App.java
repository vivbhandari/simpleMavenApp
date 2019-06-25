package com.simpleApp.simpleMavenApp;

import java.net.URI;

import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

/**
 * Hello world!
 *
 */
public class App {
	static String BASE_URI = "http://0.0.0.0:8080/app/v1";

	public static void main(String[] args) {
		System.out.println("Hello World!");
		final ResourceConfig rc = new ResourceConfig()
				.packages("com.simpleApp.simpleMavenApp");
		GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI), rc);
	}
}
