enum Mobile{
	APPLE(100),HTC;
	int price;
	Mobile(){
		price=80;
		
	}
	Mobile(int a){
		price=a;
	}
	
	int getPrice(){
		return price;
		}
}
/*enum will create objects in the backend 
//class mobile{
 * static final mobile apple=new mobile();
 * static final mobile htc =new htc();
 * }
 */
//*/
public class EnumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(mobile.APPLE);
		//Mobile h=Mobile.HTC;
		/*switch(apple) { //enum used in switch statement
		case APPLE:System.out.println("iphone");
		break;
		case HTC:System.out.println("HTC");
		break;
		}
		*/
		System.out.println(Mobile.HTC.getPrice());
	}

}
