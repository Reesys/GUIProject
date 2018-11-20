package gui.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import gui.controller.GUIController;

public class FirstPanel extends JPanel
{
	private GUIController appController;
	private JLabel firstLabel;
	private JButton firstButton;
	private SpringLayout appLayout;

	public FirstPanel(GUIController appController)
	{
		super();

		this.appController = appController;

		firstLabel = new JLabel("Words in a line!");
		firstButton = new JButton("Click!!");
		appLayout = new SpringLayout();

		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void changeBackground()
	{
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		this.setBackground(new Color(red, green, blue));
	}

	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.add(firstButton);
		this.add(firstLabel);
	}

	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, firstLabel, 70, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, firstLabel, -90, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout .WEST, firstButton, 175, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, firstButton, -135, SpringLayout.SOUTH, this);
	}

	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent mouseClick)
			{
				changeBackground();
			}
		});
	}
}
