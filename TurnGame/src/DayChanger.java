public class DayChanger implements Runnable{
	private State state;
	private boolean flag=true;
	int count=0;
	public DayChanger(State state){
		this.state=state;
	}
	public void dayChange(){
		if(state.getDay()==DayTime.Day){
			state.setDay(DayTime.Night);
		}else{
			state.setDay(DayTime.Day);
		}
	}
    @Override
	public void run() {
    	
    	while(flag && count<15){
    		//System.out.println("\t\t"+Thread.currentThread().getName()+" before :" +state.getDay().toString());
    		dayChange();
    		try {
    			Thread.sleep(Constant.changeTime);
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}
    		count++;
    		System.out.println("\t"+Thread.currentThread().getName()+" after :"+state.getDay().toString());
    	}
    }
    public void finish() {
		flag=false;
	}
}