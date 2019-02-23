/*
 * Copyright (C) 2019 Lucas Meyer
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package frames.analisadorasset.grafico;


/**
 *
 * @author lucasmeyer
 */
public class adicionarsimbolo extends javax.swing.JFrame
{
    public static panels.analisadorasset.grafico.submodulografico submodulograficopai;
    
    //construtor sem busca
    public adicionarsimbolo(panels.analisadorasset.grafico.submodulografico smodpai)
    {
        initComponents();
        
        submodulograficopai = smodpai;
        
        modellistasimbolosencontrados = new javax.swing.DefaultListModel();
        jlistSimbolosEncontrados.setModel(modellistasimbolosencontrados);
    }
    
    //construtor com busca
    public adicionarsimbolo(panels.analisadorasset.grafico.submodulografico smodpai, String textobuscainicial)
    {
        initComponents();
        
        submodulograficopai = smodpai;
        
        modellistasimbolosencontrados = new javax.swing.DefaultListModel();
        jlistSimbolosEncontrados.setModel(modellistasimbolosencontrados);
        
        jtfProcurarSimbolo.setText(textobuscainicial);
    }

    javax.swing.DefaultListModel modellistasimbolosencontrados;
    void procurarsimbolosemostrarnalista()
    {
        modellistasimbolosencontrados.removeAllElements();
        
        if (jCheckBoxIEXSearch.isSelected() == true)
        {
            java.util.List<String> simbolosencontradosiex = 
                submodulograficopai.submodulohpai.assetpai.iaassetpai.tprincipalpai.msapicomms.iex_procurarsimbolo(jtfProcurarSimbolo.getText());
            for (int i = 0; i < simbolosencontradosiex.size(); i++)
            {
                modellistasimbolosencontrados.addElement(simbolosencontradosiex.get(i));
            }  
        }

        if (jCheckBoxAlphaVantageSearch.isSelected() == true)
        {
            java.util.List<String> simbolosencontradosav = 
                submodulograficopai.submodulohpai.assetpai.iaassetpai.tprincipalpai.msapicomms.av_procurarsimbolo(jtfProcurarSimbolo.getText());
            for (int i = 0; i < simbolosencontradosav.size(); i++)
            {
                modellistasimbolosencontrados.addElement(simbolosencontradosav.get(i));
            }
        }        

        if (jCheckBoxCryptoCompareSearch.isSelected() == true)
        {
            java.util.List<String> simbolosencontradoscc = 
                    submodulograficopai.submodulohpai.assetpai.iaassetpai.tprincipalpai.msapicomms.crycom_procurarsimbolo(jtfProcurarSimbolo.getText());
            for (int i = 0; i < simbolosencontradoscc.size(); i++)
            {
                modellistasimbolosencontrados.addElement(simbolosencontradoscc.get(i));
            }
        }
        
        jlistSimbolosEncontrados.setSelectedIndex(0);
    }
    
    void adicionarsimboloprograma()
    {
        String simboloatual = ((String)modellistasimbolosencontrados.getElementAt(jlistSimbolosEncontrados.getSelectedIndex())).split(" - ")[0];
        
        submodulograficopai.adicionarsimboloaotextboxsubmodulo(simboloatual);
        this.dispose();
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

        jPanelFundo = new javax.swing.JPanel();
        jPanelFundo2 = new javax.swing.JPanel();
        jLabelProcurar = new javax.swing.JLabel();
        jtfProcurarSimbolo = new javax.swing.JTextField();
        jbProcurarSimbolo = new javax.swing.JButton();
        jbAdicionarSimbolo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlistSimbolosEncontrados = new javax.swing.JList<>();
        jCheckBoxIEXSearch = new javax.swing.JCheckBox();
        jCheckBoxAlphaVantageSearch = new javax.swing.JCheckBox();
        jCheckBoxCryptoCompareSearch = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Search for Symbol");

        jPanelFundo.setBackground(new java.awt.Color(55, 55, 55));

        jPanelFundo2.setBackground(new java.awt.Color(120, 120, 120));

        jLabelProcurar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelProcurar.setText("Search:");

        jbProcurarSimbolo.setText("OK");
        jbProcurarSimbolo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jbProcurarSimboloActionPerformed(evt);
            }
        });

        jbAdicionarSimbolo.setText("Add");
        jbAdicionarSimbolo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jbAdicionarSimboloActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jlistSimbolosEncontrados);

        jCheckBoxIEXSearch.setBackground(new java.awt.Color(120, 120, 120));
        jCheckBoxIEXSearch.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxIEXSearch.setSelected(true);
        jCheckBoxIEXSearch.setText("IEX");
        jCheckBoxIEXSearch.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jCheckBoxIEXSearchActionPerformed(evt);
            }
        });

        jCheckBoxAlphaVantageSearch.setBackground(new java.awt.Color(120, 120, 120));
        jCheckBoxAlphaVantageSearch.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxAlphaVantageSearch.setSelected(true);
        jCheckBoxAlphaVantageSearch.setText("Alpha Vantage");
        jCheckBoxAlphaVantageSearch.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jCheckBoxAlphaVantageSearchActionPerformed(evt);
            }
        });

        jCheckBoxCryptoCompareSearch.setBackground(new java.awt.Color(120, 120, 120));
        jCheckBoxCryptoCompareSearch.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxCryptoCompareSearch.setSelected(true);
        jCheckBoxCryptoCompareSearch.setText("CryptoCompare");
        jCheckBoxCryptoCompareSearch.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jCheckBoxCryptoCompareSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFundo2Layout = new javax.swing.GroupLayout(jPanelFundo2);
        jPanelFundo2.setLayout(jPanelFundo2Layout);
        jPanelFundo2Layout.setHorizontalGroup(
            jPanelFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFundo2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanelFundo2Layout.createSequentialGroup()
                        .addComponent(jLabelProcurar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfProcurarSimbolo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbProcurarSimbolo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFundo2Layout.createSequentialGroup()
                        .addComponent(jCheckBoxIEXSearch)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBoxAlphaVantageSearch)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBoxCryptoCompareSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                        .addComponent(jbAdicionarSimbolo)))
                .addContainerGap())
        );
        jPanelFundo2Layout.setVerticalGroup(
            jPanelFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFundo2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProcurar)
                    .addComponent(jtfProcurarSimbolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbProcurarSimbolo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbAdicionarSimbolo)
                    .addGroup(jPanelFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBoxIEXSearch)
                        .addComponent(jCheckBoxAlphaVantageSearch)
                        .addComponent(jCheckBoxCryptoCompareSearch)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelFundoLayout = new javax.swing.GroupLayout(jPanelFundo);
        jPanelFundo.setLayout(jPanelFundoLayout);
        jPanelFundoLayout.setHorizontalGroup(
            jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelFundo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelFundoLayout.setVerticalGroup(
            jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelFundo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFundo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFundo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbProcurarSimboloActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jbProcurarSimboloActionPerformed
    {//GEN-HEADEREND:event_jbProcurarSimboloActionPerformed
        procurarsimbolosemostrarnalista();
    }//GEN-LAST:event_jbProcurarSimboloActionPerformed

    private void jbAdicionarSimboloActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jbAdicionarSimboloActionPerformed
    {//GEN-HEADEREND:event_jbAdicionarSimboloActionPerformed
        adicionarsimboloprograma();
    }//GEN-LAST:event_jbAdicionarSimboloActionPerformed

    private void jCheckBoxIEXSearchActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jCheckBoxIEXSearchActionPerformed
    {//GEN-HEADEREND:event_jCheckBoxIEXSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxIEXSearchActionPerformed

    private void jCheckBoxAlphaVantageSearchActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jCheckBoxAlphaVantageSearchActionPerformed
    {//GEN-HEADEREND:event_jCheckBoxAlphaVantageSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxAlphaVantageSearchActionPerformed

    private void jCheckBoxCryptoCompareSearchActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jCheckBoxCryptoCompareSearchActionPerformed
    {//GEN-HEADEREND:event_jCheckBoxCryptoCompareSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxCryptoCompareSearchActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(adicionarsimbolo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(adicionarsimbolo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(adicionarsimbolo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(adicionarsimbolo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new adicionarsimbolo(submodulograficopai).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBoxAlphaVantageSearch;
    private javax.swing.JCheckBox jCheckBoxCryptoCompareSearch;
    private javax.swing.JCheckBox jCheckBoxIEXSearch;
    private javax.swing.JLabel jLabelProcurar;
    private javax.swing.JPanel jPanelFundo;
    private javax.swing.JPanel jPanelFundo2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAdicionarSimbolo;
    private javax.swing.JButton jbProcurarSimbolo;
    private javax.swing.JList<String> jlistSimbolosEncontrados;
    private javax.swing.JTextField jtfProcurarSimbolo;
    // End of variables declaration//GEN-END:variables
}
