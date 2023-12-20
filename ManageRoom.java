
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Ketan
 */
public class ManageRoom extends javax.swing.JFrame {
    
   String s2;
     /**
     * Creates new form ManageRoom
     */
    public ManageRoom() {
        initComponents();
        s();
        jButton3.setVisible(false);       
    }
    public void s(){
    PreparedStatement pst=null;
    Statement st=null;
    ResultSet rs=null;
    Connection con=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","ketan9535");
            pst=con.prepareStatement("Select * from room");
            rs=pst.executeQuery();
            ResultSetMetaData stData=(ResultSetMetaData) rs.getMetaData();
            //System.out.print(stData);
            int q=stData.getColumnCount();
            DefaultTableModel RecordTable= (DefaultTableModel) jTable1.getModel();
            //System.out.print(RecordTable);
            RecordTable.setRowCount(0);
            while(rs.next()){
                //Vector is like the dynamic array.
                Vector columnData=new Vector();
                for(int i=1;i<=q;i++){
                    columnData.add(rs.getString("roomnumber"));
                    columnData.add(rs.getString("roomtype"));
                    columnData.add(rs.getString("bed"));
                    columnData.add(rs.getString("price"));
                    columnData.add(rs.getString("status"));
                }
                RecordTable.addRow(columnData);
                //System.out.println(columnData);

            }  
        } catch (ClassNotFoundException | SQLException ex) {}                
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtno = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 0, 60, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Room Number", "Room Type", "Bed", "Price", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 1010, 410));

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel2.setText("Room Number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 150, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel3.setText("Room Type");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 120, 32));

        txtno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnoActionPerformed(evt);
            }
        });
        getContentPane().add(txtno, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 210, 40));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "NON AC", "Premium" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, 220, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel4.setText("Bed Type");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 90, 35));

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Double" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 210, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel5.setText("Price");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 90, 40));

        txtprice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpriceActionPerformed(evt);
            }
        });
        getContentPane().add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, 220, 35));

        jButton2.setBackground(new java.awt.Color(0, 0, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(240, 240, 240));
        jButton2.setText("Add Room");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 120, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel7.setText("Double Click on rows for update & Delete");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 410, 32));

        jButton3.setBackground(new java.awt.Color(0, 0, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 110, 40));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        jLabel1.setText("Manage Rooms");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void txtpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpriceActionPerformed

    }//GEN-LAST:event_txtpriceActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
dispose(); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    if(txtno.getText().equals("")){
      JOptionPane.showMessageDialog(this, "Room number cannot be empty");
      txtno.requestFocus();
    }
    else if(txtprice.getText().equals("")){
       JOptionPane.showMessageDialog(this, "Price cannot be empty");
       txtprice.requestFocus();
    }   
    else{   
        
        PreparedStatement pst=null;
        Statement st=null;
        ResultSet rs=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","ketan9535");
           // st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            pst=con.prepareStatement("select * from room where roomnumber=?");
            pst.setString(1, txtno.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(this,"Room Number Already Exist");
            }
            else{
                try{
                    double pric=Double.parseDouble(txtprice.getText());
                       
                        try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","ketan9535");
                        pst=con.prepareStatement("insert into room(roomnumber,roomtype,bed,price,status)values(?,?,?,?,?)");
                        pst.setString(1, txtno.getText());
                        pst.setString(2, jComboBox1.getItemAt(jComboBox1.getSelectedIndex()));
                        pst.setString(3, jComboBox2.getItemAt(jComboBox2.getSelectedIndex()));
                        pst.setString(4, txtprice.getText());
                        pst.setString(5, "Not Booked");                       
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(this, "Room Added Successfully");
                        s();
                        txtprice.setText("");
                        txtno.setText("");
                  
                } catch (ClassNotFoundException | SQLException ex) {}
                }catch(Exception e){
                    JOptionPane.showMessageDialog(this,"Price is not valid");
                    }
                
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
           //Logger.getLogger(Record.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }    
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
    if(evt.getClickCount()==2){
        String check=JOptionPane.showInputDialog(this,"If you want to Delete this Record Write here to Delete\nIf you want to Update this Record then Write here update");
        if(check.equalsIgnoreCase("Delete")){
            DefaultTableModel dmodel=(DefaultTableModel) jTable1.getModel();
            int rows=jTable1.getSelectedRow();
            s2=(String) dmodel.getValueAt(rows,0);
            String s1=(String) dmodel.getValueAt(rows,4);
            if(s1.equalsIgnoreCase("booked"))
               JOptionPane.showMessageDialog(this,"Sorry Room is Booked So unable to delete it");
            else{
                PreparedStatement pst;
                java.sql.Connection con;
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "ketan9535");
                    pst = con.prepareStatement("delete from room where roomnumber=?");
                    pst.setString(1,s2);
                    pst.executeUpdate();
                    s();
                }
                catch(Exception e){}               
            }
        }
        if(check.equalsIgnoreCase("update")){
            DefaultTableModel dmodel=(DefaultTableModel) jTable1.getModel();
            int rows=jTable1.getSelectedRow();
            s2=(String) dmodel.getValueAt(rows,0);
            String s1=(String) dmodel.getValueAt(rows,4);
            String s3=(String) dmodel.getValueAt(rows,1);
            String s4=(String) dmodel.getValueAt(rows,2);
            String s5=(String) dmodel.getValueAt(rows,3);
            if(s1.equalsIgnoreCase("booked"))
               JOptionPane.showMessageDialog(this,"Sorry Room is Booked So unable to Update it");
            else{
                jButton3.setVisible(true);
                jButton2.setVisible(false);
                txtno.setText(s2);
                txtprice.setText(s5);
                txtno.setEditable(false);
                txtno.setEditable(true);
                
            }
        }
        
    }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        if(txtprice.getText().equals(""))
            JOptionPane.showMessageDialog(this, "All Field id Required");
        else{
                String type=jComboBox1.getItemAt(jComboBox1.getSelectedIndex());
                String bed=jComboBox2.getItemAt(jComboBox2.getSelectedIndex());
                PreparedStatement pst;
                java.sql.Connection con;
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "ketan9535");
                    //pst=con.prepareStatement("update room set price="+txtprice.getText()+","+"roomtype="+type+" where roomnumber="+s2);
                    pst=con.prepareStatement("update room set price=?,roomtype=?,bed=? where roomnumber=?");
                    pst.setString(1,txtprice.getText() );
                    pst.setString(2,type);
                    pst.setString(3,bed);
                    pst.setString(4,s2);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Room Updated");
                    s();
                    jButton2.setVisible(true);
                    jButton3.setVisible(false);
                  
                }catch(Exception e){
                    
                }
                }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnoActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(ManageRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtno;
    private javax.swing.JTextField txtprice;
    // End of variables declaration//GEN-END:variables
}
