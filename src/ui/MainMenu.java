/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import static java.awt.Image.SCALE_DEFAULT;
import javax.swing.ImageIcon;
import ui.doctors.DoctorProfilePage;
import ui.doctors.DoctorHomePage;
import ui.community.CommunityCRUD;
import ui.doctors.DoctorEncounterPage;
import ui.hospital.HospitalCrud;
import ui.hospitalAdmin.DoctorCrud;
import ui.patient.MyEncounter;
import ui.patient.Appointment;
import ui.patient.MyProfile;
import ui.patient.PatientCrud;
import ui.patient.Shopping;


/**
 *
 * @author ZeyuLiao
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     * @param flag different User type chosen in Entrance
     * @param id
     * @throws java.lang.Exception
     */
    public void MainMenu(int flag, int id) throws Exception {
//        try{
//            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//            }catch(Exception e){
//            System.out.println("主题出错");
//            e.printStackTrace();
//        }
        initComponents();
        setVisible(true);
        jLabelNotification.setVisible(false);
        switch (flag) {
            //Choose Patient
            case 0 -> {
                MyProfile mp = new MyProfile(id);
                jTabbedPaneMenu.addTab("My Profile",new javax.swing.ImageIcon("src//icon//heroicons-ui_63.png"),mp);
                Appointment ap = new Appointment(id);
                jTabbedPaneMenu.addTab("Appointment", new javax.swing.ImageIcon("src//icon//icon_appointment.png"), ap);
                //jTabbedPaneMenu.addTab("Appointment", ap);
                MyEncounter me = new MyEncounter(id);
                jTabbedPaneMenu.addTab("My Encounter", new javax.swing.ImageIcon("src//icon//icon_home.png"), me);
                
                Shopping sh = new Shopping(id);
                jTabbedPaneMenu.addTab("Online Pharmacy", new javax.swing.ImageIcon("src//icon//heroicons-ui_66.png"), sh);
                
            }
            //Choose Doctor
            case 1 -> {
                DoctorHomePage hp = new DoctorHomePage(id);
                DoctorProfilePage pp = new DoctorProfilePage(id);
                DoctorEncounterPage ep = new DoctorEncounterPage(id);
                jLabelNotification.setVisible(hp.isFlag());
                jTabbedPaneMenu.addTab("", new javax.swing.ImageIcon("src//icon//icon_home.png"), hp);
                jTabbedPaneMenu.addTab("", new javax.swing.ImageIcon("src//icon//icon_patient.png"), ep);
                jTabbedPaneMenu.addTab("", new javax.swing.ImageIcon("src//icon//icon_profile.png"), pp);
                
            }
            //Choose Hospital Admin
            case 2 -> {
                DoctorCrud dc = new DoctorCrud();
                jTabbedPaneMenu.addTab("", new javax.swing.ImageIcon("src//icon//icon_patient.png"), dc);
                
            }
            //Choose Community Admin
            case 3 ->{
               HospitalCrud hc = new HospitalCrud();
               jTabbedPaneMenu.addTab("", new javax.swing.ImageIcon("src//icon//hospital.png"), hc);
            }
            
            //Choose System Admin
            case 4-> {
               CommunityCRUD cc = new CommunityCRUD();
               HospitalCrud  hc = new HospitalCrud();
               
               PatientCrud pc = new PatientCrud();
               
               jTabbedPaneMenu.addTab("", new javax.swing.ImageIcon("src//icon//community.png"), cc);
               jTabbedPaneMenu.addTab("", new javax.swing.ImageIcon("src//icon//hospital.png"), hc);
               jTabbedPaneMenu.addTab("", new javax.swing.ImageIcon("src//icon//icon_profile.png"), pc);
               
            }
            
            default -> {
    
                
            }
        }       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
        static public void notification(boolean flag){
        jLabelNotification.setVisible(flag);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHead = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelNotification = new javax.swing.JLabel();
        jTabbedPaneMenu = new javax.swing.JTabbedPane();
        jPanelNavigator = new javax.swing.JPanel();
        jButtonChangeAccount = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(Entrance.logo.getImage());
        setLocation(new java.awt.Point(300, 150));

        jPanelHead.setBackground(new java.awt.Color(255, 255, 255));
        jPanelHead.setLayout(null);
        jPanelHead.add(jLabelLogo);
        jLabelLogo.setBounds(0, 10, 320, 60);
        ImageIcon logoHospital = new ImageIcon("src//image//Logo.png");
        logoHospital.setImage(logoHospital.getImage().getScaledInstance(jLabelLogo.getWidth(),jLabelLogo.getHeight(),SCALE_DEFAULT));
        jLabelLogo.setIcon(logoHospital);

        jPanel1.setLayout(null);

        jLabelNotification.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabelNotification);
        jLabelNotification.setBounds(0, 0, 20, 20);
        ImageIcon not = new ImageIcon("src//icon//icon_reddot.png");
        not.setImage(not.getImage().getScaledInstance(jLabelNotification.getWidth(),jLabelNotification.getHeight(),SCALE_DEFAULT));
        jLabelNotification.setIcon(not);

        jTabbedPaneMenu.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPaneMenu.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPaneMenu.setAlignmentX(1.0F);
        jTabbedPaneMenu.setAlignmentY(1.0F);
        jTabbedPaneMenu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTabbedPaneMenu.setNextFocusableComponent(this);
        jPanel1.add(jTabbedPaneMenu);
        jTabbedPaneMenu.setBounds(0, 0, 1020, 440);
        jTabbedPaneMenu.getAccessibleContext().setAccessibleName("");

        jPanelNavigator.setBackground(new java.awt.Color(149, 177, 182));
        jPanelNavigator.setLayout(null);

        jButtonChangeAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangeAccountActionPerformed(evt);
            }
        });
        jPanelNavigator.add(jButtonChangeAccount);
        jButtonChangeAccount.setBounds(970, 10, 40, 40);
        ImageIcon logout = new ImageIcon("src//icon//icon_ChangeAccount.png");
        logout.setImage(logout.getImage().getScaledInstance(jButtonChangeAccount.getWidth(),jButtonChangeAccount.getHeight(),SCALE_DEFAULT));
        jButtonChangeAccount.setIcon(logout);

        jLabel1.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SERVE ANY TIME");
        jPanelNavigator.add(jLabel1);
        jLabel1.setBounds(30, 10, 180, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelNavigator, javax.swing.GroupLayout.DEFAULT_SIZE, 1023, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelHead, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelNavigator, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonChangeAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangeAccountActionPerformed
        // TODO add your handling code here:
        Entrance et = new Entrance();
        et.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonChangeAccountActionPerformed

//    /**
//     * @param flag different
//     */
//    public void MainMenu(int flag) {
//        /* Set the Nimbus look and feel */
////        try{
////            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
////            }catch(Exception e){
////            System.out.println("Error in theme");
////            e.printStackTrace();
////            }
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainMenu().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonChangeAccount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelLogo;
    public static javax.swing.JLabel jLabelNotification;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelHead;
    private javax.swing.JPanel jPanelNavigator;
    private javax.swing.JTabbedPane jTabbedPaneMenu;
    // End of variables declaration//GEN-END:variables
}
