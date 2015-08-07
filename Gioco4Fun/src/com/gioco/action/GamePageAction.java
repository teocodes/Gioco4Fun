package com.gioco.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Comparator;

import javax.swing.JOptionPane;
import javax.swing.Timer;

import com.gioco.controller.Controller;
import com.gioco.model.Costanti;
import com.gioco.model.GamePageModel;
import com.gioco.model.Model;
import com.gioco.model.SettingsPageModel;
import com.gioco.view.GamePageView;
import com.gioco.view.SettingsPageView;
import com.gioco.view.View;

public class GamePageAction {
	private GamePageModel gamePageModel;
	private GamePageView gamePageView;
	private String command;
	private long startTime;
	private static Timer timer;
	
	public GamePageAction(Model model, View view, String command) {
		gamePageModel = (GamePageModel) model;
		gamePageView = (GamePageView) view;
		this.command = command;
		execute();
	}

	public void execute() {
		
		switch (command) {

		case "btnCambia":

			switch (gamePageModel.getStringaCategoria()) {

			case "Lettere":
				gamePageView.getTextArea().setText(Costanti.MSG_LETTERE);
				gamePageView.getTextArea().append(
						gamePageModel.getCategoriaLettere());
				break;
			case "Fantasia":
				gamePageView.getTextArea().setText(Costanti.MSG_FANTASIA);
				break;
			case "Gioco di Squadra":
				gamePageView.getTextArea().setText(
						Costanti.MSG_GIOCO_SQUADRA);
				gamePageView.getTextArea().append(
						gamePageModel.getCategoriaGiocoSquadra());
				break;
			}
			break;

		case "btnContinua":
			gamePageModel.calcolaTurno();
			if (gamePageModel.getTurnoCorrente() == -1) {
				gamePageModel.getListaSquadre().sort(
						Comparator.comparing(p -> p.getPunteggio()));

				int scelta = JOptionPane
						.showConfirmDialog(
								gamePageView,
								"Fine!Il vincitore è: "
										+ gamePageModel
												.getListaSquadre()
												.get(gamePageModel
														.getListaSquadre()
														.size() - 1)
												.getNome()
										+ "\nIniziare una nuova partita?",
								"Game over", JOptionPane.YES_NO_OPTION,
								JOptionPane.QUESTION_MESSAGE);
				if (scelta == 0) {
					SettingsPageModel model = new SettingsPageModel();
					SettingsPageView view = new SettingsPageView(model);
					new Controller(model, view);
				}
				gamePageView.dispose();
			} else {
				gamePageView.getTxtNomeSquadra().setText(
						gamePageModel.getStringaSquadraCorrente());
				gamePageView.getTxtCategoria().setText(
						gamePageModel.getStringaCategoria());
				gamePageView.getTxtTurno().setText(
						String.valueOf(gamePageModel.getTurnoCorrente()));

				switch (gamePageModel.getStringaCategoria()) {

				case "Lettere":
					gamePageView.getTextArea()
							.setText(Costanti.MSG_LETTERE);
					gamePageView.getTextArea().append(
							gamePageModel.getCategoriaLettere());
					break;
				case "Fantasia":
					gamePageView.getTextArea().setText(
							Costanti.MSG_FANTASIA);
					break;
				case "Gioco di Squadra":
					gamePageView.getTextArea().setText(
							Costanti.MSG_GIOCO_SQUADRA);
					gamePageView.getTextArea().append(
							gamePageModel.getCategoriaGiocoSquadra());
					break;
				}
			}
			break;

		case "btnLettera":
			gamePageView.getCampoLettera().setText(
					gamePageModel.getLettera());
			break;

		case "btnDado":
			gamePageView.getCampoDado().setText(gamePageModel.getNumero());
			break;

		case "btnParola":
			gamePageView.getCampoParola()
					.setText(gamePageModel.getParola());
			break;

		case "btnPlayTimer":
			startTime = System.currentTimeMillis();
			timer = new Timer(100, new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					long diffTime = System.currentTimeMillis() - startTime;
					int decSeconds = (int) (diffTime % 1000 / 100);
					int seconds = (int) (diffTime / 1000 % 60);
					int minutes = (int) (diffTime / 60000 % 60);
					String s = String.format("%02d:%02d.%d", minutes,
							seconds, decSeconds);
					gamePageView.getCampoTimer().setText(s);
				}
			});
			timer.start();
			gamePageView.getBtnPlayTimer().setVisible(false);
			gamePageView.getBtnStopTimer().setVisible(true);
			break;

		case "btnStopTimer":
			timer.stop();
			gamePageView.getBtnStopTimer().setVisible(false);
			gamePageView.getBtnPlayTimer().setVisible(true);
			break;

		default:
			break;
		}

	}

}
