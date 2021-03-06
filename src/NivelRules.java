
/*
 * This class is a strategy of the Play Panel. It models the rules menu with its corresponding buttons and images
 */

import java.awt.Color;

public class NivelRules implements PlayPanelStrategy {

	private Background background;
	private Background foreground;
	private Background middleground;
	private Obstaculos obstaculos;
	private Buttons buttons;
	private Enemigos enemigos;
	
	PlayPanelStrategyContext context;

	public NivelRules(PlayPanelStrategyContext context){
		this.context=context;
		foreground = new Background(0,0,"/rulesbackground.png");
		middleground = new Background(0,0,"/runningbackground.png");
		background = new Background(0,0,"/menubackground.png");
		obstaculos = new Obstaculos();
		buttons = new Buttons();
		buttons.addButton(700,300,190,70,Color.CYAN,"menu",21, "#4372e8");
		enemigos = new Enemigos();
	}
	//getters & setters
	public Background getBackground() {
		return background;
	}

	public void setBackground(Background background) {
		this.background = background;
	}

	public Background getForeground() {
		return foreground;
	}

	public void setForeground(Background foreground) {
		this.foreground = foreground;
	}

	public Background getMiddleground() {
		return middleground;
	}

	public void setMiddleground(Background middleground) {
		this.middleground = middleground;
	}

	public Obstaculos getObstaculos() {
		return obstaculos;
	}
	
	public Enemigos getEnemigos() {
		return enemigos;
	}

	public void setEnemigos(Enemigos enemigos) {
		this.enemigos=enemigos;
	}

	public void setObstaculos(Obstaculos obstaculos) {
		this.obstaculos = obstaculos;
	}

	public PlayPanelStrategyContext getContext() {
		return context;
	}

	public void setContext(PlayPanelStrategyContext context) {
		this.context = context;
	}
	
	public void setButtons(Buttons buttons) {
		this.buttons=buttons;
	}
	
	public Buttons getButtons() {
		return this.buttons;
	}
	@Override
	public void createStuff() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void reset() {
		// TODO Auto-generated method stub
		
	}
}
