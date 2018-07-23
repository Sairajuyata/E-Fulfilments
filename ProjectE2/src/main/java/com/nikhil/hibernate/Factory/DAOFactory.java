package com.nikhil.hibernate.Factory;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class DAOFactory {
	SessionFactory session_Factory =null;
	Session session=null;
	public Session getInstance() {
		try {
	Configuration cfg= new Configuration();
    cfg.configure();
       ServiceRegistryBuilder builder = new ServiceRegistryBuilder();
       builder = builder.applySettings(cfg.getProperties());
       ServiceRegistry registery = builder.buildServiceRegistry();
       session_Factory = cfg.buildSessionFactory(registery);
       session = session_Factory.openSession();
       
} catch (Exception e) {
    System.err.println(e);
	}finally {
//		session.close();
//		session_Factory.close();
	}
		return session;
}
}
		
