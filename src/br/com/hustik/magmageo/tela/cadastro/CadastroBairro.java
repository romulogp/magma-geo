/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hustik.magmageo.tela.cadastro;

import br.com.hustik.magmageo.database.BancoDeDados;
import br.com.hustik.magmageo.tela.MagmaGeo;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rômulo Goelzer Portolann
 * @university UNIVALI - Universidade do Vale do Itajái
 */
public class CadastroBairro extends javax.swing.JDialog {

    private final MagmaGeo telaPrincipal;
    private final BancoDeDados bd;
    /**
     * Creates new form CadastroBairro
     *
     * @param parent
     * @param modal
     * @param telaPrinc
     * @param bd
     */
    public CadastroBairro(java.awt.Frame parent, boolean modal, MagmaGeo telaPrinc, BancoDeDados bd) {
        super(parent, modal);
        initComponents();
        pack(); //tamanho da tela conforme o preferredSize 
        this.telaPrincipal = telaPrinc;
        this.bd = bd;
        updateTableBairros();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel2 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBairros = new javax.swing.JTable();
        jTextFieldPesquisaBairro = new javax.swing.JTextField();
        jButtonPesquisarBairro = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldBairro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldAreaBairro = new javax.swing.JTextField();
        jButtonAdicionarBairro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableBairros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String []
            {
                "ID", "Bairro", "Área"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableBairros);

        jTextFieldPesquisaBairro.setForeground(java.awt.Color.gray);
        jTextFieldPesquisaBairro.setText("Nome do bairro a pesquisar...");

        jButtonPesquisarBairro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/hustik/magmageo/icons/Search-16.png"))); // NOI18N
        jButtonPesquisarBairro.setText("Pesquisar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextFieldPesquisaBairro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPesquisarBairro)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPesquisaBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisarBairro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Cadastro de Bairro");

        jLabel2.setText("Bairro:");

        jLabel3.setText("Área: (polígono)");

        jButtonAdicionarBairro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/hustik/magmageo/icons/Add_16.png"))); // NOI18N
        jButtonAdicionarBairro.setText("Adicionar");
        jButtonAdicionarBairro.setMaximumSize(new java.awt.Dimension(99, 25));
        jButtonAdicionarBairro.setMinimumSize(new java.awt.Dimension(99, 25));
        jButtonAdicionarBairro.setPreferredSize(new java.awt.Dimension(99, 25));
        jButtonAdicionarBairro.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonAdicionarBairroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldAreaBairro)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAdicionarBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(3, 3, 3)
                .addComponent(jTextFieldAreaBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAdicionarBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAdicionarBairroActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonAdicionarBairroActionPerformed
    {//GEN-HEADEREND:event_jButtonAdicionarBairroActionPerformed
        String areaBairro = jTextFieldAreaBairro.getText();
        String bairro     = jTextFieldBairro    .getText();
        //Verificar se campo está vazio
        boolean error = false;
        if (areaBairro.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Por favor, informe a área do bairro.");
            jTextFieldAreaBairro.requestFocus();
            error = true;
        } else if (bairro.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Por favor, informe o nome do bairro.");
            jTextFieldBairro.requestFocus();
            error = true;
        }
        if (!error) {
            //Verificar se o campo de área contém pelo menos 3 pares de coordenadas
            
            //Inserir bairro no banco de dados
            if (bd.cadastroBairro(bairro, areaBairro)) {
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
                //Atualizar tabela de bairros
                updateTableBairros();
                resetComponents();
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar bairro");
                jTextFieldAreaBairro.requestFocus();
            }
            
        }
        
    }//GEN-LAST:event_jButtonAdicionarBairroActionPerformed
    
    private void resetComponents() {
        jTextFieldBairro    .setText("");
        jTextFieldAreaBairro.setText("");
        
        jTextFieldAreaBairro.requestFocus();
    }
    
    private void verifyTextArea() {
        System.out.println("Verificando se campo área possui pelo menos 3 pares de coordenadas...");
    }
    
    private void updateTableBairros() {
        System.out.println("Atualizando a tabela de bairros...");
        
        DefaultTableModel model = new DefaultTableModel();
        model = bd.atualizaListaBairros(model);
        model = tratarPolygonString(model, 2);
        jTableBairros.setModel(model);
    }
    
    private DefaultTableModel tratarPolygonString(DefaultTableModel model, int coluna) {
        int lines = model.getRowCount();
        for (int i = 0; i < lines; i++) {
            String tratar = String.valueOf(model.getValueAt(i, coluna));
            tratar = tratar.replace("POLYGON", "");
            tratar = tratar.replace("(", "");
            tratar = tratar.replace(")", "");
            model.setValueAt(tratar, i, coluna);
        }
        return model;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionarBairro;
    private javax.swing.JButton jButtonPesquisarBairro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTableBairros;
    private javax.swing.JTextField jTextFieldAreaBairro;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldPesquisaBairro;
    // End of variables declaration//GEN-END:variables
}