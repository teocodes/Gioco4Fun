package com.gioco.view;

import java.awt.Cursor;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;

@SuppressWarnings("serial")
public class SquadrePanelPoint extends JPanel {

	private JLabel lblSquadra;
	private JTextField campoPuntoSq;
	private JButton btnPlusSq;
	private JButton btnMinusSq;
	
	private ImageIcon plus = new ImageIcon(getClass().getResource("/images/plus.png"));
	private ImageIcon minus = new ImageIcon(getClass().getResource("/images/minus.png"));
	
	public SquadrePanelPoint() {

		setBounds(10, 32, 226, 30);
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

		lblSquadra = new JLabel("Squadra");
		add(lblSquadra);

		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		add(panel);

		campoPuntoSq = new JTextField("0");
		panel.add(campoPuntoSq);
		campoPuntoSq.setHorizontalAlignment(SwingConstants.CENTER);
		campoPuntoSq.setEditable(false);
		campoPuntoSq.setColumns(3);

		btnPlusSq = new JButton(plus);
		btnPlusSq.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPlusSq.setActionCommand("Plus");
		add(btnPlusSq);

		btnMinusSq = new JButton(minus);
		btnMinusSq.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMinusSq.setActionCommand("Minus");
		add(btnMinusSq);
	}
	
	public JLabel getLblSquadra() {
		return lblSquadra;
	}

	public JTextField getCampoPuntoSq() {
		return campoPuntoSq;
	}

	public JButton getBtnPlusSq() {
		return btnPlusSq;
	}

	public JButton getBtnMinusSq() {
		return btnMinusSq;
	}
}
