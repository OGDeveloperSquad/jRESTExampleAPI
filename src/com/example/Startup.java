package com.example;

import java.io.IOException;

import com.og.jrest.routing.RouteTable;
import com.og.jrest.server.WebApi;

/**
 * This class is used to start the jRest request pipeline and do configuration for the app.
 * 
 * @author matthew.shoemaker
 *
 */
public class Startup {

	public static void main(String[] args) throws IOException {

		// Register a route with the routing engine
		RouteTable.registerRoute("Default", "api/{controller=Test}/{action=testMethod}/{id?}");

		// Fire the server and start the jREST application
		WebApi.start();
	}

}
