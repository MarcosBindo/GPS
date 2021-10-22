public class TrnsPublico implements RouteStrategy{

    @Override
    public void transporte(double locInicial, double locFinal,double tiempo) {
        System.out.println("El tiempo de llegada en Transporte publico desde: " + locInicial +" hasta: " +locFinal+" es de: "+ tiempo + " Horas");
    }
}
