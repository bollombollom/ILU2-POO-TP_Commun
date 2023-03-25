package control;

import model.CarnetClientel;

public class ControlConnecterClient {
	CarnetClientel carnetClientel;

	public ControlConnecterClient(CarnetClientel carnetClientel) {
		this.carnetClientel = carnetClientel;
	}

	public int connecterClient(String adresseMail, String mdp) {
		int numClient = carnetClientel.trouverClient(adresseMail);
		if (numClient != -1) {
			boolean mdpOK = carnetClientel.connecterClient(numClient, mdp);
			if (!mdpOK) {
				numClient = -1;
			}
		}
		return numClient;
	}

}
