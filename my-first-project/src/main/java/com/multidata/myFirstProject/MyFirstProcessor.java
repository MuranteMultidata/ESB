package com.multidata.myFirstProject;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class MyFirstProcessor implements Processor
{
	public void process(Exchange exchange) throws Exception
	{
		String filename = (String) exchange.getIn().getHeader( "CamelFileName" );
		String subject = (String) exchange.getIn().getHeader( "Subject" );
		String from = (String) exchange.getIn().getHeader( "From" );
		String body = (String) exchange.getIn().getBody();
		System.out.println(filename + " " + from + " " + subject + " " + body);
	}
}