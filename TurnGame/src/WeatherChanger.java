import java.util.Random;

public class WeatherChanger implements Runnable{
	private State state;
	private boolean flag=true;
	
	
	public WeatherChanger(State state2) {
		this.state=state2;
	}
	public void WeatherChange(){
		Random random=new Random(System.currentTimeMillis());
		int randomNumber=random.nextInt(4);
		
		switch(randomNumber){
		case 0: state.setWeather(Weather.Sunny);break;
		case 1: state.setWeather(Weather.Clowdy);break;
		case 2: state.setWeather(Weather.Rainy);break;
		case 3: state.setWeather(Weather.Snow); break;
		default : state.setWeather(Weather.Sunny);break;
		}
	}
	@Override
	public void run(){
		while(flag){
			//System.out.println("\t\t"+Thread.currentThread().getName()+" before :" +state.getWeather().toString());
    		WeatherChange();
    		try {
    			Thread.sleep(Constant.changeTime);
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}
    	System.out.println("\t\t"+Thread.currentThread().getName()+" after :"+state.getWeather().toString());
		}
	}
	public void finish() {
		flag=false;
	}
}
