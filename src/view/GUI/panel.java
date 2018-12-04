package view.GUI;

import javax.swing.*;
import controller.GUI.controllerGUI;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;


public class panel extends JPanel
{
	private controllerGUI appController;
	private JLabel textLabel;
	private JButton colorButton;
	private SpringLayout appLayout;
	private JTextField textField;
	
	
	public panel(controllerGUI appController)
	{
		super();
		
		this.appController = appController;
		
		this.textLabel = new JLabel("send minions");
		textLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 66));
		textLabel.setForeground(Color.BLUE);
		textLabel.setBackground(Color.BLUE);
		this.colorButton = new JButton("click here for new minion");
		appLayout = new SpringLayout();
		appLayout.putConstraint(SpringLayout.SOUTH, textLabel, -195, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, colorButton, 6, SpringLayout.SOUTH, textLabel);
		appLayout.putConstraint(SpringLayout.WEST, colorButton, 113, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, textLabel, -8, SpringLayout.EAST, this);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		
		this.setBackground(Color.YELLOW);
		this.add(textLabel);
		this.add(colorButton);
		
		JSeparator separator = new JSeparator();
		appLayout.putConstraint(SpringLayout.NORTH, separator, 80, SpringLayout.SOUTH, textLabel);
		appLayout.putConstraint(SpringLayout.WEST, separator, 51, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, separator, -103, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, separator, 51, SpringLayout.WEST, this);
		add(separator);
		
		JProgressBar progressBar = new JProgressBar();
		appLayout.putConstraint(SpringLayout.NORTH, progressBar, 6, SpringLayout.SOUTH, colorButton);
		appLayout.putConstraint(SpringLayout.WEST, progressBar, 10, SpringLayout.WEST, colorButton);
		appLayout.putConstraint(SpringLayout.SOUTH, progressBar, -134, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, progressBar, -8, SpringLayout.EAST, colorButton);
		add(progressBar);
		
		JLabel label = new JLabel("");
		appLayout.putConstraint(SpringLayout.NORTH, label, 51, SpringLayout.SOUTH, progressBar);
		appLayout.putConstraint(SpringLayout.EAST, label, -176, SpringLayout.EAST, this);
		add(label);
		
		textField = new JTextField();
		appLayout.putConstraint(SpringLayout.NORTH, textField, 6, SpringLayout.SOUTH, progressBar);
		appLayout.putConstraint(SpringLayout.EAST, textField, 0, SpringLayout.EAST, label);
		add(textField);
		textField.setColumns(10);
		
		
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
