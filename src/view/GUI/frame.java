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
		
	}

}
