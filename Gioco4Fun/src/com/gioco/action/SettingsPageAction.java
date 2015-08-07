package com.gioco.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.gioco.controller.Controller;
import com.gioco.model.Costanti;
import com.gioco.model.GamePageModel;
import com.gioco.model.Model;
import com.gioco.model.SettingsPageModel;
import com.gioco.model.Squadra;
import com.gioco.view.GamePageView;
import com.gioco.view.SettingsPageView;
import com.gioco.view.SquadrePanelPoint;
import com.gioco.view.View;

public class SettingsPageAction {
	private SettingsPageModel settingsPageModel;
	private SettingsPageView settingsPageView;
	private String command;
	
	public SettingsPageAction(Model model, View view, String command) {
		settingsPageModel  = (SettingsPageModel) model;
		settingsPageView  = (SettingsPageView) view;
		this.command = command;
		execute();
	}


	public void execute() {
		switch (command) {

		case "btnConfermaNumSquadre":
			settingsPageModel.setNumeroSquadre((int) settingsPageView
					.getComboBox_NumSquadre().getSelectedItem());
			settingsPageView.getComboBox_NumSquadre().setEnabled(false);
			settingsPageView.getBtnConfermaNumSquadre().setEnabled(false);

			settingsPageView.getLblNumTurni().setVisible(true);
			settingsPageView.getComboBox_turni().setVisible(true);
			settingsPageView.getComboBox_turni().setEnabled(true);
			settingsPageView.getBtnConfermaTurni().setVisible(true);
			settingsPageView.getBtnConfermaTurni().setEnabled(true);
			break;

		case "btnConfermaTurni":
			settingsPageModel.setTurni((int) settingsPageView
					.getComboBox_turni().getSelectedItem());

			settingsPageView.getComboBox_turni().setEnabled(false);
			settingsPageView.getBtnConfermaTurni().setEnabled(false);

			settingsPageView.getLblNomeSquadra().setVisible(true);
			settingsPageView.getTextField_NomeSquadra().setVisible(true);
			settingsPageView.getTextField_NomeSquadra().setEnabled(true);
			settingsPageView.getBtnAggiungi_NomeSquadra().setVisible(true);
			settingsPageView.getBtnAggiungi_NomeSquadra().setEnabled(true);
			break;

		case "btnAggiungi":
			String txt_squadra = settingsPageView
					.getTextField_NomeSquadra().getText();

			if (!txt_squadra.isEmpty()) {
				settingsPageModel.addSquadra(txt_squadra);
				if (settingsPageModel.isLast()) {
					settingsPageView.getBtnAggiungi_NomeSquadra()
							.setEnabled(false);
					settingsPageView.getTextField_NomeSquadra().setEnabled(
							false);
				}
				settingsPageView.getTextField_NomeSquadra().setText("");
			} else {
				JOptionPane.showMessageDialog(settingsPageView,
						"Nome squadra vuoto!");
			}

			if (settingsPageModel.getListaSquadre().size() >= settingsPageModel
					.getNumeroSquadre())
				settingsPageView.getBtnConferma().setEnabled(true);

			break;

		case "btnReset":
			settingsPageView.getComboBox_NumSquadre().setSelectedIndex(0);
			settingsPageView.getComboBox_NumSquadre().setEnabled(true);
			settingsPageView.getBtnConfermaNumSquadre().setEnabled(true);

			settingsPageView.getLblNumTurni().setVisible(false);
			settingsPageView.getComboBox_turni().setVisible(false);
			settingsPageView.getComboBox_turni().setEnabled(true);
			settingsPageView.getComboBox_turni().setSelectedIndex(0);
			settingsPageView.getBtnConfermaTurni().setVisible(false);
			settingsPageView.getBtnConfermaTurni().setEnabled(true);

			settingsPageView.getLblNomeSquadra().setVisible(false);
			settingsPageView.getTextField_NomeSquadra().setVisible(false);
			settingsPageView.getTextField_NomeSquadra().setEnabled(true);
			settingsPageView.getTextField_NomeSquadra().setText("");
			settingsPageView.getBtnAggiungi_NomeSquadra().setVisible(false);
			settingsPageView.getBtnAggiungi_NomeSquadra().setEnabled(true);

			settingsPageModel.reset();
			break;

		case "btnConferma":
			settingsPageView.dispose();
			GamePageModel model = new GamePageModel(
					settingsPageModel.getListaSquadre(),
					settingsPageModel.getTurni());
			GamePageView view = new GamePageView(model);

			for (Squadra squadra : model.getListaSquadre()) {
				SquadrePanelPoint squadraPanelPoint = new SquadrePanelPoint();
				squadraPanelPoint.getLblSquadra()
						.setText(squadra.getNome());
				squadraPanelPoint.getCampoPuntoSq().setText(
						String.valueOf(squadra.getPunteggio()));

				squadraPanelPoint.getBtnMinusSq().addActionListener(
						new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								int temp = squadra.getPunteggio() - 1;
								if (temp >= 0) {
									squadraPanelPoint.getCampoPuntoSq()
											.setText(String.valueOf(temp));
									squadra.setPunteggio(temp);
								}

							}
						});

				squadraPanelPoint.getBtnPlusSq().addActionListener(
						new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								int temp = squadra.getPunteggio() + 1;
								squadraPanelPoint.getCampoPuntoSq()
										.setText(String.valueOf(temp));
								squadra.setPunteggio(temp);

							}
						});

				view.getPanel_Squadre().add(squadraPanelPoint);
			}

			model.calcolaTurno();
			view.getTxtNomeSquadra().setText(
					model.getStringaSquadraCorrente());
			view.getTxtCategoria().setText(model.getStringaCategoria());
			view.getTxtTurno().setText(
					String.valueOf(model.getTurnoCorrente()));

			switch (model.getStringaCategoria()) {

			case "Lettere":
				view.getTextArea().setText(Costanti.MSG_LETTERE);
				view.getTextArea().append(model.getCategoriaLettere());
				break;
			case "Fantasia":
				view.getTextArea().setText(Costanti.MSG_FANTASIA);
				break;
			case "Gioco di Squadra":
				view.getTextArea().setText(Costanti.MSG_GIOCO_SQUADRA);
				view.getTextArea().append(model.getCategoriaLettere());
				break;
			}

			new Controller(model, view);

		default:
			break;
		}
	}

}
