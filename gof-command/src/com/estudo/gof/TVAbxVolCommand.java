package com.estudo.gof;

public class TVAbxVolCommand implements Command {
	private TV tv;

	public TVAbxVolCommand(TV tv) {
		this.tv = tv;
	}

	public void executar() {
		tv.abaixarVolume();
	}
}
