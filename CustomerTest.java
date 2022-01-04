package Shop;


import static org.junit.jupiter.api.Assertions.assertThrows;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Collection;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class CustomerTest<Cart, Item> {
	
	private final int customerId = 0;
	private final String name = "";
	private final String email = "";
	private final Collection<Order> orders = null;
	private final Cart cart = null;
	
	void addToCart( int quantity) {
		
	}
	
	
	@Test
	void AddTocart_out_of_stock() {
		
		@SuppressWarnings("rawtypes")
		InventoryItem inventoryItem = new InventoryItem();
		
		Object customer;
		OutofStockException assertThrows2 = assertThrows(OutofStockException.class, () -> ((Object) customer).addToCart(inventoryItem));
		
		
	}
	
	@Test
	void Add_To_cart() {
		
		Object price;
		Object quantity;
		Object itemName;
		Item temp = new Item(itemName, price, quantity);
	        Object totalPrice = (price * quantity);
	        Object itemCount = quantity;
	        cart[(int) itemCount] = temp;
	        Object capacity;
			if(itemCount==capacity)
	        {
	            increaseSize();
	        }
		
	}

	private void increaseSize() {
		// TODO Auto-generated method stub
		
	}

	class InventoryItem {;
		private int quantity;
	}
	
	class cart {
		
	}
	
	class order {
		
		private final int orderId = 0;
		private final LocalDateTime timeStamp = null;;
		private final Collection<OrderItem> items = null;
		
	}
	class OrderItem {
		private final Product product = new Product();
		private final BigDecimal price = null;
	}
	
	class Product {
		public Object inventoryItem;
		private final int productId = 0;
		private final String description = "";
	}
}
	
	
	
	