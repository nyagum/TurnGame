import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

// TODO 코드를 깃에 올리고 코드 커밋을 하면서 코드를 짜세요
// TODO 커밋을 자주 해야 과감하게 기능을 추가 할 수 있어요.
// TODO 한꺼번에 추가하려고 하지말고 코드커밋하고 하나씩 하세요.
// TODO 각 파일별로 한 클래스씩 나누세요. 깃에서는 파일히스토리가 관리됩니다. 

public class TurnGame {
	private MatchField matchField;
	private ArrayList<Integer> enemyAttackPattern;
	
	public TurnGame(){
		enemyAttackPattern=new ArrayList<Integer>();
		enemyAttackPattern.add(3);
		enemyAttackPattern.add(3);
		enemyAttackPattern.add(2);
		enemyAttackPattern.add(1);
		enemyAttackPattern.add(3);
		enemyAttackPattern.add(2);
		enemyAttackPattern.add(2);
		enemyAttackPattern.add(3);
		enemyAttackPattern.add(2);
		enemyAttackPattern.add(1);
		enemyAttackPattern.add(3);
		enemyAttackPattern.add(3);
		enemyAttackPattern.add(1);
		enemyAttackPattern.add(3);
		enemyAttackPattern.add(3);
		enemyAttackPattern.add(1);
//		ArrayList<Integer> Pattern1=new ArrayList<Integer>();
//		Pattern1.add(3);
//		Pattern1.add(3);
//		Pattern1.add(2);
//		Pattern1.add(1);
//		ArrayList<Integer> Pattern2=new ArrayList<Integer>();
//		Pattern2.add(3);
//		Pattern2.add(2);
//		Pattern2.add(2);
//		Pattern2.add(3);
//		Pattern2.add(2);
//		Pattern2.add(1);
//		ArrayList<Integer> Pattern3=new ArrayList<Integer>();
//		Pattern3.add(3);
//		Pattern3.add(3);
//		Pattern3.add(1);
//		Random r=new Random();
//		do{
//			int randomInteger=r.nextInt(3);
//			switch(randomInteger){
//			case 0:
//				enemyAttackPattern.addAll(Pattern1);
//				break;
//			case 1:
//				enemyAttackPattern.addAll(Pattern2);
//				break;
//			case 2:
//				enemyAttackPattern.addAll(Pattern3);
//				break;
//			default:
//				enemyAttackPattern.addAll(Pattern3);
//				break;
//			}
//		} while(enemyAttackPattern.size()<Constant.AttackMaxTurn);
//		
//		if(enemyAttackPattern.size()>Constant.AttackMaxTurn){
//			while(enemyAttackPattern.size()<=Constant.AttackMaxTurn){
//				enemyAttackPattern.remove(Constant.AttackMaxTurn+1);
//			}
//		}
	}
	
    public static int getNumber() throws IOException, NumberFormatException{
		int inputNumber=0;
		String inputString = null;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(">>");
		inputString = in.readLine();
		inputNumber=Integer.parseInt(inputString);
		return inputNumber;
	}
    public static String getString() throws IOException{
		String inputString = null;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		inputString = in.readLine();
		return inputString;
	}

    public int initGame() throws IOException, NumberFormatException{		
		System.out.println("평화롭던 마을에 어느 날");
		System.out.println("드라큐라와 좀비 떼가 마을에 몰려들어왔습니다.");
		System.out.println("마을 사람들의 걱정이 이만저만이 아니었습니다.");
		System.out.println("당신이 전사가 되어 마을을 지켜주세요.\n");
		System.out.println("1.좋다. 용사가 되어 마을을 지키겠어! \n2.싫다 나 말고도 누군가 지키겠지.\n");
		int number=getNumber();
		String name;
		switch(number){
			case 1:
				System.out.println("좋아 내가 마을을 구하고 영웅이 되겠어!");
				System.out.println("마을 사람들은 마을을 구할 호구가 생겼다며 좋아했습니다.");
				name="호구";
				break;
			case 2:
			default:
				System.out.println("싫은데, 나말고 마을을 구할 사람은 많아.");
				System.out.println("그러자 마을 사람들은 10억을 주겠다고했습니다.");
				
				System.out.println("10억이라면 로또에 버금가는군.까짓것 영웅이 되어주겠어");
				System.out.println("마을 사람들은 마을을 구할 영웅이 생겼다며 좋아했습니다.");
				System.out.println("당신의 이름을 입력해주세요");
				name=getString();
				break;
		}
		
		System.out.println("안녕하세요 [ "+name+" ]님 당신은 용사로 선택되었습니다.");
		System.out.println("");
		System.out.println("당신은 [ 공격 ], [ 방어 ] , [ 휴식 ] 세가지중 하나를 골라서 싸울 수 있습니다.");
		System.out.println("공격은 공격포인트를 모은 만큼 소비하여 공격할수 있고");
		System.out.println("방어는 상대의 공격을 방어할 수 있지만 HP가 조금 줄어듭니다. 즉, 완벽하게 방어할 수는 없습니다.");
		System.out.println("휴식을 통해 공격포인트를 쌓을 수 있습니다");
		System.out.println("하지만 휴식을 하는 동안에 상대의 공격이 들어오면 피해를 받고 공격포인트를 쌓을 수 없습니다.");
		System.out.println("");
		System.out.println("[ "+name+" ]님, 당신의 직업을 선택해 주세요. 직업에 따라 HP와 공격 포인트를 얻는 수치가 조금씩 다릅니다.");
		System.out.println("1.전사 [HP 20 , 1회 쉴때마다 공격포인트가 1증가, 스킬은 찌르기(공격포인트2감소)가 있습니다.]");
		System.out.println("");
		//number=1;
		
		number=getNumber();
		switch(number){
			case 1: System.out.println("[ 전사] 를 선택하였습니다."); break;
			case 2: System.out.println("[ 도둑 ]를 선택하였습니다."); break;
			default: System.out.println("전사를 선택하였습니다."); number=1; break;
		}
		return number;
    }
    public void playingGame(TurnGame playingGame) throws IOException, NumberFormatException{
    	playingGame.matchField.CurrentState();
		
    	while(playingGame.matchField.isDeathAlive() && (playingGame.matchField.getTurn()<Constant.AttackMaxTurn)){
    		
    		if(playingGame.matchField.User.AttackPoint >=2)
    			System.out.print("[ 1. 공격]");
    		System.out.println(" [ 2. 방어]  [ 3. 휴식] ");
    		int myNumber=getNumber();
    		int enemyNumber=playingGame.enemyAttackPattern.get(playingGame.matchField.getTurn());
    		
    		if(myNumber==1 && enemyNumber==1){
    			playingGame.matchField.UserAttack_EnemyAttack();
    		}else if(myNumber==1 && enemyNumber==2){
    			playingGame.matchField.UserAttack_EnemyDefence();
    		}else if(myNumber==1 && enemyNumber==3){
    			playingGame.matchField.UserAttack_EnemyRest();
    		}else if(myNumber==2 && enemyNumber==1){
    			playingGame.matchField.UserDefence_EnemyAttack();
    		}else if(myNumber==2 && enemyNumber==2){
    			playingGame.matchField.UserDefence_EnemyDefence();
    		}else if(myNumber==2 && enemyNumber==3){
    			playingGame.matchField.UserDefece_EnemyRest();
    		}else if(myNumber==3 && enemyNumber==1){
    			playingGame.matchField.UserRest_EnemyAttck();
    		}else if(myNumber==3 && enemyNumber==2){
    			playingGame.matchField.UserRest_EnemyDefence();
    		}else if(myNumber==3 && enemyNumber==3){
    			playingGame.matchField.UserRest_EnemyRest();
    		}else{
    			System.out.println("번호를 잘못입력하셨습니다. 다시 입력하세요.");
    		}
    		playingGame.matchField.increaseTurn();
    		playingGame.matchField.CurrentState();
    	}
    	
    	System.out.print("게임이 끝났습니다. 게임은 ");
    	if(playingGame.matchField.Enemy.isAlive()&&playingGame.matchField.User.isAlive()){
    		System.out.println("비겼습니다.");
    	}else if(playingGame.matchField.User.isAlive()){
    		System.out.println("User의 승리입니다.");
    	}else if(playingGame.matchField.Enemy.isAlive()){
    		System.out.println("적의 승리입니다.");
    	}
    	
    }
	public static void main(String[] args)  throws IOException, NumberFormatException{
		TurnGame playingGame=new TurnGame();
		
		int number=playingGame.initGame();
		
		if(number==1){
//			playingGame.matchField=new MatchField(new Warrior(), new Zombie());
			playingGame.matchField=new MatchField(new Warrior(), new Dracura());
		}else{
			System.out.println("다시 입력하세요.");
		}
		
		playingGame.playingGame(playingGame);
	}
}