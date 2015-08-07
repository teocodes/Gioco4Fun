package com.gioco.view;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import com.gioco.model.SettingsPageModel;

@SuppressWarnings("serial")
public class SettingsPageView extends JFrame implements View {

	private JPanel contentPane;

	private JLabel lblNumSquadre;
	private JLabel lblNomeSquadra;
	private JLabel lblNumTurni;

	private JComboBox<Integer> comboBox_NumSquadre;
	private JComboBox<Integer> comboBox_turni;
	private JTextField textField_NomeSquadra;

	private JButton btnConfermaNumSquadre;
	private JButton btnConfermaTurni;
	private JButton btnAggiungi_NomeSquadra;
	private JButton btnReset;
	private JButton btnConferma;

	public SettingsPageView(SettingsPageModel model) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JPanel panelContainer = new JPanel();
		contentPane.add(panelContainer);
		panelContainer.setBorder(new TitledBorder(null, "Impostazioni",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelContainer.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel panel = new JPanel();
		panelContainer.add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 418, 0 };
		gbl_panel.rowHeights = new int[] { 33, 0, 33, 0, 0 };
		gbl_panel.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 1.0,
				Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		JPanel panel_NumSquadre = new JPanel();
		GridBagConstraints gbc_panel_NumSquadre = new GridBagConstraints();
		gbc_panel_NumSquadre.anchor = GridBagConstraints.WEST;
		gbc_panel_NumSquadre.fill = GridBagConstraints.VERTICAL;
		gbc_panel_NumSquadre.insets = new Insets(0, 0, 5, 0);
		gbc_panel_NumSquadre.gridx = 0;
		gbc_panel_NumSquadre.gridy = 0;
		panel.add(panel_NumSquadre, gbc_panel_NumSquadre);

		lblNumSquadre = new JLabel("Seleziona n\u00B0 di squadre");
		panel_NumSquadre.add(lblNumSquadre);

		comboBox_NumSquadre = new JComboBox<Integer>();
		comboBox_NumSquadre.setActionCommand("comboBoxSquadre");
		panel_NumSquadre.add(comboBox_NumSquadre);

		btnConfermaNumSquadre = new JButton("Conferma");
		btnConfermaNumSquadre.setActionCommand("btnConfermaNumSquadre");
		panel_NumSquadre.add(btnConfermaNumSquadre);
		comboBox_NumSquadre.addItem(2);
		comboBox_NumSquadre.addItem(3);
		comboBox_NumSquadre.addItem(4);
		comboBox_NumSquadre.addItem(5);

		JPanel panel_hide_NumTurni = new JPanel();
		GridBagConstraints gbc_panel_hide_NumTurni = new GridBagConstraints();
		gbc_panel_hide_NumTurni.insets = new Insets(0, 0, 5, 0);
		gbc_panel_hide_NumTurni.anchor = GridBagConstraints.WEST;
		gbc_panel_hide_NumTurni.fill = GridBagConstraints.VERTICAL;
		gbc_panel_hide_NumTurni.gridx = 0;
		gbc_panel_hide_NumTurni.gridy = 1;
		panel.add(panel_hide_NumTurni, gbc_panel_hide_NumTurni);

		lblNumTurni = new JLabel("Scegli il n\u00B0 di turni per ogni squadra");
		lblNumTurni.setVisible(false);
		panel_hide_NumTurni.add(lblNumTurni);

		comboBox_turni = new JComboBox<Integer>();
		comboBox_turni.setVisible(false);
		comboBox_turni.setActionCommand("comboBoxSquadre");
		panel_hide_NumTurni.add(comboBox_turni);

		btnConfermaTurni = new JButton("Conferma");
		btnConfermaTurni.setVisible(false);
		btnConfermaTurni.setActionCommand("btnConfermaTurni");
		panel_hide_NumTurni.add(btnConfermaTurni);
		comboBox_turni.addItem(1);
		comboBox_turni.addItem(2);
		comboBox_turni.addItem(3);
		comboBox_turni.addItem(4);
		comboBox_turni.addItem(5);

		JPanel panel_hide_NomeSquadra = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_hide_NomeSquadra.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		GridBagConstraints gbc_panel_hide_NomeSquadra = new GridBagConstraints();
		gbc_panel_hide_NomeSquadra.fill = GridBagConstraints.BOTH;
		gbc_panel_hide_NomeSquadra.insets = new Insets(0, 0, 5, 0);
		gbc_panel_hide_NomeSquadra.gridx = 0;
		gbc_panel_hide_NomeSquadra.gridy = 2;
		panel.add(panel_hide_NomeSquadra, gbc_panel_hide_NomeSquadra);

		lblNomeSquadra = new JLabel("Inserisci nome squadra");
		lblNomeSquadra.setVisible(false);
		panel_hide_NomeSquadra.add(lblNomeSquadra);

		textField_NomeSquadra = new JTextField();
		textField_NomeSquadra.setVisible(false);
		textField_NomeSquadra.setName("textField_NomeSquadra");
		panel_hide_NomeSquadra.add(textField_NomeSquadra);
		textField_NomeSquadra.setColumns(10);

		btnAggiungi_NomeSquadra = new JButton("Aggiungi");
		btnAggiungi_NomeSquadra.setActionCommand("btnAggiungi");
		btnAggiungi_NomeSquadra.setVisible(false);
		panel_hide_NomeSquadra.add(btnAggiungi_NomeSquadra);

		JPanel panel_resetConfirm = new JPanel();
		GridBagConstraints gbc_panel_resetConfirm = new GridBagConstraints();
		gbc_panel_resetConfirm.fill = GridBagConstraints.VERTICAL;
		gbc_panel_resetConfirm.gridx = 0;
		gbc_panel_resetConfirm.gridy = 3;
		panel.add(panel_resetConfirm, gbc_panel_resetConfirm);

		btnReset = new JButton("Reset");
		btnReset.setActionCommand("btnReset");
		panel_resetConfirm.add(btnReset);

		btnConferma = new JButton("Conferma");
		btnConferma.setEnabled(false);
		btnConferma.setActionCommand("btnConferma");
		panel_resetConfirm.add(btnConferma);

		setVisible(true);
	}

	public JButton getBtnConfermaNumSquadre() {
		return btnConfermaNumSquadre;
	}

	public JButton getBtnConfermaTurni() {
		return btnConfermaTurni;
	}

	public JButton getBtnAggiungi_NomeSquadra() {
		return btnAggiungi_NomeSquadra;
	}

	public JLabel getLblNomeSquadra() {
		return lblNomeSquadra;
	}

	public JLabel getLblNumTurni() {
		return lblNumTurni;
	}

	public JComboBox<Integer> getComboBox_NumSquadre() {
		return comboBox_NumSquadre;
	}

	public JComboBox<Integer> getComboBox_turni() {
		return comboBox_turni;
	}

	public JTextField getTextField_NomeSquadra() {
		return textField_NomeSquadra;
	}

	public JButton getBtnConferma() {
		return btnConferma;
	}

	@Override
	public void addToListener(ActionListener listener) {
		btnConfermaNumSquadre.addActionListener(listener);
		btnConfermaTurni.addActionListener(listener);
		btnAggiungi_NomeSquadra.addActionListener(listener);
		btnReset.addActionListener(listener);
		btnConferma.addActionListener(listener);
	}

}
