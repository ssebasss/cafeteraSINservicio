public class Cafeteraaa {

    int capacidadMaxima;
    int cantidadActual;

    public Cafeteraaa(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }
/*
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }*/

    @Override
    public String toString() {
        return "Cafeteraaa{" +
                "capacidadMaxima=" + capacidadMaxima +
                ", cantidadActual=" + cantidadActual +
                '}';
    }

    public void llenarCafetera() {
        this.cantidadActual = this.capacidadMaxima;
        System.out.println("dsp de llenar hay " + this.cantidadActual);
    }

    public void servirCafe(int taza) {
        if (taza < this.cantidadActual) {
            this.cantidadActual -= taza;
            System.out.println("act es " + cantidadActual);
        } else if (taza > this.cantidadActual) {
            taza = this.cantidadActual;
        }
    }

    public void vaciarCafetera() {
        this.cantidadActual = 0;
        System.out.println("la cafetera se vació");
    }

    public void agregarCafe(int cafe) {
        System.out.println("cafe " + cafe);
        System.out.println("act " + this.cantidadActual);
        System.out.println("max " + this.capacidadMaxima);

        if ((cafe + this.cantidadActual) > (this.capacidadMaxima)) {
            System.out.println("se llenó de nuevo y sobró " + ((cafe + this.cantidadActual) - capacidadMaxima));
            this.cantidadActual = this.capacidadMaxima;
        } else if ((cafe + this.cantidadActual) < (this.capacidadMaxima)) {
            cantidadActual += cafe;
            System.out.println("dsp de agregar cafe, ahora hay...." + this.cantidadActual);
        }
    }
    public void mostrarCafe() {
        System.out.println("mostrando cantidad de cafe...." + this.cantidadActual+ " ml ");
    }
}
