public class Unit{
	protected int HP;
	protected int MAX_HP;
	protected int AttackPoint;
	protected int AttackAmount;
	
	public Unit(){
		this.HP=10;
		this.MAX_HP=10;
		this.AttackAmount=4;
		this.AttackPoint=0;
	}
	public int getAttackPoint(){
		return this.AttackPoint;
	}
	public boolean isAlive(){
		if(this.HP<=0){
			return false;
		}else{
			return true;
		}
	}
	public void Rest(){
		int amount=(int)(HP+((MAX_HP*0.2+HP)%MAX_HP));
//		if(amount>MAX_HP){
//			HP=MAX_HP;
//		}else{
//			HP=amount;
//		}
		AttackPoint++;
	}
	public int Attack(){
		return AttackAmount;
	}
	public void getDamage(int Damage){
		HP=HP-Damage;
		if(HP<0){
			HP=0;
		}
	}
	public void Defence(int Damege){
		if(Damege>0){
			HP=HP-(int)(Damege/2);
			if(HP<0){ HP=0;}
		}else{
			System.out.println("잘못된 값입니다. 다시 한번 확인해주세요.");	
		}
	}	
}