package iut.tdd;

import junit.framework.Assert;

import org.junit.Test;

public class TestConvert {
	
	private Convert myConvert;
	@Test
	public void test_num2text_zero () {
		// Given
		String input = "0";
		String expected = "zéro";
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_un () {
		// Given
		String input = "1";
		String expected = "un";
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_deux () {
		// Given
		String input = "2";
		String expected = "deux";
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_trois () {
		// Given
		String input = "3";
		String expected = "trois";
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_quatre () {
		// Given
		String input = "4";
		String expected = "quatre";
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_cinq () {
		// Given
		String input = "5";
		String expected = "cinq";
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_six () {
		// Given
		String input = "6";
		String expected = "six";
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_sept () {
		// Given
		String input = "7";
		String expected = "sept";
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_huit () {
		// Given
		String input = "8";
		String expected = "huit";
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_neuf () {
		// Given
		String input = "9";
		String expected = "neuf";
			// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_dix () {
		// Given
		String input = "10";
		String expected = "dix";
			// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_onze () {
		// Given
		String input = "11";
		String expected = "onze";
			// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_douze () {
		// Given
		String input = "12";
		String expected = "douze";
			// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_treize () {
		// Given
		String input = "13";
		String expected = "treize";
			// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_quatorze () {
		// Given
		String input = "14";
		String expected = "quatorze";
			// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_quinze () {
		// Given
		String input = "15";
		String expected = "quinze";
			// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_seize () {
		// Given
		String input = "16";
		String expected = "seize";
			// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}

}