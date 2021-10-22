
public class Navigator {
    RouteStrategy movilidad;
    private double locInicial, locFinal,distancia, tiempo;


    //Velocida en Km/h
    static double vel = 0;
    
    public Navigator(RouteStrategy movilidad, double locInicial, double locFinal){
        this.movilidad = movilidad;
        this.locFinal = locFinal;
        this.locInicial = locInicial;
        this.distancia = distancia;
        this.tiempo = tiempo;
    }

    public RouteStrategy getMovilidad() {
        return movilidad;
    }
    public double getLocFinal() {
        return locFinal;
    }
    public double getLocInicial() {
        return locInicial;
    }
    public double getDistancia() {
        return distancia;
    }
    public double getTiempo() {
        return tiempo;
    }

    public void setMovilidad(RouteStrategy movilidad) {
        this.movilidad = movilidad;
    }
    public void setLocFinal(double locFinal) {
        this.locFinal = locFinal;
    }
    public void setLocInicial(double locInicial) {
        this.locInicial = locInicial;
    }
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public void resetLocation(){
        this.locInicial = 0;
        this.locFinal = 0;
    }

    public void moverse(){
        if (getLocInicial() > getLocFinal()){
            setDistancia(getLocInicial() - getLocFinal());
        } else if(getLocInicial() < getLocFinal()){
            setDistancia(getLocFinal()-getLocInicial());
        }else{
            System.out.println("Las coordenadas se encuentran en el mismo punto");
        }
        setTiempo(getDistancia()/ vel);
        this.movilidad.transporte(locInicial, locFinal, tiempo);
    }
        
}
