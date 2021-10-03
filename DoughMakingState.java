package State;

public class DoughMakingState implements State{
	NoodleDishFactory noodles;
	public DoughMakingState(NoodleDishFactory noodles) {
		this.noodles=noodles;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void MakeDough() {
		if(noodles.doughAvailable) {
		// TODO Auto-generated method stub
		System.out.println("Dough is prepared.");
		}else {
			System.out.println("Dough is not available");
		}
		
	}

	@Override
	public void slitterOn() {
		if(noodles.doughAvailable) {
		// TODO Auto-generated method stub
		System.out.println("Dough available and Slitter is turned on.");
	}else {
		System.out.println("Wait for dough ");
	}
	}
	@Override
	public void slitterOff() {
		System.out.println("Slitter is turned off.");
		
	}

	@Override
	public void Cool() {
		System.out.println("Noodles are in cooling State.");
		
	}

	public String toString() {
		return "Dough is prepared.";
	}
}
