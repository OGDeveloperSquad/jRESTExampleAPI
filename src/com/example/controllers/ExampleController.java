package com.example.controllers;

import com.og.jrest.annotation.Delete;
import com.og.jrest.annotation.Get;
import com.og.jrest.annotation.Patch;
import com.og.jrest.annotation.Post;
import com.og.jrest.annotation.Put;
import com.og.jrest.api.Controller;
import com.og.jrest.http.response.IResponse;
import com.og.jrest.http.response.TextResponse;

public class ExampleController extends Controller {

	@Get
	public IResponse get() {
		// Look, they have access to the request! Very cool
		String rawRequest = this.request.toString();
		return new TextResponse("Invoked the get method in the ExampleController:");
	}

	@Post
	public IResponse post() {
		// Look, they have access to the request! Very cool
		String rawRequest = this.request.toString();
		return new TextResponse("Invoked the post method in the ExampleController");
	}

	@Put
	public IResponse put() {
		// Look, they have access to the request! Very cool
		String rawRequest = this.request.toString();
		return new TextResponse("Invoked the put method in the ExampleController");
	}

	@Patch
	public IResponse patch() {
		// Look, they have access to the request! Very cool
		String rawRequest = this.request.toString();
		return new TextResponse("Invoked the patch method in the ExampleController");
	}

	@Delete
	public IResponse delete() {
		// Look, they have access to the request! Very cool
		String rawRequest = this.request.toString();
		return new TextResponse("Invoked the delete method in the ExampleController");
	}

}
