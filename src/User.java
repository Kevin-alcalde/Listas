import java.util.LinkedList;
import java.util.List;


public class User
{
    List<Order> orderList; /** CREAMOS UNA LISTA CON ORDENES*/
    private final String nif;
    private final String name;

    public String getNif() /** METODO PROPIO PARA DARNOS EL NIF*/
    {
        return nif;
    }
    public String getName() /** METODO PROPIO PARA DARNOS EL NOMBRE*/
    {
        return name;
    }
    public User (String nif, String name)  /**  CONSTRUCTOR DEL OBJETO */
    {
        this.nif = nif;
        this.name = name;
        this.orderList = new LinkedList<Order>();
    }
    public void addOrder(Order o)
    {
        this.orderList.add(o);

    }



}
