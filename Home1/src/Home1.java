
public class Home1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
///////////////Task 1/////////////////		
        short speed=100, min=500;
        float km;
        km=speed/60F*min;
        System.out.println("���������� ������� "+km+" km");
        
//////////////Task 2///////////////////
        String a1="����� 1", a2="����� 2", a3="����� 3"; 
        final short dost=50;
        short quantity1=2,quantity2=3,quantity3=5;
        float price1=20.6F, price2=30.6F, price3=100.9F,x, y, z;        
        System.out.println(a1+" ���-��="+quantity1+" ����="+price1+" ���������="+(float)(x=quantity1*price1));
        System.out.println(a2+" ���-��="+quantity2+" ����="+price2+" ���������="+(float)(y=quantity2*price2));
        System.out.println(a3+" ���-��="+quantity3+" ����="+price3+" ���������="+(float)(z=quantity3*price3));
        System.out.println("�������� = "+dost);
        System.out.println("��������� ������ = "+(float)(x+y+z)+" + �������� = "+(float)(x+y+z+dost));
        
		
	}

}
