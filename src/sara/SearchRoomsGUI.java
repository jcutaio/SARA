package sara;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jeff
 */
public class SearchRoomsGUI extends javax.swing.JFrame {

    /**
     * Creates new form SearchRoomsGUI
     */
    private ReservationSystem resSystem;
    private User user;
    private String timeSlot;
    private Room room;
    public SearchRoomsGUI(ReservationSystem resSystem, User user) {
        this.resSystem = resSystem;
        this.user = user;
        if (this.user != null) { System.out.println("made it to search"); }
        initComponents();
        
        errorLabel.setVisible(false);
        resultsDD.setVisible(false);
        reserveButton.setVisible(false);
        
        timeSlotDD.removeAllItems();
        minSeatsDD.removeAllItems();
        equipDD.removeAllItems();
        resultsDD.removeAllItems();
        
        timeSlotDD.addItem("8:00 AM");
        timeSlotDD.addItem("8:30 AM");
        timeSlotDD.addItem("9:00 AM");
        timeSlotDD.addItem("9:30 AM");
        timeSlotDD.addItem("10:00 AM");
        timeSlotDD.addItem("10:30 AM");
        timeSlotDD.addItem("11:00 AM");
        timeSlotDD.addItem("11:30 AM");
        timeSlotDD.addItem("12:00 PM");
        timeSlotDD.addItem("12:30 PM");
        timeSlotDD.addItem("1:00 PM");
        timeSlotDD.addItem("1:30 PM");
        timeSlotDD.addItem("2:00 PM");
        timeSlotDD.addItem("2:30 PM");
        timeSlotDD.addItem("3:00 PM");
        timeSlotDD.addItem("3:30 PM");
        timeSlotDD.addItem("4:00 PM");
        timeSlotDD.addItem("4:30 PM");
        
        minSeatsDD.addItem("1");
        minSeatsDD.addItem("2");
        minSeatsDD.addItem("3");
        minSeatsDD.addItem("4");
        minSeatsDD.addItem("5");
        minSeatsDD.addItem("6");
        minSeatsDD.addItem("7");
        minSeatsDD.addItem("8");
        minSeatsDD.addItem("9");
        minSeatsDD.addItem("10");
        minSeatsDD.addItem("12");
        minSeatsDD.addItem("13");
        minSeatsDD.addItem("14");
        minSeatsDD.addItem("15");
        minSeatsDD.addItem("16");
        
        equipDD.addItem("TV");
        equipDD.addItem("Projector");      
        equipDD.addItem("Whiteboard");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        timeSlotDD = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        minSeatsDD = new javax.swing.JComboBox();
        equipDD = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();
        resultsDD = new javax.swing.JComboBox();
        reserveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SARA - Search Rooms");

        timeSlotDD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        timeSlotDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeSlotDDActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setText("Time Slot");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setText("Minimum Seats");

        minSeatsDD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        equipDD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel4.setText("Equipment");

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        errorLabel.setForeground(new java.awt.Color(255, 0, 0));
        errorLabel.setText("No Available Rooms Found");

        resultsDD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        reserveButton.setText("Reserve");
        reserveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(resultsDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reserveButton))
                    .addComponent(errorLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancelButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(timeSlotDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(minSeatsDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(equipDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(85, 85, 85)
                        .addComponent(jLabel3)
                        .addGap(62, 62, 62)
                        .addComponent(jLabel4))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeSlotDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minSeatsDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equipDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cancelButton)
                    .addComponent(searchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultsDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reserveButton)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void timeSlotDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeSlotDDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeSlotDDActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        timeSlot = timeSlotDD.getSelectedItem().toString();
        int minSeats = Integer.parseInt(minSeatsDD.getSelectedItem().toString());
        String equip = equipDD.getSelectedItem().toString();
        
        String[] foundRooms = resSystem.findRooms(timeSlot, minSeats, equip, user.hasPriviliges());
        
        if (foundRooms.length != 0) {
            resultsDD.removeAllItems();
            for(String s : foundRooms) {
                resultsDD.addItem(s);
            }
            
            resultsDD.setVisible(true);
            reserveButton.setVisible(true);
            errorLabel.setVisible(false);
            
        } else { 
            resultsDD.setVisible(false);
            reserveButton.setVisible(false);
            errorLabel.setVisible(true);
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void reserveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserveButtonActionPerformed
        room = resSystem.roomSearch(Integer.parseInt(resultsDD.getSelectedItem().toString().substring(5)));
        System.out.println(room.toString());
        System.out.println(user.toString());
        if (user != null) { System.out.println("creating res"); }
        RoomReservation newRes = new RoomReservation(timeSlot, room, user);
        resSystem.addRoomReservation(newRes);
        ReservationSystem.save(resSystem);
        JOptionPane.showMessageDialog(null, "Room Reserved");
        this.dispose();
        
    }//GEN-LAST:event_reserveButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox equipDD;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox minSeatsDD;
    private javax.swing.JButton reserveButton;
    private javax.swing.JComboBox resultsDD;
    private javax.swing.JButton searchButton;
    private javax.swing.JComboBox timeSlotDD;
    // End of variables declaration//GEN-END:variables
}
