package org.example.utile;

import org.example.model.Operations;
import org.example.service.ClientService;
import org.example.service.CompteBancaireService;
import org.example.service.OperationsService;

import java.util.Scanner;

public class ConsoleIHM {


    private static ClientService clientService = new ClientService();
    private static CompteBancaireService compteBancaireService = new CompteBancaireService();
    private static OperationsService operationsService = new OperationsService();
    private static Scanner scanner = new Scanner(System.in);

    public static void start() {
        boolean running = true;
        while (running) {
            System.out.println("1. Cree user/compte");
            System.out.println("2. effectuer un depot");
            System.out.println("3. effectuer un retrait");
            System.out.println("4. Afficher le solde et les operations");
            System.out.println("5. Quitter");
            System.out.print("Choix : ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    creeClient();
                    break;
                case 2:
                    depotArgent();
                    break;
                case 3:
                    //retraitArgent();
                    break;
                case 4:
                   // soldeEtOperations();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Choix invalide !");
            }
        }
        System.out.println("Au revoir !");
    }

    private static void creeClient() {
        System.out.println("creation de compte : ");
        System.out.print("Nom  : ");
        String nom = scanner.nextLine();
        System.out.print("Prenom : ");
        String prenom = scanner.nextLine();
        System.out.print("Num Tel : ");
        String numTel = scanner.nextLine();

        clientService.creeClient(nom,prenom,numTel);
    }

    private  static void depotArgent(){
        System.out.println("quelle montant souhaiter vous deposer ? ");
        String montant = scanner.nextLine();



    }

}
