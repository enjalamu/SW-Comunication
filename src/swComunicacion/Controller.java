package swComunicacion;

import swComunicacion.views.PrincipalView;

public class Controller {

	private Data d;
	public Controller(Data d2) {
		// TODO Auto-generated constructor stub
		d = d2;
	}

	public void anadirVista(PrincipalView vista) {
		// TODO Auto-generated method stub
		d.AnadirVista(vista);
	}

}
