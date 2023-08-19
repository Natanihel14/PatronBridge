// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Cliente {
    public static void main(String[] args) {


        System.out.println("<<RefinamientoAbstraccion + ImplementorConcretoA>>");
        Abstraccion ejemploBridge=new RefinamientoAbstraccion(new ImplementorConcretoA());
        ejemploBridge.operacion();

        System.out.println("\n<<RefinamientoAbstraccion + ImplementoConcretorB>>");
        ejemploBridge.implementor=new ImplementorConcretoB();
        ejemploBridge.operacion();


        }
    }
