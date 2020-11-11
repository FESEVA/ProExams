import java.util.*;
/*
* Una empresa textil que realiza polos personalizados para trabajadores, asociaciones y clubes
nos ha pedido hacer un programa que sea capaz de elaborar presupuestos. El precio de cada
polo depende de si se piden en blanco o en color, de la cantidad que se pida y del tipo de
técnica que se emplee para el logotipo, que puede ser serigrafía o bordado. En un
presupuesto no se mezclan distintos colores o técnicas. El pedido mínimo son 20 polos.
Suponemos que el usuario introduce correctamente todos los datos. En este ejercicio no hay
que comprobar la validez de los mismos. A la cantidad final hay que sumarle el IVA del 21%.
En la siguiente tabla se muestran las tarifas de los polos:
Polo blanco
entre 20 y 39 unid.
Polo blanco
entre 40 y 99 unid.
Polo blanco
100 o más unid.
4,90 € c.u. 3,90 € c.u. 3,20 € c.u.
* 
• El polo de color es siempre un 20% más caro que el blanco.
• La serigrafía cuesta 2 € por polo para pedidos de menos de 50 unidades y 1,50 € para
pedidos de 50 o más unidades.
• El bordado cuesta 3 € por polo para pedidos de menos de 50 unidades y 2,50 € para
pedidos de 50 o más unidades.
*
* @author Fernando Iván Sevilla Valderrama
*/
public class Ex19fsv2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("¿Qué polo quiere comprar? ¿Blanco o Color? ");
    String polos = s.next();
    System.out.print("Introduzca la cantidad de polos : ");
    int numPolos = s.nextInt();
    System.out.print("¿Qué tipo polo quiere comprar? ¿Serigrafiado o Bordado? ");
    String polosTipo = s.next();
    
    double dineroUnidad = 0;
    double dineroNumPolos = 0;
    double dineroTipoPoloUnidad = 0;
    double dineroTipoPolo = 0;
    
    //Blanco    
    if(polos.equals("Blanco") || polos.equals("blanco") || polos.equals("Blancos") || polos.equals("blancos")){
    
    if (numPolos >= 20){
      
    
    if (numPolos >= 20 && numPolos <= 39){
      dineroUnidad = 4.90;
      dineroNumPolos = (numPolos * dineroUnidad);
      
    }else if (numPolos >= 40 && numPolos <= 99){
      dineroUnidad = 3.90;
      dineroNumPolos = (numPolos * dineroUnidad);
      
    }else if (numPolos >= 100){
      dineroUnidad = 3.20;
      dineroNumPolos = (numPolos * dineroUnidad);
      }
    }
    else {
      System.out.println("Error, el valor mínimo de pedido es de 20 unidades.");
    }
    
    //Color
  }else if(polos.equals("Color") || polos.equals("color") || polos.equals("Colores") || polos.equals("colores")){
    
    if (numPolos >= 20){
      
    
    if (numPolos >= 20 && numPolos <= 39){
      dineroUnidad = 5.88;
      dineroNumPolos = (numPolos * dineroUnidad);
      
    }else if (numPolos >= 40 && numPolos <= 99){
      dineroUnidad = 4.68;
      dineroNumPolos = (numPolos * dineroUnidad);
      
    }else if (numPolos >= 100){
      dineroUnidad = 3.84;
      dineroNumPolos = (numPolos * dineroUnidad);
      
      }
    }
    else {
      System.out.println("Error, el valor mínimo de pedido es de 20 unidades.");
    }
  }else{
      System.out.print("Error, ese polo no existe. Prueba con 'Color' o 'Blanco'.");
      }
    
    //Serigrafiado
    if(polosTipo.equals("Serigrafiado") || polosTipo.equals("serigrafiado") || polosTipo.equals("Serigrafiados") || polosTipo.equals("serigrafiados")){
    
      if(numPolos < 50 && numPolos >= 20){
        dineroTipoPoloUnidad = 2;
        dineroTipoPolo= (numPolos * dineroTipoPoloUnidad);
        }
      else{
        dineroTipoPoloUnidad = 1.50;
        dineroTipoPolo= (numPolos * dineroTipoPoloUnidad);
        }
       
    //Bordado    
    }else if(polosTipo.equals("Bordado") || polosTipo.equals("bordado") || polosTipo.equals("Bordados") || polosTipo.equals("bordados")){
    
      if(numPolos < 50 && numPolos >= 20){
        dineroTipoPoloUnidad = 3;
        dineroTipoPolo= (numPolos * dineroTipoPoloUnidad);
        }
      else{
        dineroTipoPoloUnidad = 2.50;
        dineroTipoPolo= (numPolos * dineroTipoPoloUnidad);
        }
      
      
    }
    else {
      System.out.println("Error, ese tipo de polo no existe. Prueba con 'Serigrafiado' o 'Bordado'.");
    }
      
    
    
      double totalSinIva = (dineroTipoPolo + dineroNumPolos);
      double iva = (totalSinIva * 0.21);
      double totalConIva = (totalSinIva + iva);
      System.out.println("PRESUPUESTO DEL PEDIDO");
      System.out.println("----------------------");
      System.out.printf("Polo en "+polos+": %d unidades\n",+numPolos);
      System.out.println("Precio unitario del polo en "+polos+": "+dineroUnidad+" €");
      System.out.println("Total textil: "+dineroNumPolos+" €");
      System.out.println("Tipo de personalización: "+polosTipo);
      System.out.println(""+polosTipo+"(c.u): "+dineroTipoPoloUnidad+" €");
      System.out.println("Total "+polosTipo+":  "+dineroTipoPolo+" €");
      System.out.println("Polo más logotipo "+totalSinIva+" €");
      System.out.println("IVA:  "+iva+" €");
      System.out.println("TOTAL:  "+totalConIva+" €");
    
      
    
    
  } 
}

/*
 *    double totalSinIva = (dineroTipoPolo + dineroNumPolos);
      double iva = (totalSinIva * 0.21);
      double totalConIva = (totalSinIva + iva);
      System.out.println("PRESUPUESTO DEL PEDIDO");
      System.out.println("----------------------");
      System.out.printf("Polo en "+polos+": %2d "+numPolos);
      System.out.println("Precio unitario del polo en "+polos+": "+dineroNumPolos+);
      System.out.println("Total textil: "+dineroNumPolos);
      System.out.println("Tipo de personalización: "+polosTipo);
      System.out.println(""+polosTipo+"(c.u): "+dineroTipoPoloUnidad);
      System.out.println("Total "+polosTipo+":  "+dineroTipoPolo);
      System.out.println("Polo más logotipo "+totalSinIva);
      System.out.println("IVA:  "+totalSinIva);
      System.out.println("TOTAL:  "+totalConIva);
      * 
*/
