package problem;

public class Item  implements ItemElement{
	
	private String name;
	private int price;
	private int noOfItem;
	
	public Item(String name,int price,int noOfItem) {
		this.name = name;
		this.price = price;
		this.noOfItem = noOfItem;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	
	@Override
	public int accept(ShoppingCartPromotion promotion) {
		return promotion.promo(this);
	}
	
	
	@Override
	public String toString() {
		return " name : "+name + " price : "+price + " noOfItem : " + noOfItem;
	}

	public int getNoOfItem() {
		return noOfItem;
	}

	public void setNoOfItem(int noOfItem) {
		this.noOfItem = noOfItem;
	}

	
	
	

}
