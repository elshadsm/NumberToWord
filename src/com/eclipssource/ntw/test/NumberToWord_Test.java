package com.eclipssource.ntw.test;

import org.junit.Test;

import com.eclipssource.ntw.main.NumberToWord;

import static org.junit.Assert.assertEquals;

public class NumberToWord_Test {

	@Test
	public void testNumberFour() {

		assertEquals("four", NumberToWord.numberToWord(4));

	}

	@Test
	public void testNumberTen() {

		assertEquals("ten", NumberToWord.numberToWord(10));

	}

	@Test
	public void testNumberTwelve() {

		assertEquals("twelve", NumberToWord.numberToWord(12));

	}
	
	
	@Test
	public void testNumberOneHundred() {

		assertEquals("one hundred", NumberToWord.numberToWord(100));

	}
	@Test
	public void testNumberOneHundredEight() {

		assertEquals("one hundred eight", NumberToWord.numberToWord(108));

	}
	@Test
	public void testNumberTwoHundredNinetyNine() {

		assertEquals("two hundred ninety-nine", NumberToWord.numberToWord(299));

	}
	@Test
	public void testNumberOneThousand() {

		assertEquals("one thousand", NumberToWord.numberToWord(1000));

	}
	@Test
	public void testNumberOneThousandThree() {

		assertEquals("one thousand three", NumberToWord.numberToWord(1003));

	}
	@Test
	public void testNumberTwoThousandFourty() {

		assertEquals("two thousand fourty", NumberToWord.numberToWord(2040));

	}
	@Test
	public void testNumberFourtyFiveThousandTwoHundredThirteen() {

		assertEquals("fourty-five thousand two hundred thirteen", NumberToWord.numberToWord(45213));

	}
	@Test
	public void testNumberOneHundredThousand() {

		assertEquals("one hundred thousand", NumberToWord.numberToWord(100000));

	}
	@Test
	public void testNumberOneHundredThousandFive() {

		assertEquals("one hundred thousand five", NumberToWord.numberToWord(100005));

	}
	@Test
	public void testNumberOneHundredThousandTen() {

		assertEquals("one hundred thousand ten", NumberToWord.numberToWord(100010));

	}
	@Test
	public void testNumberTwoHundredTwoThousandTwenty() {

		assertEquals("two hundred two thousand twenty", NumberToWord.numberToWord(202020));

	}
	@Test
	public void testNumberTwoHundredTwoThousandTwentyTwo() {

		assertEquals("two hundred two thousand twenty-two", NumberToWord.numberToWord(202022));

	}
	@Test
	public void testNumberNineHundredNinetyNineThousandNineHundredNinetyNine() {

		assertEquals("nine hundred ninety-nine thousand nine hundred ninety-nine", NumberToWord.numberToWord(999999));

	}
	@Test
	public void testNumberOneMillion() {

		assertEquals("one million", NumberToWord.numberToWord(1000000));

	}
	@Test
	public void testNumberOneMillionOne() {

		assertEquals("one million one", NumberToWord.numberToWord(1000001));

	}
	@Test
	public void testNumberTenMillion() {

		assertEquals("ten million", NumberToWord.numberToWord(10000000));

	}
	@Test
	public void testNumberTenMillionSeven() {

		assertEquals("ten million seven", NumberToWord.numberToWord(10000007));

	}
	@Test
	public void testNumberNinetyNineMillionNineHundredNinetyNineThousandNineHundredNinetyNine() {

		assertEquals("ninety-nine million nine hundred ninety-nine thousand nine hundred ninety-nine", NumberToWord.numberToWord(99999999));

	}

}
