import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;


public class ImplGestor implements Gestor
{
    List<Product> products= new ArrayList<Product>(); /** INICIALIZACIÓN, SINO ESTA VACIO*/
    Queue<Order> orders;
    HashMap<String, User> users;


    public ImplGestor(){
        this.users = new HashMap<String, User >(); /**  lISTA DE USUARIOS USANDO TABLA DE HASH*/

    }


    @Override
    public List<Product> productsByPrize() {
       return this.products;
    }

    @Override
    public void addOrder(Order o) {
        this.orders.add(o);

    }

    @Override
    public Order getOrder() {
        Order o = this.orders.peek();
        process(o);
        User user = o.getUser();

        user.addOrder(o);
        return 0;
    }

    @Override
    public List<Order> ordersByUser(String idUser) {
        return null;
    }

    @Override
    public List<Product> productsySales() {
        return null;
    }

    @Override
    public void addUser(String idUser, String name) {

        this.users.put(idUser, new User(idUser, name));

    }

    @Override
    public void addProduct(String name, String description, double prize) {

    }

    @Override
    public User getUser(String idUser) {
        User user = this.users.get(idUser);
        return user;
    }
}
