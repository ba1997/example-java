package org.jacoco.examples.maven.java;//variable test webhooks

public class HelloWorld {

	public String getMessage(boolean bigger) {
		if (bigger) {
			return "Hello Universe!";
		} else {
			return "Hello World!";
		}
	}

}
