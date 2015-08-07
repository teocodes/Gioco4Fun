package com.gioco.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.gioco.action.GamePageAction;
import com.gioco.action.SettingsPageAction;
import com.gioco.model.Model;
import com.gioco.view.View;

public class Controller implements ActionListener {

	private Model model;
	private View view;

	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
		view.addToListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent action) {
		String currentView, command;
		currentView = view.getClass().getSimpleName();
		command = action.getActionCommand();

		//ogni volta crea un nuovo oggetto
		switch (currentView) {
		case "GamePageView":
			new GamePageAction(model, view, command);
			break;

		case "SettingsPageView":
			new SettingsPageAction(model, view, command);
			break;
			
		default:
			break;
		}

	}
}