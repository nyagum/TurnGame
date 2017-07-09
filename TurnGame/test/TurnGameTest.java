import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TurnGameTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testUserRest_EmenyRest() {
		MatchField matchField=new MatchField(new Warrior(), new Dracura());
		
		matchField.CurrentState();
		matchField.UserRest_EnemyRest();
	}
	
	@Test
	public void testUserRest_EmenyAttck() {
		// given
		Warrior user = new Warrior();
		Dracura enemy = new Dracura();
		
		MatchField matchField=new MatchField(user, enemy);
		
		int userHp = user.HP;
		
		enemy.AttackPoint = 2;
		
		// when		
		matchField.CurrentState();
		matchField.UserRest_EnemyAttck();
		
		
		// then
		assertEquals(0, user.AttackPoint);
		assertEquals(0, enemy.AttackPoint);
		assertEquals(userHp - enemy.AttackAmount, user.HP);
	}
	
	@Test
	public void testScenario001() {
		Warrior user = new Warrior();
		Dracura enemy = new Dracura();
		
		MatchField matchField=new MatchField(user, enemy);
		
		int userHp = user.HP;
		
		matchField.CurrentState();
		matchField.UserRest_EnemyRest();
		
		
		assertEquals(1, user.AttackPoint);
		assertEquals(1, enemy.AttackPoint);
		
		matchField.CurrentState();
		matchField.UserRest_EnemyRest();
			
		assertEquals(2, user.AttackPoint);
		assertEquals(2, enemy.AttackPoint);
		
		matchField.CurrentState();
		matchField.UserRest_EnemyAttck();
		
		assertEquals(2, user.AttackPoint);
		assertEquals(0, enemy.AttackPoint);
		assertEquals(userHp - enemy.AttackAmount, user.HP);
		
//
//		matchField.CurrentState();
//		matchField.UserAttack_EmenyDefance();
//
//		matchField.CurrentState();
//		matchField.UserDeface_EmenyRest();
//
//		matchField.CurrentState();
//		matchField.UserDeface_EmenyRest();
//		
//		matchField.CurrentState();
//		matchField.UserDefance_EmenyAttack();
//		matchField.CurrentState();
	}

}
