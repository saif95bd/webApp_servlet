package saif.project;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class regUtil {

	public void saveData(String fn, String ln, String mn, Date dob)
	{
		
		SessionFactory sf= new AnnotationConfiguration().configure().buildSessionFactory();
		Session s= sf.getCurrentSession();
		Transaction tx= s.beginTransaction();
		reg newStudent= new reg();
		newStudent.setFirstName(fn);
		newStudent.setLastName(ln);
		newStudent.setMiddleName(mn);
		newStudent.setBirth(dob);
		s.save(newStudent);
		tx.commit();
	}

	public void saveData(reg newReg)
	{
		
		SessionFactory sf= new AnnotationConfiguration().configure().buildSessionFactory();
		Session s= sf.getCurrentSession();
		Transaction tx= s.beginTransaction();
		s.save(newReg);
		tx.commit();
	}

	public reg getData(String lastname)
	{
		reg data=null;
		String query_str;
		SessionFactory sf= new AnnotationConfiguration().configure().buildSessionFactory();
		Session s= sf.getCurrentSession();
		Transaction tx=s.beginTransaction();
		query_str="from reg where lastName like '"+lastname+ "'";
		Query QueryResult =  s.createQuery(query_str);
		List<reg> result= QueryResult.list();
		if(result.size()>0)
			data=(reg) result.get(0);
		return data;
	}
	
	public List<reg> getAllData(String lastname)
	{
		reg data=null;
		String query_str;
		SessionFactory sf= new AnnotationConfiguration().configure().buildSessionFactory();
		Session s= sf.getCurrentSession();
		Transaction tx=s.beginTransaction();
		query_str="from reg where lastName like '"+lastname+ "'";
		Query QueryResult =  s.createQuery(query_str);
		List<reg> result= QueryResult.list();
		if(result.size()>0)
			data=(reg) result.get(0);
		return result;
	}
	
	public boolean updateData(reg obj)
	{
		boolean updateResult= false;
		reg data=null;
		String query_str;
		SessionFactory sf= new AnnotationConfiguration().configure().buildSessionFactory();
		Session s= sf.getCurrentSession();
		Transaction tx=s.beginTransaction();
		
		query_str="from reg where id="+obj.getId();
		Query QueryResult =  s.createQuery(query_str);
		List<reg> result= QueryResult.list();
		if(result.size()>0)
		{
			data=(reg) result.get(0);
			data.setBirth(obj.getBirth());
			data.setFirstName(obj.getFirstName());
			data.setLastName(obj.getLastName());
			data.setMiddleName(obj.getMiddleName());
			s.update(data);
			updateResult=true;
		}	
		
		tx.commit();
		return updateResult;
	}
	
}
