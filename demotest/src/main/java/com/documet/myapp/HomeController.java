package com.documet.myapp;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.documet.myapp.DAO.OtgruzkaDAO;
import com.documet.myapp.otgruzka.Document;
import com.documet.myapp.otgruzka.Otgruzka;
import com.documet.myapp.otgruzka.RootDocument;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private OtgruzkaDAO O_DAO;
	  
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		//RootDocument dadv = new RootDocument();
		List<Document> docs = O_DAO.getDocuments();
		String formattedDate = dateFormat.format(date) + "  " +" SIZE "+ docs.size() + " "+ docs.get(0).getAGENTSNAME();
		System.out.println(formattedDate);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
}
