public class Warrior extends Character{
	public Warrior(String name){
		super(name);
		AttackAmount=4;
	}
	public Warrior(){
		super("호구");
	}
	public int Attack(){
		return Cutting();
	}
	private int Cutting(){
		System.out.println("Warrior(이)가"+AttackAmount+"만큼 피해를 입혔습니다."); 
		System.out.println("\t\tAttackPoint가 "+2+" 만큼 소모하였습니다.");
		AttackPoint-=2;
		return AttackAmount;
	}
}

