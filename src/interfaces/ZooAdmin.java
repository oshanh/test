
package interfaces;

import java.awt.Color;
import static java.time.Clock.system;
import static java.time.InstantSource.system;


public class ZooAdmin extends javax.swing.JFrame {

    //private MigLayout layout;
    public ZooAdmin() {
        initComponents();
        setMenuBg();
        this.setLocationRelativeTo(null);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        tabs = new javax.swing.JTabbedPane();
        Animal_tab = new javax.swing.JPanel();
        AddAnimal = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Employee_tab = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jTextField7 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Ticket_tab = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jTextField11 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        Users_tab = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jTextField15 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        menu1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        menu3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        menu4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        menu2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(0, 153, 0));
        setName("Form"); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setBackground(new java.awt.Color(0, 153, 102));
        jLayeredPane1.setName("jLayeredPane1"); // NOI18N
        jLayeredPane1.setOpaque(true);
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabs.setName("tabs"); // NOI18N

        Animal_tab.setBackground(new java.awt.Color(102, 102, 102));
        Animal_tab.setName("Animal_tab"); // NOI18N
        Animal_tab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddAnimal.setBackground(new java.awt.Color(204, 204, 204));
        AddAnimal.setForeground(new java.awt.Color(0, 0, 0));
        AddAnimal.setName("AddAnimal"); // NOI18N
        AddAnimal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("interfaces/Bundle"); // NOI18N
        jLabel6.setText(bundle.getString("ZooAdmin.jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N
        AddAnimal.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText(bundle.getString("ZooAdmin.jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N
        AddAnimal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 40));

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText(bundle.getString("ZooAdmin.jLabel10.text")); // NOI18N
        jLabel10.setName("jLabel10"); // NOI18N
        AddAnimal.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel11.setForeground(new java.awt.Color(51, 0, 0));
        jLabel11.setText(bundle.getString("ZooAdmin.jLabel11.text")); // NOI18N
        jLabel11.setName("jLabel11"); // NOI18N
        AddAnimal.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, -1));

        jLabel12.setForeground(new java.awt.Color(51, 0, 0));
        jLabel12.setText(bundle.getString("ZooAdmin.jLabel12.text")); // NOI18N
        jLabel12.setName("jLabel12"); // NOI18N
        AddAnimal.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 43, -1));

        jTextField1.setBackground(new java.awt.Color(102, 102, 102));
        jTextField1.setText(bundle.getString("ZooAdmin.jTextField1.text")); // NOI18N
        jTextField1.setName("jTextField1"); // NOI18N
        AddAnimal.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 193, -1));

        jTextField2.setBackground(new java.awt.Color(102, 102, 102));
        jTextField2.setText(bundle.getString("ZooAdmin.jTextField2.text")); // NOI18N
        jTextField2.setName("jTextField2"); // NOI18N
        AddAnimal.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 193, -1));

        jDateChooser1.setForeground(new java.awt.Color(102, 102, 102));
        jDateChooser1.setName("jDateChooser1"); // NOI18N
        AddAnimal.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 190, -1));

        jTextField3.setBackground(new java.awt.Color(102, 102, 102));
        jTextField3.setText(bundle.getString("ZooAdmin.jTextField3.text")); // NOI18N
        jTextField3.setName("jTextField3"); // NOI18N
        AddAnimal.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 193, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        jButton1.setText(bundle.getString("ZooAdmin.jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        AddAnimal.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        jButton2.setText(bundle.getString("ZooAdmin.jButton2.text")); // NOI18N
        jButton2.setName("jButton2"); // NOI18N
        AddAnimal.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/update.png"))); // NOI18N
        jButton3.setText(bundle.getString("ZooAdmin.jButton3.text")); // NOI18N
        jButton3.setName("jButton3"); // NOI18N
        AddAnimal.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText(bundle.getString("ZooAdmin.jLabel14.text")); // NOI18N
        jLabel14.setName("jLabel14"); // NOI18N
        AddAnimal.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 220, 40));

        jTextField4.setBackground(new java.awt.Color(102, 102, 102));
        jTextField4.setColumns(2);
        jTextField4.setForeground(new java.awt.Color(0, 0, 0));
        jTextField4.setText(bundle.getString("ZooAdmin.jTextField4.text")); // NOI18N
        jTextField4.setCaretColor(new java.awt.Color(204, 51, 0));
        jTextField4.setDoubleBuffered(true);
        jTextField4.setDragEnabled(true);
        jTextField4.setName("jTextField4"); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        AddAnimal.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 290, 40));

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTable1.setBackground(new java.awt.Color(153, 153, 153));
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Birth Date", "Family"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setName("jTable1"); // NOI18N
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue(bundle.getString("ZooAdmin.jTable1.columnModel.title0")); // NOI18N
            jTable1.getColumnModel().getColumn(1).setHeaderValue(bundle.getString("ZooAdmin.jTable1.columnModel.title1")); // NOI18N
            jTable1.getColumnModel().getColumn(2).setHeaderValue(bundle.getString("ZooAdmin.jTable1.columnModel.title2")); // NOI18N
            jTable1.getColumnModel().getColumn(3).setHeaderValue(bundle.getString("ZooAdmin.jTable1.columnModel.title3")); // NOI18N
        }

        AddAnimal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 1000, 350));

        Animal_tab.add(AddAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 710));

        tabs.addTab(bundle.getString("ZooAdmin.Animal_tab.TabConstraints.tabTitle"), Animal_tab); // NOI18N

        Employee_tab.setBackground(new java.awt.Color(0, 153, 0));
        Employee_tab.setName("Employee_tab"); // NOI18N
        Employee_tab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText(bundle.getString("ZooAdmin.jLabel15.text")); // NOI18N
        jLabel15.setName("jLabel15"); // NOI18N
        Employee_tab.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText(bundle.getString("ZooAdmin.jLabel16.text")); // NOI18N
        jLabel16.setName("jLabel16"); // NOI18N
        Employee_tab.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, 40));

        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText(bundle.getString("ZooAdmin.jLabel17.text")); // NOI18N
        jLabel17.setName("jLabel17"); // NOI18N
        Employee_tab.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel18.setForeground(new java.awt.Color(51, 0, 0));
        jLabel18.setText(bundle.getString("ZooAdmin.jLabel18.text")); // NOI18N
        jLabel18.setName("jLabel18"); // NOI18N
        Employee_tab.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, -1));

        jLabel19.setForeground(new java.awt.Color(51, 0, 0));
        jLabel19.setText(bundle.getString("ZooAdmin.jLabel19.text")); // NOI18N
        jLabel19.setName("jLabel19"); // NOI18N
        Employee_tab.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 43, -1));

        jTextField5.setBackground(new java.awt.Color(102, 102, 102));
        jTextField5.setText(bundle.getString("ZooAdmin.jTextField5.text")); // NOI18N
        jTextField5.setName("jTextField5"); // NOI18N
        Employee_tab.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 193, -1));

        jTextField6.setBackground(new java.awt.Color(102, 102, 102));
        jTextField6.setText(bundle.getString("ZooAdmin.jTextField6.text")); // NOI18N
        jTextField6.setName("jTextField6"); // NOI18N
        Employee_tab.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 193, -1));

        jDateChooser2.setForeground(new java.awt.Color(102, 102, 102));
        jDateChooser2.setName("jDateChooser2"); // NOI18N
        Employee_tab.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 190, -1));

        jTextField7.setBackground(new java.awt.Color(102, 102, 102));
        jTextField7.setText(bundle.getString("ZooAdmin.jTextField7.text")); // NOI18N
        jTextField7.setName("jTextField7"); // NOI18N
        Employee_tab.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 193, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        jButton4.setText(bundle.getString("ZooAdmin.jButton4.text")); // NOI18N
        jButton4.setName("jButton4"); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        Employee_tab.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        jButton5.setText(bundle.getString("ZooAdmin.jButton5.text")); // NOI18N
        jButton5.setName("jButton5"); // NOI18N
        Employee_tab.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/update.png"))); // NOI18N
        jButton6.setText(bundle.getString("ZooAdmin.jButton6.text")); // NOI18N
        jButton6.setName("jButton6"); // NOI18N
        Employee_tab.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText(bundle.getString("ZooAdmin.jLabel20.text")); // NOI18N
        jLabel20.setName("jLabel20"); // NOI18N
        Employee_tab.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 220, 40));

        jTextField8.setBackground(new java.awt.Color(102, 102, 102));
        jTextField8.setColumns(2);
        jTextField8.setForeground(new java.awt.Color(0, 0, 0));
        jTextField8.setText(bundle.getString("ZooAdmin.jTextField8.text")); // NOI18N
        jTextField8.setCaretColor(new java.awt.Color(204, 51, 0));
        jTextField8.setDoubleBuffered(true);
        jTextField8.setDragEnabled(true);
        jTextField8.setName("jTextField8"); // NOI18N
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        Employee_tab.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 290, 40));

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        jTable2.setBackground(new java.awt.Color(153, 153, 153));
        jTable2.setForeground(new java.awt.Color(0, 0, 0));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Birth Date", "Family"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setName("jTable2"); // NOI18N
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setHeaderValue(bundle.getString("ZooAdmin.jTable1.columnModel.title0")); // NOI18N
            jTable2.getColumnModel().getColumn(1).setHeaderValue(bundle.getString("ZooAdmin.jTable1.columnModel.title1")); // NOI18N
            jTable2.getColumnModel().getColumn(2).setHeaderValue(bundle.getString("ZooAdmin.jTable1.columnModel.title2")); // NOI18N
            jTable2.getColumnModel().getColumn(3).setHeaderValue(bundle.getString("ZooAdmin.jTable1.columnModel.title3")); // NOI18N
        }

        Employee_tab.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 1000, 350));

        tabs.addTab(bundle.getString("ZooAdmin.Employee_tab.TabConstraints.tabTitle"), Employee_tab); // NOI18N

        Ticket_tab.setBackground(new java.awt.Color(153, 51, 0));
        Ticket_tab.setName("Ticket_tab"); // NOI18N
        Ticket_tab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel3.setText(bundle.getString("ZooAdmin.jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N
        Ticket_tab.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -70, 300, 190));

        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText(bundle.getString("ZooAdmin.jLabel21.text")); // NOI18N
        jLabel21.setName("jLabel21"); // NOI18N
        Ticket_tab.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText(bundle.getString("ZooAdmin.jLabel23.text")); // NOI18N
        jLabel23.setName("jLabel23"); // NOI18N
        Ticket_tab.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel24.setForeground(new java.awt.Color(51, 0, 0));
        jLabel24.setText(bundle.getString("ZooAdmin.jLabel24.text")); // NOI18N
        jLabel24.setName("jLabel24"); // NOI18N
        Ticket_tab.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, -1));

        jLabel25.setForeground(new java.awt.Color(51, 0, 0));
        jLabel25.setText(bundle.getString("ZooAdmin.jLabel25.text")); // NOI18N
        jLabel25.setName("jLabel25"); // NOI18N
        Ticket_tab.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 43, -1));

        jTextField9.setBackground(new java.awt.Color(102, 102, 102));
        jTextField9.setText(bundle.getString("ZooAdmin.jTextField9.text")); // NOI18N
        jTextField9.setName("jTextField9"); // NOI18N
        Ticket_tab.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 193, -1));

        jTextField10.setBackground(new java.awt.Color(102, 102, 102));
        jTextField10.setText(bundle.getString("ZooAdmin.jTextField10.text")); // NOI18N
        jTextField10.setName("jTextField10"); // NOI18N
        Ticket_tab.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 193, -1));

        jDateChooser3.setForeground(new java.awt.Color(102, 102, 102));
        jDateChooser3.setName("jDateChooser3"); // NOI18N
        Ticket_tab.add(jDateChooser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 190, -1));

        jTextField11.setBackground(new java.awt.Color(102, 102, 102));
        jTextField11.setText(bundle.getString("ZooAdmin.jTextField11.text")); // NOI18N
        jTextField11.setName("jTextField11"); // NOI18N
        Ticket_tab.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 193, -1));

        jButton7.setText(bundle.getString("ZooAdmin.jButton7.text")); // NOI18N
        jButton7.setName("jButton7"); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        Ticket_tab.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        jButton8.setText(bundle.getString("ZooAdmin.jButton8.text")); // NOI18N
        jButton8.setName("jButton8"); // NOI18N
        Ticket_tab.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jButton9.setText(bundle.getString("ZooAdmin.jButton9.text")); // NOI18N
        jButton9.setName("jButton9"); // NOI18N
        Ticket_tab.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText(bundle.getString("ZooAdmin.jLabel26.text")); // NOI18N
        jLabel26.setName("jLabel26"); // NOI18N
        Ticket_tab.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 220, 40));

        jTextField12.setBackground(new java.awt.Color(102, 102, 102));
        jTextField12.setColumns(2);
        jTextField12.setForeground(new java.awt.Color(0, 0, 0));
        jTextField12.setText(bundle.getString("ZooAdmin.jTextField12.text")); // NOI18N
        jTextField12.setCaretColor(new java.awt.Color(204, 51, 0));
        jTextField12.setDoubleBuffered(true);
        jTextField12.setDragEnabled(true);
        jTextField12.setName("jTextField12"); // NOI18N
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        Ticket_tab.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 290, 40));

        jScrollPane3.setName("jScrollPane3"); // NOI18N

        jTable3.setBackground(new java.awt.Color(153, 153, 153));
        jTable3.setForeground(new java.awt.Color(0, 0, 0));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Birth Date", "Family"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setName("jTable3"); // NOI18N
        jTable3.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setHeaderValue(bundle.getString("ZooAdmin.jTable1.columnModel.title0")); // NOI18N
            jTable3.getColumnModel().getColumn(1).setHeaderValue(bundle.getString("ZooAdmin.jTable1.columnModel.title1")); // NOI18N
            jTable3.getColumnModel().getColumn(2).setHeaderValue(bundle.getString("ZooAdmin.jTable1.columnModel.title2")); // NOI18N
            jTable3.getColumnModel().getColumn(3).setHeaderValue(bundle.getString("ZooAdmin.jTable1.columnModel.title3")); // NOI18N
        }

        Ticket_tab.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 1000, 350));

        tabs.addTab(bundle.getString("ZooAdmin.Ticket_tab.TabConstraints.tabTitle"), Ticket_tab); // NOI18N

        Users_tab.setBackground(new java.awt.Color(153, 153, 0));
        Users_tab.setName("Users_tab"); // NOI18N
        Users_tab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel4.setText(bundle.getString("ZooAdmin.jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N
        Users_tab.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 210, 50));

        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText(bundle.getString("ZooAdmin.jLabel22.text")); // NOI18N
        jLabel22.setName("jLabel22"); // NOI18N
        Users_tab.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText(bundle.getString("ZooAdmin.jLabel28.text")); // NOI18N
        jLabel28.setName("jLabel28"); // NOI18N
        Users_tab.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel29.setForeground(new java.awt.Color(51, 0, 0));
        jLabel29.setText(bundle.getString("ZooAdmin.jLabel29.text")); // NOI18N
        jLabel29.setName("jLabel29"); // NOI18N
        Users_tab.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, -1));

        jLabel30.setForeground(new java.awt.Color(51, 0, 0));
        jLabel30.setText(bundle.getString("ZooAdmin.jLabel30.text")); // NOI18N
        jLabel30.setName("jLabel30"); // NOI18N
        Users_tab.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 43, -1));

        jTextField13.setBackground(new java.awt.Color(102, 102, 102));
        jTextField13.setText(bundle.getString("ZooAdmin.jTextField13.text")); // NOI18N
        jTextField13.setName("jTextField13"); // NOI18N
        Users_tab.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 193, -1));

        jTextField14.setBackground(new java.awt.Color(102, 102, 102));
        jTextField14.setText(bundle.getString("ZooAdmin.jTextField14.text")); // NOI18N
        jTextField14.setName("jTextField14"); // NOI18N
        Users_tab.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 193, -1));

        jDateChooser4.setForeground(new java.awt.Color(102, 102, 102));
        jDateChooser4.setName("jDateChooser4"); // NOI18N
        Users_tab.add(jDateChooser4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 190, -1));

        jTextField15.setBackground(new java.awt.Color(102, 102, 102));
        jTextField15.setText(bundle.getString("ZooAdmin.jTextField15.text")); // NOI18N
        jTextField15.setName("jTextField15"); // NOI18N
        Users_tab.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 193, -1));

        jButton10.setText(bundle.getString("ZooAdmin.jButton10.text")); // NOI18N
        jButton10.setName("jButton10"); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        Users_tab.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        jButton11.setText(bundle.getString("ZooAdmin.jButton11.text")); // NOI18N
        jButton11.setName("jButton11"); // NOI18N
        Users_tab.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jButton12.setText(bundle.getString("ZooAdmin.jButton12.text")); // NOI18N
        jButton12.setName("jButton12"); // NOI18N
        Users_tab.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText(bundle.getString("ZooAdmin.jLabel31.text")); // NOI18N
        jLabel31.setName("jLabel31"); // NOI18N
        Users_tab.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 220, 40));

        jTextField16.setBackground(new java.awt.Color(102, 102, 102));
        jTextField16.setColumns(2);
        jTextField16.setForeground(new java.awt.Color(0, 0, 0));
        jTextField16.setText(bundle.getString("ZooAdmin.jTextField16.text")); // NOI18N
        jTextField16.setCaretColor(new java.awt.Color(204, 51, 0));
        jTextField16.setDoubleBuffered(true);
        jTextField16.setDragEnabled(true);
        jTextField16.setName("jTextField16"); // NOI18N
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });
        Users_tab.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 290, 40));

        jScrollPane4.setName("jScrollPane4"); // NOI18N

        jTable4.setBackground(new java.awt.Color(153, 153, 153));
        jTable4.setForeground(new java.awt.Color(0, 0, 0));
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Birth Date", "Family"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4.setName("jTable4"); // NOI18N
        jTable4.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setHeaderValue(bundle.getString("ZooAdmin.jTable1.columnModel.title0")); // NOI18N
            jTable4.getColumnModel().getColumn(1).setHeaderValue(bundle.getString("ZooAdmin.jTable1.columnModel.title1")); // NOI18N
            jTable4.getColumnModel().getColumn(2).setHeaderValue(bundle.getString("ZooAdmin.jTable1.columnModel.title2")); // NOI18N
            jTable4.getColumnModel().getColumn(3).setHeaderValue(bundle.getString("ZooAdmin.jTable1.columnModel.title3")); // NOI18N
        }

        Users_tab.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 1000, 350));

        tabs.addTab(bundle.getString("ZooAdmin.Users_tab.TabConstraints.tabTitle"), Users_tab); // NOI18N

        jPanel1.add(tabs, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, -39, 1160, 740));

        jLayeredPane1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 1150, 670));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setToolTipText(bundle.getString("ZooAdmin.jPanel3.toolTipText")); // NOI18N
        jPanel3.setName("jPanel3"); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(bundle.getString("ZooAdmin.jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 380, 30));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/red_dot.png"))); // NOI18N
        jLabel27.setText(bundle.getString("ZooAdmin.jLabel27.text")); // NOI18N
        jLabel27.setName("jLabel27"); // NOI18N
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(1375, 6, -1, -1));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/green_dot_20x20.png"))); // NOI18N
        jLabel32.setText(bundle.getString("ZooAdmin.jLabel32.text")); // NOI18N
        jLabel32.setName("jLabel32"); // NOI18N
        jPanel3.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(1349, 6, -1, -1));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/yellow_dot_20x20.png"))); // NOI18N
        jLabel33.setText(bundle.getString("ZooAdmin.jLabel33.text")); // NOI18N
        jLabel33.setName("jLabel33"); // NOI18N
        jPanel3.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(1323, 6, -1, -1));

        jLayeredPane1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1410, 30));

        jPanel2.setName("jPanel2"); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu1.setName("menu1"); // NOI18N
        menu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu1MouseClicked(evt);
            }
        });

        jLabel5.setText(bundle.getString("ZooAdmin.jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N

        javax.swing.GroupLayout menu1Layout = new javax.swing.GroupLayout(menu1);
        menu1.setLayout(menu1Layout);
        menu1Layout.setHorizontalGroup(
            menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );
        menu1Layout.setVerticalGroup(
            menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.add(menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 260, 50));

        menu3.setName("menu3"); // NOI18N
        menu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu3MouseClicked(evt);
            }
        });

        jLabel8.setText(bundle.getString("ZooAdmin.jLabel8.text")); // NOI18N
        jLabel8.setName("jLabel8"); // NOI18N

        javax.swing.GroupLayout menu3Layout = new javax.swing.GroupLayout(menu3);
        menu3.setLayout(menu3Layout);
        menu3Layout.setHorizontalGroup(
            menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu3Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        menu3Layout.setVerticalGroup(
            menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu3Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(16, 16, 16))
        );

        jPanel2.add(menu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 260, 50));

        menu4.setName("menu4"); // NOI18N
        menu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu4MouseClicked(evt);
            }
        });

        jLabel9.setText(bundle.getString("ZooAdmin.jLabel9.text")); // NOI18N
        jLabel9.setName("jLabel9"); // NOI18N

        javax.swing.GroupLayout menu4Layout = new javax.swing.GroupLayout(menu4);
        menu4.setLayout(menu4Layout);
        menu4Layout.setHorizontalGroup(
            menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu4Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        menu4Layout.setVerticalGroup(
            menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu4Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(16, 16, 16))
        );

        jPanel2.add(menu4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 260, 50));

        jLabel13.setBackground(new java.awt.Color(0, 51, 0));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText(bundle.getString("ZooAdmin.jLabel13.text")); // NOI18N
        jLabel13.setName("jLabel13"); // NOI18N
        jLabel13.setOpaque(true);
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 100));

        menu2.setForeground(new java.awt.Color(255, 255, 255));
        menu2.setName("menu2"); // NOI18N
        menu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu2MouseClicked(evt);
            }
        });
        menu2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText(bundle.getString("ZooAdmin.jLabel7.text")); // NOI18N
        jLabel7.setName("jLabel7"); // NOI18N
        menu2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 16, -1, -1));

        jPanel2.add(menu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 260, 50));

        jLayeredPane1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 260, 670));

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void setMenuBg(){
        if(tabs.getSelectedIndex()==0){
            menu1.setBackground(new Color(255,255,255));
        }
        menu2.setBackground(new Color(102,102,102));
        menu3.setBackground(new Color(102,102,102));
         menu4.setBackground(new Color(102,102,102));
    }
    
    private void menu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu1MouseClicked
        // TODO add your handling code here:
        tabs.setSelectedIndex(0);
        menu1.setBackground(new Color(255,255,255));
        menu2.setBackground(new Color(102,102,102));
        menu3.setBackground(new Color(102,102,102));
         menu4.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_menu1MouseClicked

    private void menu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu3MouseClicked
        // TODO add your handling code here:
         tabs.setSelectedIndex(2);
         menu3.setBackground(new Color(255,255,255));
         menu2.setBackground(new Color(102,102,102));
        menu1.setBackground(new Color(102,102,102));
         menu4.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_menu3MouseClicked

    private void menu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu4MouseClicked
        // TODO add your handling code here:
         tabs.setSelectedIndex(3);
         menu4.setBackground(new Color(255,255,255));
         menu2.setBackground(new Color(102,102,102));
        menu3.setBackground(new Color(102,102,102));
         menu1.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_menu4MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void menu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu2MouseClicked
        // TODO add your handling code here:
        tabs.setSelectedIndex(1);
        menu2.setBackground(new Color(255,255,255));
        menu1.setBackground(new Color(102,102,102));
        menu3.setBackground(new Color(102,102,102));
         menu4.setBackground(new Color(102,102,102));
        
    }//GEN-LAST:event_menu2MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel27MouseClicked

    
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
            java.util.logging.Logger.getLogger(ZooAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ZooAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ZooAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ZooAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ZooAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddAnimal;
    private javax.swing.JPanel Animal_tab;
    private javax.swing.JPanel Employee_tab;
    private javax.swing.JPanel Ticket_tab;
    private javax.swing.JPanel Users_tab;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel menu1;
    private javax.swing.JPanel menu2;
    private javax.swing.JPanel menu3;
    private javax.swing.JPanel menu4;
    private javax.swing.JTabbedPane tabs;
    // End of variables declaration//GEN-END:variables
}
