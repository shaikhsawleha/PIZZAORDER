package PIZZAORDER;

public class PizzaOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=0;
		int i;
		
		//item1.printDetail();
		PIZZA[] item1=new PIZZA[5];
		item1[0]=new PIZZA("PIZZA CHEESE",1,20);
		item1[1]=new PIZZA("PIZZA ARMANI",3,50);
		item1[2]=new PIZZA("PIZZA SOYA",1,20);
		
		System.out.println("****************************************************************************************");
		System.out.println("********************************PIZZA HOUSE BILL **************************************");
		System.out.println("****************************************************************************************");
	
		System.out.println("THE NAME OF THE PRODUCT " + " QUANTITY " + " PRICE OF PRODUCT " + " TOTAL PRICE OF PRODUCT:-");
		
		for(i=0;i<=2;i++)
		{
			total=total+item1[i].FindPrice();
			item1[i].printDetail();
			
			
		}

		System.out.println("TOTAL AMOUNT:-    "+total);
		
			float amount=total,gst_amt;
			amount=(amount*8)/100;
			gst_amt=total+amount;
			System.out.println("GST(8%) AMOUNT:-     "+amount);
			System.out.println("GST(8%) AFTER ADDING GST AMOUNT:-     "+gst_amt);
			System.out.println("\n****************************THANK YOU ************************************");
		
		
		
	}


	}


