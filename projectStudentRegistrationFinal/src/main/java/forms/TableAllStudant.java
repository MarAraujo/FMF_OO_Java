/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;

import com.mycompany.projectstudentregistration.CenterTableCellRenderer;
import com.mycompany.projectstudentregistration.CrudStudant;
import com.mycompany.projectstudentregistration.StudantData;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author marce
 */
public class TableAllStudant extends javax.swing.JFrame {

    private void setDataTble() {
    List<StudantData> listallStudantData = CrudStudant.getInstance().getAllStudant();
    DefaultTableModel dataTableStudant = (DefaultTableModel) dataTable.getModel();

    // Create instace by CenterTableCellRenderer
    CenterTableCellRenderer centerRenderer = new CenterTableCellRenderer();

    // Get model Column of table
    TableColumnModel columnModel = dataTable.getColumnModel();

    // Define renderer of each cell for each column
    int registrationColumnIndex = 0; // Índice da coluna de matrícula
    columnModel.getColumn(registrationColumnIndex).setCellRenderer(centerRenderer);

    int nameColumnIndex = 1; // Índice da coluna de nome
    columnModel.getColumn(nameColumnIndex).setCellRenderer(centerRenderer);

    int emailColumnIndex = 2; // Índice da coluna de e-mail
    columnModel.getColumn(emailColumnIndex).setCellRenderer(centerRenderer);

    int ageColumnIndex = 3; // Índice da coluna de idade
    columnModel.getColumn(ageColumnIndex).setCellRenderer(centerRenderer);

    for (StudantData std : listallStudantData) {
        Object[] obj = new Object[]{
            std.getRegistration(),
            std.getName(),
            std.getEmail(),
            std.getAge()
        };
        dataTableStudant.addRow(obj);
    }
}

    /**
     * Creates new form TableAllStudant
     */
    public TableAllStudant() {
        initComponents();
        setDataTble();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        reportStudant = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 400));
        setPreferredSize(new java.awt.Dimension(800, 400));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 20, 490));

        reportStudant.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Relatório dos Alunos Cadastrados");
        reportStudant.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        dataTable.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 51, 255))); // NOI18N
        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matrícula", "Name", "E-mail", "Idade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        dataTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        dataTable.setEnabled(false);
        dataTable.setRowHeight(30);
        dataTable.setShowGrid(true);
        jScrollPane1.setViewportView(dataTable);

        reportStudant.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 660, 230));

        getContentPane().add(reportStudant, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 720, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TableAllStudant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableAllStudant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableAllStudant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableAllStudant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableAllStudant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable dataTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel reportStudant;
    // End of variables declaration//GEN-END:variables
}
