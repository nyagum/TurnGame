
public class Timer implements Runnable{
	private long sec;
	private boolean flag=true;
	public Timer(){
		this.sec=0;
	}
	public void finish() {
		flag=false;
	}
	public void run() {
		while(sec<15000&& flag){ // 15초 동안 
	        System.out.println(sec+"sec 지났습니다.");
	        try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        sec+=1000;
		}
    }
}
