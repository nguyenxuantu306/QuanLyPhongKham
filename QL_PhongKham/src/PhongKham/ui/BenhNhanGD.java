/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package PhongKham.ui;

import PhongKham.dao.BenhNhanDao;
import PhongKham.entity.BenhNhanPK;
import PhongKham.entity.NhanVienPK;
import PhongKham.utils.MsgBox;
import PhongKham.utils.XDate;
import PhongKham.utils.XImage;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class BenhNhanGD extends javax.swing.JPanel {
    DefaultComboBoxModel model;
//    ArrayList<NhanVienPK> list = new ArrayList<>();
    /**
     * Creates new form BenhNhan
     */
    public BenhNhanGD() {
        initComponents();
        this.fillTable();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jFileChooser1 = new javax.swing.JFileChooser();
        BenhNhan = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ThongTinBN = new javax.swing.JPanel();
        btnTaiAnh = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMaBN = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtHoTenBN = new javax.swing.JTextField();
        txtCCCD = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtSDTBN = new javax.swing.JTextField();
        lblAnhBN = new javax.swing.JLabel();
        txtNgheNghiep = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDiaChi = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDauHieuBenh = new javax.swing.JTextArea();
        txtSDT = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtBaoHiem = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        JDCNgaySinh = new com.toedter.calendar.JDateChooser();
        JDCNgayKham = new com.toedter.calendar.JDateChooser();
        cboDanToc = new javax.swing.JComboBox<>();
        tblbangbacsy = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblDanhSachBN = new javax.swing.JTable();
        txtTimKiem = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(1553, 900));
        setLayout(new java.awt.BorderLayout());

        BenhNhan.setBackground(new java.awt.Color(93, 167, 219));
        BenhNhan.setPreferredSize(new java.awt.Dimension(1600, 900));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Find Name : ");

        ThongTinBN.setBackground(new java.awt.Color(129, 198, 232));
        ThongTinBN.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông Tin Bệnh Nhân", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        ThongTinBN.setToolTipText("");
        ThongTinBN.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnTaiAnh.setText("Tải Ảnh");
        btnTaiAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaiAnhActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setText("Mã BN");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel4.setText("Họ Tên ");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel5.setText("Ngày Sinh");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel6.setText("Dân Tộc");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel7.setText("CCCD:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel8.setText("Bảo Hiểm :");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel12.setText("Giới Tính");

        txtCCCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCCCDActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel16.setText("SĐTBN");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel17.setText("Nghề Nghiệp");

        lblAnhBN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnMoi.setText("Mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Địa Chỉ:");

        txtDiaChi.setColumns(20);
        txtDiaChi.setRows(5);
        jScrollPane2.setViewportView(txtDiaChi);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Dấu Hiệu Bệnh:");

        txtDauHieuBenh.setColumns(20);
        txtDauHieuBenh.setRows(5);
        jScrollPane3.setViewportView(txtDauHieuBenh);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel9.setText("Ngày Khám");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("SDT");

        rdoNam.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoNam);
        rdoNam.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdoNam.setText("Nam");

        rdoNu.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoNu);
        rdoNu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdoNu.setText("Nữ");
        rdoNu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(rdoNam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoNu)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoNam)
                    .addComponent(rdoNu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ThongTinBNLayout = new javax.swing.GroupLayout(ThongTinBN);
        ThongTinBN.setLayout(ThongTinBNLayout);
        ThongTinBNLayout.setHorizontalGroup(
            ThongTinBNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThongTinBNLayout.createSequentialGroup()
                .addGroup(ThongTinBNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ThongTinBNLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btnTaiAnh))
                    .addGroup(ThongTinBNLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAnhBN, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54)
                .addGroup(ThongTinBNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel4))
                .addGap(35, 35, 35)
                .addGroup(ThongTinBNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtHoTenBN, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(txtMaBN, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(txtNgheNghiep, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(JDCNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(cboDanToc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(70, 70, 70)
                .addGroup(ThongTinBNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ThongTinBNLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(45, 45, 45)
                        .addGroup(ThongTinBNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ThongTinBNLayout.createSequentialGroup()
                                .addGroup(ThongTinBNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBaoHiem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(ThongTinBNLayout.createSequentialGroup()
                                .addGroup(ThongTinBNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ThongTinBNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThongTinBNLayout.createSequentialGroup()
                                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(109, 109, 109))
                                        .addGroup(ThongTinBNLayout.createSequentialGroup()
                                            .addGroup(ThongTinBNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(ThongTinBNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(ThongTinBNLayout.createSequentialGroup()
                                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(115, 115, 115))
                                                    .addGroup(ThongTinBNLayout.createSequentialGroup()
                                                        .addComponent(JDCNgayKham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGap(67, 67, 67)))
                                                .addGroup(ThongTinBNLayout.createSequentialGroup()
                                                    .addComponent(txtSDTBN, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(67, 67, 67)))
                                            .addGroup(ThongTinBNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel10)
                                                .addComponent(jLabel19)
                                                .addComponent(jLabel20))
                                            .addGap(43, 43, 43)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThongTinBNLayout.createSequentialGroup()
                                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(ThongTinBNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3)
                                    .addGroup(ThongTinBNLayout.createSequentialGroup()
                                        .addGroup(ThongTinBNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(ThongTinBNLayout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(33, 33, 33)
                                                .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addComponent(jLabel12)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel16))
                .addContainerGap())
        );
        ThongTinBNLayout.setVerticalGroup(
            ThongTinBNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThongTinBNLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(ThongTinBNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAnhBN, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ThongTinBNLayout.createSequentialGroup()
                        .addGroup(ThongTinBNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(ThongTinBNLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel12))
                            .addGroup(ThongTinBNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(txtMaBN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(ThongTinBNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtHoTenBN, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(txtSDTBN, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(jLabel16))
                        .addGap(49, 49, 49)
                        .addGroup(ThongTinBNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ThongTinBNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(JDCNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)
                                .addComponent(txtCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel19)))))
                .addGroup(ThongTinBNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ThongTinBNLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnTaiAnh))
                    .addGroup(ThongTinBNLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(ThongTinBNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(ThongTinBNLayout.createSequentialGroup()
                                .addGroup(ThongTinBNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtBaoHiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGroup(ThongTinBNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ThongTinBNLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9))
                                    .addGroup(ThongTinBNLayout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(JDCNgayKham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(1, 1, 1))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ThongTinBNLayout.createSequentialGroup()
                                .addGroup(ThongTinBNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(ThongTinBNLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel6)
                                        .addGap(32, 32, 32))
                                    .addGroup(ThongTinBNLayout.createSequentialGroup()
                                        .addComponent(cboDanToc)
                                        .addGap(28, 28, 28)))
                                .addGroup(ThongTinBNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNgheNghiep, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17)))))
                    .addGroup(ThongTinBNLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThongTinBNLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(ThongTinBNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tblbangbacsy.setBackground(new java.awt.Color(129, 198, 232));
        tblbangbacsy.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh Sách Bệnh Nhân", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        tblDanhSachBN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "null", "null", "null", "null", "null", "null", "null", "null", "null", "null"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDanhSachBN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDanhSachBNMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblDanhSachBN);

        javax.swing.GroupLayout tblbangbacsyLayout = new javax.swing.GroupLayout(tblbangbacsy);
        tblbangbacsy.setLayout(tblbangbacsyLayout);
        tblbangbacsyLayout.setHorizontalGroup(
            tblbangbacsyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tblbangbacsyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1365, Short.MAX_VALUE)
                .addContainerGap())
        );
        tblbangbacsyLayout.setVerticalGroup(
            tblbangbacsyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tblbangbacsyLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout BenhNhanLayout = new javax.swing.GroupLayout(BenhNhan);
        BenhNhan.setLayout(BenhNhanLayout);
        BenhNhanLayout.setHorizontalGroup(
            BenhNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BenhNhanLayout.createSequentialGroup()
                .addGroup(BenhNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BenhNhanLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(BenhNhanLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tblbangbacsy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(ThongTinBN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        BenhNhanLayout.setVerticalGroup(
            BenhNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BenhNhanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BenhNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BenhNhanLayout.createSequentialGroup()
                        .addComponent(txtTimKiem)
                        .addGap(3, 3, 3)))
                .addComponent(ThongTinBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(tblbangbacsy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(339, 339, 339))
        );

        add(BenhNhan, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTaiAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaiAnhActionPerformed
        // TODO add your handling code here:
        this.chonAnh();
        
    }//GEN-LAST:event_btnTaiAnhActionPerformed

    private void txtCCCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCCCDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCCCDActionPerformed

    private void rdoNuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoNuActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        this.insert();
        
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        this.delete();
        
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        this.update();
       
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        // TODO add your handling code here:
        this.clearForm();
        
    }//GEN-LAST:event_btnMoiActionPerformed

    private void tblDanhSachBNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhSachBNMouseClicked
        // TODO add your handling code here:
         if(evt.getClickCount() == 1){
            this.row = tblDanhSachBN.getSelectedRow();
            this.edit();
        };
        if(evt.getClickCount() == 2){
        String mabn = (String) tblDanhSachBN.getValueAt(this.row, 0);
        BenhNhanPK  bn = dao.selectById(mabn);
        this.setForm(bn);
//             HirtoryPK maupoup = new HirtoryPK(bn);
            HirtoryPK tory = new HirtoryPK(bn);
        tory.setVisible(true);
        }
    }//GEN-LAST:event_tblDanhSachBNMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BenhNhan;
    private com.toedter.calendar.JDateChooser JDCNgayKham;
    private com.toedter.calendar.JDateChooser JDCNgaySinh;
    private javax.swing.JPanel ThongTinBN;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTaiAnh;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboDanToc;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblAnhBN;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tblDanhSachBN;
    private javax.swing.JPanel tblbangbacsy;
    private javax.swing.JTextField txtBaoHiem;
    private javax.swing.JTextField txtCCCD;
    private javax.swing.JTextArea txtDauHieuBenh;
    private javax.swing.JTextArea txtDiaChi;
    private javax.swing.JTextField txtHoTenBN;
    private javax.swing.JTextField txtMaBN;
    private javax.swing.JTextField txtNgheNghiep;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSDTBN;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
        BenhNhanDao dao = new BenhNhanDao();
    int row = -1 ;
    
    void init(){
//        setLocationRelativeTo(null);
        this.initTable();
        this.fillTable();
        
        this.initcombobox();
    }
    
    public void initcombobox(){ 
        String[] DanToc = {"Kinh","Tày","Mường","H-Mông","Dao","Khơ Me","Hoa","Chăm"};
        model = (DefaultComboBoxModel) cboDanToc.getModel();
        model.removeAllElements();
        for (int i = 0; i < DanToc.length; i++) {
            model.addElement(DanToc[i]);
        }
    }
    
    public void initTable(){
        DefaultTableModel model = (DefaultTableModel) tblDanhSachBN.getModel();
        model.setColumnIdentifiers(new String[]{"MaBN","HotenBN","GioiTinh","DiaChi","CCCD","NgaySinh","SDTBN","BaoHiem","NgheNghiep","DanToc","DauHieuBenh","NgayKham","HinhAnhBN","SDT"});
    }
    
    void fillTable(){
        DefaultTableModel model = (DefaultTableModel) tblDanhSachBN.getModel();
        model.setRowCount(0);
        
        try {   
            String keyword = txtTimKiem.getText();
            List<BenhNhanPK> list = dao.selectByKeyword(keyword);
            for(BenhNhanPK bn : list){
                Object[] row = {
                    bn.getMaBN(),
                    bn.getHoTenBN(),
                    bn.getGioiTinh()?"Nam":"Nữ",                  
                    bn.getDiaChi(),
                    bn.getCCCD(),
                    XDate.toString(bn.getNgaySinh(), "dd/MM/yyy"),
                    bn.getSDTBN(),
                    bn.getBaoHiem(),
                    bn.getNgheNghiep(),
                    bn.getDanToc(),
                    bn.getDauHieuBenh(),
                    XDate.toString(bn.getNgayKham(), "dd/MM/yyy"),
                    bn.getHinhAnhBN(),
                    bn.getSDT(),};
                    model.addRow(row);    
                }
            
        } catch (Exception e) {
                MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }
        
    
    
    void setForm(BenhNhanPK bn){
    txtMaBN.setText(bn.getMaBN());
    txtHoTenBN.setText(bn.getHoTenBN());  
    if(bn.getGioiTinh()){
            rdoNam.setSelected(true);
        }
        else{
            rdoNu.setSelected(true);
       }
    txtDiaChi.setText(bn.getDiaChi());
    txtCCCD.setText(bn.getCCCD());  
    JDCNgaySinh.setDate(bn.getNgaySinh());        
    txtSDTBN.setText(bn.getSDTBN());
    txtBaoHiem.setText(bn.getBaoHiem());
    txtNgheNghiep.setText(bn.getNgheNghiep());
    cboDanToc.setSelectedItem( bn.getDanToc());
    txtDauHieuBenh.setText(bn.getDauHieuBenh()); 
    JDCNgayKham.setDate(bn.getNgayKham());
    if(bn.getHinhAnhBN()!= null){
        lblAnhBN.setToolTipText(bn.getHinhAnhBN());
        lblAnhBN.setIcon(XImage.read(bn.getHinhAnhBN()));
    }   
    txtSDT.setText(bn.getSDT());
    }
            
            
    void clearForm(){
    BenhNhanPK bn = new BenhNhanPK();
        this.setForm(bn);
        this.row=-1;
    }
    
     BenhNhanPK getForm() {
        BenhNhanPK bn = new BenhNhanPK();
        bn.setMaBN(txtMaBN.getText());
        bn.setHoTenBN(txtHoTenBN.getText());      
        bn.setGioiTinh(rdoNam.isSelected());       
        bn.setDiaChi(txtDiaChi.getText());
        bn.setCCCD(txtCCCD.getText());
        bn.setNgaySinh(JDCNgaySinh.getDate());
        bn.setSDTBN(txtSDTBN.getText());
        bn.setBaoHiem(txtBaoHiem.getText());
        bn.setNgheNghiep(txtNgheNghiep.getText());
        bn.setDanToc(cboDanToc.getSelectedItem().toString());
        bn.setDauHieuBenh(txtDauHieuBenh.getText());       
        bn.setNgayKham(JDCNgayKham.getDate());
        bn.setHinhAnhBN(lblAnhBN.getToolTipText());
        bn.setSDT(txtSDT.getText());
        return bn;
    }
    
    
     void insert() {
        BenhNhanPK model = this.getForm();
        try {
            dao.insert(model);
            this.fillTable();
            this.clearForm();
            MsgBox.alert(this, "thêm mới thành công");
        } catch (Exception e) {
           e.printStackTrace();
//            MsgBox.alert(this, "thêm mới thành công");
        }
    }

    void edit() {
        String mabn = (String) tblDanhSachBN.getValueAt(this.row, 0);
        BenhNhanPK  bn = dao.selectById(mabn);
        this.setForm(bn);
//        NhanVien.setSelectedIndex(0);
       

    }

    void delete() {
        String mabn = txtMaBN.getText();
        try {
            dao.delete(mabn);
            this.fillTable();
            this.clearForm();
            MsgBox.alert(this, "Xóa thành công!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
            MsgBox.alert(this, "Xóa thất bại!");
        }
    }

    void update() {
        BenhNhanPK model = getForm();
        try {
            dao.update(model);
            this.fillTable();
            MsgBox.alert(this, "Cập nhật thành công!");
        } catch (Exception e) {
             JOptionPane.showMessageDialog(this, e);
            MsgBox.alert(this, "Cập nhật thất bại!");
        }
    }

    void chonAnh() {
        JFileChooser fileChooser = new JFileChooser("D:\\QLDA1_T_Phung\\QL_PhongKham\\src\\PhongKham\\Hinh\\anhbn");
        
        if(fileChooser.showOpenDialog(this) == javax.swing.JFileChooser.APPROVE_OPTION){
            File file = fileChooser.getSelectedFile();
            XImage.save(file); // lưu hình vào thư mục logos
            ImageIcon icon = XImage.read(file.getName()); // đọc hình từ logos
            lblAnhBN.setIcon(icon);
            lblAnhBN.setToolTipText(file.getName()); // giữ tên hình trong tooltip
        }
    }
    
   
}
