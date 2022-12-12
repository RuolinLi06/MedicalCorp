/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.deliver;

import dao.DeliverDao;
import static java.awt.Image.SCALE_DEFAULT;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Deliver;
import ui.Entrance;

/**
 *
 * @author ZeyuLiao
 */
public class DeliverPanel extends javax.swing.JFrame {

    /**
     * Creates new form DeliverPanel
     */
    
    DeliverDao dDao = new DeliverDao();
    
    public DeliverPanel(String Delivery_NO) throws Exception {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        jPanelConfirmBg.setVisible(false);
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelNewOrder = new javax.swing.JPanel();
        jPanelTableBg = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableNewOrder = new javax.swing.JTable();
        jPanelInfoBg = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabelDeliverNO = new javax.swing.JLabel();
        jTextFieldDeliverNO = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldOrderID = new javax.swing.JTextField();
        jLabelDeliverComp = new javax.swing.JLabel();
        jTextFieldDeliverCompany = new javax.swing.JTextField();
        jPanelConfirmBg = new javax.swing.JPanel();
        jButtonConfirm = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelBarcode = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButtonLogout = new javax.swing.JButton();
        jButtonVerify = new javax.swing.JButton();
        jButtonView = new javax.swing.JButton();
        jPanelHistoryOrder = new javax.swing.JPanel();
        jPanelHisOdBg = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableHistoryOrder = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButtonViewDetail = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabelDeliverNO1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelDeliverComp1 = new javax.swing.JLabel();
        jTextFieldHDeliverCompany = new javax.swing.JTextField();
        jTextFieldHOrderID = new javax.swing.JTextField();
        jTextFieldHDeliverNO = new javax.swing.JTextField();
        jLabelDeliverComp2 = new javax.swing.JLabel();
        jTextFieldHDeliverStatus = new javax.swing.JTextField();
        jTextFieldHDeliverTime = new javax.swing.JTextField();
        jLabelDeliverComp3 = new javax.swing.JLabel();
        jButtonViewDetail1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButtonHLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelNewOrder.setBackground(new java.awt.Color(149, 177, 182));

        jPanelTableBg.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableNewOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Deliver Number", "Order ID", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTableNewOrder);

        javax.swing.GroupLayout jPanelTableBgLayout = new javax.swing.GroupLayout(jPanelTableBg);
        jPanelTableBg.setLayout(jPanelTableBgLayout);
        jPanelTableBgLayout.setHorizontalGroup(
            jPanelTableBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTableBgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelTableBgLayout.setVerticalGroup(
            jPanelTableBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTableBgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jPanelInfoBg.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelDeliverNO.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelDeliverNO.setText("Deliver No. :");

        jTextFieldDeliverNO.setEditable(false);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Order ID :");

        jTextFieldOrderID.setEditable(false);

        jLabelDeliverComp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelDeliverComp.setText("Deliver Company :");

        jTextFieldDeliverCompany.setEditable(false);

        jPanelConfirmBg.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelConfirmBg.setLayout(null);

        jButtonConfirm.setText("Confirm");
        jButtonConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmActionPerformed(evt);
            }
        });
        jPanelConfirmBg.add(jButtonConfirm);
        jButtonConfirm.setBounds(320, 70, 100, 29);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Click Confirm Button to Deliver");
        jPanelConfirmBg.add(jLabel1);
        jLabel1.setBounds(90, 80, 210, 20);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Package Info Generated!");
        jPanelConfirmBg.add(jLabel3);
        jLabel3.setBounds(120, 60, 150, 20);

        jLabelBarcode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelConfirmBg.add(jLabelBarcode);
        jLabelBarcode.setBounds(10, 10, 410, 50);
        ImageIcon Barcode = new ImageIcon("src//image//barcode.png");
        Barcode.setImage(Barcode.getImage().getScaledInstance(jLabelBarcode.getWidth(),jLabelBarcode.getHeight(),SCALE_DEFAULT));
        jLabelBarcode.setIcon(Barcode);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelConfirmBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDeliverComp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelDeliverNO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldDeliverNO, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                    .addComponent(jTextFieldOrderID)
                    .addComponent(jTextFieldDeliverCompany))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelDeliverNO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldDeliverNO, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelDeliverComp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldDeliverCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelConfirmBg, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Zeyu Liao");

        jButtonLogout.setText("Logout");
        jButtonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jButtonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addComponent(jButtonLogout))
        );

        jButtonVerify.setText("Verify");
        jButtonVerify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerifyActionPerformed(evt);
            }
        });

        jButtonView.setText("View");
        jButtonView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelInfoBgLayout = new javax.swing.GroupLayout(jPanelInfoBg);
        jPanelInfoBg.setLayout(jPanelInfoBgLayout);
        jPanelInfoBgLayout.setHorizontalGroup(
            jPanelInfoBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoBgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInfoBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInfoBgLayout.createSequentialGroup()
                        .addGap(0, 226, Short.MAX_VALUE)
                        .addGroup(jPanelInfoBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInfoBgLayout.createSequentialGroup()
                                .addComponent(jButtonView, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonVerify, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanelInfoBgLayout.setVerticalGroup(
            jPanelInfoBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInfoBgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelInfoBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonView, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVerify, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelNewOrderLayout = new javax.swing.GroupLayout(jPanelNewOrder);
        jPanelNewOrder.setLayout(jPanelNewOrderLayout);
        jPanelNewOrderLayout.setHorizontalGroup(
            jPanelNewOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNewOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTableBg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelInfoBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelNewOrderLayout.setVerticalGroup(
            jPanelNewOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNewOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelNewOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTableBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelInfoBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("New Order", jPanelNewOrder);

        jPanelHistoryOrder.setBackground(new java.awt.Color(149, 177, 182));

        jPanelHisOdBg.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelHisOdBg.setPreferredSize(new java.awt.Dimension(536, 443));

        jTableHistoryOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Delivery NO.", "Order ID", "Deliver Status", "Delivered Time"
            }
        ));
        jScrollPane2.setViewportView(jTableHistoryOrder);

        javax.swing.GroupLayout jPanelHisOdBgLayout = new javax.swing.GroupLayout(jPanelHisOdBg);
        jPanelHisOdBg.setLayout(jPanelHisOdBgLayout);
        jPanelHisOdBgLayout.setHorizontalGroup(
            jPanelHisOdBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHisOdBgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelHisOdBgLayout.setVerticalGroup(
            jPanelHisOdBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHisOdBgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonViewDetail.setText("View");
        jButtonViewDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewDetailActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelDeliverNO1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelDeliverNO1.setText("Deliver No. :");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Order ID :");

        jLabelDeliverComp1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelDeliverComp1.setText("Deliver Company :");

        jTextFieldHDeliverCompany.setEditable(false);

        jTextFieldHOrderID.setEditable(false);

        jTextFieldHDeliverNO.setEditable(false);

        jLabelDeliverComp2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelDeliverComp2.setText("Deliver Status");

        jTextFieldHDeliverStatus.setEditable(false);

        jTextFieldHDeliverTime.setEditable(false);

        jLabelDeliverComp3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelDeliverComp3.setText("Delivered Time :");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDeliverComp3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelDeliverComp2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelDeliverComp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelDeliverNO1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldHDeliverNO, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                    .addComponent(jTextFieldHOrderID)
                    .addComponent(jTextFieldHDeliverTime)
                    .addComponent(jTextFieldHDeliverStatus)
                    .addComponent(jTextFieldHDeliverCompany))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelDeliverNO1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldHDeliverNO, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldHOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDeliverComp1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldHDeliverCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDeliverComp2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldHDeliverStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDeliverComp3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldHDeliverTime, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonViewDetail1.setText("Search");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Zeyu Liao");

        jButtonHLogout.setText("Logout");
        jButtonHLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jButtonHLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addComponent(jButtonHLogout))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButtonViewDetail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonViewDetail1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonViewDetail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonViewDetail1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelHistoryOrderLayout = new javax.swing.GroupLayout(jPanelHistoryOrder);
        jPanelHistoryOrder.setLayout(jPanelHistoryOrderLayout);
        jPanelHistoryOrderLayout.setHorizontalGroup(
            jPanelHistoryOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHistoryOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelHisOdBg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelHistoryOrderLayout.setVerticalGroup(
            jPanelHistoryOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHistoryOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHistoryOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelHisOdBg, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("History Deliver Order", jPanelHistoryOrder);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewActionPerformed
        // TODO add your handling code here:
        int selectRowIndex = jTableNewOrder.getSelectedRow();
            if(selectRowIndex <0){
                JOptionPane.showMessageDialog(this,"Please select a row to view details");
                return;
            }
            DefaultTableModel model = (DefaultTableModel) jTableNewOrder.getModel();
            String deliver_NO = model.getValueAt(selectRowIndex,0).toString();
            Deliver d = new Deliver();
        try {
            d = dDao.getDeliverByNo(deliver_NO);
        } catch (Exception ex) {
            Logger.getLogger(DeliverPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTextFieldDeliverNO.setText(d.getDelivery_NO());
        jTextFieldOrderID.setText(d.getOrder_id());
        jTextFieldDeliverCompany.setText(d.getDelivery_company());
    }//GEN-LAST:event_jButtonViewActionPerformed

    private void jButtonVerifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerifyActionPerformed
        // TODO add your handling code here:
        if("".equals(jTextFieldDeliverNO.getText())) JOptionPane.showMessageDialog(this,"Please select a row to view details first");
        else {
            jTextFieldDeliverCompany.setText("DHL");
            jPanelConfirmBg.setVisible(true);
        }
    }//GEN-LAST:event_jButtonVerifyActionPerformed

    private void jButtonViewDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewDetailActionPerformed
        // TODO add your handling code here:
        int selectRowIndex = jTableHistoryOrder.getSelectedRow();
            if(selectRowIndex <0){
                JOptionPane.showMessageDialog(this,"Please select a row to view details");
                return;
            }
            DefaultTableModel model = (DefaultTableModel) jTableHistoryOrder.getModel();
            String deliver_NO = model.getValueAt(selectRowIndex,0).toString();
            Deliver d = new Deliver();
        try {
            d = dDao.getDeliverByNo(deliver_NO);
        } catch (Exception ex) {
            Logger.getLogger(DeliverPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTextFieldHDeliverNO.setText(d.getDelivery_NO());
        jTextFieldHOrderID.setText(d.getOrder_id());
        jTextFieldHDeliverCompany.setText(d.getDelivery_company());
        jTextFieldHDeliverStatus.setText(d.getDelivery_status());
        jTextFieldHDeliverTime.setText(d.getDelivered_time());
        
    }//GEN-LAST:event_jButtonViewDetailActionPerformed

    private void jButtonHLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHLogoutActionPerformed
        // TODO add your handling code here:
        dispose();
        new Entrance().setVisible(true);
    }//GEN-LAST:event_jButtonHLogoutActionPerformed

    private void jButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLogoutActionPerformed

    private void jButtonConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonConfirmActionPerformed

    
    private void populateTable() throws Exception{
    DefaultTableModel modelNewOrder = (DefaultTableModel) jTableNewOrder.getModel();
    modelNewOrder.setRowCount(0);
    ArrayList<Deliver> elist = dDao.getAllDeliver();
    for (Deliver d : elist){
        System.out.println(d.getDelivery_status());
        if("pending".equals(d.getDelivery_status())){
            Object[] row = new Object[5];
            row[0] = d.getDelivery_NO();
            row[1] = d.getOrder_id();
            row[2] = d.getDelivery_status();            
            modelNewOrder.addRow(row);  
            }
        }
        
    DefaultTableModel modelHistoryOrder = (DefaultTableModel) jTableHistoryOrder.getModel();
    modelHistoryOrder.setRowCount(0);
    for (Deliver d : elist){
        System.out.println(d.getDelivery_status());
        if("DHL".equals(d.getDelivery_company())){
            Object[] row = new Object[5];
            row[0] = d.getDelivery_NO();
            row[1] = d.getOrder_id();
            row[2] = d.getDelivery_status();
            row[3] = d.getDelivered_time();            
            modelHistoryOrder.addRow(row);  
            }
        }
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfirm;
    private javax.swing.JButton jButtonHLogout;
    private javax.swing.JButton jButtonLogout;
    private javax.swing.JButton jButtonVerify;
    private javax.swing.JButton jButtonView;
    private javax.swing.JButton jButtonViewDetail;
    private javax.swing.JButton jButtonViewDetail1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelBarcode;
    private javax.swing.JLabel jLabelDeliverComp;
    private javax.swing.JLabel jLabelDeliverComp1;
    private javax.swing.JLabel jLabelDeliverComp2;
    private javax.swing.JLabel jLabelDeliverComp3;
    private javax.swing.JLabel jLabelDeliverNO;
    private javax.swing.JLabel jLabelDeliverNO1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelConfirmBg;
    private javax.swing.JPanel jPanelHisOdBg;
    private javax.swing.JPanel jPanelHistoryOrder;
    private javax.swing.JPanel jPanelInfoBg;
    private javax.swing.JPanel jPanelNewOrder;
    private javax.swing.JPanel jPanelTableBg;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableHistoryOrder;
    private javax.swing.JTable jTableNewOrder;
    private javax.swing.JTextField jTextFieldDeliverCompany;
    private javax.swing.JTextField jTextFieldDeliverNO;
    private javax.swing.JTextField jTextFieldHDeliverCompany;
    private javax.swing.JTextField jTextFieldHDeliverNO;
    private javax.swing.JTextField jTextFieldHDeliverStatus;
    private javax.swing.JTextField jTextFieldHDeliverTime;
    private javax.swing.JTextField jTextFieldHOrderID;
    private javax.swing.JTextField jTextFieldOrderID;
    // End of variables declaration//GEN-END:variables
}
