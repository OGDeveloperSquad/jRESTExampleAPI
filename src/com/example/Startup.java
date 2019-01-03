package com.example;

import java.io.IOException;

import com.og.jrest.logging.Log;
import com.og.jrest.routing.RouteTable;
import com.og.jrest.server.WebApi;

public class Startup {

	public static void main(String[] args) throws IOException {

		Log.info("Building Routes:\n");

		// Register a route with the routing engine
		RouteTable.registerRoute("Default", "api/{controller=Test}/{action=testMethod}/{id?}");

		// Fire the server and start the jREST application
		WebApi.start();
	}

}
