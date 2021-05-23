public class Puerta{

    String color;
    boolean abierta = false;
    boolean llavePuesta = false;
    Llave llave = null;

    public Puerta(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public boolean getAbierta() {
        return this.abierta;
    }

    public boolean getLlavePuesta() {
        return this.llavePuesta;
    }

    public Llave getLlave(){
        return this.llave;
    }

    public void setAbierta(boolean abierta) {
        this.abierta = abierta;
    }

    public void setLlave(Llave llave) {
        this.llave = llave;
    }

    public Puerta poner(Llave llave){
        this.setLlave(llave);
        return this;
    }

    public Llave quitar(){
        if (this.getLlavePuesta()){
            Llave aux = this.getLlave();
            this.llavePuesta = null;
            return aux;
        } else{
            return null;
        }
    }

    public boolean abrir(){
        if (this.getColor().equals(this.getLlave().getColor())){
            this.setAbierta(true);
        }
        return this.getAbierta();
    }

    public void cerrar(){
        this.setAbierta(false);
    }
}
