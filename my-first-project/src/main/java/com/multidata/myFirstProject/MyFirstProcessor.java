package com.multidata.myFirstProject;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class MyFirstProcessor implements Processor
{
	public void process(Exchange exchange) throws Exception
	{
		String filename = (String) exchange.getIn().getHeader( "CamelFileName" );
		System.out.println(filename);
	}
}