
public class Home1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
///////////////Task 1/////////////////		
        short speed=100, min=500;
        float km;
        km=speed/60F*min;
        System.out.println("Автомобиль проехал "+km+" km");
        
//////////////Task 2///////////////////
        String a1="Блюдо 1", a2="Блюдо 2", a3="Блюдо 3"; 
        final short dost=50;
        short quantity1=2,quantity2=3,quantity3=5;
        float price1=20.6F, price2=30.6F, price3=100.9F,x, y, z;        
        System.out.println(a1+" Кол-во="+quantity1+" Цена="+price1+" Стоимость="+(float)(x=quantity1*price1));
        System.out.println(a2+" Кол-во="+quantity2+" Цена="+price2+" Стоимость="+(float)(y=quantity2*price2));
        System.out.println(a3+" Кол-во="+quantity3+" Цена="+price3+" Стоимость="+(float)(z=quantity3*price3));
        System.out.println("Доставка = "+dost);
        System.out.println("Стоимость заказа = "+(float)(x+y+z)+" + доставка = "+(float)(x+y+z+dost));
        
		
	}

}
