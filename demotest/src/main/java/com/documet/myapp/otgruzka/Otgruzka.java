package com.documet.myapp.otgruzka;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.beans.factory.annotation.Autowired;

//import com.documet.myapp.entities.SPRORDERSOUTINVDET;

public class Otgruzka {

	@Autowired
    private EntityManager entityManager;
	
	public String getDocumetn(){
		
		/*final String databaseUrl = "jdbc:firebirdsql:localhost/3050:sprinter_curent";
		final String user = "SYSDBA";
		final String password = "sysadmin";
		String result = "no responce";
		
		//driver initialization
		try {
			Class.forName("org.firebirdsql.jdbc.FBDriver").newInstance();
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Connection conn=null;
		
		try {
			conn = DriverManager.getConnection(
					databaseUrl,
					user, password);
			
			if (conn == null){
				result = "could not connect to database";
			}
			
			Statement stmt = conn.createStatement();
			//ResultSet rs = stmt.executeQuery("select * from SPRORDERSOUTINVDET (583950,621,0,0,1, Null,Null,0,0)");

			
			ResultSet pos = stmt.executeQuery("select * from SPRORDERSOUTINV (621,'09.05.2016','09.05.2016',0,Null,0) where OUTCOMEINVOICEIDSSET = 5991581");
			int nColumnsCount = pos.getMetaData().getColumnCount();
			while(pos.next())
			{
				System.out.println();
				for (int n=1;n < nColumnsCount+1;n++)
				{
					Object obj = pos.getObject(n);
					if (obj!=null)
					{
						System.out.print(obj+" | ");
					}
				}
			}
			
			System.out.println();
			System.out.println("---------------------");
			
			ResultSet rs = stmt.executeQuery("select * from SPRORDERSOUTINVDET (583950,621,0,0,1, Null,Null,0,0)");
			nColumnsCount = rs.getMetaData().getColumnCount();
			while(rs.next())
			{
				System.out.println();
				for (int n=1;n < nColumnsCount+1;n++)
				{
					Object obj = rs.getObject(n);
					if (obj!=null)
					{
						System.out.print(obj+" (<-"+n+") ");
					}
				}
			}
			
			stmt.close();
			conn.close();
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		*/
		
		File xml = new File("E:/Temp/test.xml");
		 JAXBContext jc;
		 Unmarshaller u;
		 RootDocument doc = new RootDocument();
		 
		try {
			jc = JAXBContext.newInstance(RootDocument.class);
			 u = jc.createUnmarshaller();
			 doc = (RootDocument) u.unmarshal(xml);
		} catch (JAXBException e) {
			
			e.printStackTrace();
		}
		/*try {
		Query q = entityManager.createQuery("select SNAME from AGENTS where id=11");
		String ss = (String) q.getSingleResult();
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAA "+ ss);
		} catch(Exception e) {
			e.printStackTrace();
			
		}*/
		
		
		
		//spr.getData();
		String s = doc.getCAMPAIGNNUMBER() + " " +doc.getNUMBER() + " "+doc.getHEAD().getPACKINGSEQUENCE().getPOSITION().get(0).getDESCRIPTION() + " RRR ";
		
		return s;


	}
	
	
	
}
