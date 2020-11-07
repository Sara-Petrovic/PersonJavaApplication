/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package silab.sd.personapp.main;

import silab.sd.personapp.view.form.FrmPersonComponent;

/**
 *
 * @author Sara
 */
public class Main {
    
    public static void main(String[] args) {
        new FrmPersonComponent(null, true).setVisible(true);//prvo true je da li je forma modalna
    }
}
