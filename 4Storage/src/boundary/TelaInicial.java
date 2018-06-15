/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundary;

import java.io.File;
import javax.swing.ImageIcon;

/**
 *
 * @author Mr.W
 */
public class TelaInicial extends javax.swing.JFrame {

	/**
	 * Creates new form TelaInicial
	 */
	public TelaInicial() {
		initComponents();

	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {
		// bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

		lblLogo = new javax.swing.JLabel();
		btnEntrar = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		lblFundo = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("4Storage");
		setMinimumSize(new java.awt.Dimension(1024, 768));
		setResizable(false);
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowOpened(java.awt.event.WindowEvent evt) {
				formWindowOpened(evt);
			}
		});
		getContentPane().setLayout(null);
		getContentPane().add(lblLogo);
		lblLogo.setBounds(290, 230, 440, 130);

		btnEntrar.setBackground(new java.awt.Color(255, 91, 0));
		btnEntrar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
		btnEntrar.setText("Entrar");
		btnEntrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
		btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnEntrar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnEntrarActionPerformed(evt);
			}
		});
		getContentPane().add(btnEntrar);
		btnEntrar.setBounds(380, 470, 270, 60);

		jLabel1.setFont(new java.awt.Font("Audiowide", 0, 24)); // NOI18N
		jLabel1.setForeground(new java.awt.Color(255, 91, 0));
		jLabel1.setText("A r m a z e n e - s e !");
		getContentPane().add(jLabel1);
		jLabel1.setBounds(400, 330, 280, 70);

		lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg.jpg"))); // NOI18N

		// org.jdesktop.beansbinding.Binding binding =
		// org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE,
		// lblFundo, org.jdesktop.beansbinding.ELProperty.create("${background}"),
		// lblFundo, org.jdesktop.beansbinding.BeanProperty.create("background"));
		// bindingGroup.addBinding(binding);

		getContentPane().add(lblFundo);
		lblFundo.setBounds(0, 0, 1030, 770);

		// bindingGroup.bind();

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	private void formWindowOpened(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowOpened
		ImageIcon ico = new ImageIcon("src/Images/logo.png");
		ico.setImage(ico.getImage().getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), 1));
		lblLogo.setIcon(ico);
                new File("C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\SERVER").mkdir();
                new File("C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\SERVER\\LIXEIRA").mkdir();
	}// GEN-LAST:event_formWindowOpened

	private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnEntrarActionPerformed
		TelaLogin chamaLogin = new TelaLogin();
		chamaLogin.setVisible(true);
		this.dispose();
	}// GEN-LAST:event_btnEntrarActionPerformed

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new TelaInicial().setVisible(true);
			}
		});

	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnEntrar;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel lblFundo;
	private javax.swing.JLabel lblLogo;
	// private org.jdesktop.beansbinding.BindingGroup bindingGroup;
	// End of variables declaration//GEN-END:variables
}
