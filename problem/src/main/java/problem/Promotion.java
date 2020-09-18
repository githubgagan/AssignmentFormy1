package problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Promotion {

	public static void main(String[] args) {

		String[] input = { "A", "A", "A", "A", "A", "B", "B", "B", "B", "B", "C" };

		Promotion promotion = new Promotion();

		System.out.println("Sum = " + promotion.getPromotionValue(input));

	}

	public int getPromotionValue(String[] source) {

		List<Item> items = createItemList(source);
		int sum = calculatePrice(items);

		return sum;

	}

	private List<Item> createItemList(String[] source) {

		List<Item> items = new ArrayList<>();

		Map<String, Item> itemsMap = new HashMap<>();

		for (String input : source) {
			CharName charname = CharName.valueOf(input);
			Item item = new Item(charname.toString(), charname.getPrice(), 1);

			if (itemsMap.containsKey(item.getName())) {
				Item tempItem = itemsMap.get(item.getName());
				tempItem.setNoOfItem(tempItem.getNoOfItem() + 1);
				itemsMap.put(tempItem.getName(), tempItem);
			} else {
				itemsMap.put(charname.toString(), item);
			}

		}

		items = itemsMap.values().stream().collect(Collectors.toList());

		return items;
	}

	private int calculatePrice(List<Item> items) {

		ShoppingCartPromotion promotion = new ShoppingCartPromotionImpl();
		int sum = 0;

		for (Item item : items) {
			sum = sum + promotion.promo(item);
		}
		return sum;
	}

}
