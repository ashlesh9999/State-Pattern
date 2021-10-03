package State;

public class NoodleDishFactory {
	State doughMakingState;
	State slitterOnState;
	State slitterOffState;
	State coolState;
	
	State state=doughMakingState;
	boolean doughAvailable=false;
	public NoodleDishFactory(boolean doughAvailable) {
		doughMakingState=new DoughMakingState(this);
		slitterOnState = new SlitterOffState(this);
		slitterOffState =new SlitterOnState(this);
		coolState =new CoolState(this);
		
		this.doughAvailable=doughAvailable;
		if(doughAvailable) {
			state=slitterOffState;
		}else {
			state=slitterOnState;
		}
		
	}
	
	public void makeDough() {
		state.MakeDough();
	}
	public void slitterOn() {
		state.slitterOn();
	}
	public void slitterOff() {
		state.slitterOff();
	}
	public void cool() {
		state.Cool();
	}

	public State getDoughMakingState() {
		return doughMakingState;
	}
	public State getSlitterOnState() {
		return slitterOnState;
	}
	public State getSlitterOffState() {
		return slitterOffState;
	}
	public State getCoolState() {
		return coolState;
	}
	public boolean checkDough() {
		return  doughAvailable;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public String toString() {
		return ""+state;
	}
	

}
