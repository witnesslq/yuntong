package com.yuntong.hibernate.database.po;

import java.util.HashSet;
import java.util.Set;


/**
 * TGrade generated by MyEclipse - Hibernate Tools
 */

public class TGrade  implements java.io.Serializable {


    // Fields    

     private Integer gradeId;
     private String gradeName;
     private Float gradeConsumption;
     private Float gradeRate;
     private Set TFactoryInfos = new HashSet(0);


    // Constructors

    /** default constructor */
    public TGrade() {
    }

	/** minimal constructor */
    public TGrade(Integer gradeId) {
        this.gradeId = gradeId;
    }
    
    /** full constructor */
    public TGrade(Integer gradeId, String gradeName, Float gradeConsumption, Float gradeRate, Set TFactoryInfos) {
        this.gradeId = gradeId;
        this.gradeName = gradeName;
        this.gradeConsumption = gradeConsumption;
        this.gradeRate = gradeRate;
        this.TFactoryInfos = TFactoryInfos;
    }

   
    // Property accessors

    public Integer getGradeId() {
        return this.gradeId;
    }
    
    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public String getGradeName() {
        return this.gradeName;
    }
    
    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public Float getGradeConsumption() {
        return this.gradeConsumption;
    }
    
    public void setGradeConsumption(Float gradeConsumption) {
        this.gradeConsumption = gradeConsumption;
    }

    public Float getGradeRate() {
        return this.gradeRate;
    }
    
    public void setGradeRate(Float gradeRate) {
        this.gradeRate = gradeRate;
    }

    public Set getTFactoryInfos() {
        return this.TFactoryInfos;
    }
    
    public void setTFactoryInfos(Set TFactoryInfos) {
        this.TFactoryInfos = TFactoryInfos;
    }
   








}