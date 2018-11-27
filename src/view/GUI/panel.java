package view.GUI;

import javax.swing.*;
import controller.GUI.controllerGUI;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;


public class panel extends JPanel
{
	private controllerGUI appController;
	private JLabel textLabel;
	private JButton colorButton;
	
	
	public panel(controllerGUI appController)
	{
		super();
		
		this.appController = appController;
		
		this.textLabel = new JLabel("send minions");
		this.colorButton = new JButton("click here for new minion");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.add(textLabel);
		this.add(colorButton);
	}
	
	private void setupLayout()
	{
		
		
	}
	
	private void  setupListeners()
	{
		colorButton.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent mouseClick)
				{
					System.out.println("You made me minion");
				}
			});
		
		
	}
}
