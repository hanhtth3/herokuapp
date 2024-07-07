package com.baymax.sky.features.addelements;

import java.util.Date;

public class Person {
    private int id;
    private String name;
    private Date birthdate;
    private String gender;
    private String hometown;
    private String adress;
    private Date fromdate;
    private Date todate;

    public Person (int id, String name, Date birthdate, String gender, String hometown, String adress, Date fromdate, Date todate ){
        this.id=id;
        this.name=name;
        this.birthdate=birthdate;
        this.gender=gender;
        this.hometown=hometown;
        this.adress=adress;
        this.fromdate=fromdate;
        this.todate=todate;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
           this.id=id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }

    public Date getBirthdate(){
        return birthdate;
    }
    public  void setBirthdate(Date birthdate){
        this.birthdate=birthdate;
    }

    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender=gender;
    }

    public String getHometown(){
        return hometown;
    }
    public void setHometown(String hometown){
        this.hometown=hometown;
    }

    public String getAdress(){
        return adress;
    }
    public void setAdress(String adress){
        this.adress=adress;
    }

    public Date getFromdate(){
        return fromdate;
    }
    public void setFromdate(Date fromdate) {
        this.fromdate = fromdate;
    }

    public Date getTodate() {
        return todate;
    }
    public void setTodate(Date todate) {
        this.todate = todate;
    }
}