public class RefinamientoAbstraccion extends Abstraccion{

    public RefinamientoAbstraccion(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operacion() {
        System.out.println("Instrucciones de la "
                + "Subclase RefinamientoAbstraccion");
        implementor.operacionOriginal();
    }
}
