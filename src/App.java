import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        System.out.println("Ingrese su destino en 'coordenadas': ");
        System.out.print("Coordenada de inicio: ");
        double locInicial = sc.nextDouble();
        System.out.print("Coordenada de destino: ");
        double locFinal = sc.nextDouble();
        

        RouteStrategy est = new Auto();
        Navigator gps = new Navigator(est,locInicial,locFinal);

        boolean salir = false;

        while(salir != true){
            System.out.println("¿Como quiere llegar a su destino?");
            System.out.println("1-En auto");
            System.out.println("2-Caminando");
            System.out.println("3-Transporte Publico");
            System.out.println("4-En bicicleta");
            System.out.println("-----------------");
            System.out.println("5-Salir del GPS");
            System.out.print("Ingrese opcion numerica: ");
            int op = sc.nextInt();

            switch(op){
                case 1:
                    Navigator.vel = 40;
                    gps.moverse();
                    break;  
                case 2:
                    Navigator.vel = 4; 
                    gps.setMovilidad(new Caminar());
                    gps.moverse();
                    break;
                case 3:
                    Navigator.vel = 30;
                    gps.setMovilidad(new TrnsPublico());
                    gps.moverse();
                    break;
                case 4:
                    Navigator.vel = 20;
                    gps.setMovilidad(new Bicicleta());
                    gps.moverse();
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("La opcion ingresada es incorrecta");
            }
        }
        System.out.println("Saliste del sistema");
    }
}
