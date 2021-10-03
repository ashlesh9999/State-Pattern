package State;

public class SlitterOnState implements State{
	NoodleDishFactory noodles;
	public SlitterOnState(NoodleDishFactory noodles) {
		this.noodles=noodles;
	}

	@Override
	public void MakeDough() {
		System.out.println("Dough is already prepared.");
		
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
		if(noodles.doughAvailable) {
			System.out.println("Dough is being prepared.");			
		}else {
			System.out.println("Dough is not available");
			
		}
		
	}

	@Override
	public void Cool() {
		System.out.println("Noodles are cooled at 100 degree celsius");
		
	}
	
	public String toString() {
		return "Slitter is turned on.";
	}

}
