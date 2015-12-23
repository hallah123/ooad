/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beanss;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author hallah
 */
@ManagedBean(name="bean",eager=true)
@ViewScoped
public class bean implements Serializable {
    public String bloodgroup;
    public String email;
    public String name;
    public ArrayList<String> list;
    public ArrayList<String> city;
    private Map<String,String> listdata;
    /**
     * Creates a new instance of bean
     */
    
    @PostConstruct
    public void init(){
        list.add("A-");
        list.add("A+");
        list.add("B-");
        list.add("B+");
        list.add("O+");
        list.add("O-");
        list.add("AB+");
        list.add("AB-");
       
        city.add("Rawalpindi");
        city.add("Islamabad");
        city.add("Lahore");
    }
    
    public bean() {
        list=new ArrayList<String>();
        listdata=new HashMap<String,String>();
        city=new ArrayList<String>();
    }
    
    public ArrayList<String> getCity(){
        return city;
    }
    
    
    public void setBloodgroup(String bg){
        bloodgroup=bg;
    }
    
    public String getBloodGroup(){
        return bloodgroup;
    }
    
    public void setListData(){
        listdata.put("A-", "A-");
        listdata.put("A+", "A+");
        listdata.put("B-", "B-");
        listdata.put("B+", "B+");
        listdata.put("AB-", "AB-");
        listdata.put("AB+", "AB+");
        listdata.put("O-", "O-");
        listdata.put("O+", "O+");
    }
    public ArrayList<String> getList(){
        return list;
    }
    
    public Map<String,String> getListData(){
        return listdata;
    }
        
    public void buttonAction(javax.faces.event.ActionEvent e) throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("ForgotPassword.xhtml");
    }
     
    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
        
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
