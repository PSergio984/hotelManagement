
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author Eric
 */
public class checkOut extends javax.swing.JFrame {
    
    /**
     * Creates new form checkOut
     */
    public checkOut() {
        initComponents();
        populateTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRoomData = new javax.swing.JPanel();
        btnCheckOut = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRooms = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        txtRoomSearch = new javax.swing.JTextField();
        txtCpNum = new javax.swing.JTextField();
        lblRoomNumberSr = new javax.swing.JLabel();
        txtInDate = new javax.swing.JTextField();
        txtCustName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtOutDate = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPricePerDay = new javax.swing.JTextField();
        txtDays = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlRoomData.setBackground(new java.awt.Color(242, 242, 242));
        pnlRoomData.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(28, 25, 41), 5, true));
        pnlRoomData.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCheckOut.setBackground(new java.awt.Color(153, 255, 153));
        btnCheckOut.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        btnCheckOut.setForeground(new java.awt.Color(0, 0, 0));
        btnCheckOut.setText("Check-Out");
        btnCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOutActionPerformed(evt);
            }
        });
        pnlRoomData.add(btnCheckOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 300, -1, -1));

        tblRooms.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tblRooms.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Room Number", "Customer Name", "Custome Phone Number", "Room Type", "Price", "Room Size", "Check-In Date", "Check-Out Date", "Reservation Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRooms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRoomsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRooms);

        pnlRoomData.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 1130, 350));

        btnSearch.setBackground(new java.awt.Color(51, 204, 255));
        btnSearch.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        pnlRoomData.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, -1, -1));

        txtRoomSearch.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtRoomSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoomSearchActionPerformed(evt);
            }
        });
        txtRoomSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRoomSearchKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRoomSearchKeyTyped(evt);
            }
        });
        pnlRoomData.add(txtRoomSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 80, 30));

        txtCpNum.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        pnlRoomData.add(txtCpNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 170, 180, 40));

        lblRoomNumberSr.setBackground(new java.awt.Color(0, 0, 0));
        lblRoomNumberSr.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblRoomNumberSr.setForeground(new java.awt.Color(0, 0, 0));
        lblRoomNumberSr.setText("Room Number:");
        pnlRoomData.add(lblRoomNumberSr, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 170, 30));

        txtInDate.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtInDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInDateActionPerformed(evt);
            }
        });
        pnlRoomData.add(txtInDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 180, 40));

        txtCustName.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        pnlRoomData.add(txtCustName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 180, 40));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Customer Name");
        pnlRoomData.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 170, 40));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Check-In Date");
        pnlRoomData.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 160, 40));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Check-Out Date");
        pnlRoomData.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 170, 40));

        txtOutDate.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        pnlRoomData.add(txtOutDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 180, 40));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Customer Mobile Number");
        pnlRoomData.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 130, 260, 40));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        pnlRoomData.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 130, 80, 40));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Price Per Day");
        pnlRoomData.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 150, 40));

        txtPricePerDay.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        pnlRoomData.add(txtPricePerDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 180, 40));

        txtDays.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        pnlRoomData.add(txtDays, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 180, 40));

        txtTotal.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        pnlRoomData.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 180, 40));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Total Amount");
        pnlRoomData.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, -1, 40));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("No. of Days Stay");
        pnlRoomData.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, -1, 40));

        btnBack.setBackground(new java.awt.Color(204, 0, 0));
        btnBack.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        pnlRoomData.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 20, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Check-Out");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 25, 41), 3));
        pnlRoomData.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, 49));

        getContentPane().add(pnlRoomData, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

    // Get the text entered in the search field
    String searchRoomNumber = txtRoomSearch.getText();

    // Check if the entered value is a valid integer
    if (searchRoomNumber.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter a room number.");
        return;
    }

    // Check if the entered value is a valid integer
    try {
        int roomNumber = Integer.parseInt(searchRoomNumber);
        if (roomNumber < 0) {
            JOptionPane.showMessageDialog(this, "Please enter a valid positive room number.");
            return;
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Please enter a valid integer room number.");
        return;
    }


    // Create a TableRowSorter for the table's model
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>((DefaultTableModel) tblRooms.getModel());
    tblRooms.setRowSorter(sorter);

    // Define a RowFilter to filter rows based on room number
    RowFilter<Object, Object> rowFilter = RowFilter.regexFilter(searchRoomNumber, 0); // 1 is the column index of room number

    // Apply the filter to the TableRowSorter
    sorter.setRowFilter(rowFilter);        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtInDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInDateActionPerformed

    private void txtRoomSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoomSearchActionPerformed

    }//GEN-LAST:event_txtRoomSearchActionPerformed

    private void btnCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOutActionPerformed
                                         
   // Get the selected row index
    int selectedRow = tblRooms.getSelectedRow();
    
    // Make sure a row is selected
    if (selectedRow != -1) {
        // Get the data from the selected row
        DefaultTableModel model = (DefaultTableModel) tblRooms.getModel();
        int roomNumber = (int) model.getValueAt(selectedRow, 0); // Room number
        String checkInDate = (String) model.getValueAt(selectedRow, 6); // Check-in date
        String checkOutDate = (String) model.getValueAt(selectedRow, 7); // Check-out date
        String reservationStatus = "Available"; // Set reservation status to Available
        
        // Update room information in the rooms list
        Rooms roomToUpdate = null;
        for (Rooms room : HotelNibra.rooms) {
            if (room.getRoomNumber() == roomNumber) {
                roomToUpdate = room;
                break;
            }
        }
        if (roomToUpdate != null) {
            // Update room details
            roomToUpdate.setCheckInDate("N/A");
            roomToUpdate.setCheckOutDate("N/A");
            roomToUpdate.setReservationStatus("available");
            
            // Update the room file
            updateRoomsTextFile(HotelNibra.rooms);
        } else {
            JOptionPane.showMessageDialog(this, "Error: Selected room not found.");
            return;
        }
        
        // Update user information
        User user = User.getUserForRoom(roomNumber);
        if (user != null) {
            // Change the roomCheckIn attribute of the selected user to -1
            user.setroomCheckIn(-1);
            
            // Update the user text file
            user.updateUsersTextFiles();
        } else {
            JOptionPane.showMessageDialog(this, "Error: User for selected room not found.");
            return;
        }
        
        // Display a message to indicate successful check-out
        JOptionPane.showMessageDialog(this, "Room checked out successfully!");
        
        // Refresh the table
        populateTable();
    } else {
        JOptionPane.showMessageDialog(this, "Please select a room to check out.");
    }
             
    }//GEN-LAST:event_btnCheckOutActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        HomePage homePage = new HomePage();
        homePage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtRoomSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRoomSearchKeyPressed
      
    }//GEN-LAST:event_txtRoomSearchKeyPressed

    private void txtRoomSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRoomSearchKeyTyped
       JTextField txt1 = (JTextField) evt.getSource();
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtRoomSearchKeyTyped

    private void tblRoomsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRoomsMouseClicked
      // Get the selected row index
    int selectedRow = tblRooms.getSelectedRow();
    
    // Make sure a row is selected
    if (selectedRow != -1) {
        // Get the data from the selected row
        DefaultTableModel model = (DefaultTableModel) tblRooms.getModel();
        String roomNumber = model.getValueAt(selectedRow, 0).toString();
        String price = model.getValueAt(selectedRow,4).toString();
        String checkInDate = model.getValueAt(selectedRow, 6).toString();
        String checkOutDate = model.getValueAt(selectedRow, 7).toString();
        String custName = model.getValueAt(selectedRow, 1).toString();
        String cpNo = model.getValueAt(selectedRow, 2).toString();
        
        System.out.println(checkOutDate);
        System.out.println(checkInDate);
        
        dateCalculator(checkInDate,checkOutDate,price);
        
        txtInDate.setText(checkInDate);
        txtOutDate.setText(checkOutDate);
        txtPricePerDay.setText(price);
       txtCustName.setText(custName);
       txtCpNum.setText(cpNo);
        txtRoomSearch.setText(roomNumber);
        int noOfDays;
        int totalAmount;
        
    }
    }//GEN-LAST:event_tblRoomsMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(checkOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(checkOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(checkOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(checkOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new checkOut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCheckOut;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRoomNumberSr;
    private javax.swing.JPanel pnlRoomData;
    private javax.swing.JTable tblRooms;
    private javax.swing.JTextField txtCpNum;
    private javax.swing.JTextField txtCustName;
    private javax.swing.JTextField txtDays;
    private javax.swing.JTextField txtInDate;
    private javax.swing.JTextField txtOutDate;
    private javax.swing.JTextField txtPricePerDay;
    private javax.swing.JTextField txtRoomSearch;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
 public void populateTable(){
     
       DefaultTableModel model = (DefaultTableModel) tblRooms.getModel();
    model.setRowCount(0); // Clear existing data

    List<Rooms> rooms = HotelNibra.getRooms();
    
    for (Rooms room : rooms) {
        if (room.getReservationStatus().equals("Occupied")) {
              User user = User.getUserForRoom(room.getRoomNumber());
              System.out.println(user.getroomCheckIn());
            Object[] row = {
                room.getRoomNumber(),
                (user != null) ? user.getName() : "", // Display user name if available
                 (user != null) ? user.getPhone() : "", // Display user name if available
                room.getType(),
                room.getPrice(),
                room.getSize(),
                room.getCheckInDate(),
                room.getCheckOutDate(),
                room.getReservationStatus(),
            };
            model.addRow(row);
        }
    }
 }
 
 public void dateCalculator(String checkInDateStr,String checkOutDateStr,String prices){
       // Define the date format you want
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");

    // Parse the date strings into LocalDate objects
    LocalDate checkInDate = LocalDate.parse(checkInDateStr, formatter);
    LocalDate checkOutDate = LocalDate.parse(checkOutDateStr, formatter);

    // Calculate the number of days between the two dates
    long daysBetween = ChronoUnit.DAYS.between(checkInDate, checkOutDate);
     txtDays.setText(String.valueOf(daysBetween));
     txtTotal.setText(String.valueOf(daysBetween*Integer.parseInt(prices)));
    }
 
   private void updateRoomsTextFile(List<Rooms> rooms) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("ROOMS.txt"));
            for (Rooms room : rooms) {
                writer.write(room.toString()); // Assuming Rooms class has a toString() method to represent room details
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}