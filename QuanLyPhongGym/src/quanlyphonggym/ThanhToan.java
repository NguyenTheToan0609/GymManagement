/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quanlyphonggym;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author The Toan
 */
public class ThanhToan extends javax.swing.JFrame {
    private int Amount;

    /**
     * Creates new form ThanhToan
     */
    public ThanhToan() {
        initComponents();
        DisplayPayment();
        GetMember();
    }

    Connection Con = null ;
    PreparedStatement pst = null;
    ResultSet Rs = null , Rs1 = null;
    Statement St = null , St1 = null ;
    
    private void DisplayPayment(){
        try {
            Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gymdb","root","");
            St = (Statement) Con.createStatement();
            Rs = St.executeQuery("select *from financetbl");
            PaymentTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void GetMember(){
        try {
            Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gymdb","root","");
            St = (Statement) Con.createStatement();
            String Query = "Select *from membertbl";
            Rs = St.executeQuery(Query);
            while(Rs.next()){
                String MemberName = Rs.getString("MName");
                MemberCb.addItem(MemberName);
            }
        } catch (Exception e) {
                 e.printStackTrace();
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        AmountTb = new javax.swing.JTextField();
        SearchTb = new javax.swing.JTextField();
        MemberCb = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PaymentTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        PaymentBtn = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        PerilodDate = new com.toedter.calendar.JDateChooser();
        TotalLbl = new javax.swing.JLabel();
        PrintBtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 102, 0));

        jPanel4.setBackground(new java.awt.Color(204, 102, 0));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Đăng xuất");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\The Toan\\OneDrive\\Desktop\\icon\\logout.png")); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Khách hàng");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\The Toan\\OneDrive\\Desktop\\icon\\weightlifter.png")); // NOI18N

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\The Toan\\OneDrive\\Desktop\\icon\\weightlifting.png")); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\The Toan\\OneDrive\\Desktop\\icon\\coach.png")); // NOI18N

        jLabel11.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Người huấn luyện");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel1))
                                .addGap(0, 18, Short.MAX_VALUE))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("Quản lý Hoá Đơn");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 0));
        jLabel9.setText("Tên khách hàng:");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 153, 0));
        jLabel10.setText("Giá tập:");

        AmountTb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        AmountTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmountTbActionPerformed(evt);
            }
        });

        SearchTb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        SearchTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTbActionPerformed(evt);
            }
        });

        MemberCb.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        MemberCb.setForeground(new java.awt.Color(255, 153, 0));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 153, 0));
        jLabel13.setText("Khách hàng:");

        PaymentTable.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        PaymentTable.setForeground(new java.awt.Color(255, 153, 0));
        PaymentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "mã", "Perilod", "Member", "Amount"
            }
        ));
        PaymentTable.setRowHeight(25);
        PaymentTable.setSelectionBackground(new java.awt.Color(255, 153, 0));
        jScrollPane1.setViewportView(PaymentTable);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 153, 0));
        jButton2.setText("Làm mới");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        PaymentBtn.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        PaymentBtn.setForeground(new java.awt.Color(255, 153, 0));
        PaymentBtn.setText("Thanh toán");
        PaymentBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PaymentBtnMouseClicked(evt);
            }
        });
        PaymentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentBtnActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 153, 0));
        jButton4.setText("Tìm kiếm");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        TotalLbl.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TotalLbl.setForeground(new java.awt.Color(255, 153, 0));
        TotalLbl.setText("Tổng Tiền:");

        PrintBtn.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        PrintBtn.setForeground(new java.awt.Color(255, 153, 0));
        PrintBtn.setText("In hoá đơn");
        PrintBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintBtnMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 153, 0));
        jLabel12.setText("Ngày thanh toán:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PerilodDate, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MemberCb, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(63, 63, 63)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(AmountTb)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(354, 354, 354)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jButton2))
                                        .addComponent(SearchTb, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(PaymentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(PrintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(TotalLbl)
                                            .addGap(110, 110, 110))))))
                        .addContainerGap(112, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 972, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MemberCb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PerilodDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AmountTb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchTb, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PaymentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TotalLbl))
                    .addComponent(PrintBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        new KhachHang().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void AmountTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmountTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AmountTbActionPerformed

    private void SearchTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchTbActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        new HuyenLuyenVien().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

      int PNum = 0 ;
    private void CountCoach(){
        try {
            St1 = (Statement) Con.createStatement();
            Rs1 = St1.executeQuery("select MAX(PId) from financetbl");
            Rs1.next();
            PNum = Rs1.getInt(1) + 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    int Total = 0 ;
    private void PaymentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PaymentBtnActionPerformed

    private void PaymentBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaymentBtnMouseClicked
        if(PerilodDate == null || MemberCb.getSelectedIndex()== -1 || AmountTb.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Chưa nhập đủ thông tin");
        }
        else {
            try {
                CountCoach();
                Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gymdb","root","");
                PreparedStatement Add = (PreparedStatement) Con.prepareStatement("insert into financetbl values(?,?,?,?)");
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String formattedDate = sdf.format(PerilodDate.getDate());
                Add.setInt(1,PNum);
                Add.setString(2, formattedDate);
                Add.setString(3, MemberCb.getSelectedItem().toString());
                Add.setString(4, AmountTb.getText());
                Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Thêm dữ liệu thành công");
                Con.close();
                int tot = Integer.valueOf(AmountTb.getText());
                Total = Total + tot ;
                TotalLbl.setText("Tổng tiền:"+Total);
                DisplayPayment();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Thêm dữ liệu không thành công");
            }
        }
    }//GEN-LAST:event_PaymentBtnMouseClicked

    private void PrintBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintBtnMouseClicked
        try {
          PaymentTable.print();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_PrintBtnMouseClicked

    
    public void SelectedSeller(){
         try {
            Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gymdb","root","");
            St = (Statement) Con.createStatement();
            Rs = St.executeQuery("select *from financetbl");
            PaymentTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
         try {
            Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gymdb","root","");
            St = (Statement) Con.createStatement();
            Rs = St.executeQuery("SELECT *FROM financetbl WHERE PMember = '"+SearchTb.getText()+"'");
            PaymentTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        SelectedSeller();
    }//GEN-LAST:event_jButton2MouseClicked

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
            java.util.logging.Logger.getLogger(ThanhToan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThanhToan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThanhToan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThanhToan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThanhToan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AmountTb;
    private javax.swing.JComboBox MemberCb;
    private javax.swing.JButton PaymentBtn;
    private javax.swing.JTable PaymentTable;
    private com.toedter.calendar.JDateChooser PerilodDate;
    private javax.swing.JButton PrintBtn;
    private javax.swing.JTextField SearchTb;
    private javax.swing.JLabel TotalLbl;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
