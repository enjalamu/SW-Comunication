package swComunicacion;

import swComunicacion.views.PrincipalView;

public class Controller {

	private Data d;
	public Controller(Data d2) {
		// TODO Auto-generated constructor stub
		d = d2;
	}
	
	public boolean addObserver(Observer po) {
		return d.addObserver(po);
	}
	

	public void onCambioOpcion(boolean op){
		d.notifyCambioOpcion(op);
	}

}
