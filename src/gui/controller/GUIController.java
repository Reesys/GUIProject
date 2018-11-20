package gui.controller;

import gui.model.Duck;
import gui.view.FirstFrame;

public class GUIController
{
	private Duck myDuck;
	private FirstFrame appFrame;

	public GUIController()
	{
		myDuck = new Duck();

		appFrame = new FirstFrame(this);
	}

	public void start()
	{

	}
}
