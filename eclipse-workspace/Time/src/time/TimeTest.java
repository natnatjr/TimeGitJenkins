package time;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TimeTest {
/**
	@Test
	void testGetTotalSecondsGood() {
		int seconds = Time.getTotalSeconds("05:05:05:05");
		assertTrue("The totalseconds were not calculated properly", seconds==18305);
	}

	@Test
	public void testGetTotalSecondsBad()
	{
	assertThrows(StringIndexOutOfBoundsException.class, 
			()-> {Time.getTotalSeconds("10:00");});
	}
	
	@Test
	public void testGetTotalSecondsBoundary() 
	{
		int seconds = Time.getTotalSeconds("23:59:59:06");
		assertTrue("Total seconds is bound to the time limit", seconds==86399);
	}
	
	@ParameterizedTest
	@ValueSource(strings = { "05:00:00", "05:15:15", "05:59:59" })
	void testGetTotalHours(String candidate) {
	int hours = Time.getTotalHours(candidate);
	assertTrue("The hours were not calculated properly",hours ==5);
	}



	@Test
	void testGetSecondsGood() {
		int seconds = Time.getSeconds("05:10:23");
		assertTrue("The seconds were calculated properly", seconds==23);
	}

	@Test
	void testGetSecondsBad() {
		int seconds = Time.getSeconds("05:10:1120");
		assertFalse("The seconds were not calculated properly", seconds==1120);
	}
	
	@Test
	void testGetSecondsBoundary() {
		int seconds = Time.getSeconds("23:59:59");
		assertTrue("Seconds is bound to the time limit", seconds==59);
	}
	@Test
	void testGetTotalMinutesGood() {
		int minutes = Time.getTotalMinutes("23:59:59");
		assertTrue("Minutes is bound to the time limit", minutes==59);
	}
	
	@Test
	void testGetTotalMinutesBad() {
		int minutes = Time.getTotalMinutes("05:10:61");
		assertFalse("The minutes were not calculated properly", minutes==61);
	}
	
	@Test
	void testGetTotalMinutesBoundary() {
		int minutes = Time.getTotalMinutes("23:59:59");
		assertTrue("Minutes is bound to the time limit", minutes==59);
	}

	@Test
	void testGetTotalHoursGood() {
		int hours = Time.getTotalHours("22:59:59");
		assertTrue("Hours is bound to the time limit", hours==22);
	}
	
	@Test
	void testGetTotalHoursBad() {
		int hours = Time.getTotalHours("25:62:61");
		assertFalse("The hours were not calculated properly", hours==62);
	}
	
	@Test
	void testGetTotalHoursBoundary() {
		int hours = Time.getTotalHours("23:59:59");
		assertTrue("Hours is bound to the time limit", hours==23);
	}
	**/
	
	@Test
	public void testGetMillisecondsFail() {
		assertEquals(5, Time.getMilliseconds("12:05:05:06"));
	}
	
	@Test
	public void testGetMillisecondsGood() {
		try {
			Time.getMilliseconds("12:05:05:10");
		} catch (NumberFormatException e) {
		}
	}
	
	@Test
	public void testGetMillisecondsBoundary() {
		assertEquals(0, Time.getMilliseconds("23:59:59:59"));
	}

}
