import java.util.List;

public interface Gestor
{
    public List<Product> productsByPrize();
    public void addOrder (Order o);
    public Order getOrder();
    public List<Order> ordersByUser(String idUser);
    public List<Product> productsySales();
    public void addUser(String idUser, String name);
    public void addProduct(String name, String description, double prize);
    public User getUser(String idUser);




}




