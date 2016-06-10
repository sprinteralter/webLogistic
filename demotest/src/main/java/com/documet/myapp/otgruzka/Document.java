package com.documet.myapp.otgruzka;

//import java.sql.*;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Document {
	@Id
	private int ID;
    private java.sql.Date DOCDATE;
    private Integer CLIENTID;
    private String CLIENTSNAME;
    private String CLIENTNAME;
    private Integer STOREID;
    private String STORESNAME;
    private String STORENAME;
    private String OUTCOMEINVOICEIDSSET;
    private Double ENDSUMM;
    private Double ENDSUMMWITHOVERH;
    private String comment;
    private Double OVERHSUMM;
    private Integer BEEPRESLINKID;
    private String BEEPRESSTORE;
    private java.sql.Timestamp BEEPRESSENDTIME;
    private java.sql.Date TERMDATE;
    private Integer PAYTYPEID;
    private String PAYTYPESNAME;
    private String COMMENT1;
    private String COMMENT2;
    private Integer PRICETYPEID;
    private String PRICETYPESNAME;
    private String USEREDIT;
    private java.sql.Timestamp TIMEEDIT;
    private Integer AGENTID;
    private String AGENTSNAME;
    private Double ITEMSSUMM;
    private Float DISCOUNT;
    private Float SPECDISCOUNT;
    private Integer OK_PASSED;
    private String CLIENTADRESSLOCATION;
    private Integer CLIENTCLASS1;
    
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public java.sql.Date getDOCDATE() {
		return DOCDATE;
	}
	public void setDOCDATE(java.sql.Date dOCDATE) {
		DOCDATE = dOCDATE;
	}
	public int getCLIENTID() {
		return CLIENTID;
	}
	public void setCLIENTID(int cLIENTID) {
		CLIENTID = cLIENTID;
	}
	public String getCLIENTSNAME() {
		return CLIENTSNAME;
	}
	public void setCLIENTSNAME(String cLIENTSNAME) {
		CLIENTSNAME = cLIENTSNAME;
	}
	public String getCLIENTNAME() {
		return CLIENTNAME;
	}
	public void setCLIENTNAME(String cLIENTNAME) {
		CLIENTNAME = cLIENTNAME;
	}
	public int getSTOREID() {
		return STOREID;
	}
	public void setSTOREID(int sTOREID) {
		STOREID = sTOREID;
	}
	public String getSTORESNAME() {
		return STORESNAME;
	}
	public void setSTORESNAME(String sTORESNAME) {
		STORESNAME = sTORESNAME;
	}
	public String getSTORENAME() {
		return STORENAME;
	}
	public void setSTORENAME(String sTORENAME) {
		STORENAME = sTORENAME;
	}
	public String getOUTCOMEINVOICEIDSSET() {
		return OUTCOMEINVOICEIDSSET;
	}
	public void setOUTCOMEINVOICEIDSSET(String oUTCOMEINVOICEIDSSET) {
		OUTCOMEINVOICEIDSSET = oUTCOMEINVOICEIDSSET;
	}
	public double getENDSUMM() {
		return ENDSUMM;
	}
	public void setENDSUMM(double eNDSUMM) {
		ENDSUMM = eNDSUMM;
	}
	public double getENDSUMMWITHOVERH() {
		return ENDSUMMWITHOVERH;
	}
	public void setENDSUMMWITHOVERH(double eNDSUMMWITHOVERH) {
		ENDSUMMWITHOVERH = eNDSUMMWITHOVERH;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public double getOVERHSUMM() {
		return OVERHSUMM;
	}
	public void setOVERHSUMM(double oVERHSUMM) {
		OVERHSUMM = oVERHSUMM;
	}
	public int getBEEPRESLINKID() {
		return BEEPRESLINKID;
	}
	public void setBEEPRESLINKID(int bEEPRESLINKID) {
		BEEPRESLINKID = bEEPRESLINKID;
	}
	public String getBEEPRESSTORE() {
		return BEEPRESSTORE;
	}
	public void setBEEPRESSTORE(String bEEPRESSTORE) {
		BEEPRESSTORE = bEEPRESSTORE;
	}
	public java.sql.Timestamp getBEEPRESSENDTIME() {
		return BEEPRESSENDTIME;
	}
	public void setBEEPRESSENDTIME(java.sql.Timestamp bEEPRESSENDTIME) {
		BEEPRESSENDTIME = bEEPRESSENDTIME;
	}
	public java.sql.Date getTERMDATE() {
		return TERMDATE;
	}
	public void setTERMDATE(java.sql.Date tERMDATE) {
		TERMDATE = tERMDATE;
	}
	public int getPAYTYPEID() {
		return PAYTYPEID;
	}
	public void setPAYTYPEID(int pAYTYPEID) {
		PAYTYPEID = pAYTYPEID;
	}
	public String getPAYTYPESNAME() {
		return PAYTYPESNAME;
	}
	public void setPAYTYPESNAME(String pAYTYPESNAME) {
		PAYTYPESNAME = pAYTYPESNAME;
	}
	public String getCOMMENT1() {
		return COMMENT1;
	}
	public void setCOMMENT1(String cOMMENT1) {
		COMMENT1 = cOMMENT1;
	}
	public String getCOMMENT2() {
		return COMMENT2;
	}
	public void setCOMMENT2(String cOMMENT2) {
		COMMENT2 = cOMMENT2;
	}
	public int getPRICETYPEID() {
		return PRICETYPEID;
	}
	public void setPRICETYPEID(int pRICETYPEID) {
		PRICETYPEID = pRICETYPEID;
	}
	public String getPRICETYPESNAME() {
		return PRICETYPESNAME;
	}
	public void setPRICETYPESNAME(String pRICETYPESNAME) {
		PRICETYPESNAME = pRICETYPESNAME;
	}
	public String getUSEREDIT() {
		return USEREDIT;
	}
	public void setUSEREDIT(String uSEREDIT) {
		USEREDIT = uSEREDIT;
	}
	public java.sql.Timestamp getTIMEEDIT() {
		return TIMEEDIT;
	}
	public void setTIMEEDIT(java.sql.Timestamp tIMEEDIT) {
		TIMEEDIT = tIMEEDIT;
	}
	public int getAGENTID() {
		return AGENTID;
	}
	public void setAGENTID(int aGENTID) {
		AGENTID = aGENTID;
	}
	public String getAGENTSNAME() {
		return AGENTSNAME;
	}
	public void setAGENTSNAME(String aGENTSNAME) {
		AGENTSNAME = aGENTSNAME;
	}
	public double getITEMSSUMM() {
		return ITEMSSUMM;
	}
	public void setITEMSSUMM(double iTEMSSUMM) {
		ITEMSSUMM = iTEMSSUMM;
	}
	public float getDISCOUNT() {
		return DISCOUNT;
	}
	public void setDISCOUNT(float dISCOUNT) {
		DISCOUNT = dISCOUNT;
	}
	public float getSPECDISCOUNT() {
		return SPECDISCOUNT;
	}
	public void setSPECDISCOUNT(float sPECDISCOUNT) {
		SPECDISCOUNT = sPECDISCOUNT;
	}
	public int getOK_PASSED() {
		return OK_PASSED;
	}
	public void setOK_PASSED(int oK_PASSED) {
		OK_PASSED = oK_PASSED;
	}
	public String getCLIENTADRESSLOCATION() {
		return CLIENTADRESSLOCATION;
	}
	public void setCLIENTADRESSLOCATION(String cLIENTADRESSLOCATION) {
		CLIENTADRESSLOCATION = cLIENTADRESSLOCATION;
	}
	public int getCLIENTCLASS1() {
		return CLIENTCLASS1;
	}
	public void setCLIENTCLASS1(int cLIENTCLASS1) {
		CLIENTCLASS1 = cLIENTCLASS1;
	}
    
    
}
