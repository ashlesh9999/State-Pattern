package State;

public class NoodleDishFactoryState {

	public static void main(String[] args) {
		
//		Here the availability of dough is false
//		NoodleDishFactory noodles=new NoodleDishFactory(false);
		
//		Here the availability of dough is true

		NoodleDishFactory noodles=new NoodleDishFactory(true);

		
		System.out.println(noodles);
		noodles.slitterOn();
		
		noodles.slitterOff();
		System.out.println(noodles);

		noodles.slitterOn();
		System.out.println(noodles);

		noodles.makeDough();	
		System.out.println(noodles);

		noodles.cool();
		System.out.println(noodles);
		
		
		noodles.makeDough();
		noodles.slitterOn();
		noodles.slitterOff();
		noodles.makeDough();
		noodles.checkDough();
		noodles.cool();
		System.out.println("Noodles are ready and sent for packaging");
		


	}

}
