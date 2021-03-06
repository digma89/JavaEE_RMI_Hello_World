package com.rmi.server;

import java.nio.channels.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import com.rmi.demo.RMIConstant;
public class HelloServer {
	
public static void main (String[] argv) throws RemoteException, AlreadyBoundException
{
	try
{
		HelloImpl h = new HelloImpl("Hello, world!");
		Registry registry=LocateRegistry.createRegistry(RMIConstant.RPORT);
		registry.bind(RMIConstant.RID,h);
		System.out.println("server started");
}
catch (Exception e)
{
	System.out.println ("Hello server failed: " + e);
	}
	}
}