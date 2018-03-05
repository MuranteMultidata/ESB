package com.multidata.myFirstProject;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.spring.Main;

public class MyFirstRoute extends RouteBuilder
{
    public static void main(String[] args) throws Exception
    {
        new Main().run(args);
    }
	@Override
	public void configure() throws Exception
	{
		from("file:/tmp/camel/input")
		.process(new MyFirstProcessor())
		.to("jms:TESTQ")
		.to("file:/tmp/camel/output");
	}
}