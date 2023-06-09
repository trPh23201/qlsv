/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DTO.*;
import BUS.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lenovo
 */
public class Faculty_Course extends javax.swing.JFrame {

    BUSFaculty_Course bus = new BUSFaculty_Course();

    /**
     * Creates new form MainClass
     */
    public Faculty_Course() {
        initComponents();
        showCourse("");
        showFaculty("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblLogoManageCourses = new javax.swing.JLabel();
        lblTitleManageCourses = new javax.swing.JLabel();
        lblCourseName = new javax.swing.JLabel();
        txtCourseName = new javax.swing.JTextField();
        lblSearchCourses = new javax.swing.JLabel();
        txtSearchCourses = new javax.swing.JTextField();
        btnSearchCourses = new javax.swing.JButton();
        btnAdd_Courses = new javax.swing.JButton();
        btnUpdate_Courses = new javax.swing.JButton();
        btnDelete_Courses = new javax.swing.JButton();
        btnIndex = new javax.swing.JToggleButton();
        lblPeriod = new javax.swing.JLabel();
        txtPeriod = new javax.swing.JTextField();
        lblLogoManageFaculty = new javax.swing.JLabel();
        lblTitleManageFaculty = new javax.swing.JLabel();
        lblFacultyName = new javax.swing.JLabel();
        lblFacultyPhone = new javax.swing.JLabel();
        txtFal = new javax.swing.JTextField();
        txtFacultyPhone = new javax.swing.JTextField();
        lblFacultyRoom = new javax.swing.JLabel();
        txtFacultyRoom = new javax.swing.JTextField();
        btnAdd_Faculty = new javax.swing.JButton();
        btnUpdate_Faculty = new javax.swing.JButton();
        btnDelete_Faculty = new javax.swing.JButton();
        lblSearchFaculty = new javax.swing.JLabel();
        txtSearchFaculty = new javax.swing.JTextField();
        btnSearchFaculty = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFaculty = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCourse = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblLogoManageCourses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo_Courses.png"))); // NOI18N

        lblTitleManageCourses.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTitleManageCourses.setText("Quản lý khóa");

        lblCourseName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCourseName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IconSubjectName.png"))); // NOI18N
        lblCourseName.setText("Tên khóa :");

        txtCourseName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblSearchCourses.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSearchCourses.setText("Nhập tên khóa:");

        txtSearchCourses.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnSearchCourses.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSearchCourses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IconSearch.png"))); // NOI18N
        btnSearchCourses.setPreferredSize(new java.awt.Dimension(32, 32));
        btnSearchCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchCoursesActionPerformed(evt);
            }
        });

        btnAdd_Courses.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAdd_Courses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IconAdd.png"))); // NOI18N
        btnAdd_Courses.setText("Thêm ");
        btnAdd_Courses.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAdd_Courses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd_CoursesActionPerformed(evt);
            }
        });

        btnUpdate_Courses.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnUpdate_Courses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IconUpdate.png"))); // NOI18N
        btnUpdate_Courses.setText("Sửa");
        btnUpdate_Courses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate_CoursesActionPerformed(evt);
            }
        });

        btnDelete_Courses.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnDelete_Courses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IconDelete.png"))); // NOI18N
        btnDelete_Courses.setText("Xóa");
        btnDelete_Courses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete_CoursesActionPerformed(evt);
            }
        });

        btnIndex.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnIndex.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LogoSchool-40.png"))); // NOI18N
        btnIndex.setText("Về trang chủ");
        btnIndex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIndexActionPerformed(evt);
            }
        });

        lblPeriod.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPeriod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IconPeriod.png"))); // NOI18N
        lblPeriod.setText("Niên khóa :");

        txtPeriod.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblLogoManageFaculty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LogoFaculty.png"))); // NOI18N

        lblTitleManageFaculty.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTitleManageFaculty.setText("Quản lý khoa");

        lblFacultyName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblFacultyName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IconFacultyName.png"))); // NOI18N
        lblFacultyName.setText("Tên khoa :");

        lblFacultyPhone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblFacultyPhone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IconPhone.png"))); // NOI18N
        lblFacultyPhone.setText("SĐT:");

        txtFal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtFacultyPhone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblFacultyRoom.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblFacultyRoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IconClassroom.png"))); // NOI18N
        lblFacultyRoom.setText("Phòng :");

        txtFacultyRoom.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtFacultyRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFacultyRoomActionPerformed(evt);
            }
        });

        btnAdd_Faculty.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAdd_Faculty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IconAdd.png"))); // NOI18N
        btnAdd_Faculty.setText("Thêm ");
        btnAdd_Faculty.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAdd_Faculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd_FacultyActionPerformed(evt);
            }
        });

        btnUpdate_Faculty.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnUpdate_Faculty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IconUpdate.png"))); // NOI18N
        btnUpdate_Faculty.setText("Sửa");
        btnUpdate_Faculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate_FacultyActionPerformed(evt);
            }
        });

        btnDelete_Faculty.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnDelete_Faculty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IconDelete.png"))); // NOI18N
        btnDelete_Faculty.setText("Xóa");
        btnDelete_Faculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete_FacultyActionPerformed(evt);
            }
        });

        lblSearchFaculty.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSearchFaculty.setText("Nhập tên khoa :");

        txtSearchFaculty.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnSearchFaculty.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSearchFaculty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IconSearch.png"))); // NOI18N
        btnSearchFaculty.setPreferredSize(new java.awt.Dimension(32, 32));
        btnSearchFaculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchFacultyActionPerformed(evt);
            }
        });

        tblFaculty.setModel(new javax.swing.table.DefaultTableModel(
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
        tblFaculty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFacultyMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblFaculty);

        tblCourse.setModel(new javax.swing.table.DefaultTableModel(
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
        tblCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCourseMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCourse);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCourseName)
                                .addGap(15, 15, 15))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnAdd_Courses)
                                    .addComponent(lblPeriod))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPeriod)
                            .addComponent(txtCourseName)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(btnUpdate_Courses)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addComponent(btnDelete_Courses)))
                        .addGap(117, 117, 117))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lblLogoManageCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblTitleManageCourses)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblLogoManageFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblTitleManageFaculty))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnIndex))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblFacultyName)
                        .addGap(18, 18, 18)
                        .addComponent(txtFal))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblFacultyPhone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFacultyPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblFacultyRoom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFacultyRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSearchFaculty)
                                    .addComponent(btnAdd_Faculty))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtSearchFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSearchFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(btnUpdate_Faculty)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelete_Faculty)))))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblSearchCourses)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearchCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLogoManageFaculty)
                            .addComponent(lblLogoManageCourses)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(lblTitleManageCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(lblTitleManageFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnIndex))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCourseName)
                            .addComponent(txtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFacultyName)
                            .addComponent(txtFal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPeriod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPeriod)
                            .addComponent(lblFacultyPhone)
                            .addComponent(txtFacultyPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFacultyRoom)
                            .addComponent(txtFacultyRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd_Courses, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate_Courses, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete_Courses, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd_Faculty, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate_Faculty, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete_Faculty, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblSearchCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSearchCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblSearchFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtSearchFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnSearchFaculty, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(btnSearchCourses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 61, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdd_CoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd_CoursesActionPerformed
        String message = bus.addCourse(txtCourseName.getText(),txtPeriod.getText());
        JOptionPane.showMessageDialog(rootPane, message);
        showCourse("");
    }//GEN-LAST:event_btnAdd_CoursesActionPerformed

    private void btnIndexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIndexActionPerformed
        Index index = new Index();
        index.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnIndexActionPerformed

    private void btnAdd_FacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd_FacultyActionPerformed
        String message = bus.addFaculty(txtFal.getText(),txtFacultyPhone.getText(),txtFacultyRoom.getText());
        JOptionPane.showMessageDialog(rootPane, message);
        showFaculty("");
    }//GEN-LAST:event_btnAdd_FacultyActionPerformed

    private void txtFacultyRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFacultyRoomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFacultyRoomActionPerformed

    private void btnSearchCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchCoursesActionPerformed
        if(txtSearchCourses.getText().equals("")) JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập gì");
        else showCourse(txtSearchCourses.getText());
    }//GEN-LAST:event_btnSearchCoursesActionPerformed

    private void btnSearchFacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchFacultyActionPerformed
        if(txtSearchFaculty.getText().equals("")) JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập gì");
        else showFaculty(txtSearchFaculty.getText());
    }//GEN-LAST:event_btnSearchFacultyActionPerformed

    private void tblCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCourseMouseClicked
        int i = tblCourse.getSelectedRow();
        txtCourseName.setText(tblCourse.getModel().getValueAt(i, 1).toString());
        txtPeriod.setText(tblCourse.getModel().getValueAt(i, 2).toString());
    }//GEN-LAST:event_tblCourseMouseClicked

    private void tblFacultyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFacultyMouseClicked
        int i = tblFaculty.getSelectedRow();
        txtFal.setText(tblFaculty.getModel().getValueAt(i, 1).toString());
        txtFacultyPhone.setText(tblFaculty.getModel().getValueAt(i, 2).toString());
        txtFacultyRoom.setText(tblFaculty.getModel().getValueAt(i, 3).toString());
    }//GEN-LAST:event_tblFacultyMouseClicked

    private void btnUpdate_CoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate_CoursesActionPerformed
        String message = bus.updateCourse(txtCourseName.getText(),txtPeriod.getText(),
                tblCourse.getModel().getValueAt(tblCourse.getSelectedRow(), 0).toString());
        JOptionPane.showMessageDialog(rootPane, message);
        showCourse("");
    }//GEN-LAST:event_btnUpdate_CoursesActionPerformed

    private void btnUpdate_FacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate_FacultyActionPerformed
        String message = bus.updateFaculty(txtFal.getText(),txtFacultyPhone.getText(),txtFacultyRoom.getText(),
                tblFaculty.getModel().getValueAt(tblFaculty.getSelectedRow(), 0).toString());
        JOptionPane.showMessageDialog(rootPane, message);
        showFaculty("");
    }//GEN-LAST:event_btnUpdate_FacultyActionPerformed

    private void btnDelete_CoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete_CoursesActionPerformed
        int q = JOptionPane.showConfirmDialog(rootPane, "Lưu ý! Khóa sẽ bị xóa, bạn có muốn tiếp tục?");
        if (q == 0) {
            String message = bus.deleteCourse(tblCourse.getModel().getValueAt(tblCourse.getSelectedRow(), 0).toString());
            JOptionPane.showMessageDialog(rootPane, message);
            showCourse("");
        }
    }//GEN-LAST:event_btnDelete_CoursesActionPerformed

    private void btnDelete_FacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete_FacultyActionPerformed
        int q = JOptionPane.showConfirmDialog(rootPane, "Lưu ý! Khoa sẽ bị xóa, bạn có muốn tiếp tục?");
        if (q == 0) {
            String message = bus.deleteFaculty(tblFaculty.getModel().getValueAt(tblFaculty.getSelectedRow(), 0).toString());
            JOptionPane.showMessageDialog(rootPane, message);
            showFaculty("");
        }
    }//GEN-LAST:event_btnDelete_FacultyActionPerformed

    private void showCourse(String searchKey) {
        DefaultTableModel model = new DefaultTableModel();
        Object[] columns = {"ID", "Tên khóa", "Niên khóa"};
        model.setColumnIdentifiers(columns);

        ArrayList<Course> course = bus.showCourse(searchKey);
        for (int i = 0; i < course.size(); i++) {
            model.addRow(new Object[]{
                course.get(i).getId(),
                course.get(i).getName(),
                course.get(i).getPeriod(),});
        }
        tblCourse.setModel(model);
    }

    private void showFaculty(String searchKey) {
        DefaultTableModel model = new DefaultTableModel();
        Object[] columns = {"ID", "Tên khoa", "Số điện thoại liên lạc", "Phòng"};
        model.setColumnIdentifiers(columns);

        ArrayList<Faculty> course = bus.showFaculty(searchKey);
        for (int i = 0; i < course.size(); i++) {
            model.addRow(new Object[]{
                course.get(i).getId(),
                course.get(i).getName(),
                course.get(i).getPhone(),
                course.get(i).getRoom(),});
        }
        tblFaculty.setModel(model);
    }

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
            java.util.logging.Logger.getLogger(Faculty_Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Faculty_Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Faculty_Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Faculty_Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Faculty_Course facuCourse = new Faculty_Course();
                facuCourse.setVisible(true);
                facuCourse.setLocationRelativeTo(null);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd_Courses;
    private javax.swing.JButton btnAdd_Faculty;
    private javax.swing.JButton btnDelete_Courses;
    private javax.swing.JButton btnDelete_Faculty;
    private javax.swing.JToggleButton btnIndex;
    private javax.swing.JButton btnSearchCourses;
    private javax.swing.JButton btnSearchFaculty;
    private javax.swing.JButton btnUpdate_Courses;
    private javax.swing.JButton btnUpdate_Faculty;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCourseName;
    private javax.swing.JLabel lblFacultyName;
    private javax.swing.JLabel lblFacultyPhone;
    private javax.swing.JLabel lblFacultyRoom;
    private javax.swing.JLabel lblLogoManageCourses;
    private javax.swing.JLabel lblLogoManageFaculty;
    private javax.swing.JLabel lblPeriod;
    private javax.swing.JLabel lblSearchCourses;
    private javax.swing.JLabel lblSearchFaculty;
    private javax.swing.JLabel lblTitleManageCourses;
    private javax.swing.JLabel lblTitleManageFaculty;
    private javax.swing.JTable tblCourse;
    private javax.swing.JTable tblFaculty;
    private javax.swing.JTextField txtCourseName;
    private javax.swing.JTextField txtFacultyPhone;
    private javax.swing.JTextField txtFacultyRoom;
    private javax.swing.JTextField txtFal;
    private javax.swing.JTextField txtPeriod;
    private javax.swing.JTextField txtSearchCourses;
    private javax.swing.JTextField txtSearchFaculty;
    // End of variables declaration//GEN-END:variables
}
