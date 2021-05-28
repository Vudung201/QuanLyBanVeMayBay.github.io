/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLbanVeMayBay;

import Service.itemService;
import Service.userService;
import getItem.Item;
import getItem.User;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author ASUS
 */
public class listCBay extends javax.swing.JFrame {

    /**
     * Creates new form listCBay
     */
    itemService itemService;
    Item item;
    DefaultTableModel dfTable;

    public listCBay() {
        initComponents();
        setLocationRelativeTo(null);
        item = new Item();
        itemService = new itemService();
        dfTable = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        dscbTable.setModel(dfTable);
        dfTable.addColumn("ID");
        dfTable.addColumn("Nơi đi");
        dfTable.addColumn("Nơi đến");
        dfTable.addColumn("Số HK");
        dfTable.addColumn("Ngày đi");
        dfTable.addColumn("Hạng ghế");
        dfTable.addColumn("Thời gian đi");
        dfTable.addColumn("Thời gian đến");
        dfTable.addColumn("Giá");
        setTableData(itemService.getAllItem());
    }

    void setTableData(List<Item> items) {
        for (Item item : items) {
            dfTable.addRow(new Object[]{
                item.getIdCB(),
                item.getNoidi(),
                item.getNoiden(),
                item.getSoHK(),
                item.getNgaydi(),
                item.getHangghe(),
                item.getTimedi(),
                item.getTimeden(),
                item.getGia(),});
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        giaText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        timediText = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        timeDen = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        dscbTable = new javax.swing.JTable();
        idText = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        deteleButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        dateText = new com.toedter.calendar.JDateChooser();
        clearButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        diComboBox = new javax.swing.JComboBox<>();
        denComboBox = new javax.swing.JComboBox<>();
        soHKtext = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        hgComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setText("Giá");

        giaText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                giaTextKeyPressed(evt);
            }
        });

        jLabel7.setText("Ngày đi");

        jLabel10.setText("Thời gian đi");

        jLabel11.setText("Thời gian đến");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Danh sách chuyến bay");

        dscbTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nơi đi", "Nơi đến", "Số HK", "Ngày đi", "Hạng ghế", "Thời gian đi", "Thời gian đến", "Giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dscbTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dscbTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dscbTable);

        idText.setEditable(false);

        jLabel12.setText("ID");

        deteleButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        deteleButton.setText("Xóa");
        deteleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deteleButtonActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backButton.setText("Quay lại");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel13.setText("Số HK");

        dateText.setDateFormatString("yyyy-MM-dd");

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        editButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        editButton.setText("Sửa");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        addButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        addButton.setText("Thêm");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Nơi đến");

        jLabel5.setText("Nơi đi");

        diComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ha Noi", "Da Nang", "Ho Chi Minh" }));

        denComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ha Noi", "Da  Nang", "Ho Chi Minh" }));

        soHKtext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                soHKtextKeyPressed(evt);
            }
        });

        jLabel14.setText("Hạng ghế");

        hgComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pho Thong", "Pho Thong DB", "Thuong Gia" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(188, 188, 188)
                                .addComponent(backButton)
                                .addGap(152, 152, 152)
                                .addComponent(deteleButton)
                                .addGap(142, 142, 142)
                                .addComponent(editButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(diComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(idText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                    .addComponent(denComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(99, 99, 99)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(soHKtext)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(giaText)
                                        .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel14))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(timeDen, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                    .addComponent(timediText, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                    .addComponent(hgComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(4, 4, 4)))
                        .addGap(33, 33, 33)
                        .addComponent(clearButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(362, 362, 362)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1017, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(soHKtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(hgComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(timeDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clearButton))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(timediText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(giaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)))
                        .addGap(18, 18, 18)
                        .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(diComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(denComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deteleButton)
                    .addComponent(backButton)
                    .addComponent(editButton)
                    .addComponent(addButton))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dscbTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dscbTableMouseClicked
        // TODO add your handling code here:
        int index = dscbTable.getSelectedRow();
        TableModel model = dscbTable.getModel();
        idText.setText(model.getValueAt(index, 0).toString());
        final DefaultComboBoxModel hnModel = new DefaultComboBoxModel(new String[]{"Ha Noi", "Da Nang", "Ho Chi Minh"});
        final DefaultComboBoxModel dnModel = new DefaultComboBoxModel(new String[]{"Da Nang", "Ha Noi", "Ho Chi Minh"});
        final DefaultComboBoxModel hcmModel = new DefaultComboBoxModel(new String[]{"Ho Chi Minh", "Ha Noi", "Da Nang"});

        String ndi = model.getValueAt(index, 1).toString();
        String nd = model.getValueAt(index, 2).toString();
        if (ndi.equals("Ha Noi")) {
            diComboBox.setModel(hnModel);
        } else if (ndi.equals("Da Nang")) {
            diComboBox.setModel(dnModel);
        } else {
            diComboBox.setModel(hcmModel);
        }

        if (nd.equals("Ha Noi")) {
            denComboBox.setModel(hnModel);
        } else if (nd.equals("Da Nang")) {
            denComboBox.setModel(dnModel);
        } else {
            denComboBox.setModel(hcmModel);
        }

        soHKtext.setText(model.getValueAt(index, 3).toString());
        String st = model.getValueAt(index, 4).toString();
        try {
            dateText.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(st));
        } catch (ParseException ex) {
            Logger.getLogger(listAccount.class.getName()).log(Level.SEVERE, null, ex);
        }
        final DefaultComboBoxModel ptModel = new DefaultComboBoxModel(new String[]{"Pho Thong", "Pho Thong DB", "Thuong Gia"});
        final DefaultComboBoxModel ptdbModel = new DefaultComboBoxModel(new String[]{"Pho Thong DB", "Pho Thong", "Thuong Gia"});
        final DefaultComboBoxModel tgModel = new DefaultComboBoxModel(new String[]{"Thuong Gia", "Pho Thong", "Pho Thong DB"});

        String hg = model.getValueAt(index, 5).toString();
        if (hg.equals("Pho Thong")) {
            hgComboBox.setModel(ptModel);
        } else if (ndi.equals("Pho Thong DB")) {
            hgComboBox.setModel(ptdbModel);
        } else {
            hgComboBox.setModel(tgModel);
        }
        timediText.setText(model.getValueAt(index, 6).toString());
        timeDen.setText(model.getValueAt(index, 7).toString());
        giaText.setText(model.getValueAt(index, 8).toString());
    }//GEN-LAST:event_dscbTableMouseClicked

    private void deteleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deteleButtonActionPerformed
        // TODO add your handling code here:
        int row = dscbTable.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Vui long chon", "Loi", JOptionPane.ERROR_MESSAGE);
        } else {
            int confirm = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa User này ?");
            if (confirm == JOptionPane.YES_OPTION) {
                int itemID = (int) dscbTable.getValueAt(row, 0);
                itemService.deleteItem(itemID);
                dfTable.setRowCount(0);
                setTableData(itemService.getAllItem());

            }
        }
    }//GEN-LAST:event_deteleButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        mainForm main = new mainForm();
        main.setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        idText.setText("");
        soHKtext.setText("");
        timeDen.setText("");
        timediText.setText("");
        giaText.setText("");

    }//GEN-LAST:event_clearButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:int x2 = Integer.parseInt(numeric2.getValue().toString());

        if (soHKtext.getText().equals("") || giaText.getText().equals("") || timediText.getText().equals("") || timeDen.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ", "Thông báo", JOptionPane.ERROR_MESSAGE);

        } else if (diComboBox.getSelectedItem().toString().equals(denComboBox.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(this, "Nơi đi phải khác nơi đến", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            item.setIdCB(Integer.parseInt(idText.getText()));
            item.setNoidi(diComboBox.getSelectedItem().toString());
            item.setNoiden(denComboBox.getSelectedItem().toString());
            item.setSoHK(soHKtext.getText());
            SimpleDateFormat dfm = new SimpleDateFormat("dd-MM-yyyy");
            item.setNgaydi(dfm.format(dateText.getDate()));
            item.setHangghe(hgComboBox.getSelectedItem().toString());
            item.setTimedi(timediText.getText());
            item.setTimeden(timeDen.getText());
            item.setGia(Integer.parseInt(giaText.getText()));
            itemService.updateItem(item);
            dfTable.setRowCount(0);
            setTableData(itemService.getAllItem());

            idText.setText("");
            soHKtext.setText("");
            timeDen.setText("");
            timediText.setText("");
            giaText.setText("");

            JOptionPane.showMessageDialog(this, "Cap nhat thanh cong", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_editButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:

        if (soHKtext.getText().equals("") || giaText.getText().equals("") || timediText.getText().equals("") || timeDen.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else if (diComboBox.getSelectedItem().toString().equals(denComboBox.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(this, "Nơi đi phải khác nơi đến", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }else{
            item.setNoidi(diComboBox.getSelectedItem().toString());
            item.setNoiden(denComboBox.getSelectedItem().toString());
            item.setSoHK(soHKtext.getText());
            SimpleDateFormat dfm = new SimpleDateFormat("dd-MM-yyyy");
            item.setNgaydi(dfm.format(dateText.getDate()));
            item.setHangghe(hgComboBox.getSelectedItem().toString());
            item.setTimedi(timediText.getText());
            item.setTimeden(timeDen.getText());
            item.setGia(Integer.parseInt(giaText.getText()));

            itemService.addItem(item);
            dfTable.setRowCount(0);
            setTableData(itemService.getAllItem());

            JOptionPane.showMessageDialog(this, "Thêm thành Công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_addButtonActionPerformed

    private void soHKtextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_soHKtextKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            soHKtext.setEditable(true);
        } else if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE) {
            soHKtext.setEditable(true);
        } else {
            soHKtext.setEditable(false);
        }
    }//GEN-LAST:event_soHKtextKeyPressed

    private void giaTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_giaTextKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            giaText.setEditable(true);
        } else if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE) {
            giaText.setEditable(true);
        } else {
            giaText.setEditable(false);
        }
    }//GEN-LAST:event_giaTextKeyPressed

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
            java.util.logging.Logger.getLogger(listCBay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(listCBay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(listCBay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(listCBay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new listCBay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton clearButton;
    private com.toedter.calendar.JDateChooser dateText;
    private javax.swing.JComboBox<String> denComboBox;
    private javax.swing.JButton deteleButton;
    private javax.swing.JComboBox<String> diComboBox;
    private javax.swing.JTable dscbTable;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField giaText;
    private javax.swing.JComboBox<String> hgComboBox;
    private javax.swing.JTextField idText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField soHKtext;
    private javax.swing.JTextField timeDen;
    private javax.swing.JTextField timediText;
    // End of variables declaration//GEN-END:variables
}