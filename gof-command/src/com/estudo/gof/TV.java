package com.estudo.gof;

public class TV {
	private boolean ligada = false;
	private byte volume = 0;

	public void ligarDesligar() {
		if (ligada = !ligada) {
			System.out.println("TV Ligada.");
		} else {
			System.out.println("TV Desligada.");
		}
	}

	public void aumentarVolume() {
		if (ligada) {
			if (volume < 10)
				volume++;
			System.out.println("Volume da TV: " + volume);
		} else {
			System.out.println("Ligue a TV.");
		}
	}

	public void abaixarVolume() {
		if (ligada) {
			if (volume > 0)
				volume--;
			System.out.println("Volume da TV: " + volume);
		} else {
			System.out.println("Ligue a TV.");
		}
	}
}
