package com.example.controllers;

import com.og.jrest.annotation.Delete;
import com.og.jrest.annotation.Get;
import com.og.jrest.annotation.Patch;
import com.og.jrest.annotation.Post;
import com.og.jrest.annotation.Put;
import com.og.jrest.api.Controller;
import com.og.jrest.http.Header;
import com.og.jrest.http.HeaderCollection;
import com.og.jrest.http.Verb;
import com.og.jrest.http.response.IResponse;
import com.og.jrest.http.response.Response;
import com.og.jrest.http.response.TextResponse;
import com.og.jrest.http.response.XMLResponse;

public class ExampleController extends Controller {

	@Get
	public IResponse get() {
		// Look, the api implementer has access to the request through the Controller base class! Very cool
		String body = this.request.getBody();
		Verb verb = this.request.getVerb();
		HeaderCollection headers = this.request.getHeaders();

		// They can build whatever response they want!
		Response response = new TextResponse("Invoked the get method in the ExampleController");
		response.addHeader(new Header("foo", "bar"));
		response.setStatusCode(200);

		return response;
	}

	@Post
	public IResponse post() {
		return new XMLResponse("<root>Invoked the post method in the ExampleController</root>");
	}

	@Put
	public IResponse put() {
		return new TextResponse("Invoked the put method in the ExampleController");
	}

	@Patch
	public IResponse patch() {
		return new TextResponse("Invoked the patch method in the ExampleController");
	}

	@Delete
	public IResponse delete() {
		return new TextResponse("Invoked the delete method in the ExampleController");
	}

}
