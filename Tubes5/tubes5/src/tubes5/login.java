/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import Controller.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Aji
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    Controller cont;
    DefaultTableModel model;

    public login(Controller _cont) {
        initComponents();
        cont = _cont;
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
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);
        setMinimumSize(new java.awt.Dimension(800, 508));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setBorder(null);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(324, 270, 149, 22);

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField1.setBorder(null);
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(324, 308, 149, 22);

        jButton1.setFont(new java.awt.Font("04b_19", 0, 30)); // NOI18N
        jButton1.setText("LogiN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(485, 265, 111, 67);

        jLabel3.setFont(new java.awt.Font("04b_19", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("something wrong with your input.. please check again");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(197, 340, 390, 14);
		jLabel3.setVisible(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubes5/front.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 778, 458);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 778, 458);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("04b_19", 0, 48)); // NOI18N
        jLabel4.setText("Dashboard");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(30, 23, 250, 50);

        jLabel5.setFont(new java.awt.Font("04b_19", 0, 18)); // NOI18N
        jLabel5.setText("Dear Users, Here is Your Task List");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(30, 70, 710, 20);

        jLabel6.setFont(new java.awt.Font("04b_19", 0, 18)); // NOI18N
        jLabel6.setText("Sick oF These Tasks ?");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(420, 400, 200, 20);

        jLabel7.setFont(new java.awt.Font("04b_19", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("LOGOUT HERE");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel7);
        jLabel7.setBounds(630, 400, 110, 20);

		/*Object[][] obj = new Object[cont.task_list.size()][6];
		
		for (int i=0; i< cont.task_list.size(); i++){
			obj[i][0] = cont.task_list.get(i).getName();
			obj[i][1] = cont.task_list.get(i).getTask_category();
			obj[i][2] = cont.task_list.get(i).getDeadline();
			obj[i][3] = cont.task_list.get(i).getCreator();
			obj[i][4] = cont.task_list.get(i).getTag_list().toString();
			if(cont.task_list.get(i).getStatus().equals("0"))
			{
			obj[i][5] = null;
			}
			else
			{
			obj[i][5] = true;
			}
		}*/
		String data[][] = {};
		String col[] = {
                "Task Name", "Category", "Deadline", "Creator", "Tag", "Status"
        };
		model = new DefaultTableModel(data,col){
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        };
        
		jTable1.setModel(model);
		jTable1.addMouseListener(new java.awt.event.MouseAdapter(){
			public void mouseClicked(java.awt.event.MouseEvent e){
				int row = jTable1.rowAtPoint(e.getPoint());
				int col = jTable1.columnAtPoint(e.getPoint());
				System.out.println(row + " lalala "+ col);
				cont.ubahStatus(row);
				cont.update();
				RefreshList();
			}
		});
		
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setResizable(false);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(1).setResizable(false);
        jTable1.getColumnModel().getColumn(2).setResizable(false);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(3).setResizable(false);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(4).setResizable(false);
        jTable1.getColumnModel().getColumn(5).setResizable(false);
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(20);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(30, 100, 720, 290);

        jLabel8.setIcon(new javax.swing.ImageIcon("src/tubes5/list.png")); // NOI18N
        jLabel8.setToolTipText("");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(0, 0, 780, 458);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(820, 10, 778, 458);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubes5/background.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 838, 480);

        pack();
	}// </editor-fold>//GEN-END:initComponents

    public void CreateList() {
        while (model.getRowCount() > 0) {
            model.removeRow(model.getRowCount() - 1);
        }
        for (int i = 0; i < cont.task_list.size(); i++) {
            Object obj[] = new Object[6];
            obj[0] = cont.task_list.get(i).getName();
            obj[1] = cont.task_list.get(i).getTask_category();
            obj[2] = cont.task_list.get(i).getDeadline();
            obj[3] = cont.task_list.get(i).getCreator();
            obj[4] = cont.task_list.get(i).getTag_list().toString();
            if (cont.task_list.get(i).getStatus().equals("0")) {
                obj[5] = null;
            } else {
                obj[5] = true;
            }
            model.insertRow(i, obj);
        }
    }

    public void RefreshList() {
        while (model.getRowCount() > 0) {
            model.removeRow(model.getRowCount() - 1);
        }
        for (int i = 0; i < cont.task_list.size(); i++) {
            Object obj[] = new Object[6];
            obj[0] = cont.task_list.get(i).getName();
            obj[1] = cont.task_list.get(i).getTask_category();
            obj[2] = cont.task_list.get(i).getDeadline();
            obj[3] = cont.task_list.get(i).getCreator();
            obj[4] = cont.task_list.get(i).getTag_list().toString();
            if (cont.task_list.get(i).getStatus().equals("0")) {
                obj[5] = null;
            } else {
                obj[5] = true;
            }
            model.insertRow(i, obj);
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //  if (jTextField1.getText().equals( "ajiganteng")){
        if (cont.login(jTextField1.getText(), jPasswordField1.getText())) {
            jLabel5.setText("Dear " + jTextField1.getText().toUpperCase() + ", Here is Your Task List");
            jTextField1.setEnabled(false);
            jPasswordField1.setEnabled(false);
            jButton1.setEnabled(false);

            cont.loadTask();
            cont.update();
            CreateList();

            int delay = 20;
            new Timer(delay, new ActionListener() {
                int x = jPanel1.getLocation().x;
                int y = jPanel1.getLocation().y;
                int a = jPanel2.getLocation().x;
                int b = jPanel2.getLocation().y;

                @Override
                public void actionPerformed(ActionEvent e) {
                    if (x > -800) {
                        x = x - 12;
                        a = a - 12;
                        jPanel1.setLocation(x, y);
                        jPanel2.setLocation(a, b);
                    } else {
                        ((Timer) e.getSource()).stop();
                        jLabel3.setVisible(false);
                        jTextField1.setText("");
                    }
                }
            }).start();
        } else {
            jLabel3.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        cont.logout();
        int delay = 20;
        new Timer(delay, new ActionListener() {
            int x = jPanel1.getLocation().x;
            int y = jPanel1.getLocation().y;
            int a = jPanel2.getLocation().x;
            int b = jPanel2.getLocation().y;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (x < 10) {
                    x = x + 12;
                    a = a + 12;
                    jPanel1.setLocation(x, y);
                    jPanel2.setLocation(a, b);
                } else {
                    ((Timer) e.getSource()).stop();
                    jTextField1.setEnabled(true);
                    jPasswordField1.setEnabled(true);
                    jButton1.setEnabled(true);
                }
            }
        }).start();
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login(new Controller()).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}