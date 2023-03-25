package test_fonctionnel;

import control.ControlCreerClient;
import frontiere.BoundaryCreerClient;
import model.CarnetClientel;

public class TestCreerClient {
	public static void main(String[] args) {
		// ---------- CREATION DES ENTITES ----------
		CarnetClientel carnetClientel = new CarnetClientel();

		// ---------- CAS CREATION CLIENT ----------
		System.out.println("---------- CREATION CLIENT ----------");
		ControlCreerClient controlCreerClient = new ControlCreerClient(carnetClientel);
		BoundaryCreerClient boundaryCreerClient = new BoundaryCreerClient(controlCreerClient);
		boundaryCreerClient.creerClient();

		// ---------- CONTROLE DES DONNEES ----------
		System.out.println("\n\n---------- CONTROLE DES DONNEES ----------");
		System.out.println(carnetClientel);
	}
}
