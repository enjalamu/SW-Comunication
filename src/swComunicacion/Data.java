package swComunicacion;

import swComunicacion.Observer;

public class Data {

	private Observer [] vistas = new Observer[10];
	public void AnadirVista(Observer v) {
		// TODO Auto-generated method stub
				boolean metido = false;
		    	int indice = 0;
		    	while((metido == false) && (indice < vistas.length)){
		    		if(vistas[indice] == null){
		    			vistas[indice] = v;
		    			metido = true;
		    		}
		    		else
		    		indice++;
		    	}
	}

	public void notifyCambioModo(boolean modo){
		for(Observer v: vistas){	
    		if(v != null){
    	v.onCambioModo(modo);
    		}
	 }
	}

}
