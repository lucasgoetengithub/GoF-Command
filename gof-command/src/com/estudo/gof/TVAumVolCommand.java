package com.estudo.gof;

public class TVAumVolCommand implements Command {
	private TV tv;

	public TVAumVolCommand(TV tv) {
		this.tv = tv;
	}

	public void executar() {
		tv.aumentarVolume();
	}
}
