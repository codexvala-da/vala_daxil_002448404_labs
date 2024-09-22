/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author apple
 */
public class VitalSignsHistory {
    ArrayList<VitalSigns> history;

    public VitalSignsHistory() {
        this.history = new ArrayList<>();
    }
    
    public VitalSigns addNewVitals(){
        VitalSigns newVs = new VitalSigns();
        history.add(newVs);
        return newVs;
    }
    
    public void removeVitals(VitalSigns vs){
        history.remove(vs);
    }

    public ArrayList<VitalSigns> getHistory(){
        return history;
    }
}
