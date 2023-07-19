/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhongKham.ui;

import PhongKham.dao.ThongKePKDao;
import PhongKham.utils.XJdbc;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import java.util.Hashtable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Admin
 */
public class ThongKeBN extends javax.swing.JPanel {

    /**
     * Creates new form ThongKeBN
     */
    public ThongKeBN() {
        initComponents();
        init();
    }
 String path = null;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnIn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnPDF = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboThang = new javax.swing.JComboBox<>();
        txtTongTienKham = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTongNguoi = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        thongke_benhnhan = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        cboNam = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblThongKe = new javax.swing.JTable();
        cboThanggg = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        thongkebenhnhan_chitiet = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(93, 167, 219));
        jPanel1.setPreferredSize(new java.awt.Dimension(1600, 900));

        btnIn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnIn.setText("In");
        btnIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Xuất file Excel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnPDF.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnPDF.setText("Xuất file PDF");
        btnPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDFActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.darkGray));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THỐNG KÊ BỆNH NHÂN");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("28-11-2022");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(686, 686, 686)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(494, 494, 494)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(488, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        cboThang.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        cboThang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tháng", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cboThang.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboThangItemStateChanged(evt);
            }
        });
        cboThang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboThangActionPerformed(evt);
            }
        });

        txtTongTienKham.setForeground(new java.awt.Color(255, 51, 51));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setText("Tổng Người  :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel4.setText("Tổng Tiền Khám  : ");

        txtTongNguoi.setForeground(new java.awt.Color(255, 51, 51));
        txtTongNguoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTongNguoiActionPerformed(evt);
            }
        });

        thongke_benhnhan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        thongke_benhnhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thongke_benhnhanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(thongke_benhnhan);

        jButton5.setText("Refresh");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        cboNam.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        cboNam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Năm", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023" }));
        cboNam.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboNamItemStateChanged(evt);
            }
        });
        cboNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNamActionPerformed(evt);
            }
        });

        tblThongKe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "null", "null"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblThongKe.setRowHeight(30);
        tblThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblThongKeMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblThongKe);

        cboThanggg.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        cboThanggg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tháng", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cboThanggg.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboThangggItemStateChanged(evt);
            }
        });
        cboThanggg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboThangggActionPerformed(evt);
            }
        });

        thongkebenhnhan_chitiet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "null", "null"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        thongkebenhnhan_chitiet.setRowHeight(30);
        thongkebenhnhan_chitiet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thongkebenhnhan_chitietMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(thongkebenhnhan_chitiet);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(cboThang, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(116, 116, 116)
                                    .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(28, 28, 28)
                                        .addComponent(txtTongNguoi, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel4)
                                        .addGap(19, 19, 19)
                                        .addComponent(txtTongTienKham, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(82, 82, 82)
                                        .addComponent(cboThanggg, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addGap(68, 68, 68)
                                        .addComponent(btnPDF)
                                        .addGap(67, 67, 67)
                                        .addComponent(btnIn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2))))
                .addGap(119, 119, 119))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboThang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(txtTongNguoi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTongTienKham, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cboThanggg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(266, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cboThangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboThangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboThangActionPerformed

    private void cboThangItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboThangItemStateChanged
        // TODO add your handling code here:

//        if (cboThang.getSelectedIndex() != 0 ) {
//            filltableBenhNhanThang();
//        }else{
//            filltableBenhNhan();
//        }\
select();
    }//GEN-LAST:event_cboThangItemStateChanged

    private void btnPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFActionPerformed
        // TODO add your handling code here:
//        try {
//            String thongtin;
//
//            thongtin = "Danh Sách Thống Kê Bệnh Nhân";
//
//            MessageFormat header = new MessageFormat(thongtin);
//            MessageFormat footer = new MessageFormat("1");
//            tblThongKeBN.print(JTable.PrintMode.NORMAL, header, footer);
//        } catch (PrinterException ex) {
//            Logger.getLogger(DichVuGD.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_btnPDFActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInActionPerformed
        Hashtable map = new Hashtable();
        map.put("manv", "Yta01");
        map.put("tennv", "Nguyen Thanh Ha");
        map.put("gioitinh", "Nữ");
        map.put("chucvu", "Y tá");
         if (cboThang.getSelectedIndex() != 0 && cboNam.getSelectedIndex() != 0) {
                path = "src/report/ThongKebenhnhan_theothangnam.jrxml";
                map.put("thang", Integer.parseInt((String) cboThang.getSelectedItem()));
                map.put("nam", Integer.parseInt((String) cboNam.getSelectedItem()));
                   
            } else if (cboNam.getSelectedIndex() != 0) {
                path = "src/report/ThongKebenhnhan_theonam.jrxml";
                map.put("nam", Integer.parseInt((String) cboNam.getSelectedItem()));
                  
            } else {
                path = "src/report/ThongKebenhnhan.jrxml";
                   
            }
            System.out.println("in pat tại 330  : "+ path);
           JasperReport jas;
            try {
                jas = JasperCompileManager.compileReport(path);
                JasperPrint print = JasperFillManager.fillReport(jas, map, XJdbc.consql());
                JasperViewer.viewReport(print, false);
            } catch (JRException ex) {
                System.out.println("lỗi report 249 " + ex);
            }

    }//GEN-LAST:event_btnInActionPerformed

    private void txtTongNguoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTongNguoiActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtTongNguoiActionPerformed

    private void thongke_benhnhanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thongke_benhnhanMouseClicked
        // TODO add your handling code here:
        int row = thongke_benhnhan.getSelectedRow();
        String ma = (String) thongke_benhnhan.getValueAt(row, 0);
        fillTableThongKebenhnhantheoMA(ma);
    }//GEN-LAST:event_thongke_benhnhanMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        fillTableThongKebenhnhan();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void cboNamItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboNamItemStateChanged
        // TODO add your handling code here:
         select();
    }//GEN-LAST:event_cboNamItemStateChanged

    private void cboNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboNamActionPerformed

    private void tblThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblThongKeMouseClicked
        // TODO add your handling code here:
        getsum();
        getTongNguoi();
    }//GEN-LAST:event_tblThongKeMouseClicked

    private void cboThangggItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboThangggItemStateChanged
        // TODO add your handling code here:
       if (cboThanggg.getSelectedIndex() != 0) {
            filltableBenhNhanThang();
        }else{
           filltableBenhNhan();
       }
    }//GEN-LAST:event_cboThangggItemStateChanged

    private void cboThangggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboThangggActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboThangggActionPerformed

    private void thongkebenhnhan_chitietMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thongkebenhnhan_chitietMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_thongkebenhnhan_chitietMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIn;
    private javax.swing.JButton btnPDF;
    private javax.swing.JComboBox<String> cboNam;
    private javax.swing.JComboBox<String> cboThang;
    private javax.swing.JComboBox<String> cboThanggg;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblThongKe;
    private javax.swing.JTable thongke_benhnhan;
    private javax.swing.JTable thongkebenhnhan_chitiet;
    private javax.swing.JTextField txtTongNguoi;
    private javax.swing.JTextField txtTongTienKham;
    // End of variables declaration//GEN-END:variables
    ThongKePKDao daotk = new ThongKePKDao();

    private void init() {
//        System.out.println("chaybangcom");
        initTable();
        initTablee();
        fillTableThongKebenhnhan();       
        filltableBenhNhan();
        
    }
    
    
     public void initTablee(){
        DefaultTableModel model = (DefaultTableModel) thongke_benhnhan.getModel();
        model.setColumnIdentifiers(new String[]{"Mã bệnh nhân","Tên bệnh nhân","Số lần khám"});
                DefaultTableModel model1 = (DefaultTableModel) thongkebenhnhan_chitiet.getModel();
        model1.setColumnIdentifiers(new String[]{"Mã bệnh nhân","Tên bệnh nhân","Ngày khám","Mã bác sĩ","Tên bác sĩ","Tên khoa"});
        
        
    }

    void fillTableThongKebenhnhan() {
        DefaultTableModel model = (DefaultTableModel) thongke_benhnhan.getModel();
        model.setRowCount(0);
        List<Object[]> list = daotk.getTKBenhNhan();
        for (Object[] row : list) {
            model.addRow(row);
        }
    }

    void fillTableThongKebenhnhantheoMA(String MA) {
        DefaultTableModel model = (DefaultTableModel) thongkebenhnhan_chitiet.getModel();
        model.setRowCount(0);
        List<Object[]> list = daotk.getTKBenhNhan_TheoMA(MA);
        for (Object[] row : list) {
            model.addRow(row);
        }
    }
        void fillTableThongKebenhnhantheothang(String thang,String nam) {
        DefaultTableModel model = (DefaultTableModel) tblThongKe.getModel();
        model.setRowCount(0);
        List<Object[]> list = daotk.getTKBenhNhan_TheoThangNam(thang, nam);
        for (Object[] row : list) {
            model.addRow(row);
        }
    }
            void fillTableThongKebenhnhantheonam(String nam) {
        DefaultTableModel model = (DefaultTableModel) tblThongKe.getModel();
        model.setRowCount(0);
        // int thang = (Integer)cboThang.getSelectedItem();
        List<Object[]> list = daotk.getTKBenhNhan_TheoThang(nam);
        for (Object[] row : list) {
            model.addRow(row);
        }
    }
         public void select() {
        thongke_benhnhan.clearSelection();
        if (cboThang.getSelectedIndex() != 0 && cboNam.getSelectedIndex() != 0) {
            DefaultTableModel model = (DefaultTableModel)thongke_benhnhan.getModel();
            model.setRowCount(0);
            List<Object[]> list = daotk.getTKBenhNhan_TheoThangNam((String) cboThang.getSelectedItem(), (String) cboNam.getSelectedItem());
            for (Object[] row : list) {
                model.addRow(row);
            }
        } else if (cboNam.getSelectedIndex() != 0) {
            DefaultTableModel model = (DefaultTableModel) thongke_benhnhan.getModel();
            model.setRowCount(0);
            List<Object[]> list = daotk.getTKBenhNhan_TheoThang((String) cboNam.getSelectedItem());
            for (Object[] row : list) {
                model.addRow(row);
            }
        }
        else{ 
            fillTableThongKebenhnhan();
        }
    }
     
    
    
    public void initTable(){
        DefaultTableModel model = (DefaultTableModel) tblThongKe.getModel();
        model.setColumnIdentifiers(new String[]{"HoTenBN","DiaChi","ChuanDoan","HoTenNV","TienKham","NgayKham"});
    }
        
    
     public void filltableBenhNhanThang() {
        try {
            DefaultTableModel model = (DefaultTableModel) tblThongKe.getModel();
            String thangg = (String) cboThanggg.getSelectedItem();                   
            model.setRowCount(0);
            List<Object[]> list = daotk.getTKBNTheoThang(thangg);
            for (Object[] objects : list) {
                model.addRow(objects);
            }
//            tblThongKe.setModel(model);
        } catch (Exception e) {
        }

    }
     

     

    void filltableBenhNhan(){
        DefaultTableModel model = (DefaultTableModel) tblThongKe.getModel();
        model.setRowCount(0);
        List<Object[]> list = daotk.getTKBN();
        for(Object[] row : list){
            model.addRow(row);
        }
    }
    
     
     
    public void getsum(){
            float total = 0;

            for (int i = 0; i < tblThongKe.getRowCount(); i++) {
                int amount = (int) Float.parseFloat(tblThongKe.getValueAt(i, 4).toString());
                //int amount = Integer.parseInt(tblHDCT.getValueAt(i, 5).toString());
                total = total + amount;
            }

            txtTongTienKham.setText("" + Float.toString((int) total));
    
}
    
    
     public void getTongNguoi(){
            int total = 0;
                total = tblThongKe.getRowCount();
//            for (int i = 0; i < tblThongKeBN.getRowCount(); i++) {
//                int amount = Integer.parseInt((String) tblThongKeBN.getRowCount(i, 0));           
//                total = total + amount;
//            }
            txtTongNguoi.setText(String.valueOf(total));
    
}
    
}
