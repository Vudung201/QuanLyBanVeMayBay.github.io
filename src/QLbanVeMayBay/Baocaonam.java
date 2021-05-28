/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLbanVeMayBay;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ketnoiSQL.ketnoiSQL;

/**
 *
 * @author ACER
 */
public class Baocaonam extends javax.swing.JFrame {

    /**
     * Creates new form Baocaonam
     */
    //tạo bảng danh thu năm
    private String header_bcn[] = {"STT", "Tháng", "Số Chuyến bay", "Doanh thu"};
    private DefaultTableModel tblBaocaonam = new DefaultTableModel(header_bcn, 0);
    
    public Baocaonam() {
        initComponents();
        setLocationRelativeTo(null);
        Loand_jComboBox_NamDoanhThu();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox_bcn_nam = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jButton_bcn_lapbc = new javax.swing.JButton();
        jButton_bcn_xoa = new javax.swing.JButton();
        jButton_bcn_in = new javax.swing.JButton();
        jButton_bcn_thoat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_baocaonam = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jLabel_bcn_thongbao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Báo cáo năm");

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Báo cáo năm");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(367, 367, 367)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(33, 33, 33))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel1.setText("Năm");

        jComboBox_bcn_nam.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jComboBox_bcn_nam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Năm hệ thống" }));

        jButton_bcn_lapbc.setBackground(new java.awt.Color(0, 153, 255));
        jButton_bcn_lapbc.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButton_bcn_lapbc.setForeground(new java.awt.Color(255, 255, 255));
        jButton_bcn_lapbc.setText("Lập báo cáo");
        jButton_bcn_lapbc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_bcn_lapbcActionPerformed(evt);
            }
        });

        jButton_bcn_xoa.setBackground(new java.awt.Color(255, 153, 0));
        jButton_bcn_xoa.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButton_bcn_xoa.setForeground(new java.awt.Color(255, 255, 255));
        jButton_bcn_xoa.setText("Xóa báo cáo");
        jButton_bcn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_bcn_xoaActionPerformed(evt);
            }
        });

        jButton_bcn_in.setBackground(new java.awt.Color(0, 204, 0));
        jButton_bcn_in.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButton_bcn_in.setForeground(new java.awt.Color(255, 255, 255));
        jButton_bcn_in.setText("In báo cáo");
        jButton_bcn_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_bcn_inActionPerformed(evt);
            }
        });

        jButton_bcn_thoat.setBackground(new java.awt.Color(255, 51, 0));
        jButton_bcn_thoat.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButton_bcn_thoat.setForeground(new java.awt.Color(255, 255, 255));
        jButton_bcn_thoat.setText("Thoát");
        jButton_bcn_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_bcn_thoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jButton_bcn_lapbc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(jButton_bcn_xoa)
                .addGap(88, 88, 88)
                .addComponent(jButton_bcn_in)
                .addGap(116, 116, 116)
                .addComponent(jButton_bcn_thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_bcn_lapbc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_bcn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_bcn_in, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_bcn_thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        jTable_baocaonam.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTable_baocaonam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "STT", "Tháng", "Số chuyến bay", "Doanh thu"
            }
        ));
        jTable_baocaonam.setRowHeight(30);
        jScrollPane1.setViewportView(jTable_baocaonam);

        jButton5.setText("Xem báo cáo tháng");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jComboBox_bcn_nam, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(55, 55, 55))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_bcn_nam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(jLabel_bcn_thongbao, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_bcn_thongbao, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void Loand_jComboBox_NamDoanhThu() {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        String url = "net.sourceforge.jtds.jdbc.Driver";
        try {
            Class.forName(url);
            conn = ketnoiSQL.getConnection();
            st = conn.createStatement();

            rs = st.executeQuery("select distinct YEAR(ngayTT) as 'nam' from ve");
            Vector data = new Vector();

            while (rs.next()) {
                data.add(rs.getString("nam"));
            }

            DefaultComboBoxModel year_dt = new DefaultComboBoxModel(data);
            jComboBox_bcn_nam.setModel(year_dt);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (st != null) {
                    st.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    
    private void jButton_bcn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_bcn_xoaActionPerformed
        // TODO add your handling code here:
        tblBaocaonam.setRowCount(0);
    }//GEN-LAST:event_jButton_bcn_xoaActionPerformed

    private void jButton_bcn_lapbcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_bcn_lapbcActionPerformed
        // TODO add your handling code here:
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        
        String url = "net.sourceforge.jtds.jdbc.Driver";
        int nam = Integer.parseInt((String) jComboBox_bcn_nam.getSelectedItem());
        int stt = 1;
        try {
            Class.forName(url);
            conn = ketnoiSQL.getConnection();
            // Câu lệnh xem dữ liệu
            String sql = "SELECT MONTH(ngayTT) AS THANG,COUNT(idCb) as SOCHUYENBAY, SUM(tongtien) AS DOANHTHU " +
                            " FROM ve" +
                            " WHERE YEAR(ngayTT) = "+ nam +
                            " GROUP BY MONTH(ngayTT)";
            // Tạo đối tượng thực thi câu lệnh Select
            st = conn.createStatement();

            // Thực thi 
            rs = st.executeQuery(sql);
            Vector data = null;
            tblBaocaonam.setRowCount(0);

            // Trong khi chưa hết dữ liệu
            while (rs.next()) {
                data = new Vector();
                data.add(stt);
                data.add(rs.getString("THANG"));
                data.add(rs.getString("SOCHUYENBAY"));
                data.add(rs.getString("DOANHTHU"));
                // Thêm một dòng vào table model
                tblBaocaonam.addRow(data);
                stt++;
            }

            jTable_baocaonam.setModel(tblBaocaonam); // Thêm dữ liệu vào table
            jLabel_bcn_thongbao.setText("Đã lập báo cáo!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (st != null) {
                    st.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton_bcn_lapbcActionPerformed

    private void jButton_bcn_inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_bcn_inActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Báo cáo đã được in!");
        jLabel_bcn_thongbao.setText("Đã in báo cáo!");
        return;
    }//GEN-LAST:event_jButton_bcn_inActionPerformed

    private void jButton_bcn_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_bcn_thoatActionPerformed
        // TODO add your handling code here:
        mainForm main = new mainForm();
        main.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton_bcn_thoatActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jLabel_bcn_thongbao.setText("");
        Baocaothang bct = new Baocaothang();
        bct.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Baocaonam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Baocaonam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Baocaonam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Baocaonam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Baocaonam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton_bcn_in;
    private javax.swing.JButton jButton_bcn_lapbc;
    private javax.swing.JButton jButton_bcn_thoat;
    private javax.swing.JButton jButton_bcn_xoa;
    private javax.swing.JComboBox<String> jComboBox_bcn_nam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_bcn_thongbao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_baocaonam;
    // End of variables declaration//GEN-END:variables
}
