package lifecyclemethod;

public class Pepsi {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Pepsi(int price) {
		super();
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}
	
	public void init()
	{
		System.out.println("Init method");
	}
	
	public void destroy()
	{
		System.out.println("destroy method");
	}
	
	
}
