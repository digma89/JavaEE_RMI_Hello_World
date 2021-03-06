package com.rmi.client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import com.rmi.demo.Hello;
import com.rmi.demo.RMIConstant;
public class HelloClient {
	public static void main (String[] args)throws RemoteException, NotBoundException
	{
		try
		{			
			Registry registry=LocateRegistry.getRegistry("localhost",RMIConstant.RPORT);
			Hello h = (Hello)registry.lookup(RMIConstant.RID);
			System.out.println (h.say());
		}
		catch (Exception e)
		{
				System.out.println ("Hello client exception: " + e);
		}
	}
}