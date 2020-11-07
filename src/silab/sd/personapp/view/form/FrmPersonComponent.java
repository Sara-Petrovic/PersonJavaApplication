/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package silab.sd.personapp.view.form;


import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Sara
 */
public class FrmPersonComponent extends javax.swing.JDialog {

    /**
     * Creates new form FrmPersonComponent
     */
    public FrmPersonComponent(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        prepareComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSave = new javax.swing.JButton();
        inputFirstname = new silab.sd.personapp.view.component.InputTextfieldPanel();
        inputLastname = new silab.sd.personapp.view.component.InputTextfieldPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSave))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 25, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133)
                .addComponent(btnSave)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        //uzmi vrednost za ime
        

        //sta je problem ovde? sta ako iz komponente ne uzimamo tekst? npr. za datum
        //moze li na jedinstveni nacin da se uzme vrednost iz bilo koje komponente?? uzeti text ili radiobutton na isti nacin
        //treba interfejs getvalue
        //imace samo jednu metodu getValue
        //svaki panel implementira taj interfejs
        //String firstname = inputFirstname.getTxtValue().getText().trim();
        try {
            String firstname = inputFirstname.getValue().toString();
            //validacija ne mora da se radi ovde u formi, vec getValue ako je validacija dobra vraca vrednost ako ne baca izuzetak koji obradjujemo
            //if (firstname.isEmpty()) {
            //    inputFirstname.getLblErrorValue().setText("Ime je obavezno polje.");
            //}

            
            JOptionPane.showMessageDialog(this, "Ime: "+firstname);    
           


        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Validacija nije prosla.");   
        }

        try {
            //uzmi vrednost za prezime
            String lastname = inputLastname.getValue().toString();
             JOptionPane.showMessageDialog(this, "Prezime: "+lastname);    
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Validacija nije prosla.");            }
            
            
    }//GEN-LAST:event_btnSaveActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private silab.sd.personapp.view.component.InputTextfieldPanel inputFirstname;
    private silab.sd.personapp.view.component.InputTextfieldPanel inputLastname;
    // End of variables declaration//GEN-END:variables

    private void prepareComponents() {
        inputFirstname.getLblText().setText("Firstname:");
        inputFirstname.getLblErrorValue().setText("");

        inputLastname.getLblText().setText("Lastname:");
        inputLastname.getLblErrorValue().setText("");
    }
}