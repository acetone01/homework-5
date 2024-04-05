public class OrderTester
{
    public static void main(String[] args) {

        OrderQueue orderQueue = new OrderQueue(14);

        orderQueue.addOrder("Customer1", "01/04/2024", 5);
        orderQueue.addOrder("Customer2", "01/04/2024", 5);
        orderQueue.addOrder("Customer3", "01/04/2024", 8);

        System.out.println(orderQueue);
        orderQueue.fulfillAllOrders();
        System.out.println(orderQueue);
        orderQueue.addStock(10);

        orderQueue.addOrder("Customer4", "01/04/2024", 3);
        orderQueue.addOrder("Customer5", "01/04/2024", 3);
        orderQueue.addOrder("Customer6", "01/04/2024", 5);


        orderQueue.fulfillAllOrders();

        System.out.println(orderQueue);
    }
}
