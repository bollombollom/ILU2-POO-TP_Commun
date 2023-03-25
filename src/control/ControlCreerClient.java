package control;

import model.CarnetClientel;

public class ControlCreerClient {
	private CarnetClientel carnetClientel;

	public ControlCreerClient(CarnetClientel carnetClientel) {
		this.carnetClientel = carnetClientel;
	}

	public void creerClient(String nom, String prenom, String adresseMail, String mdp) {
		carnetClientel.creerClient(nom, prenom, adresseMail, mdp);
	}
}