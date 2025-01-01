import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        ArrayList<Comenzi> listaComenzi=new ArrayList<>();
        Comenzi comanda1=new Comenzi(1, "Comanda 1", 3, 234);
        listaComenzi.add(comanda1);
        Comenzi comanda2=new Comenzi(2, "Comanda 2", 4, 112);
        listaComenzi.add(comanda2);
        Comenzi comanda3=new Comenzi(3, "Comanda 3", 5, 645);
        listaComenzi.add(comanda3);
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("1. Creează o comandă nouă.\n" +
                    "2. Modificarea comenzilor existente.\n" +
                    "3. Stergerea comenzilor existente.\n" +
                    "4. Calcularea valorii totale a unei comenzi.\n" +
                    "5. Afișarea detaliilor pentru o comandă sau pentru toate comenzile.\n" +
                    "6. Afisarea comenzii cu cel mai mare rezultat");
            int idle=sc.nextInt();
            switch (idle) {
                case 1:
                    int id = 0;
                    while (true){
                        try {
                            System.out.println("Da ID");
                            id = sc.nextInt();
                            break;
                        } catch ( InputMismatchException e ) {
                            System.out.println("ID invalid");
                            sc.nextLine();
                        }
                    }

                    System.out.println("Da numele");
                    String nume = sc.nextLine();

                    sc.nextLine();
                    int cantitate=0;
                    while (true) {
                        try {
                            System.out.println("Da cantitatea");
                            cantitate = sc.nextInt();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Cantitatea invalida");
                            sc.nextLine();
                        }
                    }
                    double pretPerUnitate=0;
                    while (true) {
                        try {
                            System.out.println("Da pret per unitate");
                            pretPerUnitate = sc.nextDouble();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Pret per unitate invalid");
                            sc.nextLine();
                        }
                    }
                    Comenzi nouaComanda = new Comenzi(id, nume, cantitate, pretPerUnitate);
                    listaComenzi.add(nouaComanda);
                    double max1=0;
                    double [] rez1={comanda1.cantitate*comanda1.pret,comanda2.cantitate*comanda2.pret, comanda3.cantitate*comanda3.pret, nouaComanda.cantitate* nouaComanda.pret};
                    for (double r:rez1) {
                        max1 = Math.max(0, r);
                    }

                    break;
                case 2:
                    int idn;
                    while (true){
                        try {
                            System.out.println("Da ID comenzii pe care vreai sa o modifici");
                            idn = sc.nextInt();
                            break;
                        }catch (InputMismatchException e) {
                            System.out.println("ID invalid");
                            sc.nextLine();
                        }}


                    listaComenzi.remove(idn - 1);

                    int idno;
                    while (true){
                        try {
                            System.out.println("Da ID");
                            idno = sc.nextInt();
                            break;
                        }catch (InputMismatchException e) {
                            System.out.println("ID invalid");
                            sc.nextLine();
                        }}


                    System.out.println("Da numele");
                    String numel = sc.nextLine();
                    sc.nextLine();

                    int cant1;
                    while (true){
                        try {
                            System.out.println("Da cantitatea");
                            cant1 = sc.nextInt();
                            break;
                        }catch (InputMismatchException e) {
                            System.out.println("Cantitate invalida");
                            sc.nextLine();
                        }}

                    double pret1;
                    while (true){
                        try {
                            System.out.println("Da pret per unitate");
                            pret1 = sc.nextDouble();
                            break;
                        }catch (InputMismatchException e) {
                            System.out.println("Cantitate invalida");
                            sc.nextLine();
                        }}

                    Comenzi comandan = new Comenzi(idno, numel, cant1, pret1);
                    listaComenzi.add(comandan);
                    double max11=0;
                    double [] rez11={comanda1.cantitate*comanda1.pret,comanda2.cantitate*comanda2.pret, comanda3.cantitate*comanda3.pret, comandan.cantitate*comandan.pret};
                    for (double r:rez11) {
                        max11 = Math.max(0, r);
                    }



                    break;
                case 3:
                    int idn2;
                    while (true){
                        try {
                            System.out.println("Da ID");
                            idn2 = sc.nextInt();
                            break;
                        }catch (InputMismatchException e) {
                            System.out.println("ID invalid");
                            sc.nextLine();
                        }}
                    listaComenzi.remove(idn2 - 1);
                    break;
                case 4:
                    int idn3;
                    while (true){
                        try {
                            System.out.println("Da ID");
                            idn3 = sc.nextInt();
                            break;
                        }catch (InputMismatchException e) {
                            System.out.println("ID invalid");
                            sc.nextLine();
                        }}
                    for (Comenzi com : listaComenzi) {
                        double rezultat=com.cantitate*com.pret;
                        if (com.getId() == idn3) {
                            System.out.println(rezultat);

                        }

                    }

                    break;
                case 5:
                    System.out.println(listaComenzi.toString());
                    break;
                case 6:
                    double max=0;
                    for (Comenzi com : listaComenzi) {
                        double rezultatvery=com.cantitate*com.pret;
                        max=Math.max(max, rezultatvery);
                    }
                    System.out.println("Maxima valoarea a lor este: "+max);

            }
        }
    }
}