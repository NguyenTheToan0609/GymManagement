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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author The Toan
 */
public class KhachHang extends javax.swing.JFrame {

    /**
     * Creates new form KhachHang
     */
    public KhachHang() {
        initComponents();
        DisplayMembers();
        GetCoach();
    }

    Connection Con = null ;
    PreparedStatement pst = null;
    ResultSet Rs = null , Rs1 = null;
    Statement St = null , St1 = null ;
    
    private void DisplayMembers(){
        try {
            Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gymdb","root","");
            St = (Statement) Con.createStatement();
            Rs = St.executeQuery("select *from membertbl");
            MemberTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (Exception e) {
        }
    }
    
    private void GetCoach(){
        try {
            Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gymdb","root","");
            St = (Statement) Con.createStatement();
            String Query = "Select *from coachtbl";
            Rs = St.executeQuery(Query);
            while(Rs.next()){
                String CoachName = Rs.getString("CName");
                CoachCb.addItem(CoachName);
            }
        } catch (Exception e) {
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
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        MNameTb = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        PhoneTb = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        AgeTb = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        AmountTb = new javax.swing.JTextField();
        GenCb = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        TimingTb = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        CoachCb = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MemberTable = new javax.swing.JTable();
        AddBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

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
        jLabel1.setText("Người huấn luyện");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\The Toan\\OneDrive\\Desktop\\icon\\coach.png")); // NOI18N

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\The Toan\\OneDrive\\Desktop\\icon\\weightlifting.png")); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Thanh toán");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\The Toan\\OneDrive\\Desktop\\icon\\dollar.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 28, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel1)))
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        jLabel2.setText("Quản Lý Khách Hàng");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 0));
        jLabel9.setText("Tên khách hàng:");

        MNameTb.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        MNameTb.setForeground(new java.awt.Color(255, 153, 0));
        MNameTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MNameTbActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 153, 0));
        jLabel10.setText("Số điện thoại:");

        PhoneTb.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        PhoneTb.setForeground(new java.awt.Color(255, 153, 0));
        PhoneTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneTbActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 153, 0));
        jLabel11.setText("Tuổi:");

        AgeTb.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        AgeTb.setForeground(new java.awt.Color(255, 153, 0));
        AgeTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeTbActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 153, 0));
        jLabel12.setText("Giá tập:");

        AmountTb.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        AmountTb.setForeground(new java.awt.Color(255, 153, 0));
        AmountTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmountTbActionPerformed(evt);
            }
        });

        GenCb.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        GenCb.setForeground(new java.awt.Color(255, 153, 0));
        GenCb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nam", "Nữ" }));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 153, 0));
        jLabel13.setText("Giới tính:");

        jLabel14.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 153, 0));
        jLabel14.setText("Thời gian:");

        TimingTb.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        TimingTb.setForeground(new java.awt.Color(255, 153, 0));
        TimingTb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "6:00h-8:00h", "8:00h-10:00h", "10:00h-12:00h", "12:00h-14:00h", "14:00h-16:00h", "16:00h-18:00h", "18:00h-20:00h", "20:00h-22:00h" }));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 153, 0));
        jLabel15.setText("Người huấn luyện:");

        CoachCb.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        CoachCb.setForeground(new java.awt.Color(255, 153, 0));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 153, 0));
        jLabel16.setText("Danh Sách Khách Hàng");

        MemberTable.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        MemberTable.setForeground(new java.awt.Color(255, 153, 0));
        MemberTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        MemberTable.setRowHeight(25);
        MemberTable.setSelectionBackground(new java.awt.Color(255, 153, 0));
        MemberTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MemberTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(MemberTable);

        AddBtn.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 153, 0));
        AddBtn.setText("Thêm");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 153, 0));
        DeleteBtn.setText("Xoá");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        EditBtn.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        EditBtn.setForeground(new java.awt.Color(255, 153, 0));
        EditBtn.setText("Sửa");
        EditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBtnMouseClicked(evt);
            }
        });
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)
                        .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)
                        .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TimingTb, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(PhoneTb, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(AgeTb, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(44, 44, 44)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(GenCb, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(38, 38, 38)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(AmountTb, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(CoachCb, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(355, 355, 355))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(394, 394, 394))))))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PhoneTb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(AgeTb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GenCb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AmountTb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TimingTb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CoachCb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditBtn)
                    .addComponent(DeleteBtn)
                    .addComponent(AddBtn))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBtnActionPerformed

    private void AmountTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmountTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AmountTbActionPerformed

    private void AgeTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeTbActionPerformed

    private void PhoneTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneTbActionPerformed

    private void MNameTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MNameTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MNameTbActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
         new HuyenLuyenVien().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        new ThanhToan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

     int MNum = 0 ;
    private void CountCoach(){
        try {
            St1 = (Statement) Con.createStatement();
            Rs1 = St1.executeQuery("select MAX(MId) from membertbl");
            Rs1.next();
            MNum = Rs1.getInt(1) + 1;
        } catch (Exception e) {
        }
    }
    
    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        if(MNameTb.getText().isEmpty() || PhoneTb.getText().isEmpty() || AgeTb.getText().isEmpty() || AmountTb.getText().isEmpty() || GenCb.getSelectedIndex()== -1 || CoachCb.getSelectedIndex()== -1 || TimingTb.getSelectedIndex()== -1){
            JOptionPane.showMessageDialog(this, "Chưa nhập đủ thông tin");
        } 
        else {
            try {
                CountCoach();
                Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gymdb","root","");
                PreparedStatement Add = (PreparedStatement) Con.prepareStatement("insert into membertbl values(?,?,?,?,?,?,?,?)");
                Add.setInt(1,MNum);
                Add.setString(2, MNameTb.getText());
                Add.setString(3, PhoneTb.getText());
                Add.setInt(4, Integer.valueOf(AgeTb.getText()));
                Add.setString(5, AmountTb.getText());
                Add.setString(6, TimingTb.getSelectedItem().toString());
                Add.setString(7, CoachCb.getSelectedItem().toString());
                Add.setString(8, GenCb.getSelectedItem().toString());
                Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Thêm dữ liệu thành công");
                Con.close();
                DisplayMembers();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Thêm dữ liệu không thành công");
            }
        }
    }//GEN-LAST:event_AddBtnMouseClicked
     int Key = 0 ;
    private void MemberTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MemberTableMouseClicked
         DefaultTableModel model = (DefaultTableModel)MemberTable.getModel();
        int MyIndex = MemberTable.getSelectedRow();
        Key = Integer.valueOf(model.getValueAt(MyIndex,0).toString());
        MNameTb.setText(model.getValueAt(MyIndex,1).toString());
        PhoneTb.setText(model.getValueAt(MyIndex,2).toString());
        AgeTb.setText(model.getValueAt(MyIndex,3).toString());
        AmountTb.setText(model.getValueAt(MyIndex,4).toString());
        TimingTb.setSelectedItem(model.getValueAt(MyIndex,5).toString());
        CoachCb.setSelectedItem(model.getValueAt(MyIndex,6).toString());
        GenCb.setSelectedItem(model.getValueAt(MyIndex,7).toString());  
    }//GEN-LAST:event_MemberTableMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
       if(Key==0){
            JOptionPane.showMessageDialog(this, "Chọn dòng cần xoá");
        }
        else {
            try {
                Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gymdb","root","");
                String Query = "Delete from membertbl where MId = "+Key;
                Statement Del = (Statement) Con.createStatement();
                Del.executeUpdate(Query);
                JOptionPane.showMessageDialog(this,"Xoá thành công");
                DisplayMembers();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,"Xoá không thành công");
            }
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
        if(Key==0){
            JOptionPane.showMessageDialog(this, "Chọn dòng cần sửa");
        }
        else{
            try {
                Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gymdb","root","");
                String Query = "Update membertbl set MName=?,MPhone=?,MAge=?,MAmount=?,MTiming=?,MCoach=?,MGen=? where MId=?";
                PreparedStatement Edit = (PreparedStatement) Con.prepareStatement(Query);
                Edit.setString(1, MNameTb.getText());
                Edit.setString(2, PhoneTb.getText());
                Edit.setInt(3,Integer.valueOf(AgeTb.getText()));
                Edit.setString(4, AmountTb.getText());
                Edit.setString(5, TimingTb.getSelectedItem().toString());
                Edit.setString(6, CoachCb.getSelectedItem().toString());
                Edit.setString(7, GenCb.getSelectedItem().toString());
                 Edit.setInt(8,Key);
                Edit.executeUpdate();
                JOptionPane.showMessageDialog(this, "Thêm dữ liệu thành công");
                Con.close();
                DisplayMembers();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Sửa dữ liệu không thành công");
            }
        }
    }//GEN-LAST:event_EditBtnMouseClicked

     
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
            java.util.logging.Logger.getLogger(KhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KhachHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JTextField AgeTb;
    private javax.swing.JTextField AmountTb;
    private javax.swing.JComboBox CoachCb;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JComboBox GenCb;
    private javax.swing.JTextField MNameTb;
    private javax.swing.JTable MemberTable;
    private javax.swing.JTextField PhoneTb;
    private javax.swing.JComboBox TimingTb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
