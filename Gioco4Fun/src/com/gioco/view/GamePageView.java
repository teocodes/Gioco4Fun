package com.gioco.view;

import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import com.gioco.model.GamePageModel;

@SuppressWarnings("serial")
public class GamePageView extends JFrame implements View {

	private JPanel contentPane;
	private JPanel panel_Squadre;
	
	private JTextField txtNomeSquadra;
	private JTextField txtCategoria;
	private JTextField txtTurno;

	private JTextField campoLettera;
	private JTextField campoDado;
	private JTextField campoParola;
	private JTextField campoTimer;
	private JTextArea textArea;

	private JButton btnCambia;
	private JButton btnContinua;
	private JButton btnLettera;
	private JButton btnDado;
	private JButton btnParola;
	private JButton btnPlayTimer;
	private JButton btnStopTimer;
	
	private ImageIcon timer_play = new ImageIcon(getClass().getResource(
			"/images/play.png"));
	private ImageIcon timer_stop = new ImageIcon(getClass().getResource(
			"/images/stop.png"));
	private ImageIcon dado = new ImageIcon(getClass().getResource(
			"/images/dado.png"));
	private ImageIcon lettere = new ImageIcon(getClass().getResource(
			"/images/lettere.png"));
	private ImageIcon parole = new ImageIcon(getClass().getResource(
			"/images/libro.png"));

	

	public GamePageView(GamePageModel model) {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1049, 483);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

		JPanel panel_title = new JPanel();
		panel_title.setBorder(new BevelBorder(BevelBorder.RAISED, null, null,
				null, null));
		contentPane.add(panel_title);

		JLabel label = new JLabel("Gioco di societ\u00E0");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Wide Latin", Font.BOLD, 22));
		panel_title.add(label);

		JPanel panel = new JPanel();
		contentPane.add(panel);

		JPanel panel_sx = new JPanel();
		panel.add(panel_sx);

		panel_Squadre = new JPanel();
		panel_sx.add(panel_Squadre);
		panel_Squadre.setLayout(new BoxLayout(panel_Squadre, BoxLayout.Y_AXIS));

		JPanel panel_cen = new JPanel();
		panel.add(panel_cen);

		JPanel panel_cenMain = new JPanel();
		panel_cen.add(panel_cenMain);
		panel_cenMain.setAlignmentY(Component.TOP_ALIGNMENT);
		panel_cenMain.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel_cenMain.setLayout(new BoxLayout(panel_cenMain, BoxLayout.Y_AXIS));

		JPanel panel_dati = new JPanel();
		panel_cenMain.add(panel_dati);
		panel_dati.setLayout(new BoxLayout(panel_dati, BoxLayout.Y_AXIS));

		JPanel panel_info = new JPanel();
		panel_dati.add(panel_info);

		JPanel panel_subInfo = new JPanel();
		panel_info.add(panel_subInfo);
		panel_subInfo.setLayout(new BoxLayout(panel_subInfo, BoxLayout.X_AXIS));

		JPanel panel_infoLabel = new JPanel();
		panel_subInfo.add(panel_infoLabel);
		panel_infoLabel.setLayout(new BoxLayout(panel_infoLabel,
				BoxLayout.Y_AXIS));

		JPanel panel_infoSquadra = new JPanel();
		FlowLayout fl_panel_infoSquadra = (FlowLayout) panel_infoSquadra
				.getLayout();
		fl_panel_infoSquadra.setAlignment(FlowLayout.RIGHT);
		panel_infoLabel.add(panel_infoSquadra);

		JLabel lblNomeSquadra = new JLabel("Squadra");
		panel_infoSquadra.add(lblNomeSquadra);

		JPanel panel_infoCat = new JPanel();
		FlowLayout fl_panel_infoCat = (FlowLayout) panel_infoCat.getLayout();
		fl_panel_infoCat.setAlignment(FlowLayout.RIGHT);
		panel_infoLabel.add(panel_infoCat);

		JLabel lblCategoria = new JLabel("Categoria");
		panel_infoCat.add(lblCategoria);

		JPanel panel_infoTurno = new JPanel();
		FlowLayout fl_panel_infoTurno = (FlowLayout) panel_infoTurno
				.getLayout();
		fl_panel_infoTurno.setAlignment(FlowLayout.RIGHT);
		panel_infoLabel.add(panel_infoTurno);

		JLabel lblTurno = new JLabel("Turno");
		panel_infoTurno.add(lblTurno);

		JPanel panel_infoText = new JPanel();
		panel_subInfo.add(panel_infoText);
		panel_infoText
				.setLayout(new BoxLayout(panel_infoText, BoxLayout.Y_AXIS));

		JPanel panel_textSquadra = new JPanel();
		panel_infoText.add(panel_textSquadra);
		FlowLayout fl_panel_textSquadra = (FlowLayout) panel_textSquadra
				.getLayout();
		fl_panel_textSquadra.setAlignment(FlowLayout.LEFT);

		txtNomeSquadra = new JTextField();
		txtNomeSquadra.setName("txtNomeSquadra");
		txtNomeSquadra.setEditable(false);
		panel_textSquadra.add(txtNomeSquadra);
		txtNomeSquadra.setColumns(15);

		JPanel panel_textCat = new JPanel();
		FlowLayout fl_panel_textCat = (FlowLayout) panel_textCat.getLayout();
		fl_panel_textCat.setAlignment(FlowLayout.LEFT);
		panel_infoText.add(panel_textCat);

		txtCategoria = new JTextField();
		txtCategoria.setName("textCategoria");
		txtCategoria.setEditable(false);
		panel_textCat.add(txtCategoria);
		txtCategoria.setColumns(15);

		JPanel panel_textTurno = new JPanel();
		FlowLayout fl_panel_textTurno = (FlowLayout) panel_textTurno
				.getLayout();
		fl_panel_textTurno.setAlignment(FlowLayout.LEFT);
		panel_infoText.add(panel_textTurno);

		txtTurno = new JTextField();
		txtTurno.setName("textTurno");
		txtTurno.setEditable(false);
		panel_textTurno.add(txtTurno);
		txtTurno.setColumns(4);

		JPanel panel_textArea = new JPanel();
		panel_dati.add(panel_textArea);
		
		JScrollPane scrollPane = new JScrollPane();
		panel_textArea.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setName("textArea");
		textArea.setEditable(false);
		textArea.setWrapStyleWord(true);
		textArea.setRows(10);
		textArea.setLineWrap(true);
		textArea.setColumns(35);

		JPanel panel_submit = new JPanel();
		panel_cenMain.add(panel_submit);

		btnCambia = new JButton("Cambia");
		btnCambia.setActionCommand("btnCambia");
		btnCambia.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_submit.add(btnCambia);

		btnContinua = new JButton("Continua");
		btnContinua.setActionCommand("btnContinua");
		btnContinua.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_submit.add(btnContinua);

		JPanel panel_dx = new JPanel();
		panel.add(panel_dx);

		JPanel panel_Buttons = new JPanel();
		panel_dx.add(panel_Buttons);
		panel_Buttons.setLayout(new BoxLayout(panel_Buttons, BoxLayout.Y_AXIS));

		JPanel panel_SingleButton = new JPanel();
		panel_Buttons.add(panel_SingleButton);
		panel_SingleButton.setLayout(new BoxLayout(panel_SingleButton,
				BoxLayout.Y_AXIS));

		JPanel panel_lettera = new JPanel();
		panel_SingleButton.add(panel_lettera);
		panel_lettera.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblPescaLaLettera = new JLabel("Pesca la lettera");
		panel_lettera.add(lblPescaLaLettera);

		JPanel panel_lettera2 = new JPanel();
		panel_SingleButton.add(panel_lettera2);
		panel_lettera2.setLayout(new GridLayout(0, 2, 0, 0));

		JPanel panel_subLettera2 = new JPanel();
		FlowLayout fl_panel_subLettera2 = (FlowLayout) panel_subLettera2
				.getLayout();
		fl_panel_subLettera2.setAlignment(FlowLayout.RIGHT);
		panel_lettera2.add(panel_subLettera2);
		btnLettera = new JButton(lettere);
		btnLettera.setActionCommand("btnLettera");
		btnLettera.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLettera.setPreferredSize(new Dimension(57, 33));
		panel_subLettera2.add(btnLettera);

		JPanel panel2_subLettera2 = new JPanel();
		FlowLayout fl_panel2_subLettera2 = (FlowLayout) panel2_subLettera2
				.getLayout();
		fl_panel2_subLettera2.setAlignment(FlowLayout.LEFT);
		panel_lettera2.add(panel2_subLettera2);

		campoLettera = new JTextField();
		campoLettera.setName("campoLettera");
		panel2_subLettera2.add(campoLettera);
		campoLettera.setEditable(false);
		campoLettera.setHorizontalAlignment(SwingConstants.CENTER);
		campoLettera.setColumns(10);

		JPanel panel_SingleButton2 = new JPanel();
		panel_Buttons.add(panel_SingleButton2);
		panel_SingleButton2.setLayout(new BoxLayout(panel_SingleButton2,
				BoxLayout.Y_AXIS));

		JPanel panel_dado = new JPanel();
		panel_SingleButton2.add(panel_dado);

		JLabel lblDado = new JLabel("Tira il dado");
		panel_dado.add(lblDado);

		JPanel panel_dado2 = new JPanel();
		panel_SingleButton2.add(panel_dado2);
		panel_dado2.setLayout(new GridLayout(0, 2, 0, 0));

		JPanel panel_subDado2 = new JPanel();
		FlowLayout fl_panel_subDado2 = (FlowLayout) panel_subDado2.getLayout();
		fl_panel_subDado2.setAlignment(FlowLayout.RIGHT);
		panel_dado2.add(panel_subDado2);
		btnDado = new JButton(dado);
		btnDado.setActionCommand("btnDado");
		btnDado.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDado.setPreferredSize(new Dimension(57, 33));
		panel_subDado2.add(btnDado);

		JPanel panel2_subDado2 = new JPanel();
		FlowLayout fl_panel2_subDado2 = (FlowLayout) panel2_subDado2
				.getLayout();
		fl_panel2_subDado2.setAlignment(FlowLayout.LEFT);
		panel_dado2.add(panel2_subDado2);

		campoDado = new JTextField();
		campoDado.setName("campoDado");
		panel2_subDado2.add(campoDado);
		campoDado.setEditable(false);
		campoDado.setHorizontalAlignment(SwingConstants.CENTER);
		campoDado.setColumns(10);

		JPanel panel_SingleButton3 = new JPanel();
		panel_Buttons.add(panel_SingleButton3);
		panel_SingleButton3.setLayout(new BoxLayout(panel_SingleButton3,
				BoxLayout.Y_AXIS));

		JPanel panel_parola = new JPanel();
		panel_SingleButton3.add(panel_parola);

		JLabel lblParola = new JLabel("Scegli la parola");
		panel_parola.add(lblParola);

		JPanel panel_parola2 = new JPanel();
		panel_SingleButton3.add(panel_parola2);
		panel_parola2.setLayout(new GridLayout(0, 2, 0, 0));

		JPanel panel_subParola2 = new JPanel();
		panel_parola2.add(panel_subParola2);
		panel_subParola2.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
		btnParola = new JButton(parole);
		btnParola.setActionCommand("btnParola");
		btnParola.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnParola.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_subParola2.add(btnParola);

		JPanel panel2_subParola2 = new JPanel();
		FlowLayout fl_panel2_subParola2 = (FlowLayout) panel2_subParola2
				.getLayout();
		fl_panel2_subParola2.setAlignment(FlowLayout.LEFT);
		panel_parola2.add(panel2_subParola2);

		campoParola = new JTextField();
		campoParola.setName("campoParola");
		panel2_subParola2.add(campoParola);
		campoParola.setEditable(false);
		campoParola.setHorizontalAlignment(SwingConstants.CENTER);
		campoParola.setColumns(12);

		JPanel panel_SingleButton4 = new JPanel();
		panel_Buttons.add(panel_SingleButton4);
		panel_SingleButton4.setLayout(new BoxLayout(panel_SingleButton4,
				BoxLayout.Y_AXIS));

		JPanel panel_timer = new JPanel();
		panel_SingleButton4.add(panel_timer);

		JLabel lblTimer = new JLabel("Timer");
		panel_timer.add(lblTimer);

		JPanel panel_timer2 = new JPanel();
		panel_SingleButton4.add(panel_timer2);
		panel_timer2.setLayout(new GridLayout(0, 2, 0, 0));

		JPanel panel_subTimer2 = new JPanel();
		FlowLayout fl_panel_subTimer2 = (FlowLayout) panel_subTimer2
				.getLayout();
		fl_panel_subTimer2.setAlignment(FlowLayout.RIGHT);
		panel_timer2.add(panel_subTimer2);
		
		btnPlayTimer = new JButton(timer_play);
		btnPlayTimer.setActionCommand("btnPlayTimer");
		btnPlayTimer.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_subTimer2.add(btnPlayTimer);
		
		btnStopTimer = new JButton(timer_stop);
		btnStopTimer.setActionCommand("btnStopTimer");
		btnStopTimer.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnStopTimer.setVisible(false);
		panel_subTimer2.add(btnStopTimer);
		
		JPanel panel2_subTimer2 = new JPanel();
		FlowLayout fl_panel2_subTimer2 = (FlowLayout) panel2_subTimer2
				.getLayout();
		fl_panel2_subTimer2.setAlignment(FlowLayout.LEFT);
		panel_timer2.add(panel2_subTimer2);

		campoTimer = new JTextField();
		campoTimer.setName("campoTimer");
		panel2_subTimer2.add(campoTimer);
		campoTimer.setEditable(false);
		campoTimer.setHorizontalAlignment(SwingConstants.CENTER);
		campoTimer.setColumns(10);
	}

	public JTextField getCampoLettera() {
		return campoLettera;
	}

	public JTextField getCampoDado() {
		return campoDado;
	}

	public JTextField getCampoParola() {
		return campoParola;
	}

	public JTextField getCampoTimer() {
		return campoTimer;
	}

	public JButton getBtnPlayTimer() {
		return btnPlayTimer;
	}

	public JButton getBtnStopTimer() {
		return btnStopTimer;
	}
	
	public JTextField getTxtNomeSquadra() {
		return txtNomeSquadra;
	}

	public JTextField getTxtCategoria() {
		return txtCategoria;
	}

	public JTextField getTxtTurno() {
		return txtTurno;
	}

	public JTextArea getTextArea() {
		return textArea;
	}
	
	public JPanel getPanel_Squadre() {
		return panel_Squadre;
	}

	public void addToListener(ActionListener listener){
		btnCambia.addActionListener(listener);
		btnContinua.addActionListener(listener);
		btnLettera.addActionListener(listener);
		btnDado.addActionListener(listener);
		btnParola.addActionListener(listener);
		btnPlayTimer.addActionListener(listener);
		btnStopTimer.addActionListener(listener);
	}
	
}
