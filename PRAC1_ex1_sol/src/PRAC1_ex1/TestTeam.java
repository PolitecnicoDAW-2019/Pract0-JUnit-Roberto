package PRAC1_ex1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class TestTeam {
	
	private Team team;
	
	@BeforeEach
	void startup() throws Exception {
		team = new Team();
	}
	
	//constructores
	@Test
	void testTeam() {
		fail("Not yet implemented");
	}

	@Test //Check
	void testTeamStringStringStringStringStringIntIntInt() {
		fail("Not yet implemented");
	}
	
	@Test
	void testSetShortNameLessOrEqualThan40() throws Exception {
		team.setShortName("sampleName");
		assertEquals("sampleName", team.getShortName());		
	}
	
	@Test
	void testSetShortNameMoreThan40() throws Exception { // Preguntar a Carlos
		team.setShortName("ThisIsAReallyReallyLongNameGodIHopeThisWorksThisTimeForGodsSake");
		assertEquals(null, team.getShortName());		
	}

	@Test
	void testGetLongName() {
		team.setLongName("sampleLongName");
		assertEquals("sampleLongName", team.getLongName());		
	}

	@Test
	void testSetLongName() {
		team.setLongName("sampleLongName");
		assertEquals("sampleLongName", team.getLongName());
	}

	@Test
	void testGetImageSrc() {
		team.setImageSrc("imgPath");
		assertEquals("imgPath", team.getImageSrc());
	}

	@Test
	void testSetImageSrc() {
		team.setImageSrc("imgPath");
		assertEquals("imgPath", team.getImageSrc());
	}

	@Test
	void testGetPresident() {
		team.setPresident("Roberto");
		assertEquals("Roberto", team.getPresident());
	}

	@Test
	void testSetPresident() {
		team.setPresident("Roberto");
		assertEquals("Roberto", team.getPresident());
	}

	@Test
	void testGetSponsor() {
		team.setSponsor("Sponsor");
		assertEquals("Sponsor", team.getSponsor());
	}

	@Test
	void testSetSponsor() {
		team.setSponsor("Sponsor");
		assertEquals("Sponsor", team.getSponsor());
	}

	@Test
	void testGetMembers() {
		team.setMembers(123);
		assertEquals(123, team.getMembers());
	}

	@Test
	void testSetMembersTrue() {
		assertEquals(true, team.setMembers(123));
	}
	
	@Test
	void testSetMembersFalse() {
		assertEquals(false, team.setMembers(-1));
	}

	@Test
	void testGetBudget() {
		team.setBudget(123);
		assertEquals(123, team.getBudget());
	}

	@Test
	void testSetBudgetTrue() {
		assertEquals(true, team.setBudget(123));
	}
	
	@Test
	void testSetBudgetFalse() {
		assertEquals(false, team.setBudget(-5));
	}


	@Test
	void testGetFounded() {
		team.setFounded(2000);
		assertEquals(2000, team.getFounded());
	}

	@Test
	void testSetFoundedTrue() {
		assertEquals(true, team.setFounded(2000));
	}
	
	@Test
	void testSetFoundedFalse() {
		assertEquals(false, team.setFounded(1500));
	}
}
