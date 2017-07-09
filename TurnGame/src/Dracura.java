
class Dracura extends Monster{
	
	public int Attack(){
		return Bloodsucking();
	}
	private int Bloodsucking(){
		System.out.println("Dracura(이)가"+AttackAmount+"만큼 피해를 입혔습니다.");
		System.out.println("\t\tAttackPoint가 "+2+" 만큼 소모하였습니다.");
		AttackPoint-=2;
	
		return AttackAmount;
	}
}