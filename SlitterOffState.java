package State;

public class SlitterOffState implements State{
	NoodleDishFactory noodles;
	public SlitterOffState(NoodleDishFactory noodles) {
		this.noodles=noodles;
	}

	@Override
	public void MakeDough() {
		if(noodles.doughAvailable) {
			System.out.println("Dough is being prepared.");			
		}else {
			System.out.println("Dough is not available");
			noodles.getSlitterOffState();
		}
		
	}

	@Override
	public void slitterOn() {
		if(noodles.doughAvailable) {
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
		System.out.println("Noodles are cooled at 100 degree celsius");
			
		
	}

	public String toString() {
		return "Slitter is turned off.";
	}
}
