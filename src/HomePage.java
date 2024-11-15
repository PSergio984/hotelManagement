//imports
import javax.swing.JOptionPane;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Eric
 */
public class HomePage extends javax.swing.JFrame {

    public static String name, phone, email, nationality, cardNo, Cvc;

    HomePage() {
        initComponents();
        //resizing the logo
       scaleImageIcon(lblLogo);
        scaleImageIcon(lblCheckIn);
         scaleImageIcon(lblCheckOut);
       
          scaleImageIcon(lblViewRooms);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gender = new javax.swing.ButtonGroup();
        roomType = new javax.swing.ButtonGroup();
        roomSize = new javax.swing.ButtonGroup();
        jpnlTop = new javax.swing.JLayeredPane();
        jpnl3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblViewRooms = new javax.swing.JLabel();
        lblCheckOut = new javax.swing.JLabel();
        lblCheckIn = new javax.swing.JLabel();
        pblBg3 = new javax.swing.JPanel();
        lolHOTELNIBRA = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jpnlTop.setBackground(new java.awt.Color(28, 25, 41));
        jpnlTop.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpnl3.setBackground(new java.awt.Color(242, 242, 242));
        jpnl3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(148, 202, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("HOME PAGE");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 25, 41), 3));
        jpnl3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(623, 24, -1, 49));

        lblViewRooms.setBackground(new java.awt.Color(148, 202, 255));
        lblViewRooms.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblViewRooms.setForeground(new java.awt.Color(0, 0, 0));
        lblViewRooms.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v9ewRooms.png"))); // NOI18N
        lblViewRooms.setToolTipText("");
        lblViewRooms.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        lblViewRooms.setOpaque(true);
        lblViewRooms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblViewRoomsMouseClicked(evt);
            }
        });
        jpnl3.add(lblViewRooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 450, 240, 230));

        lblCheckOut.setBackground(new java.awt.Color(148, 202, 255));
        lblCheckOut.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblCheckOut.setForeground(new java.awt.Color(0, 0, 0));
        lblCheckOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Check out icon.png"))); // NOI18N
        lblCheckOut.setToolTipText("");
        lblCheckOut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        lblCheckOut.setOpaque(true);
        lblCheckOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCheckOutMouseClicked(evt);
            }
        });
        jpnl3.add(lblCheckOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 150, 240, 230));

        lblCheckIn.setBackground(new java.awt.Color(148, 202, 255));
        lblCheckIn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblCheckIn.setForeground(new java.awt.Color(0, 0, 0));
        lblCheckIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check In icon.png"))); // NOI18N
        lblCheckIn.setToolTipText("");
        lblCheckIn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        lblCheckIn.setOpaque(true);
        lblCheckIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCheckInMouseClicked(evt);
            }
        });
        jpnl3.add(lblCheckIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 240, 230));

        jpnlTop.add(jpnl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 179, 1370, 790));

        pblBg3.setBackground(new java.awt.Color(28, 25, 41));

        lolHOTELNIBRA.setBackground(new java.awt.Color(255, 255, 255));
        lolHOTELNIBRA.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 1, 36)); // NOI18N
        lolHOTELNIBRA.setForeground(new java.awt.Color(255, 255, 255));
        lolHOTELNIBRA.setText("HOTEL AMIGGAS");

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AmiggasLogo.png"))); // NOI18N

        javax.swing.GroupLayout pblBg3Layout = new javax.swing.GroupLayout(pblBg3);
        pblBg3.setLayout(pblBg3Layout);
        pblBg3Layout.setHorizontalGroup(
            pblBg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pblBg3Layout.createSequentialGroup()
                .addContainerGap(514, Short.MAX_VALUE)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lolHOTELNIBRA, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(360, 360, 360))
        );
        pblBg3Layout.setVerticalGroup(
            pblBg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pblBg3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pblBg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pblBg3Layout.createSequentialGroup()
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pblBg3Layout.createSequentialGroup()
                        .addComponent(lolHOTELNIBRA, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))))
        );

        jpnlTop.add(pblBg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1365, 173));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnlTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblViewRoomsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViewRoomsMouseClicked
        ViewRooms ViewRooms = new ViewRooms();
        ViewRooms.setVisible(true);
        this.dispose();;
    }//GEN-LAST:event_lblViewRoomsMouseClicked

    private void lblCheckOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCheckOutMouseClicked
       checkOut checkOut = new checkOut();
       checkOut.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_lblCheckOutMouseClicked

    private void lblCheckInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCheckInMouseClicked
        SignIn signIn = new SignIn();
        signIn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblCheckInMouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup gender;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jpnl3;
    private javax.swing.JLayeredPane jpnlTop;
    private javax.swing.JLabel lblCheckIn;
    private javax.swing.JLabel lblCheckOut;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblViewRooms;
    private javax.swing.JLabel lolHOTELNIBRA;
    private javax.swing.JPanel pblBg3;
    private javax.swing.ButtonGroup roomSize;
    private javax.swing.ButtonGroup roomType;
    // End of variables declaration//GEN-END:variables

   public void scaleImageIcon(JLabel label) { //scaling the image icon for jlabels
        Icon icon = label.getIcon();
        if (icon instanceof ImageIcon) {
            ImageIcon imageIcon = (ImageIcon) icon;
            Image image = imageIcon.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
            label.setIcon(new ImageIcon(image));
        } else {
            System.err.println("The label does not have an ImageIcon set.");
        }
    }

}