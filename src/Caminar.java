public class Caminar implements RouteStrategy {
    
    @Override
    public void transporte(double locInicial, double locFinal,double tiempo) {
        System.out.println("El tiempo de llegada caminando desde: " + locInicial +" hasta: " +locFinal+" es de: "+ tiempo + " Horas");

        
    }
}
