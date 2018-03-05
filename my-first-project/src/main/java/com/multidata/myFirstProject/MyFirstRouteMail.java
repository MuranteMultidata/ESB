package com.multidata.myFirstProject;

import java.util.Scanner;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class MyFirstRouteMail extends RouteBuilder
{
	public static void main(String[] args) throws Exception
	{
		CamelContext ctx = new DefaultCamelContext();
		
		ctx.addRoutes(new MyFirstRouteMail());
//		ctx.addRoutes(new MyFirstRoute());
		
		ctx.start();
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		ctx.stop();
		sc.close();
	}

	@Override
	public void configure() throws Exception
	{
		from("imaps://imap.gmail.com?username=esb@multidata.org&password=multidata" +
				"&delete=false&unseen=true&consumer.delay=6000")
		.process(new MyFirstProcessor())
		.to("file:/tmp/camel/output");
	}
}
