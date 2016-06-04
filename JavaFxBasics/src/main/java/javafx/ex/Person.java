/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx.ex;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author adam
 */
public class Person {
    private StringProperty firstName = new SimpleStringProperty(this,"firstName","");

    public StringProperty firstNamePerson() {
        return firstName;
    }
    
    public String getFristname(){
        return firstName.get();
    }

    public void setFirstName(StringProperty firstName) {
        this.firstName = firstName;
    }

    void setFirstName(String name) {
         this.firstName.set(name);
     }
    
    

    

     
    
    
    
}
