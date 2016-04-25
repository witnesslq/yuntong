package com.yuntong.hibernate.database.po;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * TClientInfo generated by MyEclipse - Hibernate Tools
 */

public class TClientInfo  implements java.io.Serializable {


    // Fields    

     private Long clientId;
     private TMarketInfo TMarketInfo;
     private String clientCompany;
     private String clientName;
     private String clientPhone;
     private String clientEmail;
     private String clientPostId;
     private String clientAddress;
     private Date clientDate;
     private Set TRegisterInfos = new HashSet(0);


    // Constructors

    /** default constructor */
    public TClientInfo() {
    }

	/** minimal constructor */
    public TClientInfo(Long clientId) {
        this.clientId = clientId;
    }
    
    /** full constructor */
    public TClientInfo(Long clientId, TMarketInfo TMarketInfo, String clientCompany, String clientName, String clientPhone, String clientEmail, String clientPostId, String clientAddress, Date clientDate, Set TRegisterInfos) {
        this.clientId = clientId;
        this.TMarketInfo = TMarketInfo;
        this.clientCompany = clientCompany;
        this.clientName = clientName;
        this.clientPhone = clientPhone;
        this.clientEmail = clientEmail;
        this.clientPostId = clientPostId;
        this.clientAddress = clientAddress;
        this.clientDate = clientDate;
        this.TRegisterInfos = TRegisterInfos;
    }

   
    // Property accessors

    public Long getClientId() {
        return this.clientId;
    }
    
    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public TMarketInfo getTMarketInfo() {
        return this.TMarketInfo;
    }
    
    public void setTMarketInfo(TMarketInfo TMarketInfo) {
        this.TMarketInfo = TMarketInfo;
    }

    public String getClientCompany() {
        return this.clientCompany;
    }
    
    public void setClientCompany(String clientCompany) {
        this.clientCompany = clientCompany;
    }

    public String getClientName() {
        return this.clientName;
    }
    
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientPhone() {
        return this.clientPhone;
    }
    
    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    public String getClientEmail() {
        return this.clientEmail;
    }
    
    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getClientPostId() {
        return this.clientPostId;
    }
    
    public void setClientPostId(String clientPostId) {
        this.clientPostId = clientPostId;
    }

    public String getClientAddress() {
        return this.clientAddress;
    }
    
    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public Date getClientDate() {
        return this.clientDate;
    }
    
    public void setClientDate(Date clientDate) {
        this.clientDate = clientDate;
    }

    public Set getTRegisterInfos() {
        return this.TRegisterInfos;
    }
    
    public void setTRegisterInfos(Set TRegisterInfos) {
        this.TRegisterInfos = TRegisterInfos;
    }
   








}