
package Coche;

/**
 *
 * @author Fran
 */
public class Main {z
    
      public static void main(String[] args) {
        Coche coche1;
        int stockActual;
        
        coche1 = new Coche("Opel",12000,500);
        operativaCoches(coche1, 300);
        stockActual = coche1.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

	public static void operativaCoches(Coche coche1, int cantidad) {
		try 
        {
            System.out.println("Venta de Coches");
            coche1.vender(300);
        } catch (Exception e)
        {
            System.out.print("FALLO al vender");
        }
        
        try
        {
            System.out.println("Compra de Coches");
            coche1.comprar(500);
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar");
        }
	}

}
    