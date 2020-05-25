package org.beuwi.simulator.platform.application.views.actions;

import org.beuwi.simulator.managers.LogManager;

import java.net.MalformedURLException;

public class OpenBotLogTabAction
{
	// Bot Name
	public static void update(String name) {
		AddEditorTabAction.update
		(
			"@log::" + name,
			"Log : " + name,
			LogManager.getView(name)
		);
	}
}