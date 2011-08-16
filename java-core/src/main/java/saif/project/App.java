package saif.project;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.text.DateFormatter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */


public class App 
{
    public static void main( String[] args )
    {
    	System.out.print("starts:");
    	regUtil myReg= new regUtil();
    	SimpleDateFormat df= new SimpleDateFormat("dd/mm/yyyy");
    	Date d = null;
		try {
			d = (Date) df.parse("15/02/2002");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Insert data
//    	myReg.saveData("saif2", "shams", "middle", d);
		
		/* find a data by last name*/
		reg r;
		r=myReg.getData("shams");
		if(r==null)
			System.out.print("Data not found.");
		else{
			System.out.print("\nFirst name:");
			if(r.getFirstName()==null)
				System.out.print("None");
			else
				System.out.print(r.getFirstName());
			System.out.print("\nMiddle name:");
			if(r.getMiddleName()==null)
				System.out.print("None");
			else
				System.out.print(r.getMiddleName());
			System.out.print("\nLast name:");
			if(r.getLastName()==null)
				System.out.print("None");
			else
				System.out.print(r.getLastName());
			System.out.print("\nDOB:");
			if(r.getBirth()==null)
				System.out.print("None");
			else
				System.out.print(r.getBirth().toString());
			r.setFirstName("sm");
			r.setBirth(d);
			myReg.updateData(r);
			/* Edit an existing data*/
			
//			System.out.print("F.name:"+r.getFirstName()+"\nM.name:"+r.getMiddlename()+"\nL.name:"+r.getLastName()+"\nDob:"+r.getBirth().toString());
		}


 /*   	String fn="saif";
    	String ln="shams";
    	String mn="nai";
    	
		SessionFactory sf= new AnnotationConfiguration().configure().buildSessionFactory();
		Session s= sf.getCurrentSession();
		Transaction tx=s.beginTransaction();
		s.beginTransaction();
		reg newStudent= new reg();
		newStudent.setFirstName(fn);
		newStudent.setLastName(ln);
		newStudent.setMiddlename(mn);
		Date dob= new Date("15-feb-2002");
		newStudent.setBirth(dob);
		s.save(newStudent);
		tx.commit();
*/    }	
    }
