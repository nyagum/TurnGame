
class Dracura extends Monster{
	
	public Dracura(State state){
		super.state=state;
	}
	public int Attack(){
		return Bloodsucking();
	}
	private int Bloodsucking(){
		if(super.state.getDay()==DayTime.Day){
			System.out.println("Dracura(이)가"+AttackAmount+"만큼 피해를 입혔습니다.");
			System.out.println("\t\tAttackPoint가 "+2+" 만큼 소모하였습니다.");
			AttackPoint-=2;
			return AttackAmount;
		}else if(super.state.getDay()==DayTime.Night){
			System.out.println("Dracura(이)가"+7+"만큼 피해를 입혔습니다.");
			System.out.println("\t\tAttackPoint가 "+2+" 만큼 소모하였습니다.");
			AttackPoint-=2;
			return 7;
		}else if(super.state.getDay()==DayTime.Night && super.state.getWeather()==Weather.Rainy){
				System.out.println("Dracura(이)가"+7+"만큼 피해를 입혔습니다.");
				System.out.println("\t\tAttackPoint가 "+2+" 만큼 소모하였습니다.");
				AttackPoint-=2;
				return 6;
		}else{
			System.out.println("Dracura(이)가"+AttackAmount+"만큼 피해를 입혔습니다.");
			System.out.println("\t\tAttackPoint가 "+2+" 만큼 소모하였습니다.");
			AttackPoint-=2;
			return AttackAmount;
		}
	}
}