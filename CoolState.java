package State;

public class CoolState implements State{
	
	NoodleDishFactory noodles;
	public CoolState(NoodleDishFactory noodles) {
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
		System.out.println("Slitter is turned on.");
		
	}

	@Override
	public void slitterOff() {
		System.out.println("Slitter is turned off and waiting for dough");
		
	}

	@Override
	public void Cool() {
		System.out.println("Noodles are cooling at 100 degrees celsius");
		
	}
	
	public String toString() {
		return "Noodles are cooled at 100 degree celsius";
	}

}
