public class CustomOrder
{
    private String name;
    private String date;
    private int quantity;

    public CustomOrder()
    {
        this.name = null;
        this.date = null;
        this.quantity = 0;
    }

    public CustomOrder(String name, String date, int quantity)
    {
        this.name = name;
        this.date = date;
        this.quantity = quantity;
    }

    public void shipProduct()
    {
        if (quantity > 0)
        {quantity--;}
    }

    public String toString()
    {return String.valueOf(quantity);}
}
