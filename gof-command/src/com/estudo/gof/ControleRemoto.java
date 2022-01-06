package com.estudo.gof;

public class ControleRemoto {
	private Command btLigDes, btAumVol, btAbxVol;

	public ControleRemoto(TV tv) {
		btLigDes = new TVLigDesCommand(tv);
		btAumVol = new TVAumVolCommand(tv);
		btAbxVol = new TVAbxVolCommand(tv);
	}

	public void pressLigDes() {
		btLigDes.executar();
	}

	public void pressAumVol() {
		btAumVol.executar();
	}

	public void pressAbxVol() {
		btAbxVol.executar();
	}
}
