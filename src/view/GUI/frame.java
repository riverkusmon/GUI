package view.GUI;
import javax.swing.JFrame;
import controller.GUI.controllerGUI;

public class frame extends JFrame 
{
	private controllerGUI appController;
	private panel appPanel;
	
	public frame(controllerGUI appController)
	{
		super();
		this.appController = appController;
		this.appPanel = new panel(appController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(800, 800);
		this.setTitle("banana");
		this.setResizable(true);
		this.setVisible(true);
		
	}

}
