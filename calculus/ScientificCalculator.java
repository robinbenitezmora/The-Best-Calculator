import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ScientificCalculator extends JFrame {
  public static String cstatus = "Disonnected";
  public String person2 = "";
  public static String username = "";
  static int portnum = 0;
  public static String IpAddress = ""; // Added variable name
  public static ServerSocket ssc = null;
  public static Socket sc = null;
  public static DataInputStream in;
  public static DataOutputStream out;

  public ScientificCalculator() {
    initComponents();
    seticon()
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">
  private void initComponents() {

    JPanel jPanel1 = new javax.swing.JPanel();
    JPanel jPanel2 = new javax.swing.JPanel();
    JRadioButton jRadioButton1 = new javax.swing.JRadioButton();
    JRadioButton jRadioButton2 = new javax.swing.JRadioButton();
    JLabel jLabel3 = new javax.swing.JLabel();
    JTextField jTextField1 = new javax.swing.JTextField();
    JLabel jLabel4 = new javax.swing.JLabel();
    JTextField jTextField2 = new javax.swing.JTextField();
    JLabel jLabel5 = new javax.swing.JLabel();
    JTextField jTextField3 = new javax.swing.JTextField();
    JButton jButton3 = new javax.swing.JButton();
    JButton jButton4 = new javax.swing.JButton();
    JLabel jLabel6 = new javax.swing.JLabel();
    JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
    JTextArea jTextArea1 = new javax.swing.JTextArea();
    JScrollPane jScrollPane2 = new javax.swing.JScrollPane();
    JTextArea jTextArea2 = new javax.swing.JTextArea();
    JButton jButton2 = new javax.swing.JButton();
    JLabel jLabel1 = new javax.swing.JLabel();
    JLabel jLabel2 = new javax.swing.JLabel();
    JLabel jLabel7 = new javax.swing.JLabel();
    JLabel jLabel8 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Scientific Calculator");
    setMaximumSize(new java.awt.Dimension(600, 400));
    setMinimumSize(new java.awt.Dimension(600, 400));
    setResizable(false);

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));
    jPanel1.setMaximumSize(new java.awt.Dimension(600, 400));
    jPanel1.setMinimumSize(new java.awt.Dimension(600, 400));
    jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel1.setLayout(null);

    jPanel2.setBackground(new java.awt.Color(200, 200, 200));
    jPanel2.setMaximumSize(new java.awt.Dimension(300, 400));
    jPanel2.setMinimumSize(new java.awt.Dimension(300, 400));
    jPanel2.setPreferredSize(new java.awt.Dimension(300, 400));

    jRadioButton1.setText("Host");
    jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jRadioButton1ActionPerformed(evt);
      }
    });

    jRadioButton2.setText("Client");
    jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jRadioButton2ActionPerformed(evt);
      }
    });

    jLabel3.setText("IP Address");
    jLabel3.setForeground(new java.awt.Color(30, 30, 30));
    jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12));

    jTextField1.setText("localhost");
    jTextField1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1ActionPerformed(evt);
      }
    });

    jLabel4.setText("Port Number");
    jLabel4.setForeground(new java.awt.Color(30, 30, 30));

    jTextField2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jTextField2ActionPerformed(evt);
      }
    });

    jLabel5.setText("Username");
    jLabel5.setForeground(new java.awt.Color(30, 30, 30));
    jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12));
    
    jButton3.setBackground(new java.awt.Color(255, 255, 255));
    jButton3.setText("Connect");
    jButton3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton3ActionPerformed(evt);
      }
    });

    jButton4.setBackground(new java.awt.Color(255, 255, 255));
    jButton4.setText("Disconnect");
    jButton4.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton4ActionPerformed(evt);
      }
    });

    jLabel6.setForeground(new java.awt.Color(30, 30, 30));
    jLabel6.setText("None key clicked");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup().addGap(20, 20, 20)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup().addComponent(jRadioButton1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE).addComponent(jRadioButton2))
                .addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel5)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createSequentialGroup().addComponent(jButton3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                    .addComponent(jButton4)))
            .addGap(20, 20, 20))
        .addGroup(jPanel2Layout.createSequentialGroup().addGap(20, 20, 20).addComponent(jLabel6)
            .addContainerGap(200, Short.MAX_VALUE)));
