package test_fonctionnel;

import control.ControlConnecterClient;
import control.ControlCreerClient;
import frontiere.BoundaryConnecterClient;
import frontiere.BoundaryCreerClient;
import model.CarnetClientel;

public class TestConnecterClient {
	public static void main(String[] args) {
		// ---------- CREATION DES ENTITES ----------
		CarnetClientel carnetClientel = new CarnetClientel();

		// ---------- CAS CREATION CLIENT ----------
		System.out.println("---------- CREATION CLIENT ----------");
		ControlCreerClient controlCreerClient = new ControlCreerClient(carnetClientel);
		BoundaryCreerClient boundaryCreerClient = new BoundaryCreerClient(controlCreerClient);
		boundaryCreerClient.creerClient();

		// ---------- CAS CONNECTION CLIENT ----------
		System.out.println("\n---------- CONNECTION CLIENT ----------");
		ControlConnecterClient controlConnecterClient = new ControlConnecterClient(carnetClientel);
		BoundaryConnecterClient boundaryConnecterClient = new BoundaryConnecterClient(controlConnecterClient);
		boundaryConnecterClient.connecterClient();

		// ---------- CONTROLE DES DONNEES ----------
		System.out.println("\n\n---------- CONTROLE DES DONNEES ----------");
		System.out.println(carnetClientel);
	}
}
