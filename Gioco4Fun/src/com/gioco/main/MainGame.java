package com.gioco.main;

import com.gioco.controller.Controller;
import com.gioco.model.SettingsPageModel;
import com.gioco.view.SettingsPageView;

public class MainGame {

	public static void main(String[] args) {
		
		SettingsPageModel model = new SettingsPageModel();
		SettingsPageView view = new SettingsPageView(model);
		new Controller(model, view);

	}

}
