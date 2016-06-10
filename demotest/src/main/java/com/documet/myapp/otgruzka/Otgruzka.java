package com.documet.myapp.otgruzka;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Otgruzka {

	
	public String getDocumetn(){
		
		
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
	
		
		String s = doc.getCAMPAIGNNUMBER() + " " +doc.getNUMBER() + " "+doc.getHEAD().getPACKINGSEQUENCE().getPOSITION().get(0).getDESCRIPTION() + " RRR ";
		
		return s;


	}
	
	
	
}
