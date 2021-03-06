package com.yuntong.hibernate.database.po;



/**
 * TAgioInfo generated by MyEclipse - Hibernate Tools
 */

public class TAgioInfo  implements java.io.Serializable {


    // Fields    

     private Integer agioId;
     private TAgioType TAgioType;
     private TRegisterInfo TRegisterInfo;
     private Float agioMoney;
     private String agioInfo;


    // Constructors

    /** default constructor */
    public TAgioInfo() {
    }

	/** minimal constructor */
    public TAgioInfo(Integer agioId) {
        this.agioId = agioId;
    }
    
    /** full constructor */
    public TAgioInfo(Integer agioId, TAgioType TAgioType, TRegisterInfo TRegisterInfo, Float agioMoney, String agioInfo) {
        this.agioId = agioId;
        this.TAgioType = TAgioType;
        this.TRegisterInfo = TRegisterInfo;
        this.agioMoney = agioMoney;
        this.agioInfo = agioInfo;
    }

   
    // Property accessors

    public Integer getAgioId() {
        return this.agioId;
    }
    
    public void setAgioId(Integer agioId) {
        this.agioId = agioId;
    }

    public TAgioType getTAgioType() {
        return this.TAgioType;
    }
    
    public void setTAgioType(TAgioType TAgioType) {
        this.TAgioType = TAgioType;
    }

    public TRegisterInfo getTRegisterInfo() {
        return this.TRegisterInfo;
    }
    
    public void setTRegisterInfo(TRegisterInfo TRegisterInfo) {
        this.TRegisterInfo = TRegisterInfo;
    }

    public Float getAgioMoney() {
        return this.agioMoney;
    }
    
    public void setAgioMoney(Float agioMoney) {
        this.agioMoney = agioMoney;
    }

    public String getAgioInfo() {
        return this.agioInfo;
    }
    
    public void setAgioInfo(String agioInfo) {
        this.agioInfo = agioInfo;
    }
   








}