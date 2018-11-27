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
		this.setBackground(Color.BLUE);
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
					changeBackgroundColor();
				}
			});
		
		
	}
	
	private void changeBackgroundColor()
	{
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		
		this.setBackground(new Color(red, green, blue));
		textLabel.setText("Red: " + red + " Green: " + green + " Blue: " + blue);
		
	}
	
}
