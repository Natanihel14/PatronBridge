abstract class Abstraccion {
    protected Implementor implementor;

    public Abstraccion(Implementor implementor){
        this.implementor = implementor;
    }

    abstract public void operacion();
}
