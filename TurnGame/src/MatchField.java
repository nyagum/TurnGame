
class MatchField{
	public Unit User;
	public Unit Enemy;
	private int turn;
	
	
	public MatchField(Unit user, Unit emeny){
		this.User=user;
		this.Enemy=emeny;
		turn=0;
	}
	public void increaseTurn(){
		turn++;
	}
	public int getTurn(){
		return turn;
	}
	public void CurrentState(){
		System.out.println("\t\t\t\t [ User  : HP "+User.HP+" ][ AttackPoint "+User.AttackPoint+" ]"+
							"\n\t\t\t\t\t\t\t\t\t[ Emeny : HP"+ Enemy.HP+" ][ AttackPoint "+Enemy.AttackPoint+" ]");
	}
	public void UserAttack_EnemyAttack(){
		Enemy.getDamage(User.Attack());
		User.getDamage(Enemy.Attack());
	}
	public void UserDefence_EnemyDefence(){
		System.out.println("둘다 방어를 하므로 아무 일도 일어나지 않았습니다.");
	}
	public void UserAttack_EnemyDefence(){
		System.out.println(" 이가 공격을 합니다. 적은 방어를 합니다.");
		Enemy.Defence(User.Attack());
	}
	public void UserAttack_EnemyRest(){
		System.out.println("User 이가 공격을 합니다.");
		Enemy.getDamage(User.Attack());
	}
	public void UserDefence_EnemyAttack(){
		System.out.println("User(이)가 방어를 하고 적이 공격합니다.");
		User.Defence(Enemy.Attack());
	}
	public void UserDefece_EnemyRest(){
		System.out.println("User(이)가 방어를 하고 적이 쉽니다.");
		Enemy.Rest();
	}
	public void UserRest_EnemyAttck(){
		System.out.println("User의 휴식이 실패하였습니다. 공격을 받았습니다.");
		User.getDamage(Enemy.Attack());
	}
	public void UserRest_EnemyDefence(){
		System.out.println("User는 휴식을쉬하고 적은 방어를 합니다.");
		User.Rest();
	}
	public void UserRest_EnemyRest(){
		System.out.println("적과 User 모두 쉬었습니다.");
		User.Rest();
		Enemy.Rest();
	}
	public boolean isDeathAlive(){
		return (User.isAlive()&&Enemy.isAlive());
	}
}