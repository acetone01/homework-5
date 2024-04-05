public class OrderQueue
{
    private LinkedQueue<CustomOrder> orders;
    private int stock;

    public OrderQueue()
    {
        orders = new LinkedQueue<>();
        stock = 0;
    }

    public OrderQueue(int stock)
    {
        orders = new LinkedQueue<>();
        this.stock = stock;
    }

    public void addOrder(String name, String date, int quantity)
    {
        CustomOrder order = new CustomOrder(name, date, quantity);
        orders.enqueue(order);
    }

    public void addStock(int additionalStock)
    {
        stock += additionalStock;
    }

    public void fulfillOrder()
    {
        CustomOrder order = orders.getFront();
        if (order != null && stock > 0)
        {
            order.shipProduct();
            stock--;
            if (order.toString().equals("0"))
            {
                orders.dequeue();
            }
        }
    }

    public void fulfillAllOrders()
    {
        while (!orders.isEmpty() && stock > 0)
        {
            fulfillOrder();
        }
    }

    public String toString()
    {return orders.getFront().toString();}
}
