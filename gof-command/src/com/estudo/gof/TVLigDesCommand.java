package com.estudo.gof;

public class TVLigDesCommand implements Command {
	private TV tv;

	public TVLigDesCommand(TV tv) {
		this.tv = tv;
	}

	public void executar() {
		tv.ligarDesligar();
	}
}
