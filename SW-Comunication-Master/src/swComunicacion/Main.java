package swComunicacion;

import swComunicacion.views.PrincipalView;

public class Main {

	public static void main(String[] args) {
		
		Data d = new Data();
	   	   Controller c = new Controller(d);
	   	   PrincipalView vista = new PrincipalView(c);
	}
}
