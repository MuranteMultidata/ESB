package com.multidata.myFirstProject;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

    public void start(BundleContext context)
    {
    	System.out.println("My first project START..");
    }

    public void stop(BundleContext context)
    {
    	System.out.println("My first project STOP");
    }

}