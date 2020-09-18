package problem;

public class ShoppingCartPromotionImpl implements ShoppingCartPromotion {

	@Override
	public int promo(Item item) {
		
		int sum =0;
		
		if(item.getName().equals("A")) {
			
			
			sum = sum + ((item.getNoOfItem()/3) * 130)+( (item.getNoOfItem()%3)*item.getPrice());
			
			
		} else if(item.getName().equals("B")) {
			
			
			
			sum = sum +((item.getNoOfItem()/2) * 45)+ ((item.getNoOfItem()%2)*item.getPrice());
			
		}else if(item.getName().equals("C") || item.getName().equals("D")) {
			sum = sum + (item.getNoOfItem() * item.getPrice());
		}  else {
			sum = sum +0;
		}
		
		
		return sum;
	}

}
