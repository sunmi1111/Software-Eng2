package Shop;

import org.apache.commons.lang3.StringUtils;
	
	public class Customer<Cart>  {
		
		private final int customerId;
		private final String name;
		Customer(String name, int customerId) {
			isBlank(name);
			isTrue(StringUtils.isAlphanumeric(name),
					"customerId name must be alphanumeric, was: " + name);
	isTrue( customerId>0, "CustomerId must be greater than zero. It was: "+customerId);
	this.name = name;
	this.customerId = customerId;
	
	}
		
		private void isBlank(String name2) {
			// TODO Auto-generated method stub
			
		}

		private void isTrue(boolean b, String string) {
			// TODO Auto-generated method stub
			
		}

		Customer<Object> GetCustomer() {
			return new Customer<Object>(this.name, this.customerId);
			
			
		}
		
		int getcustomerId() { return customerId; }
		
		
		
		@Override
		public String toString() { return String.format("Room name is %, capacity is %", name, customerId); }
		
		void OutofStockException(int customerId) {
			if(this.customerId < customerId) {
				throw new OutofStockException
					(String.format("current room: % has capacity: % but is trying to enlist: %", this, 
							customerId, customerId));
					
				}
			
			}							
		
	}